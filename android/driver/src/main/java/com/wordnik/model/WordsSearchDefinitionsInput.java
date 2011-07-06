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
public class WordsSearchDefinitionsInput extends WordnikObject {

		 //Search term
		 private String query ;  
			 //Defined word search term
		 private String definedWordSearchTerm ;  
			 //Only include these comma-delimited source dictionaries
		 private String includeSourceDictionaries ;  
			 //Exclude these comma-delimited source dictionaries
		 private String excludeSourceDictionaries ;  
			 //Only include these comma-delimited parts of speech
		 private String includePartOfSpeech ;  
			 //Exclude these comma-delimited parts of speech
		 private String excludePartOfSpeech ;  
			 //Minimum corpus frequency for terms
		 private String minCorpusCount ;  
			 //Maximum corpus frequency for terms
		 private String maxCorpusCount ;  
			 //Minimum word length
		 private String minLength ;  
			 //Maximum word length
		 private String maxLength ;  
			 //Expand terms
		 private String expandTerms ;  
			 //Word types
		 private String wordTypes ;  
			 //Return a closed set of XML tags in response
		 private String includeTags ;  
			 //Attribute to sort by
		 private String sortBy ;  
			 //Sort direction
		 private String sortOrder ;  
			 //Results to skip
		 private String skip ;  
			 //Maximum number of results to return
		 private String limit ;  
		
	
		 //Search term
		 
		 public String getQuery() {
		 	return query;
		 }  
		 
		 public void setQuery(String  query) {
		 	this.query = query;
		 }
			 //Defined word search term
		 
		 public String getDefinedWordSearchTerm() {
		 	return definedWordSearchTerm;
		 }  
		 
		 public void setDefinedWordSearchTerm(String  definedWordSearchTerm) {
		 	this.definedWordSearchTerm = definedWordSearchTerm;
		 }
			 //Only include these comma-delimited source dictionaries
		 @AllowableValues(value="ahd, century, wiktionary, webster, wordnet")	 
		 public String getIncludeSourceDictionaries() {
		 	return includeSourceDictionaries;
		 }  
		 
		 public void setIncludeSourceDictionaries(String  includeSourceDictionaries) {
		 	this.includeSourceDictionaries = includeSourceDictionaries;
		 }
			 //Exclude these comma-delimited source dictionaries
		 @AllowableValues(value="ahd, century, wiktionary, webster, wordnet")	 
		 public String getExcludeSourceDictionaries() {
		 	return excludeSourceDictionaries;
		 }  
		 
		 public void setExcludeSourceDictionaries(String  excludeSourceDictionaries) {
		 	this.excludeSourceDictionaries = excludeSourceDictionaries;
		 }
			 //Only include these comma-delimited parts of speech
		 
		 public String getIncludePartOfSpeech() {
		 	return includePartOfSpeech;
		 }  
		 
		 public void setIncludePartOfSpeech(String  includePartOfSpeech) {
		 	this.includePartOfSpeech = includePartOfSpeech;
		 }
			 //Exclude these comma-delimited parts of speech
		 
		 public String getExcludePartOfSpeech() {
		 	return excludePartOfSpeech;
		 }  
		 
		 public void setExcludePartOfSpeech(String  excludePartOfSpeech) {
		 	this.excludePartOfSpeech = excludePartOfSpeech;
		 }
			 //Minimum corpus frequency for terms
		 @AllowableValues(value="non-negative integer")	 
		 public String getMinCorpusCount() {
		 	return minCorpusCount;
		 }  
		 
		 public void setMinCorpusCount(String  minCorpusCount) {
		 	this.minCorpusCount = minCorpusCount;
		 }
			 //Maximum corpus frequency for terms
		 @AllowableValues(value="non-negative integer")	 
		 public String getMaxCorpusCount() {
		 	return maxCorpusCount;
		 }  
		 
		 public void setMaxCorpusCount(String  maxCorpusCount) {
		 	this.maxCorpusCount = maxCorpusCount;
		 }
			 //Minimum word length
		 @AllowableValues(value="0 to 1024")	 
		 public String getMinLength() {
		 	return minLength;
		 }  
		 
		 public void setMinLength(String  minLength) {
		 	this.minLength = minLength;
		 }
			 //Maximum word length
		 @AllowableValues(value="0 to 1024")	 
		 public String getMaxLength() {
		 	return maxLength;
		 }  
		 
		 public void setMaxLength(String  maxLength) {
		 	this.maxLength = maxLength;
		 }
			 //Expand terms
		 @AllowableValues(value="synonym,hypernym")	 
		 public String getExpandTerms() {
		 	return expandTerms;
		 }  
		 
		 public void setExpandTerms(String  expandTerms) {
		 	this.expandTerms = expandTerms;
		 }
			 //Word types
		 @AllowableValues(value="word,multi-word-unit")	 
		 public String getWordTypes() {
		 	return wordTypes;
		 }  
		 
		 public void setWordTypes(String  wordTypes) {
		 	this.wordTypes = wordTypes;
		 }
			 //Return a closed set of XML tags in response
		 @AllowableValues(value="false,true")	 
		 public String getIncludeTags() {
		 	return includeTags;
		 }  
		 
		 public void setIncludeTags(String  includeTags) {
		 	this.includeTags = includeTags;
		 }
			 //Attribute to sort by
		 @AllowableValues(value="alpha,count,length")	 
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
			 //Results to skip
		 @AllowableValues(value="0 to 1000")	 
		 public String getSkip() {
		 	return skip;
		 }  
		 
		 public void setSkip(String  skip) {
		 	this.skip = skip;
		 }
			 //Maximum number of results to return
		 @AllowableValues(value="1 to 1000")	 
		 public String getLimit() {
		 	return limit;
		 }  
		 
		 public void setLimit(String  limit) {
		 	this.limit = limit;
		 }
		
}