
public class Peso extends Condicion {
	//Atributos
	double peso;
	
	//Contructor
	public Peso(double peso) {
		this.peso = peso;
	}
		
	public double get_peso(){
		return peso;
	}
	
	public boolean se_cumple(Animal a) {
		if (a.getPeso() > peso )
			return true;
		else
			return false;
	}


}
