package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="m_Kelas")
public class m_Kelas {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="kelas_id")
	private int kelas_id;
	
	@Column(name="kelas_kode")
	private String kelasKode;
	
	@Column(name="kelas_parent")
	private int kelasParent;
	
	@Column(name="kelas_parent_kode")
	private String kelasParentKode;
	
	@Column(name="kelas_nama")
	private String kelasNama;
	
	@Column(name="kelas_keterangan")
	private String kelasKeterangan;
	
	@Column(name="kelas_filter")
	private String kelasFilter;
	
	@Column(name="kelas_default_pelayanan")
	private char defaultPelayanan;
	
	@Column(name="kelas_aktif")
	private char kelasAktif;
	
	@Column(name="kelas_created_by")
	private String kelasCreatedBy;
	
	@Column(name="kelas_created_date")
	private Timestamp kelasCreatedDate;
	
	@Column(name="kelas_updated_by")
	private String kelasUpdatedBy;
	
	@Column(name="kelas_updated_date")
	private Timestamp kelasUpdatedDate;
	
	@Column(name="kelas_revised")
	private int kelasRevised;
	
	@Column(name="kelas_deleted_date")
	private Timestamp kelasDeletedDate;

	public int getKelas_id() {
		return kelas_id;
	}

	public void setKelas_id(int kelas_id) {
		this.kelas_id = kelas_id;
	}

	public String getKelasKode() {
		return kelasKode;
	}

	public void setKelasKode(String kelasKode) {
		this.kelasKode = kelasKode;
	}

	public int getKelasParent() {
		return kelasParent;
	}

	public void setKelasParent(int kelasParent) {
		this.kelasParent = kelasParent;
	}

	public String getKelasParentKode() {
		return kelasParentKode;
	}

	public void setKelasParentKode(String kelasParentKode) {
		this.kelasParentKode = kelasParentKode;
	}

	public String getKelasNama() {
		return kelasNama;
	}

	public void setKelasNama(String kelasNama) {
		this.kelasNama = kelasNama;
	}

	public String getKelasKeterangan() {
		return kelasKeterangan;
	}

	public void setKelasKeterangan(String kelasKeterangan) {
		this.kelasKeterangan = kelasKeterangan;
	}

	public String getKelasFilter() {
		return kelasFilter;
	}

	public void setKelasFilter(String kelasFilter) {
		this.kelasFilter = kelasFilter;
	}

	public char getDefaultPelayanan() {
		return defaultPelayanan;
	}

	public void setDefaultPelayanan(char defaultPelayanan) {
		this.defaultPelayanan = defaultPelayanan;
	}

	public char getKelasAktif() {
		return kelasAktif;
	}

	public void setKelasAktif(char kelasAktif) {
		this.kelasAktif = kelasAktif;
	}

	public String getKelasCreatedBy() {
		return kelasCreatedBy;
	}

	public void setKelasCreatedBy(String kelasCreatedBy) {
		this.kelasCreatedBy = kelasCreatedBy;
	}

	public Timestamp getKelasCreatedDate() {
		return kelasCreatedDate;
	}

	public void setKelasCreatedDate(Timestamp kelasCreatedDate) {
		this.kelasCreatedDate = kelasCreatedDate;
	}

	public String getKelasUpdatedBy() {
		return kelasUpdatedBy;
	}

	public void setKelasUpdatedBy(String kelasUpdatedBy) {
		this.kelasUpdatedBy = kelasUpdatedBy;
	}

	public Timestamp getKelasUpdatedDate() {
		return kelasUpdatedDate;
	}

	public void setKelasUpdatedDate(Timestamp kelasUpdatedDate) {
		this.kelasUpdatedDate = kelasUpdatedDate;
	}

	public int getKelasRevised() {
		return kelasRevised;
	}

	public void setKelasRevised(int kelasRevised) {
		this.kelasRevised = kelasRevised;
	}

	public Timestamp getKelasDeletedDate() {
		return kelasDeletedDate;
	}

	public void setKelasDeletedDate(Timestamp kelasDeletedDate) {
		this.kelasDeletedDate = kelasDeletedDate;
	}

	@Override
	public String toString() {
		return "m_Kelas [kelas_id=" + kelas_id + ", kelasKode=" + kelasKode + ", kelasParent=" + kelasParent
				+ ", kelasParentKode=" + kelasParentKode + ", kelasNama=" + kelasNama + ", kelasKeterangan="
				+ kelasKeterangan + ", kelasFilter=" + kelasFilter + ", defaultPelayanan=" + defaultPelayanan
				+ ", kelasAktif=" + kelasAktif + ", kelasCreatedBy=" + kelasCreatedBy + ", kelasCreatedDate="
				+ kelasCreatedDate + ", kelasUpdatedBy=" + kelasUpdatedBy + ", kelasUpdatedDate=" + kelasUpdatedDate
				+ ", kelasRevised=" + kelasRevised + ", kelasDeletedDate=" + kelasDeletedDate + "]";
	}
	
	
}
