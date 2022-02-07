
<%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

</head>
<body>
   <h3>Contact Form</h3>
   <s:form method="post" modelAttribute="contact" action="${pageContext.request.contextPath}/contact/send">
    <table>
       <tr>
          <td>Nom</td>
          <td><s:input path="nom"/></td>
       </tr>
       <tr>
          <td>email</td>
          <td><s:input path="email"/></td>
       </tr>
       <tr>
          <td>adresse</td>
          <td><s:input path="adresse"/></td>
       </tr>
       <tr>
          <td>subject</td>
          <td><s:input path="subject"/></td>
       </tr>
       <tr>
          <td>content</td>
          <td><s:input path="content"/></td>
       </tr>
       <tr>
          <td>
             <s:button type="submit" value="Send"/>
          </td>

       </tr>
    </table>
   </s:form>
</body>
</html>