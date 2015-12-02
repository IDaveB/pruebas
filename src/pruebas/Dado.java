package pruebas;

public class Dado {

	public static void main(String[] args) {

		mostrar();

	}

	public static void mostrar() {

		String Nombres[] = { "David I", "Oscar", "Gorka", "Ariane", "Gontxal",
				"Aitor", "Santi", "Raul", "David Ortiz", "Sergio",
				"David Barbudo", "Edorta", "Asier", "Alberto", "Iñigo" };

		// for (int i = 0; i <= Nombres.length; i++) {
		//
		// System.out.println(i  + " " + Nombres[i]);
		//
		// }

		int numero = (int) (Math.random() * Nombres.length);

		System.out.println("El afortunado es : " + Nombres[numero]);

	}
}