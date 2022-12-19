<%@page import="ar.com.codoacodo.domain.Articulo"%>
<%
	Articulo producto = (Articulo)request.getAttribute("producto");
%>
<!-- codigo estatico -->
<!Doctype html>
<html lang ="es">
	<head>
		<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	</head>
	<body>
		<!-- navbar -->
		<jsp:include page="navbar.jsp"/>
		<main class="container">
			<h1>Editar Producto</h1>
			<div class="row">
				<div class="col-12 mt-2">
					<!-- formulario de alta -->
					<form class="row g-3 needs-validation" novalidate
						action="<%=request.getContextPath()%>/UpdateArticuloController?id=<%=producto.getId()%>"
						method="POST">
					  <div class="col-md-4">
					    <label for="validationCustom01" class="form-label">
					    	Titulo
				    	</label>
					    <input
					    	name="titulo" 
					    	type="text" 
					    	class="form-control" 
					    	id="validationCustom01" 
					    	value="<%=producto.getTitulo()%>" 
					    	required>
					    <div class="valid-feedback">
					      Looks good!
					    </div>
					  </div>
					  <div class="col-md-4">
					    <label for="validationCustom02" class="form-label">
					    	Autor
					    </label>
					    <input 
					    	name="autor"
					    	type="text" 
					    	class="form-control" 
					    	id="validationCustom02" 
					    	value="<%=producto.getAutor()%>"
					    	required>
					    <div class="valid-feedback">
					      Looks good!
					    </div>
					  </div>
					  <div class="col-md-4">
					    <label for="validationCustomUsername" class="form-label">
					    	Precio
					    </label>
					    <div class="input-group has-validation">
					      <input 
					      	name="precio"
					      	type="number"					       
					      	class="form-control" 
					      	id="validationCustomUsername" 
					      	aria-describedby="inputGroupPrepend"
					      	value="<%=producto.getPrecio()%>" 
					      	required>
					      <div class="invalid-feedback">
					        Please choose a username.
					      </div>
					    </div>
					  </div>
					  <div class="col-md-6">
					    <label for="validationCustom03" class="form-label">
					    	Im&aacute;gen
					    </label>
					    <input
					    	name="imagen" 
					    	type="file" 
					    	class="form-control" 
					    	id="validationCustom03"
					    	value="<%=producto.getImg()%>" 
					    	required>
					    <div class="invalid-feedback">
					      Please provide a valid city.
					    </div>
					  </div>

					  <div class="col-12">
					    <button class="btn btn-primary" type="submit">
					    	Editar
					    </button>
					  </div>
					</form>
				</div>
			</div>	
		</main>
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	</body>
</html>