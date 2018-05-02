<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="font-back-in-form">
    <div class="container register-form">
        <div class="logmod" style="margin-top: 150px;">
            <form:form accept-charset="utf-8" modelAttribute="userForm" action="${contextPath}/registration" class="simform"
                       method="post" autocomplete="off">
                <div class="sminputs">
                    <div class="input full">
                        <label class="string optional" for="username">UserName*</label>
                        <form:input class="string optional" maxlength="255" id="user-email" path="username"
                                    placeholder="User Name" type="text" size="50"/>
                    </div>
                </div>
                <div class="sminputs">
                    <div class="input full">
                        <label class="string optional" for="user-pw">Password *</label>
                        <form:input class="string optional" maxlength="255" id="user-pw" path="password"
                                    placeholder="Password" type="password" size="50"/>
                    </div>
                </div>
                <div style="text-align: center" class="sminputs submit-register">
                    <button class="btn btn-default" name="register" type="sumbit">Create Account</button>
                </div>
            </form:form>
        </div>
    </div>
</div>
