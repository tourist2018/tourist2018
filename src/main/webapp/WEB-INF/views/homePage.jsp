<%@ page language="java" contentType="text/html; charset=UTF-8"
         isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<u:set var="contextPath" value="${pageContext.request.contextPath}"/>
<style>
    .row.form-search-tour {
        background-color: white;
        padding: 10px;
        border-radius: 10px;
    }
</style>
<!-- START HOME -->
<section id="home" class="home_parallax"
         style="background-image: url(img/bg/avata.jpg);  background-size:cover; background-position: center center;">
    <a class="player"
       data-property="{videoURL:'https://youtu.be/f7MskKkn2Jg',containment:'#home', showControls:false, autoPlay:true, loop:true, mute:true, startAt:0, opacity:1, quality:'default'}"></a>
    <div class="container">
        <div class="row">
            <div class="col-md-12 text-center">
                <div class="hero-text">
                    <h1>DU LỊCH TP ĐÀ NẴNG</h1>
                    <p>Top tourist, nơi chia sẽ cảm xúc và khám phá những địa điểm du lịch hấp dẫn. <br/>Hãy để những
                        trải nghiệm được lưu giữ nơi đây.</p>
                    <div style="display: inline-flex">
                        <%--<form:form action="${contextPath}/search-tour" modelAttribute="form_search" method="GET">
                            <div class="row form-search-tour">
                                <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                                    <form:input type="text" class="address_tour" name="address" path="address" placeholder="Địa điểm"/>
                                </div>
                                <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                                    <form:input type="date" class="date_start" name="dateStart" path="dateStart"/>
                                </div>
                                <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                                    <form:select class="custom-select" name="costTour" path="costTour">
                                        <option value="0" selected>Choose...</option>
                                        <option value="100">< $100</option>
                                        <option value="500">< $500</option>
                                        <option value="1000">< $1000</option>
                                        <option value="1001"><= $1000</option>
                                    </form:select>
                                </div>
                            </div>
                            <button class="btn btn-default btn-home-bg" type="submit" style="border-radius: 45px">Find place</button>

                        </form:form>--%>
                        <form action="${contextPath}/search-tour" method="POST">
                            <div class="row form-search-tour">
                                <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                                    <input type="text" class="address_tour" name="address"  placeholder="Địa điểm"/>
                                </div>
                                <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                                    <input type="date" class="date_start" name="dateStart"/>
                                </div>
                                <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
                                    <select class="custom-select" name="costTour">
                                        <option value="0" selected>Choose...</option>
                                        <option value="100">< $200</option>
                                        <option value="500">< $500</option>
                                        <option value="1000">< $1000</option>
                                        <option value="2001"><= $2000</option>
                                    </select>
                                </div>
                            </div>
                            <button class="btn btn-default btn-home-bg" type="submit" style="border-radius: 45px">Find place</button>

                        </form>
                    </div>
                </div>
            </div><!--- END COL -->
        </div><!--- END ROW -->
    </div><!--- END CONTAINER -->
</section>
<!-- END HOME DESIGN -->

<!-- START SPECIAL PACKAGE -->
<section id="special_package" class="special_package section-padding">
    <div class="container">
        <div class="row">
            <div class="col-md-12">
                <div class="section-title text-center">
                    <h2>Tất cả các Tour</h2>
                    <span></span>
                    <!-- <p>Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat.</p> -->
                </div>
            </div><!-- END COL -->
        </div><!-- END ROW -->
        <div class="row text-center">
            <div class="col-md-12" data-aos="fade-up">
                <div id="package-slider">
                    <c:if test="${not empty lists}">
                        <c:forEach var="listValue" items="${lists}">
                            <div class="single_package">
                                <img class="img-fluid" src="${listValue.image}" alt="">
                                <h5 class="package-name">${listValue.address}</h5>
                                <div class="package-hover">
                                    <h5>${listValue.address}</h5>
                                    <span>Giá chỉ $${listValue.costTour}</span>
                                    <p>${listValue.title}</p>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <i class="fa fa-star"></i>
                                    <a href="tour-booking?id=${listValue.id}">
                                        <span class="time_zone">${listValue.tourTimes}</span>
                                    </a>
                                </div>
                            </div>
                            <!-- END SINGLE PACKAGE -->
                        </c:forEach>
                    </c:if>
                </div>
            </div><!-- END COL -->
        </div><!-- END ROW -->
    </div><!-- END CONTAINER -->
</section>
<!-- END SPECIAL PACKAGE -->


