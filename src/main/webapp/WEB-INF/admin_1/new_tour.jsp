<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<section class="tour_details section-padding">
    <div class="container">
        hello
    </div>
    <div class="container">
        <form:form accept-charset="utf-8" modelAttribute="formTour" action="${contextPath}/admin/create-tour"
                   method="post" autocomplete="off">
            <form:input type="hidden" name="id" path="id" value="${listValue.id}"/>
            <input type="submit" class="btn btn-default" value="Duyệt"/>
        </form:form>
    </div>
</section>