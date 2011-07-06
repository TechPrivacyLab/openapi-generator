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
public class WordPronunciationsInput extends WordnikObject {

		 //Word to get pronunciations for
		 private String word ;  
			 //If true will try to return a correct word root ('cats' -> 'cat'). If false returns exactly what was requested.
		 private String useCanonical ;  
			 //Get from a single dictionary.
		 private String sourceDictionary ;  
			 //Text pronunciation type
		 private String typeFormat ;  
			 //Maximum number of results to return
		 private String limit ;  
		
	
		 //Word to get pronunciations for
		 
		 public String getWord() {
		 	return word;
		 }  
		 
		 public void setWord(String  word) {
		 	this.word = word;
		 }
			 //If true will try to return a correct word root ('cats' -> 'cat'). If false returns exactly what was requested.
		 
		 public String getUseCanonical() {
		 	return useCanonical;
		 }  
		 
		 public void setUseCanonical(String  useCanonical) {
		 	this.useCanonical = useCanonical;
		 }
			 //Get from a single dictionary.
		 @AllowableValues(value="ahd,century,cmu,macmillan,wiktionary,webster,wordnet")	 
		 public String getSourceDictionary() {
		 	return sourceDictionary;
		 }  
		 
		 public void setSourceDictionary(String  sourceDictionary) {
		 	this.sourceDictionary = sourceDictionary;
		 }
			 //Text pronunciation type
		 @AllowableValues(value="ahd,arpabet,gcide-diacritical,IPA")	 
		 public String getTypeFormat() {
		 	return typeFormat;
		 }  
		 
		 public void setTypeFormat(String  typeFormat) {
		 	this.typeFormat = typeFormat;
		 }
			 //Maximum number of results to return
		 
		 public String getLimit() {
		 	return limit;
		 }  
		 
		 public void setLimit(String  limit) {
		 	this.limit = limit;
		 }
		
}