<!-- START TOP DEALS -->
<section id="top_deals" class="top_deals section-padding">

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12" data-aos="fade-up">
				<div class="section-title text-center">
					<h2>các tour đứng đầu</h2>
					<span></span>
					<p>Được mọi người bình chọn là những nơi đẹp nhất Đà Nẵng nói riêng, nước Việt Nam nói chung.</p>
				</div>
			</div><!-- END COL -->
		</div><!-- END ROW -->
		<div class="row" data-aos="fade-up">
			<div class="col-sm-4 col-xs-12 no-padding">
				<div class="grid">
					<figure class="effect-sadie">
						<img src="img/bg/anhdep3.jpg" alt=""/>
						<figcaption>
							<h4>Địa điểm đẹp</h4>
							<p><a href="tour-booking?id=1">xem chi tiết</a></p>
						</figcaption>
					</figure>
				</div><!--- END GRID -->
			</div><!--- END COL -->
			<div class="col-sm-4 col-xs-12 no-padding">
				<div class="grid">
					<figure class="effect-sadie">
						<img src="img/bg/anhdep6.jpg" alt=""/>
						<figcaption>
							<h4>Địa điểm đẹp</h4>
							<p><a href="tour-booking?id=2">xem chi tiết</a></p>
						</figcaption>
					</figure>
				</div><!--- END GRID -->
			</div><!--- END COL -->
			<div class="col-sm-4 col-xs-12 no-padding">
				<div class="grid">
					<figure class="effect-sadie">
						<img src="img/bg/bana2.jpg" alt=""/>
						<figcaption>
							<h4>Địa điểm đẹp</h4>
							<p><a href="tour-booking?id=3">xem chi tiết </a></p>
						</figcaption>
					</figure>
				</div><!--- END GRID -->
			</div><!--- END COL -->
			<div class="col-sm-4 col-xs-12 no-padding">
				<div class="grid">
					<figure class="effect-sadie">
						<img src="img/bg/63.jpg" alt=""/>
						<figcaption>
							<h4>Địa điểm đẹp</h4>
							<p><a href="tour-booking?id=4">xem chi tiết </a></p>
						</figcaption>
					</figure>
				</div><!--- END GRID -->
			</div><!--- END COL -->
			<div class="col-sm-4 col-xs-12 no-padding">
				<div class="grid">
					<figure class="effect-sadie">
						<img src="img/bg/bro6.jpg" alt=""/>
						<figcaption>
							<h4>Địa điểm đẹp</h4>
							<p><a href="tour-booking?id=5">xem chi tiết </a></p>
						</figcaption>
					</figure>
				</div><!--- END GRID -->
			</div><!--- END COL -->
			<div class="col-sm-4 col-xs-12 no-padding">
				<div class="grid">
					<figure class="effect-sadie">
						<img src="img/bg/62.jpg" alt=""/>
						<figcaption>
							<h4>Địa điểm đẹp</h4>
							<p><a href="tour-booking?id=6">xem chi tiết</a></p>
						</figcaption>
					</figure>
				</div><!--- END GRID -->
			</div><!--- END COL -->
		</div><!--- END ROW -->
	</div><!--- END CONTAINER-FLUID -->

  
</section>
<!-- END TOP DEALS -->


<!-- START SERVICES -->
<section id="service" class="our_services">
	<div class="container">
		<div class="row">
			<div class="col-md-12 text-center">
				<div class="section-title">
					<h2>Dịch Vụ Top</h2>
					<span></span>
				</div>
			</div>
		</div>
		<div class="row text-center">
			<div class="col-lg-4 col-sm-6 col-xs-12" data-aos="fade-up">
				<div class="service">
					<div class="icon"><i class="fa fa-bed"></i></div>
					<h4>Đặt phòng khác sạn</h4>
					<p>Vào buổi tối, tự do tham quan Công Viên Châu Á: một công viên giải trí hàng đầu ở Đông Nam Á tiêu chuẩn đẳng cấp thế giới, bạn được tự do trải nghiệm "Bánh Xe Mặt Trời". Nghỉ đêm tại Đà Nẵng.</p>
				</div>
			</div><!-- END COL -->
			<div class="col-lg-4 col-sm-6 col-xs-12" data-aos="fade-up">
				<div class="service">
					<div class="icon"><i class="fa fa-plane"></i></div>
					<h4>Đặt vé máy bay</h4>
					<p>Bạn đang có mặt tại sân bay Tân Sơn Nhất, Cột 10 - Quầy của Vietravel, Nhà ga nội địa. Hướng dẫn viên của Vietravel sẽ hỗ trợ bạn trong các thủ tục để đón chuyến bay đến Đà Nẵng.</p>
				</div>
			</div><!-- END COL -->
			<div class="col-lg-4 col-sm-6 col-xs-12" data-aos="fade-up">
				<div class="service">
					<div class="icon"><i class="fa fa-ticket"></i></div>
					<h4>Đặt vé</h4>
					<p>Quý khách đi xe đến thăm Bà Nà - Suối Mơ, tận hưởng không khí lạnh giá của "Đà Lạt ở miền Trung", sau đó tham quan Chùa Linh Ứng, Hầm Debay, Vườn Lê Jardin D'Amour, vv.</p>
				</div>
			</div><!-- END COL -->
			<div class="col-lg-4 col-sm-6 col-xs-12" data-aos="fade-up">
				<div class="service">
					<div class="icon"><i class="fa fa-ship"></i></div>
					<h4>Đặt chỗ</h4>
					<p>Tiếp tục tham quan hang động mới tại Di sản thế giới Phong Nha - Kẻ Bàng: Paradise Cave - Được xem là cung điện ngầm, nhờ vào cảnh đẹp.</p>
				</div>
			</div><!-- END COL -->
			<div class="col-lg-4 col-sm-6 col-xs-12" data-aos="fade-up">
				<div class="service">
					<div class="icon"><i class="fa fa-train"></i></div>
					<h4>Đặt vé tàu hỏa</h4>
					<p>Bạn có thể mua vé trực tiếp tại quầy vé ở ga hoặc có thể đặt trên website Tauhoa.com.vn , tàu hỏa nối dài từ hà nội đến Sài gòn và giá cả rất phải chăng ahihi !</p>
				</div>
			</div><!-- END COL -->
			<div class="col-lg-4 col-sm-6 col-xs-12" data-aos="fade-up">
				<div class="service">
					<div class="icon"><i class="fa fa-home"></i></div>
					<h4>Địa điểm tuyệt vời</h4>
					<p>Các địa điểm đẹp ở đà nẵng như : Bà nà hill , Bán đảo sơn trà , Ngủ hành sơn , cầu rồng , trần thị lý , sông hàn , Da Nang với bãi biển dài và đẹp tuyệt với :)) , gần đó có Hội An một nơi không gian cổ kính đẹp và thú vị .</p>
				</div>
			</div><!-- END COL -->
		</div><!-- END ROW -->
	</div><!-- END CONTAINER -->

