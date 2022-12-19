package ar.com.codoacodo.herencia;

//todas la clases en java hereden de object implicitamente
public abstract class Consola /*extends Object*/ {
	
	//new Consola();
	
	private String nombre;
	protected Integer bit;
	private String marca;
	
	// contructor con todos los parametros
	// porque se que todos los hijos se crearan con dichos parametros
	//alt+shit+s
	
	public Consola(String nombre, Integer bit, String marca) {		
		this.nombre = nombre;	
		this.bit = bit;
		this.marca = marca;
	}

	//como nombre y marca soin private
	//expongo getters y setters
	
	public String getNombre() {
		return nombre;
	}

	public Integer getBit() {
		return bit;
	}

	public String getMarca() {
		return marca;
	}

	
	//polimorfismo: 
	//alt+shit+s
	public String toString() {
		return "Consola [nombre=" + nombre + ", bit=" + bit + ", marca=" + marca + "]";
	}

	public void mostrar() {
		System.out.println(toString());
	}
}
