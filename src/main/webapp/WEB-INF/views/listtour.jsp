<%@ page language="java" contentType="text/html; charset=UTF-8"
		 isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
				<td>${listValue.user.username}</td>
				<td>${listValue.tour.title}</td>
				<td>${listValue.tour.dateStart}</td>
				<td>${listValue.tour.dateEnd}</td>
				<td>$${listValue.tour.costTour}</td>
                <td>
                    <div class="list-tour-choose" style="display: inline-flex;">
                        <c:choose>
                            <c:when test="${listValue.statusBooking == 'CANCEL' }">
                                <input style="width: 100px;" readonly="readonly" class="btn btn-default"  id="result" value="Đã hủy">
                            </c:when>
                            <c:otherwise>
                                <c:choose>
                                    <c:when test="${listValue.statusBooking == 'DONE' }">
                                        <input style="width: 100px;" readonly="readonly" class="btn btn-default"  id="result" value="Đã đặt">
                                    </c:when>
                                    <c:otherwise>
                                        <input style="width: 120px;" class="btn btn-default"  id="result" value="Đang đợi">
                                    </c:otherwise>
                                </c:choose>
                            </c:otherwise>
                        </c:choose>
                        <form:form action="${contextPath}/delete-booking" method="get" modelAttribute="delete_booking" >
                            <form:input path="id" type="hidden" value="${listValue.id}"/>
                            <input type="submit" name="submit" class="btn btn-danger" value="Hủy"/>
                        </form:form>
                    </div>
                </td>
			</tr>
    </c:forEach>
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
