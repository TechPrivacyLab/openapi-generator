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
public class WordsSearchInput extends WordnikObject {

		 //Search term
		 private String query ;  
			 //Search case sensitive
		 private String caseSensitive ;  
			 //Only include these comma-delimited parts of speech
		 private String includePartOfSpeech ;  
			 //Exclude these comma-delimited parts of speech
		 private String excludePartOfSpeech ;  
			 //Minimum corpus frequency for terms
		 private String minCorpusCount ;  
			 //Maximum corpus frequency for terms
		 private String maxCorpusCount ;  
			 //Minimum number of dictionary entries
		 private String minDictionaryCount ;  
			 //Maximum dictionary count
		 private String maxDictionaryCount ;  
			 //Minimum word length
		 private String minLength ;  
			 //Maximum word length
		 private String maxLength ;  
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
			 //Search case sensitive
		 @AllowableValues(value="true | false")	 
		 public String getCaseSensitive() {
		 	return caseSensitive;
		 }  
		 
		 public void setCaseSensitive(String  caseSensitive) {
		 	this.caseSensitive = caseSensitive;
		 }
			 //Only include these comma-delimited parts of speech
		 @AllowableValues(value="noun,adjective,verb,adverb,interjection,pronoun,preposition,abbreviation,affix,article,auxiliary-verb,conjunction,definite-article,family-name,given-name,idiom,imperative,noun-plural,noun-posessive,past-participle,phrasal-prefix,proper-noun,proper-noun-plural,proper-noun-posessive,suffix,verb-intransitive,verb-transitive")	 
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
			 //Minimum number of dictionary entries
		 @AllowableValues(value="non-negative integer")	 
		 public String getMinDictionaryCount() {
		 	return minDictionaryCount;
		 }  
		 
		 public void setMinDictionaryCount(String  minDictionaryCount) {
		 	this.minDictionaryCount = minDictionaryCount;
		 }
			 //Maximum dictionary count
		 @AllowableValues(value="non-negative integer")	 
		 public String getMaxDictionaryCount() {
		 	return maxDictionaryCount;
		 }  
		 
		 public void setMaxDictionaryCount(String  maxDictionaryCount) {
		 	this.maxDictionaryCount = maxDictionaryCount;
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