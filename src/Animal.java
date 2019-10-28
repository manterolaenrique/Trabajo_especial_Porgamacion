import java.util.ArrayList;


public class Animal extends ComponenteGanadero {
	//Atributos
	int id_chip;
	double peso;
	int edad;
	String raza;
	String sexo;
	Boolean capado;
	int hijos;
	
	//Constructor
	public Animal(int id_chip, double peso, int edad, String raza, String sexo,
			Boolean capado, int hijos) {
		this.id_chip = id_chip;
		this.peso = peso;
		this.edad = edad;
		this.raza = raza;
		this.sexo = sexo;
		this.capado = capado;
		this.hijos = hijos;
	}


	//Metodos
	public int total_animal() {
		return 1;
	}
	
	public int total_edad(){
		return getEdad();
	}
	
	public ArrayList<Animal> es_apto(Condicion c){
		ArrayList<Animal> res = new ArrayList<Animal>();
		if (c.se_cumple(this))
			res.add(this);
		return res;
	}
	
	public ArrayList<Animal> listar_animales(){
		ArrayList<Animal> res = new ArrayList<Animal>();
			res.add(this);
			return res;
	}
	
	public double total_peso() {
		
		return getPeso();
	}
		
	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public Boolean getCapado() {
		return capado;
	}


	public void setCapado(Boolean capado) {
		this.capado = capado;
	}


	public int getHijos() {
		return hijos;
	}


	public void setHijos(int hijos) {
		this.hijos = hijos;
	}


	public int getId_chip() {
		return id_chip;
	}


	public String getSexo() {
		return sexo;
	}
	
	public boolean equals(Object o){ 
		if (o instanceof Animal){
			Animal a = (Animal) o;
			return a.getId_chip()== this.getId_chip();
		}
		return false;
	}
	
	public void eliminar (Animal a) {
	}


	public String toString() {
		return "\n id_chip: " + id_chip + "\n peso: " + peso + "\n edad: "
				+ edad + "\n raza: " + raza + "\n sexo: " + sexo + "\n capado: "
				+ capado + "\n hijos: " + hijos + " \n"+  "----------------";
	}
}
