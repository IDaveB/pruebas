package pruebas;

import java.util.ArrayList;

public class Numeros {
	
	public static void main(String[] args) {
		


		int numeros[] = { 2, 5, 8, 9, 12 };
		ArrayList<Integer> par = new ArrayList<Integer>();
		ArrayList<Integer> impar = new ArrayList<Integer>();

		for (int x = 0; x < numeros.length; x++) {

			if (numeros[x] % 2 == 0) {

				par.add(numeros[x]);

			} else {

				impar.add(numeros[x]);

			}

		}

		System.out.println("Numeros pares");
		System.out.println(par);
		System.out.println("Numeros impares");
		System.out.println(impar);

	}
	
}


