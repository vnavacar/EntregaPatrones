package main;

public class Impresora extends ComponentIO {
	
	private String Cartucho;
	private int impresiones = 0;

	public Impresora(int precio, String Fabricante, String Modelo, String Conector, int puertos,String Cartucho) {
		super(precio, Fabricante, Modelo,Conector, puertos);
		this.Cartucho=Cartucho;
		// TODO Auto-generated constructor stub
	}
	public void imprimir() {
		impresiones++;
	}
	public int getImpresiones() {
		return impresiones;
	}
	public String getCartucho() {
		return Cartucho;
	}

}
