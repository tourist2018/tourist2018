<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<u:set var="contextPath" value="${pageContext.request.contextPath}"/>
<c:choose>
    <c:when test="${not empty oneTour }">
        <!-- START TITLE TOP -->
        <section class="section-content section-padding"
                 style="background-image: url(img/bg/avata.jpg); background-size: cover; background-position: center center;">
            <div class="container">
                <div class="row">
                    <div class="col-md-12 text-center">
                        <h1 class="section-blog-title">Tour Reviews</h1>
                    </div>
                </div>
            </div>
        </section>
        <!-- END TITLE TOP -->
        <!-- START BLOG -->
        <section class="tour_details section-padding">
            <div class="container">
                <div class="row">
                    <div class="col-md-8 col-sm-8 col-xs-12">
                        <div class="single_tour_details">
                            <img src="${oneTour.image}" class="img-responsive" alt="image"/>
                            <h4><span><i class="material-icons" id="color-like">thumb_up</i> 77 Like </span></h4>
                            <input hidden="hidden" class="id_user" id="${pageContext.request.userPrincipal.name}" value="${pageContext.request.userPrincipal.name}"/>
                            <input hidden="hidden" class="id_tour" id="id_tour${oneTour.id}" value="${user_id}"/>
                            <h2 class="title">${oneTour.title}</h2>
                            <p>${oneTour.content}</p>
                            <br>
                                <%--<p>Lorem ipsum dosectetur adipisicing elit, sed doLorem ipsum
                                    dolor sit amet, consectetur Nulla fringilla purus at leo dignissim
                                    congue. Mauris elementum accumsan leo vel tempo Sit amet cursus
                                    nisl aliquam. Aliquam et elit eu nunc rhoncus viverra quis at
                                    felis. Seddo Lorem ipsum dolor sit amet, consectetur Nulla
                                    fringilla purus Lorem ipsum dosectetur a dipisicing elit at leo
                                    dignissim congue.</p>--%>
                        </div>
                    </div>
                    <!--- END COL -->
                    <div class="col-md-4 col-sm-4 col-xs-12">
                        <div class="book_now">
                            <h4>Tour Booking</h4>
                            <div class="row">
                                <form:form action="${contextPath}/form-booking" method="post"
                                           modelAttribute="form_booking" onSubmit="return validate()">
                                    <form:input path="tour" type="hidden" value="${oneTour.id}"/>
                                    <form:input path="user" type="hidden" value="${user_id}"/>
                                    <div class="form-group col-md-12">
                                        <h4>Tên tour:</h4>
                                    </div>
                                    <div class="form-group col-md-12">
                                        <h5>${oneTour.title}.</h5>
                                    </div>
                                    <div class="form-group col-md-12">
                                        <p>${oneTour.tourTimes}</p>
                                    </div>
                                    <div class="form-group col-md-12">
                                        <p>Ngày khởi hành: <strong>${oneTour.dateStart}</strong></p>
                                    </div>
                                    <div class="form-group col-md-12">
                                        <div class="row">
                                            <div class="col-6">
                                                <p>Giá tiền: <strong>$${oneTour.costTour}</strong></p>
                                            </div>
                                            <div class="col-6">
                                                <p>Số lượng: <strong>${numberTour}</strong></p>
                                            </div>
                                        </div>
                                    </div>
                                    <label style="color: red; margin-left: 130px;" id="error_project"></label>
                                    <div class="form-group col-md-12">
                                        <p>Số người đăng ký:
                                        </p>
                                        <span hidden="hidden" id="valueNumber" value="${numberTour}"></span>
                                        <form:input path="quantily" type="number" class="form-control" value=""/>
                                    </div>

                                    <div class="col-md-12">
                                        <div class="actions">
                                            <input type="submit" value="BOOKING NOW!" name="submit"
                                                   STYLE="width: 200px;"
                                                   id="submitButton" class="btn btn-lg btn-contact-bg"
                                                   title="Submit Your Message!"/>
                                            <button class="btn btn-default" id="tour-was-booking" style="width: 200px; height: 40px;">
                                                <a href="${contextPath}/list-tour">TOUR ĐÃ
                                                ĐẶT</a></button>
                                        </div>
                                    </div>
                                </form:form>
                            </div>
                        </div>
                        <div class="tag">
                            <h4 class="blog_sidebar_title">Tag cloud</h4>
                            <a class="btn btn-default btn-tag-bg" href="#">Travel</a> <a
                                class="btn btn-default btn-tag-bg" href="#">tour</a> <a
                                class="btn btn-default btn-tag-bg" href="#">portfolio</a> <a
                                class="btn btn-default btn-tag-bg" href="#">Photography</a> <a
                                class="btn btn-default btn-tag-bg" href="#">Responsive</a> <a
                                class="btn btn-default btn-tag-bg" href="#">agency</a>
                        </div>
                    </div>
                    <!--- END COL -->
                </div>
                <!--- END ROW -->
            </div>
            <!--- END CONTAINER -->
        </section>
        <!-- END BLOG -->
    </c:when>
