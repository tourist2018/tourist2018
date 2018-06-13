<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<style>
    .wapper-thongke {
        min-height: 534px;
        background-color: #EDEDED;
    }
</style>
<section class="tour_details section-padding">
    <div class="wapper-thongke">
        <div class="container">
        </div>
        <div class="container">
            <div class="khung">
                <table id="example" class="table table-striped table-bordered thongke">
                    <thead>
                    <tr style="color: #f9461d">
                        <th><h4>Mã Tour</h4></th>
                        <th><h4>Địa chỉ</h4></th>
                        <th><h4>Ngày Bắt Đầu</h4></th>
                        <th><h4>Ngày kết thúc</h4></th>
                        <th><h4>Giá</h4></th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:if test="${not empty lists}">
                        <c:forEach var="listValue" items="${lists}">
                            <tr>
                                <td>${listValue.id}</td>
                                <td>${listValue.address}</td>
                                <td>${listValue.dateStart}</td>
                                <td>${listValue.dateEnd}</td>
                                <td>${listValue.quantity}</td>
                            </tr>
                        </c:forEach>
                    </c:if>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</section>
<style>

    table#example {
        width:  83.6%;
        margin-left: 221px;
        margin-top: 19px;
    }
</style>