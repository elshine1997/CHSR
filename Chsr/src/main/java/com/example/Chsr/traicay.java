package com.example.Chsr;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="traicay")
public class traicay {
	
	@Id
	@Size(min = 1, max = 6)
	@Column(columnDefinition = "TEXT", name = "idtraicay", nullable = false)
	private String id_tc;
	
	@Size(min = 1, max = 20)
	@Column(columnDefinition = "TEXT", name = "tentraicay", length = 20)
	private String ten_tc;
	
	@Size(min = 1, max =6)
	@Column(columnDefinition = "TEXT", name = "idloai", length = 20)
	private String id_loai;
	
	@Column(columnDefinition = "FLOAT", name = "soluong", length = 12)
	private float soluong;
	
	@Column(columnDefinition = "FLOAT", name = "giaban", length = 15)
	private float giaban;
	
	@Size(min = 1, max = 1)
	@Column(columnDefinition = "INT", name = "status", length = 1)
	private String status;

	public String getId_tc() {
		return id_tc;
	}

	public void setId_tc(String id_tc) {
		this.id_tc = id_tc;
	}

	public String getTen_tc() {
		return ten_tc;
	}

	public void setTen_tc(String ten_tc) {
		this.ten_tc = ten_tc;
	}

	public String getId_loai() {
		return id_loai;
	}

	public void setId_loai(String id_loai) {
		this.id_loai = id_loai;
	}

	public float getSoluong() {
		return soluong;
	}

	public void setSoluong(float soluong) {
		this.soluong = soluong;
	}

	public float getGiaban() {
		return giaban;
	}

	public void setGiaban(float giaban) {
		this.giaban = giaban;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	

}
