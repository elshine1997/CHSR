package com.example.Chsr;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "loaitraicay")
public class loaitraicay {

	@Id
	@Size(min = 1, max = 6)
	@Column(columnDefinition = "TEXT", name = "idloai", nullable = false)
	private String idloai;

	@Size(min = 1, max = 20)
	@Column(columnDefinition = "TEXT", name = "tenloai", length = 20)
	private String tenloai;

	public String getIdloai() {
		return idloai;
	}

	public void setIdloai(String idloai) {
		this.idloai = idloai;
	}

	public String getTenloai() {
		return tenloai;
	}

	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
	}

}
