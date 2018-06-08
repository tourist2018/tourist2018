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
    <title>CoreUI Free Bootstrap Admin Template</title>
    <!-- Icons-->
    <link href="../Admin/node_modules/@coreui/icons/css/coreui-icons.min.css" rel="stylesheet">
    <link href="../Admin/node_modules/flag-icon-css/css/flag-icon.min.css" rel="stylesheet">
    <link href="../Admin/node_modules/font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href="../Admin/node_modules/simple-line-icons/css/simple-line-icons.css" rel="stylesheet">
    <!-- Main styles for this application-->
    <link href="/Admin/src/css/style.css" rel="stylesheet">
    <link href="/Admin/src/vendors/pace-progress/css/pace.min.css" rel="stylesheet">
  </head>
  <body >
    <tiles:insertAttribute name="header" />

	<tiles:insertAttribute name="navleft" />

	<tiles:insertAttribute name="body" />

	<tiles:insertAttribute name="footer" />
    
     
   
    
    <!-- Bootstrap and necessary plugins-->
    <script src="../Admin/node_modules/jquery/dist/jquery.min.js"></script>
    <script src="../Admin/node_modules/popper.js/dist/umd/popper.min.js"></script>
    <script src="../Admin/node_modules/bootstrap/dist/js/bootstrap.min.js"></script>
    <script src="../Admin/node_modules/pace-progress/pace.min.js"></script>
    <script src="../Admin/node_modules/perfect-scrollbar/dist/perfect-scrollbar.min.js"></script>
    <script src="../Admin/node_modules/@coreui/coreui/dist/js/coreui.min.js"></script>
    <!-- Plugins and scripts required by this view-->
    <script src="../Admin/node_modules/chart.js/dist/Chart.min.js"></script>
    <script src="../Admin/node_modules/@coreui/coreui-plugin-chartjs-custom-tooltips/dist/js/custom-tooltips.min.js"></script>
    <script src="../Admin/js/main.js"></script>
  </body>
</html>