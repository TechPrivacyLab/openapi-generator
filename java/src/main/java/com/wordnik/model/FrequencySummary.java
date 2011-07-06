package com.wordnik.model;

import com.wordnik.common.WordnikObject;
import com.wordnik.annotations.AllowableValues;
import com.wordnik.annotations.Required;

import com.wordnik.common.WordListType;
import com.wordnik.common.StringValue;
import com.wordnik.common.Size;
import java.util.List;
import java.util.ArrayList;


/**
 * 
 * NOTE: This class is auto generated by the drive code generator program so please do not edit the program manually.  
 * @author ramesh
 *
 */
public class FrequencySummary extends WordnikObject {

		 //
		 private String word ;  
			 //
		 private Long totalCount ;  
			 //
		 private List<Frequency> frequency  =  new ArrayList<Frequency>();  
			 //
		 private int unknownYearCount ;  
		
	
		 //
		 
		 public String getWord() {
		 	return word;
		 }  
		 
		 public void setWord(String  word) {
		 	this.word = word;
		 }
			 //
		 
		 public Long getTotalCount() {
		 	return totalCount;
		 }  
		 
		 public void setTotalCount(Long  totalCount) {
		 	this.totalCount = totalCount;
		 }
			 //
		 
		 public List<Frequency> getFrequency() {
		 	return frequency;
		 }  
		 
		 public void setFrequency(List<Frequency>  frequency) {
		 	this.frequency = frequency;
		 }
			 //
		 
		 public int getUnknownYearCount() {
		 	return unknownYearCount;
		 }  
		 
		 public void setUnknownYearCount(int  unknownYearCount) {
		 	this.unknownYearCount = unknownYearCount;
		 }
		
}