</section>
<!-- END SERVICES -->

<!-- START WHY CHOOSE US -->
<section data-stellar-background-ratio="0.3" class="why_choose section-padding"  style="background-image: url(img/bg/sunwhell.jpg);  background-size:cover; background-position: center center;">
	<div class="container">
		<div class="row">
			<div class="col-md-12" data-aos="fade-up">
				<div class="section-title text-center">
					<h2 class="section-title-white">Tại sao chọn chúng tôi</h2>
					<span class="section-title-white"></span>
					<p class="section-title-white">TOP Tour & Travel, được hàng triệu người trên thế giới tin tưởng.</p>
				</div>
			</div><!-- END COL -->
		</div><!-- END ROW -->
		<div class="row text-center">
			<div class="col-sm-4 col-xs-12" data-aos="fade-up">
				<div class="single-choose">
					<i class="fa fa-star"></i>
					<h4>Khác Sạn hiện đại</h4>

				</div>
			</div><!-- END COL -->
			<div class="col-sm-4 col-xs-12" data-aos="fade-up">
				<div class="single-choose">
					<i class="fa fa-globe"></i>
					<h4>Dịch vụ đẳng cấp thế giới</h4>

				</div>
			</div><!-- END COL -->
			<div class="col-sm-4 col-xs-12" data-aos="fade-up">
				<div class="single-choose">
					<i class="fa fa-thumbs-up"></i>
					<h4>Giá tốt nhất</h4>


                </div>
            </div><!-- END COL -->
        </div><!-- END ROW -->
    </div><!-- END CONTAINER -->
</section>
<!-- END WHY CHOOSE US -->

<!-- START COUNTER -->
<section class="complete-project-area counter_feature section-padding">
    <div class="container">
        <div class="row ">
            <div class="col-md-3 col-sm-6 col-xs-12 no-padding" data-aos="fade-up">
                <div class="single-project-complete">
                    <h2 class="counter-num">32652</h2>
                    <h3>Happy Customers</h3>
                </div>
            </div><!-- END COL -->
            <div class="col-md-3 col-sm-6 col-xs-12 no-padding" data-aos="fade-up">
                <div class="single-project-complete">
                    <h2 class="counter-num">1821</h2>
                    <h3>Amazing Place</h3>
                </div>
            </div><!-- END COL -->
            <div class="col-md-3 col-sm-6 col-xs-12 no-padding" data-aos="fade-up">
                <div class="single-project-complete">
                    <h2 class="counter-num">5660</h2>
                    <h3>In Business</h3>
                </div>
            </div><!-- END COL -->
            <div class="col-md-3 col-sm-6 col-xs-12 no-padding" data-aos="fade-up">
                <div class="single-project-complete brnone">
                    <h2 class="counter-num">11859</h2>
                    <h3>Support Cases</h3>
                </div>
            </div><!-- END COL -->
        </div><!-- END ROW -->
    </div><!-- END CONTAINER -->
</section>
<!-- END COUNTER -->


