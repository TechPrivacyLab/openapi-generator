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
public class Bigram extends WordnikObject {

		 //
		 private Long count ;  
			 //
		 private String gram1 ;  
			 //
		 private String gram2 ;  
			 //
		 private Double mi ;  
			 //
		 private Double wlmi ;  
		
	
		 //
		 
		 public Long getCount() {
		 	return count;
		 }  
		 
		 public void setCount(Long  count) {
		 	this.count = count;
		 }
			 //
		 
		 public String getGram1() {
		 	return gram1;
		 }  
		 
		 public void setGram1(String  gram1) {
		 	this.gram1 = gram1;
		 }
			 //
		 
		 public String getGram2() {
		 	return gram2;
		 }  
		 
		 public void setGram2(String  gram2) {
		 	this.gram2 = gram2;
		 }
			 //
		 
		 public Double getMi() {
		 	return mi;
		 }  
		 
		 public void setMi(Double  mi) {
		 	this.mi = mi;
		 }
			 //
		 
		 public Double getWlmi() {
		 	return wlmi;
		 }  
		 
		 public void setWlmi(Double  wlmi) {
		 	this.wlmi = wlmi;
		 }
		
}