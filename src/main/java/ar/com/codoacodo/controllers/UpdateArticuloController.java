package ar.com.codoacodo.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

@WebServlet("/UpdateArticuloController")
public class UpdateArticuloController extends HttpServlet{

	//cargar el articulo/producto en la jsp
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();
		
		try {
			var articulo = dao.getById(Long.parseLong(id));
			req.setAttribute("producto", articulo);			
		} catch (Exception e) {
			e.printStackTrace();
		} 

		//redirect a la jsp
		//redirect a otra pagina u otro servlet(Controller/WebServlet)
		getServletContext().getRequestDispatcher("/editar.jsp").forward(req, resp);
	}
	
	//realiza la actualizacion
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String titulo = req.getParameter("titulo");
		String autor = req.getParameter("autor");;
		String img = req.getParameter("imagen");
		Float precio = Float.parseFloat(req.getParameter("precio"));
		Long id = Long.parseLong(req.getParameter("id")); 
		
		//1 - busco el articulo a actualizar
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();
		
		try {
			Articulo articulo = dao.getById(id);
			//solo actualizo la imagen
			articulo.setImg(img);
			articulo.setAutor(autor);
			articulo.setPrecio(precio);
			articulo.setTitulo(titulo);
			
			dao.update(articulo);
		} catch (Exception e) {
			e.printStackTrace();
		} 

		//redirect a otra pagina u otro servlet(Controller/WebServlet)
		getServletContext().getRequestDispatcher("/FindAllArticulosController").forward(req, resp);
	}
}
