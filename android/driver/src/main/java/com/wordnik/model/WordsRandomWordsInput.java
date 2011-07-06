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
public class WordsRandomWordsInput extends WordnikObject {

		 //Only return words with dictionary definitions
		 private String hasDictionaryDef ;  
			 //CSV part-of-speech values to include
		 private String includePartOfSpeech ;  
			 //CSV part-of-speech values to exclude
		 private String excludePartOfSpeech ;  
			 //Minimum corpus frequency for terms (integer)
		 private String minCorpusCount ;  
			 //Maximum corpus frequency for terms (integer)
		 private String maxCorpusCount ;  
			 //Minimum dictionary count (integer)
		 private String minDictionaryCount ;  
			 //Maximum dictionary count (integer)
		 private String maxDictionaryCount ;  
			 //Minimum word length (characters)
		 private String minLength ;  
			 //Maximum word length (characters)
		 private String maxLength ;  
			 //Attribute to sort by
		 private String sortBy ;  
			 //Sort direction
		 private String sortOrder ;  
			 //Maximum number of results to return (integer)
		 private String limit ;  
		
	
		 //Only return words with dictionary definitions
		 
		 public String getHasDictionaryDef() {
		 	return hasDictionaryDef;
		 }  
		 
		 public void setHasDictionaryDef(String  hasDictionaryDef) {
		 	this.hasDictionaryDef = hasDictionaryDef;
		 }
			 //CSV part-of-speech values to include
		 
		 public String getIncludePartOfSpeech() {
		 	return includePartOfSpeech;
		 }  
		 
		 public void setIncludePartOfSpeech(String  includePartOfSpeech) {
		 	this.includePartOfSpeech = includePartOfSpeech;
		 }
			 //CSV part-of-speech values to exclude
		 
		 public String getExcludePartOfSpeech() {
		 	return excludePartOfSpeech;
		 }  
		 
		 public void setExcludePartOfSpeech(String  excludePartOfSpeech) {
		 	this.excludePartOfSpeech = excludePartOfSpeech;
		 }
			 //Minimum corpus frequency for terms (integer)
		 
		 public String getMinCorpusCount() {
		 	return minCorpusCount;
		 }  
		 
		 public void setMinCorpusCount(String  minCorpusCount) {
		 	this.minCorpusCount = minCorpusCount;
		 }
			 //Maximum corpus frequency for terms (integer)
		 
		 public String getMaxCorpusCount() {
		 	return maxCorpusCount;
		 }  
		 
		 public void setMaxCorpusCount(String  maxCorpusCount) {
		 	this.maxCorpusCount = maxCorpusCount;
		 }
			 //Minimum dictionary count (integer)
		 
		 public String getMinDictionaryCount() {
		 	return minDictionaryCount;
		 }  
		 
		 public void setMinDictionaryCount(String  minDictionaryCount) {
		 	this.minDictionaryCount = minDictionaryCount;
		 }
			 //Maximum dictionary count (integer)
		 
		 public String getMaxDictionaryCount() {
		 	return maxDictionaryCount;
		 }  
		 
		 public void setMaxDictionaryCount(String  maxDictionaryCount) {
		 	this.maxDictionaryCount = maxDictionaryCount;
		 }
			 //Minimum word length (characters)
		 
		 public String getMinLength() {
		 	return minLength;
		 }  
		 
		 public void setMinLength(String  minLength) {
		 	this.minLength = minLength;
		 }
			 //Maximum word length (characters)
		 
		 public String getMaxLength() {
		 	return maxLength;
		 }  
		 
		 public void setMaxLength(String  maxLength) {
		 	this.maxLength = maxLength;
		 }
			 //Attribute to sort by
		 @AllowableValues(value="alpha,count")	 
		 public String getSortBy() {
		 	return sortBy;
		 }  
		 
		 public void setSortBy(String  sortBy) {
		 	this.sortBy = sortBy;
		 }
			 //Sort direction
		 @AllowableValues(value="asc,desc")	 
		 public String getSortOrder() {
		 	return sortOrder;
		 }  
		 
		 public void setSortOrder(String  sortOrder) {
		 	this.sortOrder = sortOrder;
		 }
			 //Maximum number of results to return (integer)
		 
		 public String getLimit() {
		 	return limit;
		 }  
		 
		 public void setLimit(String  limit) {
		 	this.limit = limit;
		 }
		
}