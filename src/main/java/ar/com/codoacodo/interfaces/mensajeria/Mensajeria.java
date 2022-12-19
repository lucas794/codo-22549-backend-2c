package ar.com.codoacodo.interfaces.mensajeria;

public class Mensajeria {

	public void enviarMail(String mensaje) {
		System.out.println("Enviando mail : " + mensaje);
	}
	
	public void enviarHD(String mensaje) {
		System.out.println("Escribiendo en HD /temp/: " + mensaje);
	}
	
	public void enviarADB(String mensaje) {
		System.out.println("conecntando a MYSQL");
		System.out.println("usuario root");
		System.out.println("password root");
		System.out.println("insertando en tablexyz ");
		System.out.println("insert into tablexyz ....");
	}
}
