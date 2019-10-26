
public class MenuTpEspecial {

	public static void main(String[] args) {
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		//EMPRESAS, ESTABLECIMIENTOS Y RODEOS
		SociedadGanadera monarca = new SociedadGanadera("Monarca");
		SociedadGanadera rodeo_norte = new SociedadGanadera("rodeo_norte");
		SociedadGanadera establecimiento_central = new SociedadGanadera("Establecimiento_Central");
		SociedadGanadera rodeo_sur = new SociedadGanadera("rodeo_sur");
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		//CAMIONES
		Camion camion_cisterna = new Camion("mack", "MPS145", 6);
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		//CONDICIONES
		Condicion beefmaster = new Raza("beefmaster");
		Condicion charolais = new Raza("charolais");
		Condicion simmental = new Raza("simmental");
		Condicion hereford = new Raza("hereford");
		Condicion mayor_edad = new Edad(12);
		Condicion menor_edad = new Not(new Edad(8));
		Condicion por_peso = new Peso(500);
		Condicion and = new And(menor_edad, mayor_edad);
		Condicion or = new Or(menor_edad, por_peso);
		CondicionGrupal peso_mayor = new PromedioPeso(1500);
		CondicionGrupal edad_mayor = new PromedioEdad(10);
		CondicionGrupal and_grupal = new AndPorGrupo(peso_mayor, edad_mayor);
		CondicionGrupal or_grupal = new OrPorGrupo(edad_mayor, peso_mayor);
		CondicionGrupal not_grupal = new NotPorGrupo(peso_mayor);
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		//MINISTERIO
		Ministerio ministerio_AP = new Ministerio("Ministerio_de agricultura y pesca");
		ministerio_AP.setMinisterio("lechal", menor_edad);
		ministerio_AP.setMinisterio("ternero", and);
		ministerio_AP.setMinisterio("añojo", new And(menor_edad,new Edad(24)));
		ministerio_AP.setMinisterio("novillo", new And(new Edad(24), new Edad(48)));
		ministerio_AP.setMinisterio("cebon", new And(new Capado(true), new Not(new Edad(48))));
		ministerio_AP.setMinisterio("vaquillona", new And(new Edad(15),new And(new Hijos(0), new Sexo("hembra"))));
		ministerio_AP.setMinisterio("vaca",new And(new Edad(15),new And(new Sexo("hembra"), new Not(new Hijos(0)))));
		ministerio_AP.setMinisterio("buey",new And(new Sexo("macho"), new And(new Edad(48), new Capado(true))));
		ministerio_AP.setMinisterio("toro" ,new And(new Sexo("macho"), new Not(new Capado(true))) );
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		//ANIMALES
		Animal vaca1 = new Animal(1, 650, 15, "beefmaster", "hembra", false, 3);
		Animal vaca2 = new Animal(2, 550, 10, "charolais", "hembra", false, 5);
		Animal vaca3 = new Animal(3, 450, 9, "simmental", "hembra", false, 6);
		Animal vaca4 = new Animal(4, 800, 18, "charolais", "hembra", true, 3);
		Animal vaca5 = new Animal(5, 750, 14, "simmental", "hembra", true, 9);
		Animal vaca6 = new Animal(6, 1000, 10, "charolais", "hembra", false, 6);
		Animal vaca7 = new Animal(7, 950, 20, "beefmaster", "hembra", false, 1);
		Animal vaca8 = new Animal(8, 1200, 15, "beefmaster", "hembra", false, 2);
		Animal vaca9 = new Animal(9, 350, 6, "charolais", "hembra", false, 0);
		Animal vaca10 = new Animal(10, 300, 3, "hereford", "hembra", false, 0);
		Animal vaca11 = new Animal(11, 200, 2, "hereford", "hembra", false, 0);
		Animal toro = new Animal(12, 1000, 5, "beefmaster", "macho", false, 45);
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		
		   
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		//EMPRESA "Monarca" (CARGADO DE RODEOS)
		monarca.add(vaca1);
		monarca.add(vaca10);
		monarca.add(vaca11);
		monarca.add(toro);
		monarca.add(establecimiento_central);
		establecimiento_central.add(rodeo_sur);
		establecimiento_central.add(vaca2);
		establecimiento_central.add(vaca3);
		establecimiento_central.add(vaca9);
		rodeo_sur.add(vaca4);
		rodeo_sur.add(vaca5);
		rodeo_sur.add(vaca6);
		monarca.add(rodeo_norte);
		rodeo_norte.add(vaca7);
		rodeo_norte.add(vaca8);
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		//LISTADO DE VACA SEGUN CONDICON DE RAZA //MONARCA! 
		System.out.println(monarca.getNombre());
		System.out.println("Listado de vacas por la raza: " + hereford.toString() + monarca.es_apto(hereford));
		System.out.println("Listado de vacas por la raza: " + beefmaster.toString() + monarca.es_apto(beefmaster));
		System.out.println("Listado de vacas por la raza: " + charolais.toString() + monarca.es_apto(charolais));
		System.out.println("Listado de vacas por la raza: " + simmental.toString() + monarca.es_apto(simmental));
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		//LISTADO DE VACA SEGUN CONDICON DE RAZA //ESTABLECIMIENTO CENTRAL! 
		System.out.println("_________________________________________________________");
		System.out.println(establecimiento_central.getNombre());
		System.out.println("Listado de vacas por la raza: " + hereford.toString() + establecimiento_central.es_apto(hereford));
		System.out.println("Listado de vacas por la raza: " + beefmaster.toString() + establecimiento_central.es_apto(beefmaster));
		System.out.println("Listado de vacas por la raza: " + charolais.toString() + establecimiento_central.es_apto(charolais));
		System.out.println("Listado de vacas por la raza: " + simmental.toString() + establecimiento_central.es_apto(simmental));
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		//LISTADO DE VACA SEGUN CONDICON DE RAZA //RODEO DEL NORTE!
		System.out.println("_________________________________________________________");
		System.out.println(rodeo_norte.getNombre());
		System.out.println("Listado de vacas por la raza: " + hereford.toString() + rodeo_norte.es_apto(hereford));
		System.out.println("Listado de vacas por la raza: " + beefmaster.toString() + rodeo_norte.es_apto(beefmaster));
		System.out.println("Listado de vacas por la raza: " + charolais.toString() + rodeo_norte.es_apto(charolais));
		System.out.println("Listado de vacas por la raza: " + simmental.toString() + rodeo_norte.es_apto(simmental));
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		//LISTADO DE VACA SEGUN CONDICON DE RAZA //RODEO DEL SUR!
		System.out.println("_________________________________________________________");
		System.out.println(rodeo_sur.getNombre());
		System.out.println("Listado de vacas por la raza: " + hereford.toString() + rodeo_sur.es_apto(hereford));
		System.out.println("Listado de vacas por la raza: " + beefmaster.toString() + rodeo_sur.es_apto(beefmaster));
		System.out.println("Listado de vacas por la raza: " + charolais.toString() + rodeo_sur.es_apto(charolais));
		System.out.println("Listado de vacas por la raza: " + simmental.toString() + rodeo_sur.es_apto(simmental));
		//----------------------------------------------------------------------------------------------------------------------------------------------------------

		
		System.out.println("_________________________________________________________");
		System.out.println(monarca.getNombre());
		System.out.println("El promedio edad es: " + monarca.promedio_edad());
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		//LISTADO DE ANIMALES SEGUN SU PESO SUPERA LOS 500 KG //
		System.out.println("ANIMALES CON PESO SUPERIOR A 500kg"+monarca.es_apto(por_peso));
		
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		//LISTADO DE ANIMALES CON EDADES MENORES A 8 AÑOS O CON UN PESO MAYOR A 500 KG //
		System.out.println("ANIMALES CON EDADES MENORES A 8 AÑOS O CON UN PESO MAYOR A 500 KG"+monarca.es_apto(or));
		
		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		//RETORNA SI HAY ANIMALES CON UN PESO MAYOR A 1500 KG Y CON EDAD MAYORES A 10 AÑOS //
		System.out.println("HAY ANIMALES CON UN PESO MAYOR A 1500 KG Y CON EDAD MAYORES A 10 AÑOS ? Respuesta: " + and_grupal.se_cumple(monarca));

		
		
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		//RETORNA SI HAY ANIMALES CON UNA EDAD MAYOR A 10 AÑOS O CON UN PESO MAYOR A 1500KG //
		System.out.println("HAY ANIMALES CON UN PESO MAYOR A 1500 KG Y CON EDAD MAYORES A 10 AÑOS ? Respuesta: " + or_grupal.se_cumple(monarca));
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		
		//RETORNA SI NO HAY ANIMALES CON UN PESO MAYOR A 1500KG //
		System.out.println("HAY ANIMALES CON UN PESO MAYOR A 1500 KG Y CON EDAD MAYORES A 10 AÑOS ? Respuesta: " + not_grupal.se_cumple(monarca));
		//----------------------------------------------------------------------------------------------------------------------------------------------------------
		
		
		
		System.out.println("_________________________________________________________");
		System.out.println("verifica animal "+ministerio_AP.verifica(vaca2));
		
		System.out.println("_________________________________________________________");
		System.out.println("CANTIDAD DE ANIMALES DEL ESTABLECIMIENTO ANTES DE SER CARGADO : " + monarca.total_animal());
		camion_cisterna.cargar(monarca, charolais);
		System.out.println("CANTIDAD DE ANIMALES DEL ESTABLECIMIENTO LUEGO DE SER CARGADO : " + monarca.total_animal());
		
		
	
				

		
		
	}

}
