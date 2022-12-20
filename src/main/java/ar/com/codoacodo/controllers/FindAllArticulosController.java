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

@WebServlet("/FindAllArticulosController")
public class FindAllArticulosController extends HttpServlet {

	//http://localhost:8080/webapp/FindAllArticulosController
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		IArticuloDAO dao = new ArticuloDAOMysqlImpl(); 
		
		List<Articulo> articulosBuscado = new ArrayList<>();
		List<String> errores = new ArrayList<>();

		try {
			articulosBuscado = dao.findAll();		
		}catch(Exception e) {
			e.printStackTrace();
			errores.add(e.getMessage());
			req.setAttribute("errores", errores);
		}
		
		//guardo bajo el nombre productos una lista de articulos
		req.setAttribute("productos", articulosBuscado);
		
		//redirect a otra pagina u otro servlet(Controller/WebServlet)
		getServletContext().getRequestDispatcher("/listado.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {	
		doGet(req, resp);
	}
}
