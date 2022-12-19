<%@page import="ar.com.codoacodo.domain.Articulo"%>
<%@page import="java.util.List"%>
<!Doctype html>
<html lang="es">
<head>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
	crossorigin="anonymous">
</head>
<body>
	<!-- navbar -->
	<jsp:include page="navbar.jsp"/>
	<div class="container">
		<div class="row">
			<h1>Listado de productos</h1>
			<div class="col-12 mt-2">
				<table class="table">
					<thead>
						<tr>
							<th scope="col">#</th>
							<th scope="col">Titulo</th>
							<th scope="col">Precio</th>
							<th scope="col">Autor</th>
							<th scope="col">Im&aacute;gen</th>
							<th scope="col">&nbsp;</th>
						</tr>
					</thead>
					<tbody>
						<!-- REPETIR/ITERAR SOBRE LA LISTA DE PRODUCTO QUE CARGUE EN EL CONTROLLER -->
						<%
							//capturar /bajar el listado del objeto request
							Float total = 0f; 
							List<Articulo> articulos = (List<Articulo>)request.getAttribute("productos");
							for(Articulo articulo : articulos) {
								total += articulo.getPrecio();
						%>
								<tr>
									<th scope="row"><%=articulo.getId()%></th>
									<td><%=articulo.getTitulo()%></td>
									<td><%=articulo.getPrecio()%></td>
									<td><%=articulo.getAutor()%></td>
									<td><%=articulo.getImg()%></td>
									<td>
										<a class="btn btn-info" 
											role="button" 
											href="<%=request.getContextPath()%>/UpdateArticuloController?id=<%=articulo.getId()%>">
												Editar
										</a>
										 | 
										<!-- Button trigger modal -->
										<button type="button" class="btn btn-danger" data-bs-toggle="modal" data-bs-target="#exampleModal"
											onclick="setId(<%=articulo.getId()%>)">
										  Eliminar
										</button>
									</td>
								</tr>
						<%
							}
						%>						
					</tbody>
					<tfoot>
						<tr>
							<td colspan="2" align="right">
								Total $ 
							</td>
							<td colspan="4">
								<%=total%>
							<td>
						</tr>
					</tfoot>
				</table>
			</div>
		</div>
	</div>
	<!-- Modal -->
	<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
	  <div class="modal-dialog">
	    <div class="modal-content">
	    	<form action="<%=request.getContextPath()%>/DeleteArticuloController" 
	    		method="get">
	    	  <input type="hidden" name="id" id="id"/>
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLabel">Eliminar Articulo</h5>
		        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
		      </div>
		      <div class="modal-body">
		        ¿Desea eliminar el articulo?
		      </div>
		      <div class="modal-footer">
		        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">
		        	Cancelar
		        </button>
		        <button type="submit" class="btn btn-danger">
		        	Eliminar
		        </button>
		      </div>
	     	</form>
	    </div>
	  </div>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
	<script type="text/javascript">
		function setId(id) {
			document.getElementById('id').value=id;
		}
	</script>
</body>
</html>