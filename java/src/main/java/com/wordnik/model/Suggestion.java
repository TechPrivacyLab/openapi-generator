package com.wordnik.model;

import com.wordnik.common.WordnikObject;
import com.wordnik.annotations.AllowableValues;
import com.wordnik.annotations.Required;

import com.wordnik.common.WordListType;
import com.wordnik.common.StringValue;
import com.wordnik.common.Size;


/**
 * 
 * NOTE: This class is auto generated by the drive code generator program so please do not edit the program manually.  
 * @author ramesh
 *
 */
public class Suggestion extends WordnikObject {

		 //
		 private int type ;  
			 //
		 private String wordstring ;  
		
	
		 //
		 
		 public int getType() {
		 	return type;
		 }  
		 
		 public void setType(int  type) {
		 	this.type = type;
		 }
			 //
		 
		 public String getWordstring() {
		 	return wordstring;
		 }  
		 
		 public void setWordstring(String  wordstring) {
		 	this.wordstring = wordstring;
		 }
		
}