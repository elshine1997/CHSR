package com.example.Chsr;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "hoadon")
public class hoadon {

	@Id
	@Size(min = 1, max = 6)
	@Column(columnDefinition = "TEXT", name = "idhoadon", nullable = false)
	private String id_hd;

	@Column(columnDefinition = "FLOAT", name = "tongtienban", length = 12)
	private float tongtienban;

	@Size(min = 1, max = 30)
	@Column(columnDefinition = "TEXT", name = "tenkh", length = 30)
	private String tenkh;

	public String getId_hd() {
		return id_hd;
	}

	public void setId_hd(String id_hd) {
		this.id_hd = id_hd;
	}

	public float getTongtienban() {
		return tongtienban;
	}

	public void setTongtienban(float tongtienban) {
		this.tongtienban = tongtienban;
	}

	public String getTenkh() {
		return tenkh;
	}

	public void setTenkh(String tenkh) {
		this.tenkh = tenkh;
	}

}
