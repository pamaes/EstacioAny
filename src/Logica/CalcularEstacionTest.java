package Logica;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalcularEstacionTest {

	private String mes;

	@Test
	public String devolverEsacion(int num_mes, String mes, String estacion){
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
		
		return estacion;
	}

}

