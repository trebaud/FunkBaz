
package baz.interpreter;

import java.util.*;

import baz.semantics.*;
import baz.syntax.node.*;

public class Frame {

    private Frame parent;
    
    private Frame lexicalEnv;

    private FunctionInfo functionInfo;
    
    private LambdaInfo lambdaInfo;

    private HashMap<String, Value> variables = new HashMap<>();

    private Value returnValue = VoidValue.getInstance();

    private TId callLocation;

    public Frame(
            Frame parent,
            FunctionInfo functionInfo) {

        this.parent = parent;
        this.functionInfo = functionInfo;
    }
    
    public Frame(
            Frame parent, Frame lexicalEnv,
            LambdaInfo lambdaInfo) {

        this.parent = parent;
        this.lexicalEnv = lexicalEnv;
        this.lambdaInfo = lambdaInfo;
    }
    
    // copy constructor for closure's lexical environment frame
    public Frame(Frame lexicalEnvironment){
    	this.variables = new HashMap<String,Value>(lexicalEnvironment.getVariables());
    	this.returnValue = lexicalEnvironment.getReturnValue(null);
   
    }

    public void setVariable(
            String name,
            Value value) {
    	
    	if(variableExists(name)){
        	this.variables.put(name, value);

    	}
    	else if(lexicalEnv != null && lexicalEnv.variableExists(name)){
        	this.lexicalEnv.getVariables().put(name, value);
    	}
    }
    
    public void addVariable(
            String name,
            Value value) {
    	
    	this.variables.put(name, value);
    }

    public Value getVariable(
            TId id) {

        // vérifie si la variable existe
        String name = id.getText();
        
        if (variableExists(name)) {
            return this.variables.get(name);
        }
        if(lexicalEnv != null && lexicalEnv.variableExists(name)){
            return this.lexicalEnv.getVariables().get(name);
        }
        else{
        	throw new InterpreterException("undefined variable '" + name + "'",
                    id, this);
        }
       
    }
    
    public boolean variableExists(
            String name) {
    	return this.variables.containsKey(name);
    }
    
    public HashMap<String,Value> getVariables(){
    	return variables;
    }
    
    public void setReturnValue(
            Value value) {

        this.returnValue = value;
    }

    public Value getReturnValue(
            Token location) {

        return this.returnValue;
    }

    public void setCallLocation(
            TId callLocation) {

        this.callLocation = callLocation;
    }

    public TId getCallLocation() {

        return this.callLocation;
    }

    public Frame getParent() {

        return this.parent;
    }

    public FunctionInfo getFunctionInfo() {

        return this.functionInfo;
    }
}
