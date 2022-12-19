package ar.com.codoacodo.interfaces.mensajeria;

public class DefaultEnviarImpl implements IEnviar{
	
	public void enviar(String msj) {
		System.out.println("Implementacion por defecto! para target:" + msj);
	}
}
