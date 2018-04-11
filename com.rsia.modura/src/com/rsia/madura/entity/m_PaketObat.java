package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_paket_obat")
public class m_PaketObat {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="paket_barang_id")
	private int paketBarang_id;
	
	@Column(name="m_paket_id")
	private int paketId;
	
	@Column(name="m_barang_id")
	private int barangId;
	
	@Column(name="m_kelas_id")
	private int kelasId;
	
	@Column(name="paket_barang_jumlah")
	private int paketBarangJumlah;
	  
	@Column(name="paket_barang_harga")
	private int paketBarangHarga;
	
	@Column(name="paket_satuan_id")
	private int satuanId;
	
	@Column(name="paket_barang_aktif")
	private char paketBarangAktif;
	
	@Column(name="paket_barang_created_by")
	private String paketBarangCreatedBy;
	
	@Column(name="paket_barang_created_date")
	private Timestamp paketBarangCreatedDate;
	
	@Column(name="paket_barang_updated_by")
	private String paketBarangUpdatedBy;
	
	@Column(name="paket_barang_updated_date")
	private Timestamp paketBarangUpdatedDate;
	
	@Column(name="paket_barang_revised")
	private int paketBarangRevised;
	
	@Column(name="paket_barang_deleted_date")
	private Timestamp paketBarangDeletedBy;

	public int getPaketBarang_id() {
		return paketBarang_id;
	}

	public void setPaketBarang_id(int paketBarang_id) {
		this.paketBarang_id = paketBarang_id;
	}

	public int getPaketId() {
		return paketId;
	}

	public void setPaketId(int paketId) {
		this.paketId = paketId;
	}

	public int getBarangId() {
		return barangId;
	}

	public void setBarangId(int barangId) {
		this.barangId = barangId;
	}

	public int getKelasId() {
		return kelasId;
	}

	public void setKelasId(int kelasId) {
		this.kelasId = kelasId;
	}

	public int getPaketBarangJumlah() {
		return paketBarangJumlah;
	}

	public void setPaketBarangJumlah(int paketBarangJumlah) {
		this.paketBarangJumlah = paketBarangJumlah;
	}

	public int getPaketBarangHarga() {
		return paketBarangHarga;
	}

	public void setPaketBarangHarga(int paketBarangHarga) {
		this.paketBarangHarga = paketBarangHarga;
	}

	public int getSatuanId() {
		return satuanId;
	}

	public void setSatuanId(int satuanId) {
		this.satuanId = satuanId;
	}

	public char getPaketBarangAktif() {
		return paketBarangAktif;
	}

	public void setPaketBarangAktif(char paketBarangAktif) {
		this.paketBarangAktif = paketBarangAktif;
	}

	public String getPaketBarangCreatedBy() {
		return paketBarangCreatedBy;
	}

	public void setPaketBarangCreatedBy(String paketBarangCreatedBy) {
		this.paketBarangCreatedBy = paketBarangCreatedBy;
	}

	public Timestamp getPaketBarangCreatedDate() {
		return paketBarangCreatedDate;
	}

	public void setPaketBarangCreatedDate(Timestamp paketBarangCreatedDate) {
		this.paketBarangCreatedDate = paketBarangCreatedDate;
	}

	public String getPaketBarangUpdatedBy() {
		return paketBarangUpdatedBy;
	}

	public void setPaketBarangUpdatedBy(String paketBarangUpdatedBy) {
		this.paketBarangUpdatedBy = paketBarangUpdatedBy;
	}

	public Timestamp getPaketBarangUpdatedDate() {
		return paketBarangUpdatedDate;
	}

	public void setPaketBarangUpdatedDate(Timestamp paketBarangUpdatedDate) {
		this.paketBarangUpdatedDate = paketBarangUpdatedDate;
	}

	public int getPaketBarangRevised() {
		return paketBarangRevised;
	}

	public void setPaketBarangRevised(int paketBarangRevised) {
		this.paketBarangRevised = paketBarangRevised;
	}

	public Timestamp getPaketBarangDeletedBy() {
		return paketBarangDeletedBy;
	}

	public void setPaketBarangDeletedBy(Timestamp paketBarangDeletedBy) {
		this.paketBarangDeletedBy = paketBarangDeletedBy;
	}

	@Override
	public String toString() {
		return "m_PaketObat [paketBarang_id=" + paketBarang_id + ", paketId=" + paketId + ", barangId=" + barangId
				+ ", kelasId=" + kelasId + ", paketBarangJumlah=" + paketBarangJumlah + ", paketBarangHarga="
				+ paketBarangHarga + ", satuanId=" + satuanId + ", paketBarangAktif=" + paketBarangAktif
				+ ", paketBarangCreatedBy=" + paketBarangCreatedBy + ", paketBarangCreatedDate="
				+ paketBarangCreatedDate + ", paketBarangUpdatedBy=" + paketBarangUpdatedBy
				+ ", paketBarangUpdatedDate=" + paketBarangUpdatedDate + ", paketBarangRevised=" + paketBarangRevised
				+ ", paketBarangDeletedBy=" + paketBarangDeletedBy + "]";
	}
	
	
	
}
