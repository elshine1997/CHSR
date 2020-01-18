package com.example.Chsr;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="lohang")
public class lohang {

	@Id
	@Size(min=1,max=6)
	@Column(columnDefinition = "TEXT", name = "idlohang", nullable = false)
	private String idlohang;
	
	@Size(min=1,max=6)
	@Column(columnDefinition = "TEXT", name="idncc",nullable = false)
	private String idncc;
	
	@Column(columnDefinition = "DATE", name="createtime",length=10)
	private Date createtime ;

	public String getIdlohang() {
		return idlohang;
	}

	public void setIdlohang(String idlohang) {
		this.idlohang = idlohang;
	}

	public String getIdncc() {
		return idncc;
	}

	public void setIdncc(String idncc) {
		this.idncc = idncc;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}
	
	
}
