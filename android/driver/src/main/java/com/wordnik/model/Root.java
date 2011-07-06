package com.wordnik.model;

import com.wordnik.common.WordnikObject;
import com.wordnik.annotations.AllowableValues;
import com.wordnik.annotations.Required;

import com.wordnik.common.WordListType;
import java.util.List;
import java.util.ArrayList;


/**
 * 
 * NOTE: This class is auto generated by the drive code generator program so please do not edit the program manually.  
 * @author ramesh
 *
 */
public class Root extends WordnikObject {

		 //
		 private String name ;  
			 //
		 private List<Category> categories  = new ArrayList< Category>();  
		
	
		 //
		 
		 public String getName() {
		 	return name;
		 }  
		 
		 public void setName(String  name) {
		 	this.name = name;
		 }
			 //
		 
		 public List<Category> getCategories() {
		 	return categories;
		 }  
		 
		 public void setCategories(List<Category>  categories) {
		 	this.categories = categories;
		 }
		
}