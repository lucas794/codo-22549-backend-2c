<%@ page import="ar.com.codoacodo.interfaces.elementosHTML.ElementosHTML" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="ar.com.codoacodo.interfaces.elementosHTML.Trabajo" %>
<%@ page import="ar.com.codoacodo.interfaces.elementosHTML.Separador" %>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <div class="container-fluid">
    <a class="navbar-brand" href="<%=request.getContextPath()%>">Trabajo Integrador Final</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="<%=request.getContextPath()%>/FindAllArticulosController">
          	Listado
          </a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="<%=request.getContextPath()%>/nuevo.jsp">
          	Nuevo
          </a>
        </li>
        <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-bs-toggle="dropdown" aria-expanded="false">
            Trabajos CodoACodo
          </a>
          <ul class="dropdown-menu" aria-labelledby="navbarDropdown">
            <% List<ElementosHTML> trabajos = new ArrayList<>( Arrays.asList(
                    new Trabajo("HTML", "https://github.com/lucas794/coc_tp1.github.io"),
                    new Trabajo("JS + BOOTSTRAP", "https://github.com/lucas794/coc_tp2.github.io"),
                    new Separador(),
                    new Trabajo("Base de datos", "https://github.com/lucas794/CoC-BaseDeDatos"),
                    new Trabajo("Trabajo FINAL", "https://github.com/lucas794/codo-22549-backend-2c")
            ));

            for( ElementosHTML elemento : trabajos ) {
              out.print("<li>" + elemento.obtener_elemento_html() + "</li>" );

            }
            %>

          </ul>
        </li>
      </ul>
      <form class="d-flex"
      	action="<%=request.getContextPath()%>/SearchArticulosController"
      	method="get">
        <input
        	name="claveBusqueda" 
        	class="form-control me-2" 
        	type="search" 
        	placeholder="Search"
            <% String busqueda_realizada = (String) request.getAttribute("busqueda_realizada");
               if( busqueda_realizada != null && !busqueda_realizada.isEmpty() ) { %>
                value=<%=busqueda_realizada%>
            <%}%>
        	aria-label="Search">
        <button class="btn btn-outline-success" type="submit">
        	Buscar
        </button>
      </form>
    </div>
  </div>
</nav>