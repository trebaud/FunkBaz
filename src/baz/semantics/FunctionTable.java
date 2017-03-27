
package baz.semantics;

import java.util.*;

import baz.syntax.node.*;

public class FunctionTable {

    private LinkedHashMap<String, FunctionInfo> functions = new LinkedHashMap<String, FunctionInfo>();

    public void addFunction(
            AFunc node) {

        String name = node.getName().getText();
        if (this.functions.containsKey(name)) {
            throw new SemanticException(
                    "function '" + name + "' is already defined",
                    node.getName());
        }

        this.functions.put(name, new FunctionInfo(node));
    }
    
    public void addFunction(String name,ClosureInfo node){
         if (this.functions.containsKey(name)) {
             //throw new SemanticException(
               //      "function '" + name + "' is already defined",
                 //    node.get());
         }

         this.functions.put(name, new FunctionInfo(node));
    }

    public Collection<FunctionInfo> getFunctions() {

        return this.functions.values();
    }

    public FunctionInfo getFunctionInfo(
            TId id) {

        String name = id.getText();
        return this.functions.get(name);
    }
}
