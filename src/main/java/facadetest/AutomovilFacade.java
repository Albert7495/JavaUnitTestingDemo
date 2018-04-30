package facadetest;

public class AutomovilFacade {

	public static void arrancar() {
		
		ComprobarLiquidos comprobarLiquidos= new ComprobarLiquidos();
		ComprobarAsientos comprobrarAsientos= new ComprobarAsientos();
		ComprobarEspejos comprobrarEspejos= new ComprobarEspejos();
		ComprobarGasolina comprobarGasolina= new ComprobarGasolina();
		Arrancar arrancar= new Arrancar();
		
		comprobarLiquidos.comprobrar();
		comprobrarAsientos.comprobrar();
		comprobrarEspejos.comprobrar();
		comprobarGasolina.comprobrar();
		arrancar.encender();
		System.out.println("Encendido!!");
	}
}
