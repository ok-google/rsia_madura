<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
	<title>Master - Barang</title>
	<link rel="stylesheet" href="<c:url value="/resources/css/vendor.css "/>">
	<link href="<c:url value="/resources/css/app.css "/>" rel="stylesheet" type="text/css"/>
	<link rel="stylesheet" href="<c:url value="/resources/css/app-blue.css "/>">
	<link href="<c:url value="/resources/css/style.css "/>" rel="stylesheet" type="text/css"/>
	<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script> -->
	<script src="<c:url value="/resources/js/jquery-1.11.3.min.js "/>"></script>
</head>

<body>
	<div class="main-wrapper">
		<div class="app" id="app">
			<header class="header">
				<div class="nav-title">
					<h3 class="title">Master - Barang</h3><small>Tambah -  Obat dan Alat</small>
				</div>
				<div class="header-block header-block-collapse d-lg-none d-xl-none">
					<button class="collapse-btn" id="sidebar-collapse-btn">
							<i class="fa fa-bars"></i>
						</button>
				</div>
				<div class="header-block header-block-nav">
					<ul class="nav-profile">
						<li class="notifications new">
							<a href="" data-toggle="dropdown">
									<i class="fa fa-bell-o"></i>
									<sup>
										<span class="counter">8</span>
									</sup>
								</a>
							<div class="dropdown-menu notifications-dropdown-menu">
								<ul class="notifications-container">
									<li>
										<a href="" class="notification-item">
											<div class="img-col">
												<div class="img" style="background-image: url('assets/faces/3.jpg')"></div>
											</div>
											<div class="body-col">
												<p>
													<span class="accent">Zack Alien</span> pushed new commit:
													<span class="accent">Fix page load performance issue</span>. </p>
											</div>
										</a>
									</li>
								</ul>
								<footer>
									<ul>
										<li>
											<a href=""> View All </a>
										</li>
									</ul>
								</footer>
							</div>
						</li>
						<li class="profile dropdown">
							<a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">
								<div class="img" style="background-image: url('https://avatars3.githubusercontent.com/u/3959008?v=3&s=40')"> </div>
								<span class="name"> John Doe </span>
							</a>
							<div class="dropdown-menu profile-dropdown-menu" aria-labelledby="dropdownMenu1">
								<a class="dropdown-item" href="#">
										<i class="fa fa-user icon"></i> Profile </a>
								<a class="dropdown-item" href="#">
										<i class="fa fa-bell icon"></i> Notifications </a>
								<a class="dropdown-item" href="#">
										<i class="fa fa-gear icon"></i> Settings </a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="login.html">
										<i class="fa fa-power-off icon"></i> Logout </a>
							</div>
						</li>
					</ul>
				</div>
			</header>
			<aside class="sidebar">
				<div class="sidebar-container">
					<div class="sidebar-header">
						<div class="brand">
							<div class="logo">
								<span class="l l1"></span>
								<span class="l l2"></span>
								<span class="l l3"></span>
								<span class="l l4"></span>
								<span class="l l5"></span>
							</div> RSIA Hikmah </div>
					</div>
					<nav class="menu">
						<ul class="sidebar-menu metismenu" id="sidebar-menu">
							<li>
								<a href="index.html">
										<i class="fa fa-home"></i> Dashboard
									</a>
							</li>
							<li>
								<a href="">
										<i class="fa fa-desktop"></i> Transaksi
										<i class="fa arrow"></i>
									</a>
								<ul class="sidebar-nav">
									<li>
										<a href="pendaftaran.html">
											<i class="fa fa-users"></i> Pendaftaran
											</a>
									</li>
									<li>
										<a href="pelayanan.html">
												<i class="fa fa-user-md"></i> &nbsp;Pelayanan
											</a>
									</li>
									<li>
										<a href="pembayaran.html">
												<i class="fa fa-money"></i> Pembayaran
											</a>
									</li>
								</ul>
							</li>
							<li>
								<a href="">
										<i class="fa fa-hdd-o"></i> Master
										<i class="fa arrow"></i>
									</a>
								<ul class="sidebar-nav">
									<li>
										<a href="v_kelas.html"> Kelas </a>
									</li>
									<li>
										<a href="v_agama.html"> Agama </a>
									</li>
									<li>
										<a href="v_pasien.html"> Pasien </a>
									</li>
									<li>
										<a href="v_tindakan.html"> Tindakan </a>
									</li>
									<li>
										<a href="v_paket.html"> Paket </a>
									</li>
									<li class="active">
										<a href="v_kamar.html"> Kamar </a>
									</li>
									<li>
										<a href="v_kondisi_pasien.html"> Kondisi Pasien </a>
									</li>
									<li>
										<a href="v_jenis_rujukan.html"> Jenis Rujukan </a>
									</li>
									<li>
										<a href="v_rujukan.html"> Rujukan </a>
									</li>
									<li>
										<a href="v_rujukan.html"> History Pasien </a>
									</li>
								</ul>
							</li>
						</ul>
					</nav>
				</div>
				<footer class="sidebar-footer">
					<ul class="sidebar-menu metismenu" id="customize-menu">
						<li>
							<ul>
								<li class="customize">
									<div class="customize-item">
										<div class="row customize-header">
											<div class="col-4"> </div>
											<div class="col-4">
												<label class="title">fixed</label>
											</div>
											<div class="col-4">
												<label class="title">static</label>
											</div>
										</div>
										<div class="row">
											<div class="col-4">
												<label class="title">Sidebar:</label>
											</div>
											<div class="col-4">
												<label>
														<input class="radio" type="radio" name="sidebarPosition" value="sidebar-fixed">
														<span></span>
													</label>
											</div>
											<div class="col-4">
												<label>
														<input class="radio" type="radio" name="sidebarPosition" value="">
														<span></span>
													</label>
											</div>
										</div>
										<div class="row">
											<div class="col-4">
												<label class="title">Header:</label>
											</div>
											<div class="col-4">
												<label>
														<input class="radio" type="radio" name="headerPosition" value="header-fixed">
														<span></span>
													</label>
											</div>
											<div class="col-4">
												<label>
														<input class="radio" type="radio" name="headerPosition" value="">
														<span></span>
													</label>
											</div>
										</div>
										<div class="row">
											<div class="col-4">
												<label class="title">Footer:</label>
											</div>
											<div class="col-4">
												<label>
														<input class="radio" type="radio" name="footerPosition" value="footer-fixed">
														<span></span>
													</label>
											</div>
											<div class="col-4">
												<label>
														<input class="radio" type="radio" name="footerPosition" value="">
														<span></span>
													</label>
											</div>
										</div>
									</div>
									<div class="customize-item">
										<ul class="customize-colors">
											<li>
												<span class="color-item color-red" data-theme="red"></span>
											</li>
											<li>
												<span class="color-item color-orange" data-theme="orange"></span>
											</li>
											<li>
												<span class="color-item color-green active" data-theme=""></span>
											</li>
											<li>
												<span class="color-item color-seagreen" data-theme="seagreen"></span>
											</li>
											<li>
												<span class="color-item color-blue" data-theme="blue"></span>
											</li>
											<li>
												<span class="color-item color-purple" data-theme="purple"></span>
											</li>
										</ul>
									</div>
								</li>
							</ul>
							<a href="">
									<i class="fa fa-cog"></i> Customize </a>
						</li>
					</ul>
				</footer>
			</aside>
			<div class="sidebar-overlay" id="sidebar-overlay"></div>
			<div class="sidebar-mobile-menu-handle" id="sidebar-mobile-menu-handle"></div>
			<div class="mobile-menu-handle"></div>
			<article class="content forms-page">
				<section class="section">
					<div class="container">
						<small>Keterangan : <span style="color:red">*</span> Wajib Diisi</small>
						<div class="row card-block">
						<form:form modelAttribute="barangModel" method="POST" action="store">
							<!--<div class="col-6">
								<div class="form-group">
									<label class="control-label">Jenis Barang</label>
									<div>
										<c:forEach var="tempJenis" items="${jenisBarang}">
											<label>
												<form:radiobutton path="IdJenisBarang" value="${tempJenis.idBarangJenis }" class="radio" />  
													<span> ${tempJenis.namaJB } </span>
											</label>
										</c:forEach>
									</div>
								</div>
								  <div class="form-group">
									<label class="control-label">Jenis Obat</label>
									<select class="form-control boxed form-control-sm">
											<option>Option one</option>
											<option>Option two</option>
											<option>Option three</option>
											<option>Option four</option>
										</select>
								</div>
								<div class="form-group">
									<label class="control-label">Kategori Obat</label>
									<select class="form-control boxed form-control-sm">
											<option>Option one</option>
											<option>Option two</option>
											<option>Option three</option>
											<option>Option four</option>
										</select>
								</div>-->
								<div class="form-group">
									<label for="exampleInputEmail1">Kode</label>
									<form:input path="KodeBarang" class="form-control boxed form-control-sm" />
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">Nama Barang<span style="color:red">*</span></label>
									<form:input path="NamaBarang" class="form-control boxed form-control-sm" />
								</div>
								<div class="form-group">
									<label class="control-label">Satuan Terkecil<span style="color:red">*</span></label>
									<form:select class="form-control boxed form-control-sm" path="IdSatuanBarang">
											<c:forEach var="tempSatuan" items="${satuan}" >
												<form:option value="${tempSatuan.satuan_id }" label="${tempSatuan.satuanNama }" />
											</c:forEach>
									</form:select>
								</div>
								<!--<div class="form-group">
									<label class="control-label">Cara Pakai</label>
									<select class="form-control boxed form-control-sm">
											<option>Option one</option>
											<option>Option two</option>
											<option>Option three</option>
											<option>Option four</option>
										</select>
								</div> -->
							</div>
							<div class="col-6">
								<div class="form-group">
									<label for="exampleInputEmail1">Keterangan</label>
									<form:input path="KeteranganBarang" class="form-control boxed form-control-sm" />
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">Profit(%)<span style="color:red">*</span></label>
									<form:input path="ProfitBarang" class="form-control boxed form-control-sm" />
								</div>
								<div class="form-group">
									<label for="exampleInputEmail1">Stok Minimal</label>
									<form:input path="StokMinBarang" class="form-control boxed form-control-sm" />
								</div>

								<label for="exampleInputEmail1">Harga HET</label>
								<div class="input-group input-group-sm">
									<span class="input-group-addon">Rp</span>
									<form:input path="HetBarang" class="form-control boxed form-control-sm" />
									<span class="input-group-addon">,00</span>
								</div>
								<!--  <div class="form-group">
									<label class="control-label">Paket</label>
									<div>
										<label>
												<input class="radio" name="paket" type="radio">
												<span>Ya</span>
											</label>
										<label>
												<input class="radio" name="paket" type="radio">
												<span>Tidak</span>
											</label>
									</div>
								</div>
								<div class="form-group">
									<label class="control-label">Aktif</label>
									<div>
										<label>
												<input class="radio" name="aktif-barang" type="radio">
												<span>Aktif</span>
											</label>
										<label>
												<input class="radio" name="aktif-barang" type="radio">
												<span>Tidak Aktif</span>
											</label>
									</div>
								</div>

								<label for="exampleInputEmail1">Harga Jual<span style="color:red">*</span></label>
								<div class="input-group input-group-sm">
									<span class="input-group-addon">Rp</span>
									<input type="number" class="form-control">
									<span class="input-group-addon">,00</span>
								</div>
							</div>
						</div>-->
						<div class="col col-12" style="padding:0">
							<div class="card sameheight-item" data-exclude="xs" id="dashboard-history">
								<div class="card-header card-header-sm bordered">
									<ul class="nav nav-tabs" role="tablist">
										<li class="nav-item">
											<a class="nav-link active" href="#satuan" role="tab" data-toggle="tab">Satuan Konversi</a>
										</li>
										<li class="nav-item">
											<a class="nav-link" href="#detail" role="tab" data-toggle="tab">Detail Paket</a>
										</li>
										<li class="nav-item">
											<a class="nav-link" href="#jenis-pasien" role="tab" data-toggle="tab">Untuk Jenis Pasien</a>
										</li>
										<li class="nav-item">
											<a class="nav-link" href="#jasa" role="tab" data-toggle="tab">Jasa</a>
										</li>
									</ul>
								</div>
								<div class="card-block">
									<div class="tab-content">
										<div role="tabpanel" class="tab-pane active fade show" id="satuan">
											<div class="container-fluid" style="padding:0">
												<div class="card-header card-header-sm bordered" style="background-color: #f0f0f0">
													<div class="header-block">
														<button type="button" class="btn btn-success btn-sm">Add</button>
														<button type="button" class="btn btn-danger btn-sm">Delete</button>
													</div>
												</div>
												<div class="card-block" style="background-color: #f4f4f4">
													<div class="table-responsive">
														<table class="table table-sm table-striped table-bordered table-hover">
															<thead>
																<tr>
																	<th>Satuan</th>
																	<th>Nilai</th>
																	<th>Satuan Default?</th>
																</tr>
															</thead>
															<tbody>
																<tr>
																	<td>[1] - PCS</td>
																	<td>1</td>
																	<td style="text-align: center;">
																		<label>
						                                                    <input class="checkbox" type="checkbox">
						                                                    <span></span>
						                                                </label>
																	</td>
																</tr>
															</tbody>
														</table>
													</div>
												</div>
											</div>
										</div>
										<div role="tabpanel" class="tab-pane fade" id="detail">
											<div class="container-fluid" style="padding:0">
												<small>Kosong</small>
											</div>
										</div>
										<div role="tabpanel" class="tab-pane fade" id="jenis-pasien">
											<div class="container-fluid" style="padding:0">
												<small>Kosong</small>
											</div>
										</div>
										<div role="tabpanel" class="tab-pane fade" id="jasa">
											<div class="container-fluid" style="padding:0">
												<small>Kosong</small>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<div class="container form-group" style="float: right;background-color: #f5f5f5;margin-bottom:20px">
							<a href="v_barang_index.html"><button type="button" class="btn btn-danger d_pasien-button">Batal</button></a>
							<button type="submit" class="btn btn-primary d_pasien-button">Simpan</button>
						</div>
						<div class="container">
							<div class="form-group" style="float: right;">
								<button type="reset" class="btn btn-sm btn-danger">Hapus</button>
							</div>
						</div>
						
						</form:form>
					</div>
				</section>
			</article>
			<footer class="footer">

			</footer>
		</div>
	</div>
	<!-- Reference block for JS -->
	<div class="ref" id="ref">
		<div class="color-primary"></div>
		<div class="chart">
			<div class="color-primary"></div>
			<div class="color-secondary"></div>
		</div>
	</div>
	<!-- /.modal -->
	<div class="modal fade" id="confirm-modal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					<h4 class="modal-title">
						<i class="fa fa-warning"></i> Alert</h4>
					<button type="button" class="close" data-dismiss="modal" aria-label="Close">
									<span aria-hidden="true">&times;</span>
								</button>
				</div>
				<div class="modal-body">
					<p>Are you sure want to do this?</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-primary" data-dismiss="modal">Yes</button>
					<button type="button" class="btn btn-secondary" data-dismiss="modal">No</button>
				</div>
			</div>
			<!-- /.modal-content -->
		</div>
		<!-- /.modal-dialog -->
	</div>
	<!-- /.modal -->
	<script>
		(function(i, s, o, g, r, a, m)
					{
						i['GoogleAnalyticsObject'] = r;
						i[r] = i[r] || function()
						{
							(i[r].q = i[r].q || []).push(arguments)
						}, i[r].l = 1 * new Date();
						a = s.createElement(o),
							m = s.getElementsByTagName(o)[0];
						a.async = 1;
						a.src = g;
						m.parentNode.insertBefore(a, m)
					})(window, document, 'script', 'https://www.google-analytics.com/analytics.js', 'ga');
					ga('create', 'UA-80463319-4', 'auto');
					ga('send', 'pageview');
	</script>
	<script src="<c:url value="/resources/js/vendor.js "/>"></script>
	<script src="<c:url value="/resources/js/app.js "/>"></script>

</body>

</html>