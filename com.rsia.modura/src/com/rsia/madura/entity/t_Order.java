package com.rsia.madura.entity;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="t_order")
public class t_Order {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="order_id")
	private int order_id;
	
	@Column(name="order_no")
	private String orderNomer;
	
	@Column(name="order_tanggal")
	private Timestamp orderTanggal;
	
	@Column(name="order_jatuhtempo")
	private Date orderJatuhTempo;
	
	@Column(name="order_perusahaan")
	private int orderPerusahaan;
	
	@Column(name="order_diskon")
	private int orderDiskon;
	
	@Column(name="order_cashback")
	private int orderCashback;
	
	@Column(name="order_total")
	private int orderTotal;
	
	@Column(name="order_jumlahbayar")
	private int orderJumlahBayar;
	
	@Column(name="order_bayar_id")
	private int orderBayarId;
	
	@Column(name="order_keterangan")
	private String orderKeterangan;
	
	@Column(name="order_status")
	private String orderStatus;
	
	@Column(name="order_ttd_id")
	private int orderTtdId;
	
	@Column(name="order_ttd_nama")
	private String orderTtdNama;
	
	@Column(name="order_ttd_nip")
	private String orderTtdNip;
	
	@Column(name="order_ttd_jabatan_nama")
	private String orderTtdJabatanNama;
	
	@Column(name="order_barang_jenis_id")
	private int orderBarangJenisId;
	
	@Column(name="order_barang_jenis")
	private String orderBarangJenis;
	
	@Column(name="order_group")
	private String orderGroup;
	
	
	@Column(name="order_aktif")
	private char orderAktif;
	
	@Column(name="order_created_by")
	private String orderCreatedBy;
	
	@Column(name="order_created_date")
	private Timestamp orderCreatedDate;
	
	@Column(name="order_updated_by")
	private String orderUpdatedBy;
	
	@Column(name="order_updated_date")
	private Timestamp orderUpdatedDate;
	
	@Column(name="order_deleted_date")
	private Timestamp orderDeletedDate;
	
	@Column(name="order_revised")
	private int orderRevised;

	public int getOrder_id() {
		return order_id;
	}

	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}

	public String getOrderNomer() {
		return orderNomer;
	}

	public void setOrderNomer(String orderNomer) {
		this.orderNomer = orderNomer;
	}

	public Timestamp getOrderTanggal() {
		return orderTanggal;
	}

	public void setOrderTanggal(Timestamp orderTanggal) {
		this.orderTanggal = orderTanggal;
	}

	public Date getOrderJatuhTempo() {
		return orderJatuhTempo;
	}

	public void setOrderJatuhTempo(Date orderJatuhTempo) {
		this.orderJatuhTempo = orderJatuhTempo;
	}

	public int getOrderPerusahaan() {
		return orderPerusahaan;
	}

	public void setOrderPerusahaan(int orderPerusahaan) {
		this.orderPerusahaan = orderPerusahaan;
	}

	public int getOrderDiskon() {
		return orderDiskon;
	}

	public void setOrderDiskon(int orderDiskon) {
		this.orderDiskon = orderDiskon;
	}

	public int getOrderCashback() {
		return orderCashback;
	}

	public void setOrderCashback(int orderCashback) {
		this.orderCashback = orderCashback;
	}

	public int getOrderTotal() {
		return orderTotal;
	}

	public void setOrderTotal(int orderTotal) {
		this.orderTotal = orderTotal;
	}

	public int getOrderJumlahBayar() {
		return orderJumlahBayar;
	}

	public void setOrderJumlahBayar(int orderJumlahBayar) {
		this.orderJumlahBayar = orderJumlahBayar;
	}

	public int getOrderBayarId() {
		return orderBayarId;
	}

	public void setOrderBayarId(int orderBayarId) {
		this.orderBayarId = orderBayarId;
	}

	public String getOrderKeterangan() {
		return orderKeterangan;
	}

	public void setOrderKeterangan(String orderKeterangan) {
		this.orderKeterangan = orderKeterangan;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public int getOrderTtdId() {
		return orderTtdId;
	}

	public void setOrderTtdId(int orderTtdId) {
		this.orderTtdId = orderTtdId;
	}

	public String getOrderTtdNama() {
		return orderTtdNama;
	}

	public void setOrderTtdNama(String orderTtdNama) {
		this.orderTtdNama = orderTtdNama;
	}

	public String getOrderTtdNip() {
		return orderTtdNip;
	}

	public void setOrderTtdNip(String orderTtdNip) {
		this.orderTtdNip = orderTtdNip;
	}

	public String getOrderTtdJabatanNama() {
		return orderTtdJabatanNama;
	}

	public void setOrderTtdJabatanNama(String orderTtdJabatanNama) {
		this.orderTtdJabatanNama = orderTtdJabatanNama;
	}

	public int getOrderBarangJenisId() {
		return orderBarangJenisId;
	}

	public void setOrderBarangJenisId(int orderBarangJenisId) {
		this.orderBarangJenisId = orderBarangJenisId;
	}

	public String getOrderBarangJenis() {
		return orderBarangJenis;
	}

	public void setOrderBarangJenis(String orderBarangJenis) {
		this.orderBarangJenis = orderBarangJenis;
	}

	public String getOrderGroup() {
		return orderGroup;
	}

	public void setOrderGroup(String orderGroup) {
		this.orderGroup = orderGroup;
	}

	public char getOrderAktif() {
		return orderAktif;
	}

	public void setOrderAktif(char orderAktif) {
		this.orderAktif = orderAktif;
	}

	public String getOrderCreatedBy() {
		return orderCreatedBy;
	}

	public void setOrderCreatedBy(String orderCreatedBy) {
		this.orderCreatedBy = orderCreatedBy;
	}

	public Timestamp getOrderCreatedDate() {
		return orderCreatedDate;
	}

	public void setOrderCreatedDate(Timestamp orderCreatedDate) {
		this.orderCreatedDate = orderCreatedDate;
	}

	public String getOrderUpdatedBy() {
		return orderUpdatedBy;
	}

	public void setOrderUpdatedBy(String orderUpdatedBy) {
		this.orderUpdatedBy = orderUpdatedBy;
	}

	public Timestamp getOrderUpdatedDate() {
		return orderUpdatedDate;
	}

	public void setOrderUpdatedDate(Timestamp orderUpdatedDate) {
		this.orderUpdatedDate = orderUpdatedDate;
	}

	public Timestamp getOrderDeletedDate() {
		return orderDeletedDate;
	}

	public void setOrderDeletedDate(Timestamp orderDeletedDate) {
		this.orderDeletedDate = orderDeletedDate;
	}

	public int getOrderRevised() {
		return orderRevised;
	}

	public void setOrderRevised(int orderRevised) {
		this.orderRevised = orderRevised;
	}

	@Override
	public String toString() {
		return "t_Order [order_id=" + order_id + ", orderNomer=" + orderNomer + ", orderTanggal=" + orderTanggal
				+ ", orderJatuhTempo=" + orderJatuhTempo + ", orderPerusahaan=" + orderPerusahaan + ", orderDiskon="
				+ orderDiskon + ", orderCashback=" + orderCashback + ", orderTotal=" + orderTotal
				+ ", orderJumlahBayar=" + orderJumlahBayar + ", orderBayarId=" + orderBayarId + ", orderKeterangan="
				+ orderKeterangan + ", orderStatus=" + orderStatus + ", orderTtdId=" + orderTtdId + ", orderTtdNama="
				+ orderTtdNama + ", orderTtdNip=" + orderTtdNip + ", orderTtdJabatanNama=" + orderTtdJabatanNama
				+ ", orderBarangJenisId=" + orderBarangJenisId + ", orderBarangJenis=" + orderBarangJenis
				+ ", orderGroup=" + orderGroup + ", orderAktif=" + orderAktif + ", orderCreatedBy=" + orderCreatedBy
				+ ", orderCreatedDate=" + orderCreatedDate + ", orderUpdatedBy=" + orderUpdatedBy
				+ ", orderUpdatedDate=" + orderUpdatedDate + ", orderDeletedDate=" + orderDeletedDate
				+ ", orderRevised=" + orderRevised + "]";
	}
	
	
}
