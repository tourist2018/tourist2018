<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<div class="container">
    <div class="logmod__form" style="margin-top: 150px;">
        <form:form accept-charset="utf-8" modelAttribute="login" action="${contextPath}/login-test" class="simform" method="POST" autocomplete="off">
            <div class="sminputs">
                <div class="input full">
                    <label class="string optional" for="user-name">UserName*</label>
                    <form:input class="string optional" path="username" maxlength="255" id="user-email" placeholder="User Name" type="text" size="50" />
                </div>
            </div>
            <div class="sminputs">
                <div class="input full">
                    <label class="string optional" for="user-pw">Password *</label>
                    <form:input class="string optional"  path="password" maxlength="255" id="user-pw" placeholder="Password" type="password" size="50"/>
                    <span class="hide-password">Show</span>
                </div>
            </div>
            <div class="simform__actions">
                <button class="sumbit" name="login" value="submitLogin" type="sumbit">Log In</button>
                <span class="simform__actions-sidetext"><a class="special" role="link" href="#">Forgot your password?<br>Click here</a></span>
            </div>
        </form:form>
    </div>
</div>