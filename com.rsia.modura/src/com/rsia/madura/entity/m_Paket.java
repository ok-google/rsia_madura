package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_paket")
public class m_Paket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="paket_id")
	private int paket_id;
	
	@Column(name="paket_nama")
	private String paketNama;
	
	@Column(name="paket_kelas")
	private int paketKelas;
	
	@Column(name="paket_keterangan")
	private String paketKeterangan;
	
	@Column(name="paket_harga")
	private int paketHarga;
	
	@Column(name="paket_jenis")
	private String paketJenis;
	
	@Column(name="paket_aktif")
	private char paketAktif;
	
	@Column(name="paket_created_by")
	private String paketCreatedBy;
	
	@Column(name="paket_created_date")
	private Timestamp paketCreatedDate;
	
	@Column(name="paket_updated_by")
	private String paketUpdatedBy;
	
	@Column(name="paket_updated_date")
	private Timestamp paketUpdatedDate;
	
	@Column(name="paket_revised")
	private int paketRevised;
	
	@Column(name="paket_deleted_date")
	private Timestamp paketDeletedDate;

	public int getPaket_id() {
		return paket_id;
	}

	public void setPaket_id(int paket_id) {
		this.paket_id = paket_id;
	}

	public String getPaketNama() {
		return paketNama;
	}

	public void setPaketNama(String paketNama) {
		this.paketNama = paketNama;
	}

	public int getPaketKelas() {
		return paketKelas;
	}

	public void setPaketKelas(int paketKelas) {
		this.paketKelas = paketKelas;
	}

	public String getPaketKeterangan() {
		return paketKeterangan;
	}

	public void setPaketKeterangan(String paketKeterangan) {
		this.paketKeterangan = paketKeterangan;
	}

	public int getPaketHarga() {
		return paketHarga;
	}

	public void setPaketHarga(int paketHarga) {
		this.paketHarga = paketHarga;
	}

	public String getPaketJenis() {
		return paketJenis;
	}

	public void setPaketJenis(String paketJenis) {
		this.paketJenis = paketJenis;
	}

	public char getPaketAktif() {
		return paketAktif;
	}

	public void setPaketAktif(char paketAktif) {
		this.paketAktif = paketAktif;
	}

	public String getPaketCreatedBy() {
		return paketCreatedBy;
	}

	public void setPaketCreatedBy(String paketCreatedBy) {
		this.paketCreatedBy = paketCreatedBy;
	}

	public Timestamp getPaketCreatedDate() {
		return paketCreatedDate;
	}

	public void setPaketCreatedDate(Timestamp paketCreatedDate) {
		this.paketCreatedDate = paketCreatedDate;
	}

	public String getPaketUpdatedBy() {
		return paketUpdatedBy;
	}

	public void setPaketUpdatedBy(String paketUpdatedBy) {
		this.paketUpdatedBy = paketUpdatedBy;
	}

	public Timestamp getPaketUpdatedDate() {
		return paketUpdatedDate;
	}

	public void setPaketUpdatedDate(Timestamp paketUpdatedDate) {
		this.paketUpdatedDate = paketUpdatedDate;
	}

	public int getPaketRevised() {
		return paketRevised;
	}

	public void setPaketRevised(int paketRevised) {
		this.paketRevised = paketRevised;
	}

	public Timestamp getPaketDeletedDate() {
		return paketDeletedDate;
	}

	public void setPaketDeletedDate(Timestamp paketDeletedDate) {
		this.paketDeletedDate = paketDeletedDate;
	}

	@Override
	public String toString() {
		return "m_Paket [paket_id=" + paket_id + ", paketNama=" + paketNama + ", paketKelas=" + paketKelas
				+ ", paketKeterangan=" + paketKeterangan + ", paketHarga=" + paketHarga + ", paketJenis=" + paketJenis
				+ ", paketAktif=" + paketAktif + ", paketCreatedBy=" + paketCreatedBy + ", paketCreatedDate="
				+ paketCreatedDate + ", paketUpdatedBy=" + paketUpdatedBy + ", paketUpdatedDate=" + paketUpdatedDate
				+ ", paketRevised=" + paketRevised + ", paketDeletedDate=" + paketDeletedDate + "]";
	}
	
	
}
