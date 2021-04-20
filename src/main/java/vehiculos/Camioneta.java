package vehiculos;

public class Camioneta extends Vehiculo{
	private boolean volco;
	private static int cantidadCamionetas=0;

	public Camioneta(String placa, int puertas, String nombre, int precio, int peso,
			Fabricante fabricante, boolean volco) {
		super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
		this.volco = volco;
		cantidadCamionetas ++;
	}

	public static int getcantidadCamionetas() {
		return cantidadCamionetas;
	}
	
	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	
	
}
