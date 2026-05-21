


public class TiemposMatrizEnterosCuadrada {



	public static void main(String[] args) {



		final int MAX_ITERATIONS = 10;



		// Evaluamos el codigo para diferentes valores de n

		for (int n = 32; n <= 4096; n = n * 2) {

			// Reservamos memoria para un array con los tiempos

			long[] tiempos = new long[MAX_ITERATIONS];



			// Ejecutgamos el experimentos MAX_ITERATIONS veces

			for (int i = 0; i < MAX_ITERATIONS; i++) {

				MatrizEnterosCuadrada m = new MatrizEnterosCuadrada(n);



				long tiempoInicial = System.nanoTime();

				MatrizEnterosCuadrada ordenada = m.matrizOrdenadaPorFilas();

				long tiempoFinal = System.nanoTime();




				// Guardamos el tiempo en el array

				tiempos[i] = tiempoFinal - tiempoInicial;

				System.out.println(tiempos[i]);

			}



			// Eliminamos el tiempo máximo y hacemos la media

			long maximo = tiempos[0];

			long suma = tiempos[0];

			for (int i = 1; i < MAX_ITERATIONS; i++) {

				if (tiempos[i] > maximo) {

					maximo = tiempos[i];

				}

				suma = suma + tiempos[i];

			}



			// Restamos el maximo a la suma de tiempos

			suma = suma - maximo;



			// Calculamos la media de los tiempos

			double media = (double) suma / (MAX_ITERATIONS - 1);



			System.out.printf("%d %.4f\n", n, media);

		}



	}

}