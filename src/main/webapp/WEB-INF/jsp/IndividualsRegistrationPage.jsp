<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>

<!DOCTYPE html>
<html lang="en">
  <head>
      <meta charset="utf-8">
      <title>Create an account</title>

      <link href="${contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
      <link href="${contextPath}/resources/css/common.css" rel="stylesheet">
  </head>

  <body>

    <div>

        <form:form method="POST" modelAttribute="user" action="AddUser">

            <h2>Create your account</h2>

            <spring:bind path="fullName">
                <div>
                    <form:input type="text" path="fullName" placeholder="Full Name"
                                autofocus="true"></form:input>
                    <form:errors path="fullName"></form:errors>
                </div>
            </spring:bind>

            <spring:bind path="nationalID">
                                         <div>
                                             <form:input type="text" path="nationalID" placeholder="National ID"></form:input>
                                             <form:errors path="nationalID"></form:errors>
                                         </div>
            </spring:bind>

            <spring:bind path="email">
                            <div>
                                <form:input type="text" path="email" placeholder="Email"
                                            autofocus="true"></form:input>
                                <form:errors path="email"></form:errors>
                            </div>
             </spring:bind>

            <spring:bind path="password">
                <div>
                    <form:input type="password" path="password" placeholder="Password"></form:input>
                    <form:errors path="password"></form:errors>
                </div>
            </spring:bind>

            <spring:bind path="phoneNumber">
                                        <div>
                                            <form:input type="text" path="phoneNumber" placeholder="Phone Number"
                                                        autofocus="true"></form:input>
                                            <form:errors path="phoneNumber"></form:errors>
                                        </div>
             </spring:bind>

            <spring:bind path="dob">
                             <div>
                                 <form:input type="text" path="dob" placeholder="Date of Birth"></form:input>
                                 <form:errors path="dob"></form:errors>
                             </div>
             </spring:bind>

            <button type="submit">Submit</button>
        </form:form>

    </div>

    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
    <script src="${contextPath}/resources/js/bootstrap.min.js"></script>
  </body>
</html>

