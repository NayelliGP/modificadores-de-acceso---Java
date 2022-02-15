package paquete2;

import paquete1.ClaseDefault;
import paquete1.ClaseProtected;

//paquete1.ClaseProtected - solo se especifica el paquete cuand 

public class Main extends ClaseProtected {
	public static void main(String[] args) {
		ClaseDefault prueba = new ClaseDefault();
		
		//prueba.mostrar();
		
		ClasePrivada privada = new ClasePrivada();
		
		//privada.edad = 30;
		// privada.nombre = "juan";
		privada.setSaludar("Juan");
		
		System.out.println(privada.getSaludar());
		//System.out.println(privada.nombre);
		
		//objeto de la clase protected
		//ClaseProtected protegido  = new ClaseProtected();//objeto creado
		//protegido.setEdad(18);
		
		//System.out.println(protegido.getEdad());
		
		Main protegido = new Main();
		protegido.setEdad(18);
		System.out.println(protegido.getEdad());
		
	}

}
