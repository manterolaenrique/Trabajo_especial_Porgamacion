import java.util.ArrayList;
import java.util.HashMap;

public class Ministerio {
	//Atributos
	String nombre;
	HashMap <String,Condicion> lista;
	
	//Constructor
	public Ministerio(String nombre) {
		this.nombre = nombre;
		lista = new HashMap<String, Condicion>();
	}
	
	//Metodos
	public void setMinisterio (String n, Condicion c){
		lista.put(n,c);
	}
	
	public ArrayList<String> verifica(Animal a){
		ArrayList<String> res = new ArrayList<String>();
		
		for(String cat : lista.keySet()){
			if (lista.get(cat).se_cumple(a))
				res.add(cat);
			
		}
		return res;
	}
}
