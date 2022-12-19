package ar.com.codoacodo.controllers;

import ar.com.codoacodo.dao.IArticuloDAO;
import ar.com.codoacodo.dao.impl.ArticuloDAOMysqlImpl;
import ar.com.codoacodo.domain.Articulo;

public class GetArticuloController {

	public static void main(String[] args) throws Exception {
		
		//obtner un articulo por id=1
		
		IArticuloDAO dao = new ArticuloDAOMysqlImpl(); 
		
		Articulo articuloBuscado = dao.getById(1L);
		
		System.out.println(articuloBuscado);
	}

}
