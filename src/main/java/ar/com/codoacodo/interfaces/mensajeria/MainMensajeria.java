package ar.com.codoacodo.interfaces.mensajeria;

public class MainMensajeria {

	public static void main(String[] args) {
		String target = "";
		String mensaje = "aprendiendo interfaces en java";
		
		var mensajeria = new Mensajeria();
		
		switch (target) {
			case "A":
				mensajeria.enviarMail(mensaje);
				break;
			case "B":
				mensajeria.enviarHD(mensaje);
				break;
			case "C":
				mensajeria.enviarADB(mensaje);
				break;
		default:
			System.out.println("OPCION INVALIDA");
			break;
		}
	}

}
