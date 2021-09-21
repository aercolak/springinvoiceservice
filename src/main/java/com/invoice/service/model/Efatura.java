package com.invoice.service.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Efatura implements Serializable  {
	
	private static final long serialVersionUID = 1L;

	@Id
	private Long id;
	
	private String MUSNO;
	
	private String FATURATRH;
	
	private String efatura;
	
	private String tevkifat;
	

	public String getMUSNO() {
		return MUSNO;
	}

	public void setMUSNO(String mUSNO) {
		MUSNO = mUSNO;
	}

	public String getFATURATRH() {
		return FATURATRH;
	}

	public void setFATURATRH(String fATURATRH) {
		FATURATRH = fATURATRH;
	}

	public String getEfatura() {
		return efatura;
	}

	public void setEfatura(String efatura) {
		this.efatura = efatura;
	}

	public String getTevkifat() {
		return tevkifat;
	}

	public void setTevkifat(String tevkifat) {
		this.tevkifat = tevkifat;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
