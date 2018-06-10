<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<u:set var="contextPath" value="${pageContext.request.contextPath}"/>

<table id="example" class="table table-striped table-bordered"
       style="width: 100%;">
    <thead>
    <tr style="color: #f9461d">
        <th><h6>Performer</h6></th>
        <th><h6>Name Tour</h6></th>
        <th><h6>Date Go</h6></th>
        <th><h6>Date end</h6></th>
        <th><h6>Salary</h6></th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="listValue" items="${lists}">
        <tr>

            <td>${listValue.id}</td>
            <td>${listValue.title}</td>
            <td>
                <p><fmt:formatDate value="${listValue.dateStart}" pattern="yyyy/MM/dd" /></p>
            </td>
            <td>
                <p><fmt:formatDate value="${listValue.dateEnd}" pattern="yyyy/MM/dd" /></p>
            </td>
            <td>$${listValue.costTour}</td>
            <td>
                <button class="btn  btn-default">
                    <a href="${contextPath}/tour-booking?id=${listValue.id}">Xem chi tiết</a>
                </button>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
