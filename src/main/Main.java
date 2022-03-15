package main;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Impresora impresora = new Impresora(52, "ElectronicaSA", "Imprimemas", "USB",2,"Laser");
		Teclado teclado = new Teclado(22, "ElDelTeclado", "escribemas", "USB", 1);
		UnidadCentral Unidad = new UnidadCentral(223, "CajaMagica", "Potatium5");
		Pantalla pantalla = new Pantalla(222, "ElDelaPantalla", "brillamas", "HDMI", 1);
		Raton ratoncito = new Raton(22, "ElDelRaton", "deslizamas", "USB", 1);
		Tableta tableta = new Tableta(123, "ElDelaTableta", "TabletaEstandar", "USB", 1);
		
		Computer caja = new Computer(Unidad,teclado,ratoncito,  impresora,pantalla, tableta);
		
		
		System.out.println(caja.print());
		System.out.println( caja.getPrecio() + "€");
	}

}
