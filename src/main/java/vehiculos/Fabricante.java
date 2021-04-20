package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private static ArrayList<Fabricante> fabricantes;
	
	public Fabricante(String nombre, Pais pais) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		fabricantes.add(this);
	}

	
	public static Fabricante fabricaMayorVentas() {
		int maximo = 0;
		Fabricante moda = null;
		for(int i = 0; i<fabricantes.size(); i++) {
			int repeticiones =0;
			for(int j = 0; j<fabricantes.size(); j++) {
				if(fabricantes.get(i)== fabricantes.get(j)) {
					repeticiones ++;
				}
			}
			if(repeticiones > maximo) {
				maximo = repeticiones;
				moda = fabricantes.get(i);
			}
		}
		return moda;
	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
}
