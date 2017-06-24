package Logica;

/*
 * By Paco Gomez
 * Esta clase realiza el calculo
 * 
 * */
public class CalcularEstacion {
	
	private String mes="";
	private String estacion="";
	private int num_mes = 0;
	
	//El constructor recibe el mes en formato String
	public CalcularEstacion(String mes) {
		this.mes=mes;
	}
	
	
	//Realiza el calculo
	public String devolverEsacion(){
		num_mes = Integer.parseInt(this.mes);
		switch (num_mes % 4) {
		case 0:
			estacion = "Invierno";
			break;
		case 1:
			estacion = "Primavera";
			break;
		case 2:
			estacion = "Verano";
			break;
		case 3:
			estacion = "Otoño";
			break;
			
		}
		
		return this.estacion;
	}

}
