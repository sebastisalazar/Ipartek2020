package UF2404;

public class PruebaTecnica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("**Empezamos el bucle");
		System.out.println("Prueba tecnica");

		for (int i = 0; i < 5; i++) {

			System.out.println("Esta es la iteración numero " + i);

			if (i == 0) {
				System.out.println(i + " No es par ni impar");

			} else if (i % 2 == 0) {

				System.out.println(i + " Es par");

			} else {
				System.out.println(i + " Es impar");
			}
			// 1º IF

		} // For

		System.out.println("**Terminamos bucle");
	}// main

}// clase
