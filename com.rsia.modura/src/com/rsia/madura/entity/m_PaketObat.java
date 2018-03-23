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
	
}
