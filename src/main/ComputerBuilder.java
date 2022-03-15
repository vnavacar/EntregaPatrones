package main;

public class ComputerBuilder implements Builder {

	private UnidadCentral Unidad;
    


    public void setUnidadCentral(String Unidad) {
        this.Unidad = Unidad;
    }

    @Override
    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setUnidadCentral(UnidadCentral unidad) {
        this.UnidadCentral = unidad;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Computer getResult() {
        return new Computer(UnidadCentral);
    }
}

}
