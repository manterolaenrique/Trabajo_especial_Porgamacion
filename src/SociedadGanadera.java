import java.util.ArrayList;

public class SociedadGanadera extends ComponenteGanadero {
	//Atributos
	ArrayList <ComponenteGanadero> lista_ganadera;
	String nombre;
	
	
	//Constructor
	public SociedadGanadera(String nombre) {
		this.nombre = nombre;
		lista_ganadera = new ArrayList<ComponenteGanadero>();
	}

	//Metodos
	public void add(ComponenteGanadero elemento){
		lista_ganadera.add(elemento);
	}
	
	
	public int total_animal() {
		int cantidad = 0;
		for(ComponenteGanadero elemento : lista_ganadera){
			cantidad += elemento.total_animal();
		}
		return cantidad;
	}

	
	public double total_peso() {
		double peso = 0;
		for(ComponenteGanadero elemento : lista_ganadera){
			peso += elemento.total_peso();
		}
		return peso;
	}
	
	public double promedio_peso (){
		double peso = total_peso();
		return peso/lista_ganadera.size();
	}
	
	public int total_edad(){
		int edad = 0;
		for(ComponenteGanadero elemento : lista_ganadera){
			edad += elemento.total_edad();
		}
		return edad;
	}
	
	public double promedio_edad(){
		int edad = total_edad();
		int cantidad = lista_ganadera.size();
		return edad / cantidad;
	}
	
	public ArrayList<Animal> es_apto(Condicion c){
		ArrayList<Animal> res = new ArrayList<Animal>();
		for(ComponenteGanadero elemento: lista_ganadera){
			res.addAll(elemento.es_apto(c));
	}
		return res;
	}
	
	public ArrayList<Animal> listar_animales(){
		ArrayList<Animal> res = new ArrayList<Animal>();
		for(ComponenteGanadero elemento : lista_ganadera)
			res.addAll(elemento.listar_animales());
		return res;
	}
	
	public ArrayList<String> mostrar (){
		ArrayList<String> mostrare = new ArrayList<String>();
		String a;
			for(int i =0; i<lista_ganadera.size(); i++){
				a=lista_ganadera.get(i).toString();
				mostrare.add(a);
			}
			return mostrare ;
		}
	
	
	public void eliminar(Animal a) {
		ComponenteGanadero aux = null;
		for (int i =0; i<lista_ganadera.size(); i++){
			aux = lista_ganadera.get(i);
			if (aux.equals(a)){
				lista_ganadera.remove(aux);
				return;
			}
		}
		
		for(int i =0; i<lista_ganadera.size(); i++){
			aux=lista_ganadera.get(i);
			aux.eliminar(a);
		}
	}
		

	public String getNombre() {
		return nombre.toUpperCase();
	}
	
	
}
