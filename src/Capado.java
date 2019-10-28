
public class Capado extends Condicion {
	//Atributos
	boolean capado;
	
	
	//Constructor
	public Capado(boolean capado) {
		this.capado = capado;
	}



	public boolean se_cumple(Animal a) {
		
		return a.getCapado() == this.capado;
	}

}
