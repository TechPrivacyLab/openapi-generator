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
public class Sentence extends WordnikObject {

		 //
		 private Long id ;  
			 //
		 private List<ScoredWord> scoredWords  = new ArrayList< ScoredWord>();  
			 //
		 private String display ;  
			 //
		 private Long documentMetadataId ;  
			 //
		 private int rating ;  
		
	
		 //
		 
		 public Long getId() {
		 	return id;
		 }  
		 
		 public void setId(Long  id) {
		 	this.id = id;
		 }
			 //
		 
		 public List<ScoredWord> getScoredWords() {
		 	return scoredWords;
		 }  
		 
		 public void setScoredWords(List<ScoredWord>  scoredWords) {
		 	this.scoredWords = scoredWords;
		 }
			 //
		 
		 public String getDisplay() {
		 	return display;
		 }  
		 
		 public void setDisplay(String  display) {
		 	this.display = display;
		 }
			 //
		 
		 public Long getDocumentMetadataId() {
		 	return documentMetadataId;
		 }  
		 
		 public void setDocumentMetadataId(Long  documentMetadataId) {
		 	this.documentMetadataId = documentMetadataId;
		 }
			 //
		 
		 public int getRating() {
		 	return rating;
		 }  
		 
		 public void setRating(int  rating) {
		 	this.rating = rating;
		 }
		
}