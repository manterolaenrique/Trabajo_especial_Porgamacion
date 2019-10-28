import java.util.ArrayList;

public class Camion {
	// Atributos
	String modelo;
	String patente;
	int capacidad;
	ArrayList<Animal> cargado;

	// Constructor
	public Camion(String modelo, String patente, int capacidad) {
		this.modelo = modelo;
		this.patente = patente;
		this.capacidad = capacidad;
		cargado = new ArrayList<Animal>();
	}

	public ArrayList<String> mostrar() {
		ArrayList<String> mostrare = new ArrayList<String>();
		String a;
		for (int i = 0; i < cargado.size(); i++) {
			a = cargado.get(i).toString();
			mostrare.add(a);
		}
		return mostrare;
	}

	// Metodos

	public void cargar(SociedadGanadera e, Condicion c) {
		ArrayList<Animal> apto = e.es_apto(c);
		Animal vender = null;
		for (int i = 0; (i < apto.size() && cargado.size() < capacidad); i++) {
			vender = apto.get(i);
			cargado.add(vender);
			e.eliminar(vender);
		}
	}
}
