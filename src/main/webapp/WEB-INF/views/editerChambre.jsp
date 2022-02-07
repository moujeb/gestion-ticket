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
<title>Modifier un chambre</title>
</head>
<body>
<div class="container">
<div class="card-body">
<form action="updateProduit" method="post">
<div class="form-group">
<label class="control-label">ID chambre :</label>
<input type="text" name="num" value="${chambre.num}"
readonly class="form-control"/>
</div>
<div class="form-group">
<label class="control-label">nbre lits   :</label>
<input type="text" name="nbreLit" value="${chambre.nbreLit}"
class="form-control"/>
</div>
<div class="form-group">
<label class="control-label">type  :</label>
<input type="text" name="type" value="${chambre.type}"
class="form-control"/>
</div>
<div class="form-group">
<label class="control-label">Prix :</label>
<input type="text" name="prix" value="${chambre.prix}"
class="form-control"/>
</div>

<div>
<button type="submit" class="btn btn-primary">Modifier</button>
</div>
</form>
</div>
<br/>
<br/>
<a href="ListeChambres">Liste chambres</a>
</div>
</body>
</html>