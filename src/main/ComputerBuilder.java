package main;

public class ComputerBuilder implements Builder {

	private UnidadCentral Unidad;
    private Teclado teclado;
    private Raton raton;
    private Tableta tableta;
    private Pantalla pantalla;
    private Impresora impresora;
    

    public void setTeclado(Teclado teclado) {
    	
    	this.teclado  = teclado;
    }
    public void setImpresora(Impresora impresora) {
    	
    	this.impresora= impresora;
    }

    @Override
    public void setPantalla(Pantalla transmission) {
        this.pantalla = transmission;
    }

    @Override
    public void setUnidadCentral(UnidadCentral unidad) {
        this.Unidad = unidad;
    }

    @Override
    public void setTableta(Tableta tableta) {
        this.tableta = tableta;
    }
    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public Computer getResult() {
        return new Computer( Unidad, teclado,raton, impresora , pantalla , tableta );
    }
}


