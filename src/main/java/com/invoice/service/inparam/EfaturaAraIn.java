package com.invoice.service.inparam;

import java.io.Serializable;

public class EfaturaAraIn implements Serializable {
	private static final long serialVersionUID = 1L;
	private String musno;
	public String getMusno() {
		return musno;
	}
	public void setMusno(String musno) {
		this.musno = musno;
	}
}