</c:choose>


<!-- START COMMENT -->
<section id="deals_discount" class="deals_discount section-padding">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="section-title text-center">
                    <h2>Comments</h2>
                    <span></span>
                    <div class="col-lg-12">
                        <div class="container-fluid">
                            <div class="row">
                                <c:forEach items="${listCmt}" var="cmt">
                                    <div class="col-lg-10">
                                        <div class="panel panel-white post panel-shadow">
                                            <div class="post-heading">
                                                <div class="pull-left meta">
                                                    <div class="title h5">
                                                        <b>${cmt.getUser().getUsername()}</b>
                                                    </div>
                                                </div>
                                            </div>
                                            <br>
                                            <div class="post-description">
                                                <p>${cmt.content}</p>
                                            </div>
                                        </div>
                                    </div>
                                </c:forEach>
                                <div id="post_cmt"></div>
                            </div>

                        </div>
                        <div class="col-lg-10">
                            <%-- <form action="/comments-post" method="post"> --%>
                            <textarea style="width: 100%; height: 50px" id="noidung"></textarea>
                            <br>
                            <%-- <input name="tourid" type="hidden" value="${oneTour.id}" />
                            <input name="userid" type="hidden" value="${user_id}" /> --%>
                            <button style="float: right;" class="btn btn-success" id="comment">Bình luận</button>
                            <%-- </form> --%>
                        </div>
                    </div>
                </div>
            </div>
            <!-- END COL -->
        </div>
        <!-- END ROW -->
    </div>
</section>


