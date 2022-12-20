package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;
import ar.com.codoacodo.validator.TPValidator;
import ar.com.codoacodo.validator.ValidatorFloat;
import ar.com.codoacodo.validator.ValidatorString;

@WebServlet("/CreateArticuloController")
public class CreateArticuloController extends HttpServlet{

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//crear un articulo
		//recibimos los parametros enviados por un formularios
		String titulo = req.getParameter("titulo");//un string que representa el valor enviado en el input
		String autor = req.getParameter("autor");
		String img = req.getParameter("imagen");

		String precio_string = req.getParameter("precio");
		Float precio = null;

		if( precio_string.length() != 0 )
			precio = Float.parseFloat(precio_string);//String > Float.parseFloat()

		TPValidator validator = new TPValidator( Arrays.asList(
				new ValidatorString("titulo", titulo),
				new ValidatorString("autor", autor),
				new ValidatorFloat("precio", precio)
		) );

		List<String> errores = validator.validate();

		//instanciomos nuestro objeto
		//hacemos uso del dao
		IArticuloDAO dao = new ArticuloDAOMysqlImpl();

		//control de errores se vera con detalle en el curso de spring
		try {
			var articulo = new Articulo(img, titulo, autor, precio);
			if( errores.isEmpty() )
				dao.create(articulo);
		} catch (SQLException e) {
			errores.add(e.getMessage());
		} catch (Exception e) {

		}

		if( !errores.isEmpty() )
		{
			req.setAttribute("errores", errores);
			req.setAttribute( "recordar_input", Arrays.asList(titulo, autor, img, precio_string) );
			getServletContext().getRequestDispatcher("/nuevo.jsp").forward(req, resp);
			return;
		}
		
		//redirect a otra pagina u otro servlet(Controller/WebServlet)
		getServletContext().getRequestDispatcher("/FindAllArticulosController").forward(req, resp);
	}
}
