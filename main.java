package proba;

import java.util.Scanner;

public class main {
	
	public static void main(String[] args) {
		float PrecioFabrica = 1;
		float PrecioReal = 1;
		float PorcentajePrecio = 1;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("que costa de fabrica? ");
		PrecioFabrica = teclado.nextInt();
		System.out.println("Seguro? "+PrecioFabrica);
		
		System.out.println("que costa de real? ");
		PrecioReal = teclado.nextInt();
		System.out.println("Seguro? "+PrecioReal);
		
		PorcentajePrecio = PrecioFabrica/PrecioReal*100;
		System.out.print("El porcentaje es: "+PorcentajePrecio+"%");
	}
	
}
