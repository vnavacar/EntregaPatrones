package main;

public class Computer {
	
	private final UnidadCentral Unidad;
    private final Teclado teclado;
    private final Raton raton;
    private final Tableta tableta;
    private final Pantalla pantalla;
    private final Impresora impresora;
	
	
	
	public Computer(UnidadCentral unidadCentral,Teclado Teclado,Raton raton, Impresora Impresora, Pantalla escanner, Tableta tableta) {
		
		this.Unidad = unidadCentral;
		this.teclado = Teclado;
		this.impresora= Impresora;
		this.pantalla = escanner;
		this.raton = raton;
		this.tableta = tableta;
	}
	
	public int getPrecio() {
		int precio = 0;
		precio = Unidad.getPrecio()+teclado.getPrecio()+raton.getPrecio()+tableta.getPrecio()+pantalla.getPrecio()+impresora.getPrecio();
		return precio;
	}
	

}
