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
public class WordFrequency extends WordnikObject {

		 //
		 private Long count ;  
			 //
		 private String wordstring ;  
		
	
		 //
		 
		 public Long getCount() {
		 	return count;
		 }  
		 
		 public void setCount(Long  count) {
		 	this.count = count;
		 }
			 //
		 
		 public String getWordstring() {
		 	return wordstring;
		 }  
		 
		 public void setWordstring(String  wordstring) {
		 	this.wordstring = wordstring;
		 }
		
}