package ar.com.codoacodo.interfaces.mensajeria;

public class MainMensajeriaConCreadorDeMensajeria {

	public static void main(String[] args) {
		String target = "";
		
		String mensaje = "aprendiendo interfaces en java";
		
		IEnviar msj = CreadorDeMensajeria.crearMensajeria(target);
		
		msj.enviar(mensaje);
	}

}
