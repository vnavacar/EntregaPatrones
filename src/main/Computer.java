package main;

public class Computer {
	
	private final UnidadCentral unidadCentral;
	private final Teclado teclado;
	private final Impresora impresora;
	
	
	
	public Computer(UnidadCentral unidadCentral,Teclado Teclado, Impresora Impresora, Pantalla escanner) {
		
		this.unidadCentral = unidadCentral;
		this.teclado = Teclado;
		this.impresora= Impresora;
		
		
	}
	

}
