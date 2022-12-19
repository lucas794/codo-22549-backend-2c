package ar.com.codoacodo.interfaces;

public class Persona {

	private String nombre;
	private String idioma;//nace
	private String[] otrosIdiomas;//aprende
	
	public Persona(String nombre, String idioma) {//f6
		setNombre(nombre);//f5
		setIdioma(idioma);//f6
		setOtrosIdiomas(new String[0]);
	}//f6 f7
	
	private void setOtrosIdiomas(String[] idiomas) {
		this.otrosIdiomas = idiomas; 
	}
	
	public void decir(String palabra) {
		System.out.println(getNombre() + " dice " + palabra + " en " + getIdioma());
	}
	
	//sobrecarga de metodos: una forma de polimorfismo
	public void decir(String algo, String idioma) {
		// si this.idomas es igual al idioma 
		// o si el idoma esta en el array de otros idiomas
		// entonces puede decir algo en ese idioma
		
		//en java no se usa el == para comparar objetos, sino el .equals()
		
		if (getIdioma().equals(idioma) || existe(idioma)) {
			System.out.println(getNombre() + " puede decir " + algo + " en " + idioma);
		}else {
			System.out.println(getNombre() + " NO HABLA " + idioma);
		}
		
	}
	
	private boolean existe(String idioma) {
		//"siempre" usar los getter  
		boolean existe = false;
		for (int i = 0; !existe && i < getOtrosIdiomas().length; i++) {
			existe = getOtrosIdiomas()[i] == idioma;//true|false
		}
		return existe;
	}
	
	public void aprender(String nuevoIdioma) {//chino?
		// si el dioma nativo NO es chino,
		// && this.otrosIdiomas no existe chino
		// agrego a la lista de this.otrosIdiomas 
		if (!getIdioma().equals(nuevoIdioma) && !existe(nuevoIdioma)) {
			String[] nuevosIdiomas = new String[this.otrosIdiomas.length + 1];
			for(int i=0;i<this.otrosIdiomas.length;i++) {//f6
				nuevosIdiomas[i] = this.otrosIdiomas[i];		
			}
			nuevosIdiomas[this.otrosIdiomas.length] = nuevoIdioma;
			setOtrosIdiomas(nuevosIdiomas);
		}
	}

	private void setIdioma(String idioma) {
		this.idioma = idioma;			
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		//si hay una sola linea
		//no es obligatorio usar los {}
		if(nombre == null) {
			nombre = "";
		}
		
		this.nombre = nombre;
	}

	public String getIdioma() {
		return idioma;
	}

	public String[] getOtrosIdiomas() {
		return otrosIdiomas;
	}
	
	//alt+shit+s
	
}
