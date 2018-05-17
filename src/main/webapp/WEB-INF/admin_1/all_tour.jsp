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
        <table id="example" class="table table-striped table-bordered"
               style="width: 100%;">
            <thead>
            <tr style="color: #f9461d">
                <th><h6>Địa điểm</h6></th>
                <th><h6>Giới thiệu</h6></th>
                <th><h6>Đoạn văn giới thiệu</h6></th>
                <th><h6>Ngày bắt đầu</h6></th>
                <th><h6>Ngày kết thúc</h6></th>
                <th><h6>Giá</h6></th>
                <th><h6>Số lượng</h6></th>
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
                            <form accept-charset="utf-8" action="${contextPath}/admin/delete-user"
                                  method="post" autocomplete="off">
                                <input type="hidden" name="id" value="${listValue.id}"/>
                                <input type="submit" class="btn btn-default" value="Xóa"/>
                            </form>
                        </td>
                    </tr>
                </c:forEach>
            </c:if>
            </tbody>
        </table>
    </div>
</section>