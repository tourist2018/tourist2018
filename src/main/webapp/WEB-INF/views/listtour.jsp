<%@ page language="java" contentType="text/html; charset=UTF-8"
		 isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
				<th><h6>Note</h6></th>
                <th></th>
			</tr>
		</thead>
		<tbody>
<c:if test="${not empty lists}">
    <c:forEach var="listValue" items="${lists}">
			<tr>
				<td>${listValue.user.username}</td>
				<td>${listValue.tour.title}</td>
				<td>${listValue.tour.dateStart}</td>
				<td>${listValue.tour.dateEnd}</td>
				<td>$${listValue.tour.costTour}</td>
				<td>${listValue.statusBooking}</td>
                <td>
                    <input style="width: 120px;" class="btn btn-default"  id="result" value="Đang đợi">
                    <input type="button" class="btn btn-danger" id="cancel" value="Hủy">
                </td>
			</tr>
    </c:forEach>
</c:if>
		</tbody>
		<%--<tfoot>
			<tr style="color: #f9461d">
				<th><h6>Performer</h6></th>
				<th><h6>Name Tour</h6></th>
				<th><h6>Date Go</h6></th>
				<th><h6>Date end</h6></th>
				<th><h6>Salary</h6></th>
				<th><h6>Note</h6></th>
			</tr>
		</tfoot>--%>
	</table>
