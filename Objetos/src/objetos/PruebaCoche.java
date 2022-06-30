package objetos;

import java.util.Scanner;

public class PruebaCoche {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		/*Coche coche1 = new Coche();
		System.out.println("Marca: ");
		coche1.marca= entrada.nextLine();
		
		System.out.println("Modelo: ");
		coche1.modelo=entrada.nextLine();
		
		System.out.println("Potencia: ");
		coche1.potencia=entrada.nextInt();*/
		
		Coche c2 = new Coche();
		//c2.marca="ford";
		c2.setMarca("Ford");
		
		//c2.modelo="mondeo";
		c2.setModelo("mondeo");
		//c2.potencia= 120;
		c2.setPotencia(120);
		c2.setVelocidadMax(40);
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		c2.acelerar();
		// error el método no existe y la variable es privada
		//c2.setVelocidad(200);
		System.out.println("l coche va a "+c2.getVelocidad());
		
		c2.frenar();
		c2.frenar();
		c2.frenar();
		System.out.println("l coche va a "+c2.getVelocidad());
		
		Coche c3 = new Coche("Seat", "leon",105,170);

		Coche c4 = new Coche("Ferrari", "GT40");
		
	}

}
