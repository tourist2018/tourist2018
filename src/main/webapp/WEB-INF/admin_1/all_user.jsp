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
        <table id="example" class="table table-striped table-bordered"
               style="width: 100%;">
            <thead>
            <tr style="color: #f9461d">
                <th><h6>Tên đăng nhập</h6></th>
                <th><h6>Họ và tên</h6></th>
                <th><h6>Quyền đăng nhập</h6></th>
                <th><h6>Email</h6></th>
                <th><h6>Giới tính</h6></th>
                <th></th>
            </tr>
            </thead>
            <tbody>
            <c:if test="${not empty lists}">
                <c:forEach var="listValue" items="${lists}">
                    <tr>
                        <td>${listValue.username}</td>
                        <%--<td>${listValue.profile.firstName} ${listValue.profile.lastName} </td>--%>
                        <td>${listValue.role}</td>
                        <%--<td>${listValue.profile.email}</td>--%>
                        <%--<td>${listValue.profile.sex}</td>--%>
                        <td>
                            <form action="${contextPath}/admin/delete-user"
                                       method="GET">
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