<!-- START DEALS & DISCOUNT -->
<section id="deals_discount" class="deals_discount section-padding">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="section-title text-center">
                    <h2>Deals &amp; discount</h2>
                    <span></span>
                    <p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed
                        diam nonumy eirmod tempor invidunt ut labore et dolore magna
                        aliquyam erat.</p>
                </div>
            </div>
            <!-- END COL -->
        </div>
        <!-- END ROW -->
        <div class="row">
            <div class="col-md-12">
                <div id="discount-slider" class="owl-carousel">
                    <div class="single-discount">
                        <div class="single-img">
                            <img src="img/bg/anhdep3.jpg" class="img-fluid" alt=""/>
                            <div class="post-date">
                                <h4>
                                    <del>$650</del>
                                    $450
                                </h4>
                                <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
                                    class="fa fa-star"></i> <i class="fa fa-star"></i> <i
                                    class="fa fa-star"></i>
                            </div>
                        </div>
                        <div class="single_discount_dsc">
                            <h3>Black sea</h3>
                            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                                sed diam nonummy nibh euismod tincidunt ut laoreet dolore.</p>
                            <a href="tour-details.html" target="_blank">View details</a>
                        </div>
                    </div>
                    <!-- END SINGLE DISCOUNT -->
                    <div class="single-discount">
                        <div class="single-img">
                            <img src="img/bg/bana2.jpg" class="img-fluid" alt=""/>
                            <div class="post-date">
                                <h4>
                                    <del>$650</del>
                                    $450
                                </h4>
                                <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
                                    class="fa fa-star"></i> <i class="fa fa-star"></i> <i
                                    class="fa fa-star"></i>
                            </div>
                        </div>
                        <div class="single_discount_dsc">
                            <h3>Gallipoli</h3>
                            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                                sed diam nonummy nibh euismod tincidunt ut laoreet dolore.</p>
                            <a href="tour-details.html" target="_blank">View details</a>
                        </div>
                    </div>
                    <!-- END SINGLE DISCOUNT -->
                    <div class="single-discount">
                        <div class="single-img">
                            <img src="img/bg/63.jpg" class="img-fluid" alt=""/>
                            <div class="post-date">
                                <h4>
                                    <del>$650</del>
                                    $450
                                </h4>
                                <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
                                    class="fa fa-star"></i> <i class="fa fa-star"></i> <i
                                    class="fa fa-star"></i>
                            </div>
                        </div>
                        <div class="single_discount_dsc">
                            <h3>Pamukkale</h3>
                            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                                sed diam nonummy nibh euismod tincidunt ut laoreet dolore.</p>
                            <a href="tour-details.html" target="_blank">View details</a>
                        </div>
                    </div>
                    <!-- END SINGLE DISCOUNT -->
                    <div class="single-discount">
                        <div class="single-img">
                            <img src="img/bg/62.jpg" class="img-fluid" alt=""/>
                            <div class="post-date">
                                <h4>
                                    <del>$650</del>
                                    $450
                                </h4>
                                <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
                                    class="fa fa-star"></i> <i class="fa fa-star"></i> <i
                                    class="fa fa-star"></i>
                            </div>
                        </div>
                        <div class="single_discount_dsc">
                            <h3>Ephesus</h3>
                            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                                sed diam nonummy nibh euismod tincidunt ut laoreet dolore.</p>
                            <a href="tour-details.html" target="_blank">View details</a>
                        </div>
                    </div>
                    <!-- END SINGLE DISCOUNT -->
                    <div class="single-discount">
                        <div class="single-img">
                            <img src="img/bg/61.jpg" class="img-fluid" alt=""/>
                            <div class="post-date">
                                <h4>
                                    <del>$650</del>
                                    $450
                                </h4>
                                <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
                                    class="fa fa-star"></i> <i class="fa fa-star"></i> <i
                                    class="fa fa-star"></i>
                            </div>
                        </div>
                        <div class="single_discount_dsc">
                            <h3>Cappadocia</h3>
                            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                                sed diam nonummy nibh euismod tincidunt ut laoreet dolore.</p>
                            <a href="tour-details.html" target="_blank">View details</a>
                        </div>
                    </div>
                    <!-- END SINGLE DISCOUNT -->
                    <div class="single-discount">
                        <div class="single-img">
                            <img src="img/bg/sanho.jpg" class="img-fluid" alt=""/>
                            <div class="post-date">
                                <h4>
                                    <del>$650</del>
                                    $450
                                </h4>
                                <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i
                                    class="fa fa-star"></i> <i class="fa fa-star"></i> <i
                                    class="fa fa-star"></i>
                            </div>
                        </div>
                        <div class="single_discount_dsc">
                            <h3>Istanbul</h3>
                            <p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                                sed diam nonummy nibh euismod tincidunt ut laoreet dolore.</p>
                            <a href="tour-details.html" target="_blank">View details</a>
                        </div>
                    </div>
                    <!-- END SINGLE DISCOUNT -->
                </div>
            </div>
        </div>
        <!-- END ROW -->
    </div>
    <!-- END CONTAINER -->
</section>
<!-- END DEALS & DISCOUNT -->

<style>
    .panel.panel-white.post.panel-shadow {
        border-bottom: solid 0.25px;
        margin-bottom: 10px;
        float: left;
        width: 100%;
    }

    .title.h5 {
        font-size:  20px;
        position:  absolute;
        left:  30px;
        top: 30px;
    }
    .post-description {
        float: right;
        width: 70%;
        border-left: solid 0.25px;
    }
</style>



<script src="js/jquery.min.js"></script>
<SCRIPT LANGUAGE="JavaScript">
    function validate() {
        alert('Bạn đã đăng ký thành công.');
    }
</SCRIPT>

<script>
    $(document).ready(function(){

        var id_post = ${oneTour.id};
        var id_user = "${user_id}";
        $("#comment").click(function(){
            /*  alert("Hello! I am an alert box!"); */
            var noidung = $("#noidung").val();
            var url = "/comments-post";
            $.ajax({
                headers: {
                    'X-CSRF-TOKEN': $('meta[name="csrf-token"]').attr('content')
                },
                url:url,
                type:"post",
                data: {'noidung':noidung,'id_post':id_post,'id_user':id_user},
                async:true,
                success:function(data){
                    $("#post_cmt").after(data);
                }
            })
            document.getElementById("noidung").value="";
        });
        /*  $("#like").click(function(){

         var url = "/like";
         alert(id_post);alert(id_user);
         $.ajax({
         headers: {
         'X-CSRF-TOKEN': $('meta[name="csrf-token"]').attr('content')
         },
         url:url,
         type:"post",
         data: {'id_post':id_post,'id_user':id_user},
         async:true,
         success:function(data){
         alert("Hello! I am an alert box!");

         }
         })

         }); */
    });

</script>
