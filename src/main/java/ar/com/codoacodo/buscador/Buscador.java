//paquete
package ar.com.codoacodo.buscador;

//nombre de clase
public class Buscador {

	//o.o.p: atributos sean privados
	
	//atributos
	private String claveBusqueda;
		
	private Articulo[] resultados;
	
	private int cantidadResultados;
	
	//constructor/es
	public Buscador() {
		System.out.println("nace un buscador");
		//cuando nace el tamaño del resultado
		resultados = new Articulo[0];
	}
	
	//metodos	
	public void buscar() {
		System.out.println("buscando " + claveBusqueda);
		
		//aca debo cargar el array de resultados con objetos de la clase Articulo
		//simular que encontramos 3 resultados
		
		Articulo res1 = new Articulo();
		Articulo res2 = new Articulo();
		Articulo res3 = new Articulo();
		
		//instancio nuevamente el array de resultados
		resultados = new Articulo[3];//length 0 1 2 
		
		resultados[0]=res1;
		resultados[1]=res2;
		resultados[2]=res3;
		
		//actualizo la cantidad de resultados 
		cantidadResultados = resultados.length;
	}
	
	public void cambiarClave(String nuevaClave) {
		claveBusqueda = nuevaClave;
	}
	
	public int getCantRes() {
		return cantidadResultados;
	}
	
	public String getClaveBusqueda() {
		if(claveBusqueda == null) {
			return "";
		}
		return claveBusqueda;
	}
}
