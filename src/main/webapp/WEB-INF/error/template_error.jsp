<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Meta -->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport"
          content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <!-- SITE TITLE -->
    <title>Du lịch Đà Nẵng</title>
    <!-- Latest Bootstrap min CSS -->
    <link rel="stylesheet" href="../bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="../bootstrap/css/mdb.min.css">

    <!-- Google Font -->
    <link href="http://fonts.googleapis.com/css?family=Montserrat:400,700"
          rel="stylesheet" type="text/css">
    <link
            href="https://fonts.googleapis.com/css?family=Open+Sans:300i,400,400i,600,600i,700,700i"
            rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons"
          rel="stylesheet">
    <!-- Font Awesome CSS -->
    <link rel="stylesheet" href="../fonts/font-awesome.min.css">
    <!--ytp player-->
    <link rel="stylesheet" href="../css/YTPlayer.css">
    <!--- owl carousel Css-->
    <link rel="stylesheet" href="../owlcarousel/css/owl.carousel.css">
    <link rel="stylesheet" href="../owlcarousel/css/owl.theme.css">
    <!--Flex slider-->
    <link rel="stylesheet" href="../css/flexslider.css">
    <!-- component CSS -->
    <link rel="stylesheet" href="../css/aos.css">


    <!-- start link by Thanh -->
    <!-- <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/normalize/5.0.0/normalize.min.css"> -->
    <link rel="stylesheet" href="../css/login.css">
    <link
            href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0/css/bootstrap.css"
            rel="stylesheet" />
    <link
            href="https://cdn.datatables.net/1.10.16/css/dataTables.bootstrap4.min.css"
            rel="stylesheet" />
    <!-- end link by thanh -->
    <link rel="stylesheet" href="../css/info.css">

    <!-- Style CSS -->
    <link rel="stylesheet" href="../css/style.css">
    <link rel="stylesheet" href="../css/animate.css">
    <link rel="stylesheet" href="../css/quy.css">
    <link rel="stylesheet" href="../css/review.css">
    <link rel="stylesheet" href="../css/tour-booking.css">
    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>

<body data-spy="scroll" data-offset="80">

<!-- START PRELOADER -->
<div class="preloader">
    <div class="status">
        <div class="status-mes"></div>
    </div>
</div>
<!-- END PRELOADER -->

<!-- START NAVBAR -->
<nav class="navbar navbar-toggleable-sm fixed-top navbar-light bg-faded site-navigation">
    <div class="container">
        <a class="navbar-brand" href="/home"><img src="../img/logo.png" alt=""></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <%--<i class="icon-menu"></i>--%>
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-end" id="navbarCollapse">
            <ul class="navbar-nav">
                <li class="nav-item"><a class="nav-link" href="/home">Home</a></li>
                <li class="nav-item"><a class="nav-link" href="#service">tour special</a></li>
                <li class="nav-item"><a class="nav-link" href="#special_package">top tour</a></li>
                <li class="nav-item"><a class="nav-link" href="#top_deals">service</a></li>
                <li class="nav-item"><a class="nav-link" href="#deals_discount">about</a></li>
                <c:if test="${pageContext.request.userPrincipal.name != null}">
                    <form id="logoutForm" method="POST" action="${contextPath}/logout">
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    </form>

                    <li class="nav-item"><a class="nav-link" onclick="document.forms['logoutForm'].submit()">Logout</a></li>

                </c:if>
            </ul>
        </div>
    </div>
</nav>
<!-- END NAVBAR -->

<tiles:insertAttribute name="body" />

<tiles:insertAttribute name="footer" />






<!-- Latest jQuery -->
<script src="../js/jquery.min.js"></script>
<!-- Latest compiled and minified Bootstrap -->
<script src="../bootstrap/js/bootstrap.min.js"></script>
<!-- modernizer JS -->
<script src="../js/modernizr.2.5.3.min.js"></script>
<!-- owl-carousel min js  -->
<script src="../owlcarousel/js/owl.carousel.min.js"></script>
<!-- stellar js -->
<script src="../js/jquery.stellar.min.js"></script>
<!-- countTo js -->
<script src="../js/jquery.inview.min.js"></script>
<!-- video scripts -->
<script src="../js/jquery.mb.YTPlayer.min.js"></script>
<script type="text/javascript">
    $('.player').mb_YTPlayer();
</script>
<!-- jquery flexslider min js -->
<script src="../js/jquery.flexisel.js"></script>
<script src="../js/jquery.flexslider-min.js"></script>
<!-- scrolltopcontrol js -->
<script src="../js/scrolltopcontrol.js"></script>
<!-- form-contact js -->
<script src="../js/form-contact.js"></script>
<!-- aos js -->
<script src="../js/aos.js"></script>
<!-- map js -->
<script
        src="https://maps.googleapis.com/maps/api/js?key=AIzaSyDwIQh7LGryQdDDi-A603lR8NqiF3R_ycA"></script>

<!-- scripts js -->
<script src="../js/scripts.js"></script>
<!-- script by Thanh -->
<script src="../js/index.js"></script>

<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script
        src="https://cdn.datatables.net/1.10.16/js/jquery.dataTables.min.js"></script>
<script
        src="https://cdn.datatables.net/1.10.16/js/dataTables.bootstrap4.min.js"></script>

<script src="../js/list_tour.js"></script>

</body>
</html>