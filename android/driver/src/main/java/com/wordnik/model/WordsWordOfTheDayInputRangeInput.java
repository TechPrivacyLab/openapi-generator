package com.wordnik.model;

import com.wordnik.common.WordnikObject;
import com.wordnik.annotations.AllowableValues;
import com.wordnik.annotations.Required;

import com.wordnik.common.WordListType;


/**
 * 
 * NOTE: This class is auto generated by the drive code generator program so please do not edit the program manually.  
 * @author ramesh
 *
 */
public class WordsWordOfTheDayInputRangeInput extends WordnikObject {

		 //Filters response by category
		 private String category ;  
			 //Filters response by username
		 private String creator ;  
			 //Filters response by ContentProvider
		 private String provider ;  
			 //Results to skip
		 private String skip ;  
			 //Maximum number of results to return
		 private String limit ;  
		
	
		 //Filters response by category
		 
		 public String getCategory() {
		 	return category;
		 }  
		 
		 public void setCategory(String  category) {
		 	this.category = category;
		 }
			 //Filters response by username
		 
		 public String getCreator() {
		 	return creator;
		 }  
		 
		 public void setCreator(String  creator) {
		 	this.creator = creator;
		 }
			 //Filters response by ContentProvider
		 
		 public String getProvider() {
		 	return provider;
		 }  
		 
		 public void setProvider(String  provider) {
		 	this.provider = provider;
		 }
			 //Results to skip
		 
		 public String getSkip() {
		 	return skip;
		 }  
		 
		 public void setSkip(String  skip) {
		 	this.skip = skip;
		 }
			 //Maximum number of results to return
		 
		 public String getLimit() {
		 	return limit;
		 }  
		 
		 public void setLimit(String  limit) {
		 	this.limit = limit;
		 }
		
}