
public class NotPorGrupo extends CondicionGrupal {
	
	//Atributos
	CondicionGrupal cond;
	
	//Constructor
	public NotPorGrupo(CondicionGrupal cond) {
		this.cond = cond;
	}
	
	//Metodos
	public boolean se_cumple(SociedadGanadera grupo) {
		if(cond.se_cumple(grupo))
			return false;
		else
			return true;
	}

}
