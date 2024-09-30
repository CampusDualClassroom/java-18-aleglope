package com.campusdual.classroom;

import com.campusdual.util.Utils;

/**
 * La clase {@code Exercise18} proporciona métodos para crear e inicializar un array de números naturales
 * y para mostrar sus elementos en formato secuencial.
 * <p>
 * Incluye métodos para:
 * <ul>
 *     <li>Crear y inicializar un array de enteros con los primeros N números naturales.</li>
 *     <li>Mostrar los elementos del array en una sola línea separados por espacios.</li>
 * </ul>
 * </p>
 *
 * Además, el método {@code main} interactúa con el usuario para obtener el número de elementos y
 * demostrar la funcionalidad de los métodos implementados.
 *
 * @version 1.0
 */
public class Exercise18 {

	/**
	 * Crea e inicializa un array de enteros con los primeros N números naturales.
	 * <p>
	 * Utiliza un bucle {@code for} para asignar valores secuenciales desde 1 hasta N.
	 * </p>
	 *
	 * @param n El número de elementos que tendrá el array.
	 * @return Un array de enteros inicializado con los primeros N números naturales.
	 */
	public static int[] createAndInitializeArray(int n) {
		// Crear un array de enteros con n posiciones
		int[] array = new int[n];

		// Inicializar el array con los primeros N números naturales (1, 2, 3, ..., n)
		for (int i = 0; i < n; i++) {
			array[i] = i + 1;
		}

		return array;
	}

	/**
	 * Muestra los elementos de un array de enteros en una sola línea, separados por espacios.
	 * <p>
	 * Recorre el array elemento por elemento y los imprime en formato secuencial.
	 * </p>
	 *
	 * @param array El array de enteros cuyos elementos se mostrarán.
	 */
	public static void showInlineArray(int[] array) {
		// Recorrer cada elemento del array y mostrarlo seguido de un espacio
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]);

			// Añadir un espacio después de cada número, excepto después del último
			if (i < array.length - 1) {
				System.out.print(" ");
			}
		}
		// Añadir una nueva línea al final para mayor claridad
		System.out.println();
	}

	/**
	 * Punto de entrada del programa que interactúa con el usuario para crear y mostrar un array de números naturales.
	 * <p>
	 * Solicita al usuario que ingrese el número de elementos, crea el array correspondiente,
	 * y muestra sus elementos en formato secuencial.
	 * </p>
	 *
	 * @param args Argumentos de la línea de comandos (no utilizados).
	 */
	public static void main(String[] args) {
		// Solicitar al usuario que ingrese el número de elementos del array
		int n = Utils.integer("Ingrese el número de elementos para el array de números naturales: ");

		// Validar que n sea un número natural (positivo)
		while (n <= 0) {
			System.out.println("Por favor, ingrese un número natural positivo.");
			n = Utils.integer("Ingrese el número de elementos para el array de números naturales: ");
		}

		// Crear e inicializar el array con los primeros N números naturales
		int[] naturalNumbers = createAndInitializeArray(n);

		// Mostrar los elementos del array en formato secuencial
		System.out.print("Elementos del array: ");
		showInlineArray(naturalNumbers);
	}
}
