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

@WebServlet("/CreateArticuloController")
public class CreateArticuloController extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//crear un articulo
		//recibimos los parametros enviados por un formularios
		String titulo = req.getParameter("titulo");//un string que representa el valor enviado en el input
		String autor = req.getParameter("autor");
		String img = req.getParameter("imagen");
		Float precio = Float.parseFloat(req.getParameter("precio"));//String > Float.parseFloat()

		//instanciomos nuestro objeto
		var articulo = new Articulo(img, titulo, autor, precio);
		
		//hacemos uso del dao
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();

		//control de errores se vera con detalle en el curso de spring
		try {
			dao.create(articulo);
		} catch (Exception e) {
			e.printStackTrace();			
		}
		
		//redirect a otra pagina u otro servlet(Controller/WebServlet)
		getServletContext().getRequestDispatcher("/FindAllArticulosController").forward(req, resp);
	}
}
