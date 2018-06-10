<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<section class="tour_details section-padding">
    <div class="container">
    </div>
    <div class="container">
        <table id="example" class="table table-striped table-bordered">
            <thead>
            <tr style="color: #f9461d">
                <th><h4>Người đặt tour</h4></th>
                <th><h4>Tên tour</h4></th>
                <th><h4>Ngày đi</h4></th>
                <th><h4>Ngày về</h4></th>
                <th><h4>Giá tiền</h4></th>
                <th><h4>Số Lượng</h4></th>
                <th><h4>Tình trạng</h4></th>
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
                        <td>${listValue.quantily}</td>
                        <td>${listValue.statusBooking}</td>
                        <td>
                            <form:form accept-charset="utf-8" modelAttribute="doneOrderForm" action="${contextPath}/admin/done-order"
                                               method="post" autocomplete="off">
                                <form:input type="hidden" name="id" path="id" value="${listValue.id}"/>
                                <input type="submit" class="btn btn-primary" value="Duyệt"/>
                            </form:form>
                            <form:form accept-charset="utf-8" modelAttribute="cancelOrderForm" action="${contextPath}/admin/cancel-order"
                                       method="post" autocomplete="off">
                                <form:input type="hidden" name="id" path="id" value="${listValue.id}"/>
                                <input type="submit" class="btn btn-warning" value="Hủy"/>
                            </form:form>
                        </td>
                    </tr>
                </c:forEach>
            </c:if>
            </tbody>
        </table>
    </div>
</section>