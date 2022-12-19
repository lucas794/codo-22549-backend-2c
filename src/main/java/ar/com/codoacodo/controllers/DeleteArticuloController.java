package ar.com.codoacodo.controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;

@WebServlet("/DeleteArticuloController")
public class DeleteArticuloController extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");//string

		IArticuloDAO dao = new ArticuloDAOMysqlImpl();
				
		try {
			dao.delete(Long.parseLong(id));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//redirect a otra pagina u otro servlet(Controller/WebServlet)
		getServletContext().getRequestDispatcher("/FindAllArticulosController").forward(req, resp);
	}
}
