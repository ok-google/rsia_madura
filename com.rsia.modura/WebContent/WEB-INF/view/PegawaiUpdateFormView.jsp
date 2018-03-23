<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/app.css "/>" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/resources/css/vendor.css "/>" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/resources/css/bootstrap.min.css "/>" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/resources/css/select2.css "/>" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/resources/css/gh-pages.css "/>" rel="stylesheet" type="text/css"/>
<link href="<c:url value="/resources/css/select2.min.css "/>" rel="stylesheet" type="text/css"/>
<link rel="stylesheet" href="//select2.github.io/select2/select2-3.5.2/select2.css">
<link href="<c:url value="/resources/bootstrap-daterangepicker/daterangepicker.min.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/bootstrap-datepicker/css/bootstrap-datepicker3.min.css" />" rel="stylesheet" type="text/css">
<link href="<c:url value="/resources/bootstrap-timepicker/css/bootstrap-timepicker.min.css" />" rel="stylesheet" type="text/css">
</head>
<body>
	<div class="main-wrapper">
			<div class="app" id="app">
				<header class="header">
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
										<li>
											<a href="" class="notification-item">
												<div class="img-col">
													<div class="img" style="background-image: url('assets/faces/5.jpg')"></div>
												</div>
												<div class="body-col">
													<p>
														<span class="accent">Amaya Hatsumi</span> started new task:
														<span class="accent">Dashboard UI design.</span>. </p>
												</div>
											</a>
										</li>
										<li>
											<a href="" class="notification-item">
												<div class="img-col">
													<div class="img" style="background-image: url('assets/faces/8.jpg')"></div>
												</div>
												<div class="body-col">
													<p>
														<span class="accent">Andy Nouman</span> deployed new version of
														<span class="accent">NodeJS REST Api V3</span>
													</p>
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
									<div class="img" style="background-image: url('https://avatars3.githubusercontent.com/u/3959008?v=3&amp;s=40')"> </div>
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
										<i class="fa fa-home"></i> Dashboard </a>
								</li>
								<li>
									<a href="../provinsi/list/?page=1&limit=10">
										<i class="fa fa-user"></i> Provinsi </a>
								</li>
								<li>
									<a href="../kota/list/?page=1&limit=10">
										<i class="fa fa-home"></i> Kota </a>
								</li>
								<li>
									<a href="../kecamatan/list/?page=1&limit=10">
										<i class="fa fa-user"></i> Kecamatan </a>
								</li>
								<li>
									<a href="../kelurahan/list/?page=1&limit=10">
										<i class="fa fa-user"></i> Kelurahan </a>
								</li>
								<li>
									<a href="../jabatan/list">
										<i class="fa fa-user"></i> Jabatan </a>
								</li>
								<li class="active">
									<a href="#">
										<i class="fa fa-user"></i> Pegawai </a>
								</li>
								<li>
									<a href="../gaji/list">
										<i class="fa fa-user"></i> Gaji </a>
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
														<input class="radio" name="sidebarPosition" value="sidebar-fixed" type="radio">
														<span></span>
													</label>
												</div>
												<div class="col-4">
													<label>
														<input class="radio" name="sidebarPosition" value="" type="radio">
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
														<input class="radio" name="headerPosition" value="header-fixed" type="radio">
														<span></span>
													</label>
												</div>
												<div class="col-4">
													<label>
														<input class="radio" name="headerPosition" value="" type="radio">
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
														<input class="radio" name="footerPosition" value="footer-fixed" type="radio">
														<span></span>
													</label>
												</div>
												<div class="col-4">
													<label>
														<input class="radio" name="footerPosition" value="" type="radio">
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
						<div class="row sameheight-container">
							<div class="col-md-3"></div>
							<div class="col-md-6">
								<div class="card card-block sameheight-item">
									<div class="title-block">
										<h3 class="title"> Data Pegawai </h3>
									</div>
									<form:form modelAttribute="pegawaiModel" method="POST" action="store" enctype="multipart/form-data">		
									<form:hidden path="pegawai_id" />
									<form:hidden path="pegawaiCreatedDate" />
									<form:hidden path="pegawaiCreatedBy" />
									<form:hidden path="pegawaiAktif" />
									
										<div class="form-group">
											<label  for="form_control_1">No Pegawai</label>
							                	<form:input path="pegawaiNo" placeholder="Masukan No Pegawai" class="form-control" />
										</div>
			
										<div class="form-group">
											<label  for="form_control_1">Nama Pegawai</label>
							                	<form:input path="pegawaiNama" class="form-control" placeholder="Masukan Nama Pegawai" />
										</div>
			
										<div class="form-group">
											<label  for="form_control_1">Jenis Kelamin</label>
							                	<form:select path="pegawaiKelamin" class="form-control form-control-sm" >
							                        <form:option value='N' label="---Pilih Satu---" />
							                        <form:option value='L' label="Laki-Laki" />
							                        <form:option value='P' label="Perempuan" />
							                    </form:select>
										</div>
										
										<div class="form-group">
									        <label>Tanggal Lahir</label>
									        <div class="input-group date">
                                       			<form:input path="pegawaiTglLahir" class="form-control" />
                                   					<span class="input-group-btn">
                                   						<button class="btn default date-set" type="button">
                                       						<i class="fa fa-calendar"></i>
                                   						</button>
                                   					</span>
                                   			</div>
									    </div>
										
										<div class="form-group">
											<label for="exampleInputPassword1">Kota Lahir</label>
											<div class="select2-wrapper">
												<form:select path="tempatLahirKode" class="form-control input-lg select2-single" >
													<option></option>
													<c:forEach var="tempKota" items="${kota}">
								                      <form:option value="${tempKota.kotaKode }" label="${tempKota.kotaNama }" />
								                    </c:forEach>
												</form:select>
											</div>
										</div>
										
										<div class="form-group">
											<label  for="form_control_1">Alamat</label>
											<form:input path="pegawaiAlamat" class="form-control" placeholder="Masukan Alamat Pegawai" />
										</div>
										
										
										
										<div class="form-group">
											<label for="exampleInputPassword1">Nama Kota</label>
											<div class="select2-wrapper">
												<form:select path="kotaKode" class="form-control input-lg select2-single" >
													<option></option>
													<c:forEach var="tempKota" items="${kota}">
				                                    	<form:option value="${tempKota.kotaKode }" label="${tempKota.kotaNama }" />
				                                    </c:forEach>
												</form:select>
											</div>
										</div>
										
										<div class="form-group">
											<label  for="form_control_1">Nama Jabatan</label>
							                	<form:select path="pegawaiJabatanNama" class="form-control input-lg select2-single" >
													<form:option value="NONE" label="--Pilih Satu---" />
													<c:forEach var="tempJabatan" items="${jabatan}">
				                                    	<form:option value="${tempJabatan.jabatanNama }" label="${tempJabatan.jabatanNama }" />
				                                    </c:forEach>
												</form:select>
										</div>
										
										<div class="form-group">
											<label  for="form_control_1">Pendidikan</label>
							                	<form:select path="pegawaiPendidikanId" class="form-control form-control-sm" >
							                        <option value="0"> ---Pilih Satu--- </option>
							                        <c:forEach var="tempPendidikan" items="${pendidikan}">
				                                    	<form:option value="${tempPendidikan.pendidikanKode }" label="${tempPendidikan.pendidikanNama }"/>
				                                    </c:forEach>
							                    </form:select>
										</div>
										
										<div class="form-group">
											<label  for="form_control_1">Fungsional</label>
							                	<form:select path="pegawaiFungsional" class="form-control form-control-sm">
							                        <form:option value="Null" label="---Pilih Satu---" />
							                        <form:option value="PJ" label="Penanggung Jawab" />
							                        <form:option value="Bukan PJ" label="Bukan" />
							                    </form:select>
										</div>
										
										<div class="form-group">
											<label  for="form_control_1">Medis</label>
							                	<form:select path="pegawaiMedis" class="form-control form-control-sm" >
							                        <form:option value="0" label="---Pilih Satu---" />
							                        <form:option value="1" label="Ya" />
							                        <form:option value="-1" label="Bukan" />
							                    </form:select>
										</div>
										
										<div class="form-group">
									        <label>Tanggal Masuk</label>
									        <div class="input-group date">
                                       			<form:input path="pegawaiTglMasuk" class="form-control" />
                                   					<span class="input-group-btn">
                                   						<button class="btn default date-set" type="button">
                                       						<i class="fa fa-calendar"></i>
                                   						</button>
                                   					</span>
                                   			</div>
									    </div>
										
										<div class="form-group">
									        <label>Tanggal Keluar</label>
									        <div class="input-group date">
                                       			<form:input path="pegawaiTglKeluar" class="form-control" />
                                   					<span class="input-group-btn">
                                   						<button class="btn default date-set" type="button">
                                       						<i class="fa fa-calendar"></i>
                                   						</button>
                                   					</span>
                                   			</div>
									    </div>
										
										<div class="form-group">
											<label  for="form_control_1">Email</label>
							                <form:input path="pegawaiEmail" class="form-control" placeholder="Masukan Email" />
										</div>
										
										<div class="form-group">
											<label  for="form_control_1">Nomer HP</label>
							                <form:input path="pegawaiNoHp" class="form-control" placeholder="Masukan Nomer Handphone" />
										</div>
										
										<div class="form-group">
											<label  for="form_control_1">Nomer SIP</label>
							                <form:input path="pegawaiNomerSIP" class="form-control" placeholder="Masukan Nomer SIP" />
										</div>
										
										<div class="form-group">
											<label  for="form_control_1">Nomer NPWP</label>
							                <form:input path="pegawaiNPWP" class="form-control" placeholder="Masukan Nomer Handphone" />
										</div>
										
										<div class="form-group">
											<label  for="form_control_1">Bank</label>
							                	<form:select path="pegawaiBankNama" class="form-control form-control-sm">
							                        <form:option value="Null" label="---Pilih Satu---" />
							                        <form:option value="BNI" label="BNI" />
							                        <form:option value="BRI" label="BRI" />
							                        <form:option value="BCA" label="BCA" />
							                        <form:option value="Mandiri" label="Mandiri" />
							                        <form:option value="Lainnya" label="Lainnya" />
							                    </form:select>
										</div>
										
										<div class="form-group">
											<label  for="form_control_1">Akun Bank</label>
							                	<form:input path="pegawaiBankAkun" class="form-control" placeholder="Masukan Nama Akun" />
										</div>
										
										<div class="form-group">
											<label  for="form_control_1">Nomer Rekening</label>
							                	<form:input path="pegawaiBankRekening" class="form-control" placeholder="Masukan Nomer Rekening" />
										</div>
										
										<div class="form-group">
											<label  for="form_control_1">Foto</label>
							                	<input type="file" name="file" />
										</div>
										
										<form:hidden path="pegawaiKelurahanKode" value="1101010001" />
										
										<div class="form-group">
											<button type="submit" class="btn btn-primary"> Submit </button>
										</div>
									</form:form>
								</div>
							</div>
						</div>
					</section>
				</article>
				<footer class="footer">
					
				</footer>
				<div class="modal fade" id="modal-media">
					<div class="modal-dialog modal-lg">
						<div class="modal-content">
							<div class="modal-header">
								<h4 class="modal-title">Media Library</h4>
								<button type="button" class="close" data-dismiss="modal" aria-label="Close">
									<span aria-hidden="true">�</span>
									<span class="sr-only">Close</span>
								</button>
							</div>
							<div class="modal-body modal-tab-container">
								<ul class="nav nav-tabs modal-tabs" role="tablist">
									<li class="nav-item">
										<a class="nav-link" href="#gallery" data-toggle="tab" role="tab">Gallery</a>
									</li>
									<li class="nav-item">
										<a class="nav-link active" href="#upload" data-toggle="tab" role="tab">Upload</a>
									</li>
								</ul>
								<div class="tab-content modal-tab-content">
									<div class="tab-pane fade" id="gallery" role="tabpanel">
										<div class="images-container">
											<div class="row"> </div>
										</div>
									</div>
									<div class="tab-pane fade active in" id="upload" role="tabpanel">
										<div class="upload-container">
											<div id="dropzone">
												<form action="/" method="POST" enctype="multipart/form-data" class="dropzone needsclick dz-clickable" id="demo-upload">
													<div class="dz-message-block">
														<div class="dz-message needsclick"> Drop files here or click to upload. </div>
													</div>
												</form>
											</div>
										</div>
									</div>
								</div>
							</div>
							<div class="modal-footer">
								<button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
								<button type="button" class="btn btn-primary">Insert Selected</button>
							</div>
						</div>
						<!-- /.modal-content -->
					</div>
					<!-- /.modal-dialog -->
				</div>
				<!-- /.modal -->
				<div class="modal fade" id="confirm-modal">
					<div class="modal-dialog" role="document">
						<div class="modal-content">
							<div class="modal-header">
								<h4 class="modal-title">
									<i class="fa fa-warning"></i> Alert</h4>
								<button type="button" class="close" data-dismiss="modal" aria-label="Close">
									<span aria-hidden="true">�</span>
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
			</div>
		</div>
   <script src="<c:url value="/resources/js/app.js "/>" /></script>
   <script src="<c:url value="/resources/js/vendor.js "/>" /></script>
   <script src="<c:url value="/resources/js/bootstrap.min.js "/>" /></script>
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<script src="//cdnjs.cloudflare.com/ajax/libs/select2/4.0.3/js/select2.full.js"></script>
	<script src="<c:url value="/resources/bootstrap-datepicker/js/bootstrap-datepicker.min.js" />" type="text/javascript"></script>
	<script src="<c:url value="/resources/scripts/components-date-time-pickers.min.js" />" type="text/javascript"></script>

<script>
	$( ".select2-single, .select2-multiple" ).select2( {
		theme: "bootstrap",
		placeholder: "Pilih Kota",
		maximumSelectionSize: 6,
		containerCssClass: ':all:'
	} );

	$( ":checkbox" ).on( "click", function() {
		$( this ).parent().nextAll( "select" ).prop( "disabled", !this.checked );
	});
</script>
<script>
	 $(function(){
	     var d = new Date(2017, 05, 19);
	     $(".date").datepicker({
	     	todayHighlight: true,
	         autoclose: true,
	         format: "dd-mm-yyyy"
	     });
	 });
 </script>
   
</body>
</html>