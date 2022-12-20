package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

@WebServlet("/SearchArticulosController")
public class SearchArticulosController extends HttpServlet{

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String claveBusquda= req.getParameter("claveBusqueda");

		IArticuloDAO dao = new ArticuloDAOMysqlImpl(); 
		
		List<Articulo> articulosBuscado = new ArrayList<>();
		try {
			articulosBuscado = dao.search(claveBusquda);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//guardo bajo el nombre productos una lista de articulos
		req.setAttribute("productos", articulosBuscado);
		req.setAttribute( "busqueda_realizada", claveBusquda );

		//redirect a otra pagina u otro servlet(Controller/WebServlet)
		getServletContext().getRequestDispatcher("/listado.jsp").forward(req, resp);
	}
}
