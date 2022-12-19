package ar.com.codoacodo.herencia.interfaces;

import ar.com.codoacodo.herencia.Consola;
import ar.com.codoacodo.herencia.Vendedor;

public class MainConsolas {

	public static void main(String[] args) {
		
		
		//Consola miConsola = new Consola(null, null, null);
		
		//ctrl+shit+o
		Consola[] consolas = Vendedor.venderConsolas();
		
		for (int i = 0; i < consolas.length; i++) {
			Consola aux = consolas[i];
			aux.mostrar();
			
			//quiero saber si aux implementa la interface IActualizable
			if(aux instanceof IActualizable) {
				System.out.println(aux.getNombre() + " es actualizable");
				IActualizable instancia = (IActualizable)aux;
				instancia.actualizar();
			}else {
				System.out.println(aux.getNombre() + " NO es actualizable");
			}
			
			if(aux instanceof IJugable) {
				System.out.println(aux.getNombre() + " es Jugable");
				IJugable instancia = (IJugable)aux;
				instancia.jugar();
			}else {
				System.out.println(aux.getNombre() + " NO es Jugable");
			}
			System.out.println("-------------------------");
		}
	}

}
