
public class PromedioEdad extends CondicionGrupal {

	//Atributo
	double edad;
	
	//Contructor
	public PromedioEdad(double edad) {
		super();
		this.edad = edad;
	}
	
	//Metodos
	public boolean se_cumple(SociedadGanadera grupo) {

		if (grupo.promedio_edad()>edad)
			return true;
		else
			return false;
	}

}
