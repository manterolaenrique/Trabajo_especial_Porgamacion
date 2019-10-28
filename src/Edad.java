
public class Edad extends Condicion {

		//Atributos
		int edad;
		
		//Constructor
		public Edad(int edad) {
			this.edad = edad;
		}
		
		
		public boolean se_cumple(Animal a) {
			if (a.getEdad() > edad )
				return true;
			else
				return false;
		}


	}
