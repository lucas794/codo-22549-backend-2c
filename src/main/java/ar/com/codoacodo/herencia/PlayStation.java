package ar.com.codoacodo.herencia;

import ar.com.codoacodo.herencia.interfaces.IActualizable;
import ar.com.codoacodo.herencia.interfaces.IJugable;

/**
 * 	play 1 = 32
	play 2 = 128
	play3 = 512
	play 4 = 1024
 * @author LopezCar
 *
 */
//PODEMOS HEREDAR DE UNA SOLA CLASE
//PODEMOS IMPLEMENTAR VARIAS INTERFACES
public class PlayStation extends Consola implements IActualizable, IJugable {

	private Integer version;

	public PlayStation(Integer bit,Integer version) {

		super("PayStation", bit, "Sony");
		this.version = version;
	}

	//alt+shit+s
	public Integer getVersion() {
		return version;
	}

	//ALT+SIHT+S
	public String toString() {
		String toStringDelPadre = super.toString(); 
		String toStringDeHijo = "PlayStation [version=" + version + "]";
		return toStringDelPadre + toStringDeHijo;
	}

	public void actualizar() {
		if(this.version == 3) {
			System.out.println("actualiznado play " + this.version);
			System.out.println("conectando al servidor de sony");
			System.out.println("descargando nuevo software");
		}else {
			System.out.println("play " + this.version + " no se puede actualizar") ;
		}
	}

	public void jugar() {
		System.out.println("Encendiendo Play" + this.version);
		System.out.println("Cargando juegos del HD");
		System.out.println("Todo listo seleccione juego");
	}
	
	
}