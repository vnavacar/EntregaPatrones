package main;

public class ComponentIO extends Component {
	
	private String Conector;
	private int puerto;

	public ComponentIO(int precio, String Fabricante, String Modelo,String Conector, int puertos) {
		super(precio, Fabricante, Modelo);
		this.Conector = Conector;
		this.puerto = puertos;
		
		
		// TODO Auto-generated constructor stub
	}
	public String getConector() {
		return Conector;
	}
	public void setConector(String asd) {
		this.Conector= asd;
	}
	public int getPuerto() {
		return puerto;
	}
	public void setPuerto(int ra) {
		this.puerto= ra;
	}

}
