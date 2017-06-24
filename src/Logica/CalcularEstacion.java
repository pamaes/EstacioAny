package Logica;

/*
 * By Paco Gomez
 * Esta clase realiza el calculo
 * 
 * */
public class CalcularEstacion {
	
	private String mes="";
	private String estacion="";
	
	//El constructor recibe el DNI en formato String
	public CalcularEstacion(String mes) {
		this.mes=mes;
	}
	
	//REaliza el calculo
	public String devolverEsacion(){
		return this.estacion;
	}

}
