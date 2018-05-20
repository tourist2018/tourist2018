<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<section>
    ${hello}
    <br>
    <a href="${contextPath}/admin/all-order"> All Order</a>
        <a href="${contextPath}/admin/all-user"> All User</a>
        <a href="${contextPath}/admin/all-tour"> All Tour</a>
        <a href="${contextPath}/admin/new-tour"> new tour</a>
</section>