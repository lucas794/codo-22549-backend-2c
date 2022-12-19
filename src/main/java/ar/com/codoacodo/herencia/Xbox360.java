package ar.com.codoacodo.herencia;

import ar.com.codoacodo.herencia.interfaces.IActualizable;

public class Xbox360 extends Consola implements IActualizable{

	//escribo explicitamente el constructor de Xbox360
	//PERO, debo enviarle al padre los 3 parametros que me pide
	public Xbox360() {
		// la primer linea de un constructor de una clase hija
		// es invocar al constructor del padre, con los parametros
		//que requiere
		super("Xbox360",1024,"Microsoft");
	}

	public void actualizar() {
		System.out.println("conectando xbox al servidor de microsfot...");
		System.out.println("descargando nuevo firmware..");
		System.out.println("finalizando instalacion");
	}
}
