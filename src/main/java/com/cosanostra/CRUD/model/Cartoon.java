package com.cosanostra.CRUD.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Cartoon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private Integer id;
	
	private String ctnName;
	private String chanName;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCtnName() {
		return ctnName;
	}
	public void setCtnName(String ctnName) {
		this.ctnName = ctnName;
	}
	public String getChanName() {
		return chanName;
	}
	public void setChanName(String chanName) {
		this.chanName = chanName;
	}
	public Cartoon(Integer id, String ctnName, String chanName) {
		super();
		this.id = id;
		this.ctnName = ctnName;
		this.chanName = chanName;
	}
	public Cartoon() {
		super();
	}
	
}
