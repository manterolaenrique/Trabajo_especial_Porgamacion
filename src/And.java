
public class And extends Condicion {
	
	//Atributos
	Condicion cond1;
	Condicion cond2;
	
	//Constructor
	public And(Condicion cond1, Condicion cond2) {
		this.cond1 = cond1;
		this.cond2 = cond2;
	}

	//Metodos
	public boolean se_cumple(Animal a) {
		return (cond1.se_cumple(a)) && (cond2.se_cumple(a));
	}

}
