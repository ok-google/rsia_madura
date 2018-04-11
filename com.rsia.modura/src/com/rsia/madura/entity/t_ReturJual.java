package com.rsia.madura.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_retur_jual")
public class t_ReturJual {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="returjual_id")
	private int returJual_id;
	
	@Column(name="returjual_no")
	private int returJualNo;
	
	@Column(name="returjual_tanggal")
	private Timestamp returJualTanggal;
	
	@Column(name="returjual_jual")
	private int returJualJual;
	
	@Column(name="returjual_pasien_id")
	private int returJualPasienId;
	
	@Column(name="returjual_pasien_norm")
	private String returJualPasienNorm;
	
	@Column(name="returjual_pasien_nama")
	private String returJualPasienNama;
	
	@Column(name="returjual_pasien_alamat")
	private String returJualPasienAlamat;
	
	@Column(name="returjual_jenispasien_id")
	private int returJualJenisPasienId;
	
	@Column(name="returjual_jenispasien_nama")
	private String returJualJenisPasienNama;
	
	@Column(name="returjual_diskon")
	private int returJualDiskon;
	
	@Column(name="returjual_cashback")
	private int returJualCashback;
	
	@Column(name="returjual_total")
	private int returJualTotal;
	
	@Column(name="returjual_bayarstatus")
	private char returJualBayarStatus;
	
	@Column(name="returjual_bayar_id")
	private int returJualBayarId;
	
	@Column(name="returjual_bayarjumlah")
	private int returJualBayarJumlah;
	
	@Column(name="returjual_keterangan")
	private int returJualKeterangan;
	
	@Column(name="returjual_status")
	private char returJualStatus;
	
	@Column(name="returjual_aktif")
	private char returJualAktif;
	
	@Column(name="returjual_totalbulat")
	private int returJualTotalBulat;
	
	@Column(name="returjual_depo_id")
	private int returJualDepoId;
	
	@Column(name="returjual_bayar_nama")
	private String returJualBayarNama;
	
	@Column(name="returjual_created_by")
	private String returJualCreatedBy;
	
	@Column(name="returjual_created_date")
	private Timestamp returJualCreatedDate;
	
	@Column(name="returjual_updated_by")
	private String returJualUpdatedBy;
	
	@Column(name="returjual_updated_date")
	private Timestamp returJualUpdatedDate;
	
	@Column(name="returjual_revised")
	private int returJualRevised;

	public int getReturJual_id() {
		return returJual_id;
	}

	public void setReturJual_id(int returJual_id) {
		this.returJual_id = returJual_id;
	}

	public int getReturJualNo() {
		return returJualNo;
	}

	public void setReturJualNo(int returJualNo) {
		this.returJualNo = returJualNo;
	}

	public Timestamp getReturJualTanggal() {
		return returJualTanggal;
	}

	public void setReturJualTanggal(Timestamp returJualTanggal) {
		this.returJualTanggal = returJualTanggal;
	}

	public int getReturJualJual() {
		return returJualJual;
	}

	public void setReturJualJual(int returJualJual) {
		this.returJualJual = returJualJual;
	}

	public int getReturJualPasienId() {
		return returJualPasienId;
	}

	public void setReturJualPasienId(int returJualPasienId) {
		this.returJualPasienId = returJualPasienId;
	}

	public String getReturJualPasienNorm() {
		return returJualPasienNorm;
	}

	public void setReturJualPasienNorm(String returJualPasienNorm) {
		this.returJualPasienNorm = returJualPasienNorm;
	}

	public String getReturJualPasienNama() {
		return returJualPasienNama;
	}

	public void setReturJualPasienNama(String returJualPasienNama) {
		this.returJualPasienNama = returJualPasienNama;
	}

	public String getReturJualPasienAlamat() {
		return returJualPasienAlamat;
	}

	public void setReturJualPasienAlamat(String returJualPasienAlamat) {
		this.returJualPasienAlamat = returJualPasienAlamat;
	}

	public int getReturJualJenisPasienId() {
		return returJualJenisPasienId;
	}

	public void setReturJualJenisPasienId(int returJualJenisPasienId) {
		this.returJualJenisPasienId = returJualJenisPasienId;
	}

	public String getReturJualJenisPasienNama() {
		return returJualJenisPasienNama;
	}

	public void setReturJualJenisPasienNama(String returJualJenisPasienNama) {
		this.returJualJenisPasienNama = returJualJenisPasienNama;
	}

	public int getReturJualDiskon() {
		return returJualDiskon;
	}

	public void setReturJualDiskon(int returJualDiskon) {
		this.returJualDiskon = returJualDiskon;
	}

	public int getReturJualCashback() {
		return returJualCashback;
	}

	public void setReturJualCashback(int returJualCashback) {
		this.returJualCashback = returJualCashback;
	}

	public int getReturJualTotal() {
		return returJualTotal;
	}

	public void setReturJualTotal(int returJualTotal) {
		this.returJualTotal = returJualTotal;
	}

	public char getReturJualBayarStatus() {
		return returJualBayarStatus;
	}

	public void setReturJualBayarStatus(char returJualBayarStatus) {
		this.returJualBayarStatus = returJualBayarStatus;
	}

	public int getReturJualBayarId() {
		return returJualBayarId;
	}

	public void setReturJualBayarId(int returJualBayarId) {
		this.returJualBayarId = returJualBayarId;
	}

	public int getReturJualBayarJumlah() {
		return returJualBayarJumlah;
	}

	public void setReturJualBayarJumlah(int returJualBayarJumlah) {
		this.returJualBayarJumlah = returJualBayarJumlah;
	}

	public int getReturJualKeterangan() {
		return returJualKeterangan;
	}

	public void setReturJualKeterangan(int returJualKeterangan) {
		this.returJualKeterangan = returJualKeterangan;
	}

	public char getReturJualStatus() {
		return returJualStatus;
	}

	public void setReturJualStatus(char returJualStatus) {
		this.returJualStatus = returJualStatus;
	}

	public char getReturJualAktif() {
		return returJualAktif;
	}

	public void setReturJualAktif(char returJualAktif) {
		this.returJualAktif = returJualAktif;
	}

	public int getReturJualTotalBulat() {
		return returJualTotalBulat;
	}

	public void setReturJualTotalBulat(int returJualTotalBulat) {
		this.returJualTotalBulat = returJualTotalBulat;
	}

	public int getReturJualDepoId() {
		return returJualDepoId;
	}

	public void setReturJualDepoId(int returJualDepoId) {
		this.returJualDepoId = returJualDepoId;
	}

	public String getReturJualBayarNama() {
		return returJualBayarNama;
	}

	public void setReturJualBayarNama(String returJualBayarNama) {
		this.returJualBayarNama = returJualBayarNama;
	}

	public String getReturJualCreatedBy() {
		return returJualCreatedBy;
	}

	public void setReturJualCreatedBy(String returJualCreatedBy) {
		this.returJualCreatedBy = returJualCreatedBy;
	}

	public Timestamp getReturJualCreatedDate() {
		return returJualCreatedDate;
	}

	public void setReturJualCreatedDate(Timestamp returJualCreatedDate) {
		this.returJualCreatedDate = returJualCreatedDate;
	}

	public String getReturJualUpdatedBy() {
		return returJualUpdatedBy;
	}

	public void setReturJualUpdatedBy(String returJualUpdatedBy) {
		this.returJualUpdatedBy = returJualUpdatedBy;
	}

	public Timestamp getReturJualUpdatedDate() {
		return returJualUpdatedDate;
	}

	public void setReturJualUpdatedDate(Timestamp returJualUpdatedDate) {
		this.returJualUpdatedDate = returJualUpdatedDate;
	}

	public int getReturJualRevised() {
		return returJualRevised;
	}

	public void setReturJualRevised(int returJualRevised) {
		this.returJualRevised = returJualRevised;
	}

	@Override
	public String toString() {
		return "t_ReturJual [returJual_id=" + returJual_id + ", returJualNo=" + returJualNo + ", returJualTanggal="
				+ returJualTanggal + ", returJualJual=" + returJualJual + ", returJualPasienId=" + returJualPasienId
				+ ", returJualPasienNorm=" + returJualPasienNorm + ", returJualPasienNama=" + returJualPasienNama
				+ ", returJualPasienAlamat=" + returJualPasienAlamat + ", returJualJenisPasienId="
				+ returJualJenisPasienId + ", returJualJenisPasienNama=" + returJualJenisPasienNama
				+ ", returJualDiskon=" + returJualDiskon + ", returJualCashback=" + returJualCashback
				+ ", returJualTotal=" + returJualTotal + ", returJualBayarStatus=" + returJualBayarStatus
				+ ", returJualBayarId=" + returJualBayarId + ", returJualBayarJumlah=" + returJualBayarJumlah
				+ ", returJualKeterangan=" + returJualKeterangan + ", returJualStatus=" + returJualStatus
				+ ", returJualAktif=" + returJualAktif + ", returJualTotalBulat=" + returJualTotalBulat
				+ ", returJualDepoId=" + returJualDepoId + ", returJualBayarNama=" + returJualBayarNama
				+ ", returJualCreatedBy=" + returJualCreatedBy + ", returJualCreatedDate=" + returJualCreatedDate
				+ ", returJualUpdatedBy=" + returJualUpdatedBy + ", returJualUpdatedDate=" + returJualUpdatedDate
				+ ", returJualRevised=" + returJualRevised + "]";
	}
	
	
	
}

