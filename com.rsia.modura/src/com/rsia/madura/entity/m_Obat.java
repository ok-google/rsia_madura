package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_obat")
public class m_Obat {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="obat_id")
	private int obat_id;
	
	@Column(name="m_kategori_obat_id")
	private int kategoriObatId;
	
	@Column(name="m_jenis_obat_id")
	private int jenisObatId;
	
	@Column(name="obat_kode")
	private String obatKode;
	
	@Column(name="obat_nama")
	private String obatNama;
	
	@Column(name="m_satuan_id")
	private int satuanId;
	
	@Column(name="obat_volume")
	private int obatVolume;
	
	@Column(name="obat_volume_satuan")
	private int obatVolumeSatuan;
	
	@Column(name="obat_keterangan")
	private String obatKeterangan;
	
	@Column(name="obat_aktif")
	private char obatAktif;
	
	@Column(name="obat_created_by")
	private String obatCreatedBy;
	
	@Column(name="obat_created_date")
	private Timestamp obatCreatedDate;
	
	@Column(name="obat_updated_by")
	private String obatUpdatedBy;
	
	@Column(name="obat_updated_date")
	private Timestamp obatUpdatedDate;
	
	@Column(name="obat_revised")
	private int obatRevised;
	
	@Column(name="obat_deleted_date")
	private Timestamp obatDeletedDate;

	public int getObat_id() {
		return obat_id;
	}

	public void setObat_id(int obat_id) {
		this.obat_id = obat_id;
	}

	public int getKategoriObatId() {
		return kategoriObatId;
	}

	public void setKategoriObatId(int kategoriObatId) {
		this.kategoriObatId = kategoriObatId;
	}

	public int getJenisObatId() {
		return jenisObatId;
	}

	public void setJenisObatId(int jenisObatId) {
		this.jenisObatId = jenisObatId;
	}

	public String getObatKode() {
		return obatKode;
	}

	public void setObatKode(String obatKode) {
		this.obatKode = obatKode;
	}

	public String getObatNama() {
		return obatNama;
	}

	public void setObatNama(String obatNama) {
		this.obatNama = obatNama;
	}

	public int getSatuanId() {
		return satuanId;
	}

	public void setSatuanId(int satuanId) {
		this.satuanId = satuanId;
	}

	public int getObatVolume() {
		return obatVolume;
	}

	public void setObatVolume(int obatVolume) {
		this.obatVolume = obatVolume;
	}

	public int getObatVolumeSatuan() {
		return obatVolumeSatuan;
	}

	public void setObatVolumeSatuan(int obatVolumeSatuan) {
		this.obatVolumeSatuan = obatVolumeSatuan;
	}

	public String getObatKeterangan() {
		return obatKeterangan;
	}

	public void setObatKeterangan(String obatKeterangan) {
		this.obatKeterangan = obatKeterangan;
	}

	public char getObatAktif() {
		return obatAktif;
	}

	public void setObatAktif(char obatAktif) {
		this.obatAktif = obatAktif;
	}

	public String getObatCreatedBy() {
		return obatCreatedBy;
	}

	public void setObatCreatedBy(String obatCreatedBy) {
		this.obatCreatedBy = obatCreatedBy;
	}

	public Timestamp getObatCreatedDate() {
		return obatCreatedDate;
	}

	public void setObatCreatedDate(Timestamp obatCreatedDate) {
		this.obatCreatedDate = obatCreatedDate;
	}

	public String getObatUpdatedBy() {
		return obatUpdatedBy;
	}

	public void setObatUpdatedBy(String obatUpdatedBy) {
		this.obatUpdatedBy = obatUpdatedBy;
	}

	public Timestamp getObatUpdatedDate() {
		return obatUpdatedDate;
	}

	public void setObatUpdatedDate(Timestamp obatUpdatedDate) {
		this.obatUpdatedDate = obatUpdatedDate;
	}

	public int getObatRevised() {
		return obatRevised;
	}

	public void setObatRevised(int obatRevised) {
		this.obatRevised = obatRevised;
	}

	public Timestamp getObatDeletedDate() {
		return obatDeletedDate;
	}

	public void setObatDeletedDate(Timestamp obatDeletedDate) {
		this.obatDeletedDate = obatDeletedDate;
	}

	@Override
	public String toString() {
		return "m_Obat [obat_id=" + obat_id + ", kategoriObatId=" + kategoriObatId + ", jenisObatId=" + jenisObatId
				+ ", obatKode=" + obatKode + ", obatNama=" + obatNama + ", satuanId=" + satuanId + ", obatVolume="
				+ obatVolume + ", obatVolumeSatuan=" + obatVolumeSatuan + ", obatKeterangan=" + obatKeterangan
				+ ", obatAktif=" + obatAktif + ", obatCreatedBy=" + obatCreatedBy + ", obatCreatedDate="
				+ obatCreatedDate + ", obatUpdatedBy=" + obatUpdatedBy + ", obatUpdatedDate=" + obatUpdatedDate
				+ ", obatRevised=" + obatRevised + ", obatDeletedDate=" + obatDeletedDate + "]";
	}
	
	
}
