import java.util.ArrayList;

public  abstract class ComponenteGanadero {

		public abstract int total_animal(); //Retorna el total de animales de un sistema ganadero 
		public abstract double total_peso(); //Retorna el total de peso de un sistema ganadero 
		public abstract int total_edad(); //Retorna el total de las edades de un sistema ganadero 
		public abstract ArrayList <Animal> es_apto(Condicion c); //Lista todo los animales que comple una condicion que es pasda por paremtro
		public abstract void eliminar(Animal a); //Busca un animal, que es pasado por parametro
		public abstract ArrayList <Animal> listar_animales(); //Lista todo los animales de un Sistema ganadero
		
}
