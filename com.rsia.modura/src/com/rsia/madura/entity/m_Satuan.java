package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_satuan")
public class m_Satuan {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="satuan_id")
	private int satuan_id;
	
	@Column(name="satuan_kode")
	private String satuanKode;
	
	@Column(name="satuan_nama")
	private String satuanNama;
	
	@Column(name="satuan_kategori")
	private String satuanKategori;
	
	@Column(name="satuan_aktif")
	private char satuanAktif;
	
	@Column(name="satuan_created_by")
	private String satuanCreatedBy;
	
	@Column(name="satuan_created_date")
	private Timestamp satuanCreatedDate;
	
	@Column(name="satuan_updated_by")
	private String satuanUpdatedBy;
	
	@Column(name="satuan_updated_date")
	private Timestamp satuanUpdatedDate;
	
	@Column(name="satuan_revised")
	private int satuanRevised;
	
	@Column(name="satuan_deleted_date")
	private Timestamp satuanDeletedDate;

	public int getSatuan_id() {
		return satuan_id;
	}

	public void setSatuan_id(int satuan_id) {
		this.satuan_id = satuan_id;
	}

	public String getSatuanKode() {
		return satuanKode;
	}

	public void setSatuanKode(String satuanKode) {
		this.satuanKode = satuanKode;
	}

	public String getSatuanNama() {
		return satuanNama;
	}

	public void setSatuanNama(String satuanNama) {
		this.satuanNama = satuanNama;
	}

	public String getSatuanKategori() {
		return satuanKategori;
	}

	public void setSatuanKategori(String satuanKategori) {
		this.satuanKategori = satuanKategori;
	}

	public char getSatuanAktif() {
		return satuanAktif;
	}

	public void setSatuanAktif(char satuanAktif) {
		this.satuanAktif = satuanAktif;
	}

	public String getSatuanCreatedBy() {
		return satuanCreatedBy;
	}

	public void setSatuanCreatedBy(String satuanCreatedBy) {
		this.satuanCreatedBy = satuanCreatedBy;
	}

	public Timestamp getSatuanCreatedDate() {
		return satuanCreatedDate;
	}

	public void setSatuanCreatedDate(Timestamp satuanCreatedDate) {
		this.satuanCreatedDate = satuanCreatedDate;
	}

	public String getSatuanUpdatedBy() {
		return satuanUpdatedBy;
	}

	public void setSatuanUpdatedBy(String satuanUpdatedBy) {
		this.satuanUpdatedBy = satuanUpdatedBy;
	}

	public Timestamp getSatuanUpdatedDate() {
		return satuanUpdatedDate;
	}

	public void setSatuanUpdatedDate(Timestamp satuanUpdatedDate) {
		this.satuanUpdatedDate = satuanUpdatedDate;
	}

	public int getSatuanRevised() {
		return satuanRevised;
	}

	public void setSatuanRevised(int satuanRevised) {
		this.satuanRevised = satuanRevised;
	}

	public Timestamp getSatuanDeletedDate() {
		return satuanDeletedDate;
	}

	public void setSatuanDeletedDate(Timestamp satuanDeletedDate) {
		this.satuanDeletedDate = satuanDeletedDate;
	}

	@Override
	public String toString() {
		return "m_Satuan [satuan_id=" + satuan_id + ", satuanKode=" + satuanKode + ", satuanNama=" + satuanNama
				+ ", satuanKategori=" + satuanKategori + ", satuanAktif=" + satuanAktif + ", satuanCreatedBy="
				+ satuanCreatedBy + ", satuanCreatedDate=" + satuanCreatedDate + ", satuanUpdatedBy=" + satuanUpdatedBy
				+ ", satuanUpdatedDate=" + satuanUpdatedDate + ", satuanRevised=" + satuanRevised
				+ ", satuanDeletedDate=" + satuanDeletedDate + "]";
	}
	
	
}
