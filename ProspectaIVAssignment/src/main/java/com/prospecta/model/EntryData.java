package com.prospecta.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EntryData implements Serializable{
	
	private String API;
	private String description;
	private String auth;
	private boolean https;
	private String Cors;
	
	
	@Id
	private String link;
	private String category;
	
	
	
	
	
	

}
