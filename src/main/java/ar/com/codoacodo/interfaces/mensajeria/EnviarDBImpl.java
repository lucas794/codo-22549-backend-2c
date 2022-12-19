package ar.com.codoacodo.interfaces.mensajeria;

public class EnviarDBImpl implements IEnviar {

	private String username;
	private String password;
	private String host;
	
	public void enviar(String msj) {
		System.out.println("Conectando a mysql con username="+ this.username + "y password = " + this.password);
		System.out.println("Conectando a mysql al host "+ host);
		System.out.println("insertando en la tabla xyz el mensaje "+ msj);
	}

}
