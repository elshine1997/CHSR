package com.example.Chsr;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="ncc")
public class nhacungcap {

	@Id
	@Size(min=1,max=6)
	@Column(columnDefinition = "TEXT", name = "idncc", nullable = false)
	private String idncc;
	
	@Size(min=1,max=20)
	@Column(columnDefinition = "TEXT", name="tenncc",length=20)
	private String tenncc;
	
	@Size(min=1,max=50)
	@Column(columnDefinition = "TEXT", name="diachi",length=50)
	private String diachi;
	
	@Size(min=1,max=11)
	@Column(columnDefinition = "INT", name="tenncc",length=11)
	private int sodt;

	public String getIdncc() {
		return idncc;
	}

	public void setIdncc(String idncc) {
		this.idncc = idncc;
	}

	public String getTenncc() {
		return tenncc;
	}

	public void setTenncc(String tenncc) {
		this.tenncc = tenncc;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public int getSodt() {
		return sodt;
	}

	public void setSodt(int sodt) {
		this.sodt = sodt;
	}
	
	
}
