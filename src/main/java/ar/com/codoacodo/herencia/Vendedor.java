package ar.com.codoacodo.herencia;

public class Vendedor {

	/*
	 * PlayStation
	 * Xbox
	 * SegaGenesis
	 */
	public static Consola[]  venderConsolas() {
		
		var xbox360 = new Xbox360();
		
		var play1 = new PlayStation(36, 1);
		var play2 = new PlayStation(128, 2);
		var play3 = new PlayStation(256, 3);
		var play4 = new PlayStation(1024, 4);

		var sega = new SegaGenesis();
		
		return new Consola[]{xbox360,play1,play2,play3,play4,sega};
	}
}
