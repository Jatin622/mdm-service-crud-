package com.mdm.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;




@Entity
@Table(name="source")
public class Source   {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer id;
	
	public String source_type;
	
	@OneToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY, mappedBy = "source")
	@JsonBackReference
	

	public ConnectorModel connectorModel;
	
	
	
	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getSource_type() {
		return source_type;
	}



	public void setSource_type(String source_type) {
		this.source_type = source_type;
	}



	public Source() {
		
	}



	public Source(Integer id, String source_type) {
		
		this.id = id;
		this.source_type = source_type;
	}

}
