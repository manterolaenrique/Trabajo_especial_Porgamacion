
public class Not extends Condicion {
	//Atributo
	Condicion cond;
	
	//Contructor
	public Not(Condicion cond) {
		this.cond = cond;
	}
	
	public boolean se_cumple(Animal a) {
		return !cond.se_cumple(a);
	}


}
