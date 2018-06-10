<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<style>

    label.w40 {
        float:  left;
        width: 15%;
    }

    input.w60 {
        float:  left;
        width: 45%;
    }
    textarea.w60 {
        float:  left;
        width: 45%;
    }

    .form-group.w100 {
        float: left;
        width: 100%;
    }
</style>
<section class="tour_details section-padding">
    <div class="container" style="width: 82%;height : 700px; margin-left:18% ; background: azure;">
        <form  style="margin-left:15% ; margin-top:10%;" accept-charset="utf-8" action="${contextPath}/admin/create-tour" method="POST" >
            <div class="form-group w100">
                <label class="w40">Địa điểm:</label>
                <input type="text" name="address"value=""  class="w60"/>
            </div>
            <div class="form-group w100">
                <label class="w40">Giới thiệu:</label>
                <input type="text" name="title"value="" class="w60"/>
            </div>
            <div class="form-group w100">
                <label class="w40">Nội dung:</label>
                <textarea  type="textarea" name="content"  value="" class="w60"></textarea>
            </div>
            <div class="form-group w100">
                <label class="w40">Ngày bắt đầu:</label>
                <input type="date" name="dateStart" value="" class="w60"/>
            </div>
            <div class="form-group w100">
                <label class="w40">Ngày kết thúc:</label>
                <input type="date" name="dateEnd" value="" class="w60"/>
            </div>
            <div class="form-group w100">
                <label class="w40">Tổng thời gian:</label>
                <input type="text" name="tourTimes"  value="" class="w60"/>
            </div>
            <div class="form-group w100">
                <label class="w40">Giá:</label>
                <input type="number" name="costTour" value="" class="w60"/>
            </div>
            <div class="form-group w100">
                <label class="w40">Số lượng:</label>
                <input type="number" name="quantity" value="" class="w60"/>
            </div>
            <input type="submit" class="btn btn-danger" value="Tạo mới"/>
        </form>
    </div>
</section>