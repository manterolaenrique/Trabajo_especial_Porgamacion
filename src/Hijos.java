
public class Hijos extends Condicion {
	//Atributos
	int hijos;
	
	
	
	public Hijos(int hijos) {
		this.hijos = hijos;
	}



	public boolean se_cumple(Animal a) {
		
		if (a.getHijos() >= 1)
			return true;
		else
			return false;
	}

}
