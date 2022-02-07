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
<title>Modifier un maison</title>
</head>
<body>
<div class="container">
<div class="card-body">
<form action="updateMaison" method="post">
<div class="form-group">
<label class="control-label">ID maison :</label>
<input type="text" name="num" value="${maison.id}"
readonly class="form-control"/>
</div>
<div class="form-group">
<label class="control-label"> img   :</label>
<input type="text" name="image" value="${maison.image}"
class="form-control"/>
</div>
<div class="form-group">
<label class="control-label">nbchambre  :</label>
<input type="text" name="nbchambre" value="${maison.nbchambre}"
class="form-control"/>
</div>

<div class="form-group">
<label class="control-label">surface  :</label>
<input type="text" name="surface" value="${maison.surface}"
class="form-control"/>
</div>

<div class="form-group">
<label class="control-label">adresse  :</label>
<input type="text" name="adresse" value="${maison.adresse}"
class="form-control"/>
</div>
<div class="form-group">
<label class="control-label">Prix :</label>
<input type="text" name="prix" value="${maison.prix}"
class="form-control"/>
</div>

<div>
<button type="submit" class="btn btn-primary">Modifier</button>
</div>
</form>
</div>
<br/>
<br/>
<a href="ListeChambres">Liste maisons</a>
</div>
</body>
</html>