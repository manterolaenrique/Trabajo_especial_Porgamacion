

public class PromedioPeso extends CondicionGrupal {
	//Atributos
	double peso;
	
	//Constructor
	public PromedioPeso(double peso) {
		this.peso = peso;
	}
	

	public boolean se_cumple(SociedadGanadera grupo) {
		return grupo.promedio_peso() > peso;
		
	}


}
