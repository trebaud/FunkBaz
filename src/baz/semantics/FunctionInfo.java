
package baz.semantics;

import static baz.semantics.Type.*;

import java.util.*;

import baz.interpreter.*;
import baz.syntax.analysis.*;
import baz.syntax.node.*;

public class FunctionInfo {

    //private AFunc definition;
    	
	private Node definition;
	
	private String name;
    
    private LinkedHashSet<String> paramNames = new LinkedHashSet<>();

    private LinkedList<Declaration> params = new LinkedList<>();
    
    private Type returnType;

    public FunctionInfo(
            AFunc node) {

        this.definition = node.getBlock();
        this.name = node.getName().getText();

        // collectionne les paramètres
        addParams(node.getParams());
        if (node.getReturnType() != null) {

            node.getReturnType().apply(new DepthFirstAdapter() {

                @Override
                public void caseAReturnType(
                        AReturnType node) {

                    FunctionInfo.this.returnType = Type.get(node.getType());
                }
            });
        }
        else {
            this.returnType = VOID;
        }
        
    }
    
    public FunctionInfo(LambdaValue lambda){
    	ALambdaTerm node = lambda.getValue();
    	this.definition = node.getBlock();
    	addParams(node.getParams());
    	if (node.getReturnType() != null) {

            node.getReturnType().apply(new DepthFirstAdapter() {

                @Override
                public void caseAReturnType(
                        AReturnType node) {

                    FunctionInfo.this.returnType = Type.get(node.getType());
                }
            });
        }
        else {
            this.returnType = VOID;
        }
    	
    }
    
    // constructor for lambda  function variable
    public FunctionInfo(ALambdaTerm node){
    	this.definition = node.getBlock();
    	addParams(node.getParams());
    	if (node.getReturnType() != null) {

            node.getReturnType().apply(new DepthFirstAdapter() {

                @Override
                public void caseAReturnType(
                        AReturnType node) {

                    FunctionInfo.this.returnType = Type.get(node.getType());
                }
            });
        }
        else {
            this.returnType = VOID;
        }
    	
    }
    
    // constructor for function call of anonymous function passed as parameter inside another function
    public FunctionInfo(Declaration anonFunction){
    	this.returnType = anonFunction.getAnonReturnType();
    	LinkedList<Type> anonParams = anonFunction.getAnonParameters();
    	for(int i = 0; i < anonParams.size(); i++){
    		this.params.add(new Declaration(Integer.toString(i),anonParams.get(i),null));
    	}
    }
    
    private void addParams(PParams params){
        if (params != null) {
            params.apply(new DepthFirstAdapter() {

                @Override
                public void caseAParam(
                        AParam node) {

                    String name = node.getId().getText();
                    if (FunctionInfo.this.paramNames.contains(name)) {
                        throw new SemanticException("redefinition of " + name,
                                node.getId());
                    }
                    FunctionInfo.this.paramNames.add(name);

                    FunctionInfo.this.params
                            .add(new Declaration(node.getId().getText(),
                                    Type.get(node.getType()), node.getId(), node.getType()));
                }
            });
        }
        
    }
    

    public void setParams(
            LinkedList<Value> args,
            Frame frame) {

        Iterator<Value> argIterator = args.iterator();

        for (Declaration param : this.params) {
            frame.setVariable(param.getName(), argIterator.next());
        }
    }

    public Node getBlock() {

        return this.definition;
    }

    public String getName() {

        return this.name;
    }

    public int paramCount() {

        return this.params.size();
    }

    public void populateScope(
            Scope scope) {

        for (Declaration declaration : this.params) {
            scope.addVariable(declaration);
        }
    }
    
    public void setReturnType(){
    	
    }

    public Type getReturnType() {

        return this.returnType;
    }
    

    public void verifyArgs(
            LinkedList<Type> args,
            Token location) {

        Iterator<Type> argsIterator = args.iterator();
        int i = 0;
        for (Declaration declaration : this.params) {
            ++i;
            if (!argsIterator.hasNext()) {
                throw new SemanticException("argument #" + i + " is missing",
                        location);
            }

            if (argsIterator.next() != declaration.getType()) {
                throw new SemanticException("argument #" + i + " is not of "
                        + declaration.getType() + " type", location);
            }
        }

        if (argsIterator.hasNext()) {
            throw new SemanticException(
                    "only " + i + " arguments were expected", location);
        }

    }

}
