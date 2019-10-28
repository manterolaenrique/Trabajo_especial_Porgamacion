
public class Sexo extends Condicion {
		//Atributos
		String sexo;
		
		
		//Constructor
		public Sexo(String sexo) {
			this.sexo = sexo;
		}



		public boolean se_cumple(Animal a) {
			
			return a.getSexo() == this.sexo;
		}

}
