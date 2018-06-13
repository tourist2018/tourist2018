<%@ page language="java" contentType="text/html; charset=UTF-8"
		 isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
>>>>>>> aac04c3a99b33201b2d97ac99f99253b317a0f64
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
        <a class="navbar-brand" href="/home"><img src="img/logo.png" alt=""></a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarCollapse" aria-controls="navbarCollapse" aria-expanded="false" aria-label="Toggle navigation">
            <%--<i class="icon-menu"></i>--%>
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="collapse navbar-collapse justify-content-end" id="navbarCollapse">
            <ul class="navbar-nav">
                <li class="nav-item"><a class="nav-link" href="/home">Trang Chủ</a></li>
                <li class="nav-item"><a class="nav-link" href="#special_package">các tour</a></li>
                <li class="nav-item"><a class="nav-link" href="#top_deals">tour hàng đầu</a></li>
                <li class="nav-item"><a class="nav-link" href="#service">dịch vụ</a></li>
                <li class="nav-item"><a class="nav-link" href="#deals_discount">Khác</a></li>   
                <c:if test="${pageContext.request.userPrincipal.name != null}">
                    <form id="logoutForm" method="POST" action="${contextPath}/logout">
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                    </form>

                    <li class="nav-item"><a class="nav-link" onclick="document.forms['logoutForm'].submit()">Đăng Xuất</a></li>

                </c:if>
            </ul>
        </div>
    </div>
</nav>
<!-- END NAVBAR -->

