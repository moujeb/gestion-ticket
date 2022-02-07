<%@ page language="java" contentType="text/html; charset=windows-1256"
pageEncoding="windows-1256"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>
<link rel="stylesheet" type="text/css" href="webjars/bootstrap/4.3.1/css/bootstrap.min.css" />
<c:url value="/css/main.css" var="jstlCss" />
<link href="${jstlCss}" rel="stylesheet" />
<script type="text/javascript"
src="webjars/bootstrap/4.3.1/js/bootstrap.min.js"></script>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Modifier un guide</title>
</head>
<body>
<div class="container">
<div class="card-body">
<form action="updateGuide" method="post">
<div class="form-group">
<label class="control-label">cin guide :</label>
<input type="text" name="num" value="${guide.cin}"
readonly class="form-control"/>
</div>
<div class="form-group">
<label class="control-label"> numtel   :</label>
<input type="text" name="numtel" value="${guide.numtel}"
class="form-control"/>
</div>
<div class="form-group">
<label class="control-label">nom  :</label>
<input type="text" name="nom" value="${guide.nom}"
class="form-control"/>
</div>
<div class="form-group">
<label class="control-label">prenom :</label>
<input type="text" name="prenom" value="${guide.prenom}"
class="form-control"/>
</div>

<div class="form-group">
<label class="control-label">email :</label>
<input type="text" name="email" value="${guide.email}"
class="form-control"/>
</div>
<div>
<button type="submit" class="btn btn-primary">Modifier</button>
</div>
</form>
</div>
<br/>
<br/>
<a href="ListeGuides">Liste guides</a>
</div>
</body>
</html>