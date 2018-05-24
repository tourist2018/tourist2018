<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<section class="tour_details section-padding"">
    <div class="container" style="width: 82%;height : 700px; margin-left:18% ; background: azure;">
        <form  style="margin-left:28% ; margin-top:10%;" accept-charset="utf-8" action="${contextPath}/admin/create-tour" method="POST" >
            <div class="form-group">
                <label>Địa điểm</label>
                <input type="text" name="address"value=""/>
            </div>
            <div class="form-group">
                <label>Giới thiệu</label>
                <input type="text" name="title"value=""/>
            </div>
            <div class="form-group">
                <label>Nội dung</label>
                <input type="textarea" name="content"  value=""/>
            </div>
            <div class="form-group">
                <label>Ngày bắt đầu</label>
                <input type="date" name="dateStart" value=""/>
            </div>
            <div class="form-group">
                <label>Ngày kết thúc</label>
                <input type="date" name="dateEnd" value=""/>
            </div>
            <div class="form-group">
                <label>Tổng thời gian</label>
                <input type="text" name="tourTimes"  value=""/>
            </div>
            <div class="form-group">
                <label>Giá</label>
                <input type="number" name="costTour" value=""/>
            </div>
            <div class="form-group">
                <label>Số lượng</label>
                <input type="number" name="quantity" value=""/>
            </div>
            <input type="submit" class="btn btn-default" value="Tạo mới"/>
        </form>
    </div>
</section>