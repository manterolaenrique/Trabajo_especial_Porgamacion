
public class Or extends Condicion {
	//Atributos
	Condicion cond1;
	Condicion cond2;
	
	//Constructor
	public Or(Condicion cond1, Condicion cond2) {
		this.cond1 = cond1;
		this.cond2 = cond2;
	}

	//Metodos
	public boolean se_cumple(Animal a) {
		if ((cond1.se_cumple(a)) || (cond2.se_cumple(a)))
			return true;
		else
			return false;
	}
}
