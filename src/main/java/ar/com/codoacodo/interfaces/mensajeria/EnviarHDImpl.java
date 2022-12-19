package ar.com.codoacodo.interfaces.mensajeria;

public class EnviarHDImpl implements IEnviar{
	
	private String fileSystemPath = "/temp/miusuario";
	//etc
	
	//cumplo el contrato
	public void enviar(String msj) {
		System.out.println("Grabando en: " + fileSystemPath);
		System.out.println("Mensaje: " + msj);
	}
}
