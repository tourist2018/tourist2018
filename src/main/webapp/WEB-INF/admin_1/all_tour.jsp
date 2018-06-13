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
                <th><h4>Địa điểm</h4></th>
                <th><h4>Giới thiệu</h4></th>
                <th><h4>Đoạn văn giới thiệu</h4></th>
                <th><h4>Ngày bắt đầu</h4></th>
                <th><h4>Ngày kết thúc</h4></th>
                <th><h4>Giá</h4></th>
                <th><h4>Số lượng</h4></th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:if test="${not empty lists}">
                <c:forEach var="listValue" items="${lists}">
                    <tr>
                        <td>${listValue.address}</td>
                        <td>${listValue.title}</td>
                        <td>${listValue.content}</td>
                        <td>${listValue.dateStart}</td>
                        <td>${listValue.dateEnd}</td>
                        <td>$${listValue.costTour}</td>
                        <td>${listValue.quantity}</td>
                        <td>
                            <form accept-charset="utf-8" action="${contextPath}/admin/delete-tour"
                                  method="post" autocomplete="off">
                                <input type="hidden" name="id" value="${listValue.id}"/>
                                <input  type="submit" class="btn btn-warning" value="Xóa"/>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </c:if>
            </tbody>
        </table>
    </div>
</section>
<style>

    table#example {
        width:  83.6%;
        margin-left: 221px;
        margin-top: 19px;
    }
</style>