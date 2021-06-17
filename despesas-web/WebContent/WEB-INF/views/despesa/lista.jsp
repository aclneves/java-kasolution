<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link type="text/css" href="resources/css/bootstrap.css"
	rel="stylesheet" />
<link type="text/css" href="resources/css/bootstrap.min.css"
	rel="stylesheet" />
<title>Lista de despesas</title>
<script type="text/javascript" src="resources/js/jquery.js"></script>
</head>
<body>


	<script type="text/javascript">
		function quitarAgora(id) {
			$.post("quitarDespesa", {'id' : id}, function(resposta) {
				//muda a linha da tabela pelo id
				$("#despesa_"+id).html(resposta);
			});
		}
	</script>


	<br />
	<a href="novaDespesa" class="badge badge-primary" style="width: 8em; margin-left: 10px;" >
		Criar despesa
	</a>
	<br /><br />
	<div class="card" style="width: 60%; margin-left: 10px;" >
	<table class="table table-sm table-hover small">
		<thead class="table-dark">
		<tr>
			<th>Id</th>
			<th>Descri&ccedil;&atilde;o</th>
			<th>Pago?</th>
			<th>Data pagamento</th>
			<th></th>
			<th></th>
		</tr>
		</thead>
		<c:forEach items="${despesas}" var="despesa">
			<tr id="despesa_${despesa.id}"  >
				<td>${despesa.id}</td>
				<td>${despesa.descricao}</td>
				<c:if test="${despesa.pago eq true }">
					<td>Pago</td>
				</c:if>
				<c:if test="${despesa.pago eq false }">
					<td><a href="#" onClick="quitarAgora(${despesa.id})">Pagar</a></td>
				</c:if>
				<td><fmt:formatDate value="${despesa.dataPagamento.time}" pattern="dd/MM/yyyy" /></td>
				<td><a href="removeDespesa?id=${despesa.id}">Remover</a> 
				<td><a href="mostraDespesa?id=${despesa.id}">Alterar</a>
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>