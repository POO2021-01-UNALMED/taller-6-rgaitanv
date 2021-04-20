package vehiculos;

public class Automovil extends Vehiculo{
	private int puestos;
	private static int cantidadAutomoviles;
	
	public Automovil(String placa, String nombre, int precio, int peso,
			Fabricante fabricante, int puestos) {
		super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
		this.puestos = puestos;
		cantidadAutomoviles ++;
	}

	public static int getcantidadAutomoviles() {
		return cantidadAutomoviles;
	}
	
	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestoz) {
		this.puestos = puestoz;
	}


	
}
