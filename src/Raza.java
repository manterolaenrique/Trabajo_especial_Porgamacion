
public class Raza extends Condicion {
	//Atributos
	String raza;
	
	
	
	public Raza(String raza) {
		this.raza = raza;
	}



	public boolean se_cumple(Animal a){
		if (raza == a.getRaza())
			return true;
		else
			return false;
		
	}

	public String toString() {
		return this.raza + "\n";
	}

	
}
