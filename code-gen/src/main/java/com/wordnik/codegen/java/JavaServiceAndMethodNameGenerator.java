package com.wordnik.codegen.java;

import com.wordnik.codegen.resource.Model;
import com.wordnik.codegen.config.ServiceAndMethodNameGenerator;
import com.wordnik.exception.CodeGenerationException;

/**
 * User: ramesh
 * Date: 5/31/11
 * Time: 7:03 AM
 */
public class JavaServiceAndMethodNameGenerator implements ServiceAndMethodNameGenerator {

    /**
     * gets the name of class that is responsible for tracking current library version
     * @return
     */
    public String getVersionCheckerClassName() {
        return "VersionChecker";
    }

    /**
     * Converts the first character of the input into string.
     * Example: If the input is word, the return value will be Word
     * @param input
     * @return
     */
    public String convertToClassNameFormat(String input) {
    	if(input != null && input.length() > 0) {
    		return input.substring(0,1).toUpperCase() + input.substring(1);
    	}else{
    		throw new CodeGenerationException("Error converting input to first letter caps becuase of null input");
    	}
    }

    /**
     * Converts the first character of the input into string.
     * Example: If the input is word, the return value will be Word
     * @param input
     * @return
     */
    public String convertToMethodNameFormat(String input) {
    	if(input != null && input.length() > 0) {
    		return input.substring(0,1).toLowerCase() + input.substring(1);
    	}else{
    		throw new CodeGenerationException("Error converting input to first letter to lower because of null input");
    	}
    }

     public String getServiceName(String resourcePath) {
         String className = null;
         int index = resourcePath.indexOf(".");
         if(index >= 0) {
             String resourceName = resourcePath.substring(1,index);
             className = convertToClassNameFormat(resourceName);
         }else{
             String[] paths = resourcePath.split("/");
             for(String path : paths) {
                 if(path != null && path.length() > 0) {
                     className = convertToClassNameFormat(path);
                     break;
                 }
             }
         }
         return className+ "API";
     }

    /**
     * Generates the name of service methods.
     *
     * Resource documentation provides suggested names. Individual language can choose to use suggested name or
     * generate the name based on end point path. Example: IN java we use suggested name
     *
     * @param endPoint
     * @param suggestedName
     * @return
     */
    public String getMethodName(String endPoint, String suggestedName) {
        return suggestedName;
    }


    public String getInputObjectName(String serviceName, String resourcePath) {

        String inputobjectName = serviceName.substring(0, serviceName.length() - 3);

        String[] pathElements = resourcePath.split("/");
        StringBuilder urlPath = new StringBuilder("");
        if(pathElements != null){
            for(int i=0; i < pathElements.length; i++){
                String pathElement  = pathElements[i];
                if(pathElement != null && pathElement.length() > 0) {
                    int position = pathElement.indexOf("{");
                    if(position < 0) {
                        inputobjectName = inputobjectName + convertToClassNameFormat(pathElement) + Model.INPUT_OBJECT_SUFFIX;
                    }
                }
            }
        }
        return inputobjectName;
    }

    /**
     * Gets the signature of the method that gets value for give attribute name.
     *
     * Example: If class name is user and attibute name is email the out in java language will be
     *  <code>user.getEmail()</code>
     *
     * @param className
     * @param attributeName
     * @return
     */
    public String createGetterMethodName(String className, String attributeName) {
        return className+".get"+convertToClassNameFormat(attributeName)+"()";
    }

}
