
public class AndPorGrupo extends CondicionGrupal {

	//Atributos
	CondicionGrupal cond1;
	CondicionGrupal cond2;
	
	//Constructor
	public AndPorGrupo(CondicionGrupal cond1, CondicionGrupal cond2) {
		this.cond1 = cond1;
		this.cond2 = cond2;
	}

	//Metodos
	public boolean se_cumple(SociedadGanadera grupo) {
		if (cond1.se_cumple(grupo) && (cond2.se_cumple(grupo)))
			return true;
		else
			return false;
	}

}
