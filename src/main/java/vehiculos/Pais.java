package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private static ArrayList<Pais> paises;
	
	public Pais(String nombre) {
		super();
		this.nombre = nombre;
		paises.add(this);
	}
	
	public static Pais paisMasVendedor() {
		int maximo = 0;
		Pais moda = null;
		for(int i = 0; i<paises.size(); i++) {
			int repeticiones =0;
			for(int j = 0; j<paises.size(); j++) {
				if(paises.get(i)== paises.get(j)) {
					repeticiones ++;
				}
			}
			if(repeticiones > maximo) {
				maximo = repeticiones;
				moda = paises.get(i);
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
	
	
}