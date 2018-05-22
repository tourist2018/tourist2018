<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<title>Page Admin</title>

<!-- Bootstrap -->
<link href="gentelella/vendors/bootstrap/dist/css/bootstrap.min.css"
	rel="stylesheet">
<!-- Font Awesome -->
<link href="gentelella/vendors/font-awesome/css/font-awesome.min.css"
	rel="stylesheet">
<!-- NProgress -->
<link href="gentelella/vendors/nprogress/nprogress.css" rel="stylesheet">
<!-- iCheck -->
<link href="gentelella/vendors/iCheck/skins/flat/green.css"
	rel="stylesheet">

<!-- bootstrap-progressbar -->
<link
	href="gentelella/vendors/bootstrap-progressbar/css/bootstrap-progressbar-3.3.4.min.css"
	rel="stylesheet">
<!-- JQVMap -->
<link href="gentelella/vendors/jqvmap/dist/jqvmap.min.css"
	rel="stylesheet" />
<!-- bootstrap-daterangepicker -->
<link
	href="gentelella/vendors/bootstrap-daterangepicker/daterangepicker.css"
	rel="stylesheet">

<!-- Custom Theme Style -->
<link href="gentelella/build/css/custom.min.css" rel="stylesheet">
</head>


<body>

	<tiles:insertAttribute name="nav" />

	<tiles:insertAttribute name="headeradmin" />

	<tiles:insertAttribute name="body" />

	<tiles:insertAttribute name="footeradmin" />



	<!-- jQuery -->
	<script src="gentelella/vendors/jquery/dist/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="gentelella/vendors/bootstrap/dist/js/bootstrap.min.js"></script>
	<!-- FastClick -->
	<script src="gentelella/vendors/fastclick/lib/fastclick.js"></script>
	<!-- NProgress -->
	<script src="gentelella/vendors/nprogress/nprogress.js"></script>
	<!-- Chart.js -->
	<script src="gentelella/vendors/Chart.js/dist/Chart.min.js"></script>
	<!-- gauge.js -->
	<script src="gentelella/vendors/gauge.js/dist/gauge.min.js"></script>
	<!-- bootstrap-progressbar -->
	<script
		src="gentelella/vendors/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
	<!-- iCheck -->
	<script src="gentelella/vendors/iCheck/icheck.min.js"></script>
	<!-- Skycons -->
	<script src="gentelella/vendors/skycons/skycons.js"></script>
	<!-- Flot -->
	<script src="gentelella/vendors/Flot/jquery.flot.js"></script>
	<script src="gentelella/vendors/Flot/jquery.flot.pie.js"></script>
	<script src="gentelella/vendors/Flot/jquery.flot.time.js"></script>
	<script src="gentelella/vendors/Flot/jquery.flot.stack.js"></script>
	<script src="gentelella/vendors/Flot/jquery.flot.resize.js"></script>
	<!-- Flot plugins -->
	<script
		src="gentelella/vendors/flot.orderbars/js/jquery.flot.orderBars.js"></script>
	<script
		src="gentelella/vendors/flot-spline/js/jquery.flot.spline.min.js"></script>
	<script src="gentelella/vendors/flot.curvedlines/curvedLines.js"></script>
	<!-- DateJS -->
	<script src="gentelella/vendors/DateJS/build/date.js"></script>
	<!-- JQVMap -->
	<script src="gentelella/vendors/jqvmap/dist/jquery.vmap.js"></script>
	<script src="gentelella/vendors/jqvmap/dist/maps/jquery.vmap.world.js"></script>
	<script
		src="gentelella/vendors/jqvmap/examples/js/jquery.vmap.sampledata.js"></script>
	<!-- bootstrap-daterangepicker -->
	<script src="gentelella/vendors/moment/min/moment.min.js"></script>
	<script
		src="gentelella/vendors/bootstrap-daterangepicker/daterangepicker.js"></script>

	<!-- Custom Theme Scripts -->
	<script src="gentelella/build/js/custom.min.js"></script>

</body>
</html>