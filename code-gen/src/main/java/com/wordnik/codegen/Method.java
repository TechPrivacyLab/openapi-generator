package com.wordnik.codegen;

import com.wordnik.codegen.resource.Model;

import java.util.List;

public class Method {

	private String description;

	private List<Argument> arguments;
	
	private List<Argument> queryParameters;	
	
	private List<Argument> pathParameters;		
	
	private String returnValue;
	
	private String returnClassName;
	
	private String exceptionDescription;
	
	private List<String> argumentDefinitions;
	
	private List<String> argumentNames;	
	
	private String name;
	
	private boolean authToken;
	
	private String resourcePath;
	
	private String methodType;
	
	private boolean postObject;
	
	private Model inputModel;
	

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Argument> getArguments() {
		return arguments;
	}

	public void setArguments(List<Argument> arguments) {
		this.arguments = arguments;
	}

	public List<Argument> getQueryParameters() {
		return queryParameters;
	}

	public void setQueryParameters(List<Argument> queryParameters) {
		this.queryParameters = queryParameters;
	}

	public List<Argument> getPathParameters() {
		return pathParameters;
	}

	public void setPathParameters(List<Argument> pathParameters) {
		this.pathParameters = pathParameters;
	}
	
	public String getReturnValue() {
		return returnValue;
	}

	public void setReturnValue(String returnValue) {
		this.returnValue = returnValue;
	}

	public String getReturnClassName() {
		return returnClassName;
	}

	public void setReturnClassName(String returnClassName) {
		this.returnClassName = returnClassName;
	}

	public String getExceptionDescription() {
		return exceptionDescription;
	}

	public void setExceptionDescription(String exceptionDescription) {
		this.exceptionDescription = exceptionDescription;
	}

	public List<String> getArgumentDefinitions() {
		return argumentDefinitions;
	}

	public void setArgumentDefinitions(List<String> argumentDefinitions) {
		this.argumentDefinitions = argumentDefinitions;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isAuthToken() {
		return authToken;
	}

	public void setAuthToken(boolean authToken) {
		this.authToken = authToken;
	}

	public String getResourcePath() {
		return resourcePath;
	}

	public void setResourcePath(String resourcePath) {
		this.resourcePath = resourcePath;
	}

	public String getMethodType() {
		return methodType;
	}

	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}

	public boolean isPostObject() {
		return postObject;
	}

	public void setPostObject(boolean postObject) {
		this.postObject = postObject;
	}

	public boolean isResponseVoid() {
		return (this.getReturnClassName().equalsIgnoreCase("void"));
	}

	public Model getInputModel() {
		return inputModel;
	}

	public void setInputModel(Model inputModel) {
		this.inputModel = inputModel;
	}

	public List<String> getArgumentNames() {
		return argumentNames;
	}

	public void setArgumentNames(List<String> argumentNames) {
		this.argumentNames = argumentNames;
	}
	
	public boolean getHasArguments() {
		if(this.getArgumentNames() != null && this.getArgumentNames().size() > 0){
			return true;
		}
		return false;
	}
	
	public boolean isReturnValueList() {
		if(this.getReturnValue().startsWith("List")){
			return true;
		}
		return false;
	}
}
