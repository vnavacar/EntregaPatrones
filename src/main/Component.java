package main;

public class Component {
	
	private int precio;
	private String Fabricante;
	private String Modelo;
	
	public Component(int precio, String Fabricante, String Modelo) {
		
		this.precio = precio;
		this.Fabricante = Fabricante;
		this.Modelo= Modelo;
	}
	
	public int getPrecio() {
        return precio;
    }
	public String getFabricante() {
        return Fabricante;
	}
	public String getModelo() {
		return Modelo;
	}
	public void setPrecio(int precio) {
        this.precio= precio;
    }
	public void setFabricante(String Fabricante) {
        this.Fabricante= Fabricante;
    }
	public void setModelo(String Modelo) {
        this.Modelo= Modelo;
    }
	
}
