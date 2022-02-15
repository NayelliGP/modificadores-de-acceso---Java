package paquete2;

public class ClasePrivada {
	//atributos
	private String nombre;
	private int edad;
	
	//método
	public void setSaludar(String nombre) { //fija o midifica in valor
		this.nombre = nombre; 
		
	}
	public String getSaludar() {
		return this.nombre;
		
	}

}
