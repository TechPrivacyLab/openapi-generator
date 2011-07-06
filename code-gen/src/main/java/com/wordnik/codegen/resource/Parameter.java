package com.wordnik.codegen.resource;

import com.wordnik.codegen.AttributeDefinition;
import com.wordnik.codegen.config.DataTypeMapper;

/**
 * User: ramesh
 * Date: 3/31/11
 * Time: 7:57 AM
 */
public class Parameter {
	
    private String name;

    private String wrapperName;
    
    private String description = "";

    private String defaultValue;

    private boolean required = false;

    private String allowableValues = null;

    private String paramType;

    private String dataType;

    private String internalDescription;

    private String paramAccess;

    private AttributeDefinition attributeDefinition;
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
    
	public String getWrapperName() {
		return wrapperName;
	}

	public void setWrapperName(String wrapperName) {
		this.wrapperName = wrapperName;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public boolean isRequired() {
		return required;
	}

	public void setRequired(boolean required) {
		this.required = required;
	}

	public String getAllowableValues() {
		return allowableValues;
	}

	public void setAllowableValues(String allowableValues) {
		this.allowableValues = allowableValues;
	}

	public String getParamType() {
		return paramType;
	}

	public void setParamType(String paramType) {
		this.paramType = paramType;
	}

	public String getInternalDescription() {
		return internalDescription;
	}

	public void setInternalDescription(String internalDescription) {
		this.internalDescription = internalDescription;
	}

	public String getParamAccess() {
		return paramAccess;
	}

	public void setParamAccess(String paramAccess) {
		this.paramAccess = paramAccess;
	}

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public AttributeDefinition getAttributeDefinition(){
        return attributeDefinition;
    }

    public AttributeDefinition getAttributeDefinition(DataTypeMapper dataTypeMapper) {
    	if(attributeDefinition == null) {
    		attributeDefinition = new AttributeDefinition();
	    	String type = paramType.trim();
	    	if(type.contains("date")||type.contains("Date") ){
	    		attributeDefinition.getImportDefinitions().add("java.util.Date");
	    	}
	    	if(type.startsWith("List[")){
	    		attributeDefinition.getImportDefinitions().addAll(dataTypeMapper.getListImports());
	    		String entryType = type.substring(5, type.length()-1);
	    		entryType =  dataTypeMapper.getObjectType(entryType, true);
	    		String returnType = dataTypeMapper.getListReturnType(entryType);
	    		attributeDefinition.setReturnType(returnType);
	    		attributeDefinition.setInitialization(" = " + dataTypeMapper.getListInitialization(entryType));
	    		if(this.getWrapperName() != null){
	    			attributeDefinition.setName(this.getWrapperName());
	    		}else{
	    			attributeDefinition.setName(this.getName());
	    		}
	    		
	    	}else if (type.startsWith("Map[")) {
                attributeDefinition.getImportDefinitions().addAll(dataTypeMapper.getMapImports());
	    		String entryType = type.substring(4, type.length()-1);
	    		entryType =  dataTypeMapper.getObjectType(entryType, true);
	    		String returnType = dataTypeMapper.getMapReturnType(entryType);
	    		attributeDefinition.setReturnType(returnType);
	    		attributeDefinition.setInitialization("= " + dataTypeMapper.getMapInitialization(entryType));
	    		if(this.getWrapperName() != null){
	    			attributeDefinition.setName(this.getWrapperName());
	    		}else{
	    			attributeDefinition.setName(this.getName());
	    		}
	    	}else{
	    		attributeDefinition.setReturnType(dataTypeMapper.getObjectType(type, false));
	    		attributeDefinition.setName(this.getName());
	    	}
	    	
    	}
    	return attributeDefinition;
    }
    
}
