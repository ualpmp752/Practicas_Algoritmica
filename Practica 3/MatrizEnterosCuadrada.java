



import java.util.Random;



public class MatrizEnterosCuadrada {

	 private int [][] matriz;

	 

	 MatrizEnterosCuadrada(int numeroFilasCol) {

		 //Reservamos memoria para la matriz

		 matriz = new int [numeroFilasCol][numeroFilasCol];

		 

		 Random random = new Random();

		 //Inicializamos la matriz con valores aleatorios

		 for(int i = 0 ; i < numeroFilasCol; i++) {

			 for(int j = 0; j < numeroFilasCol; j++) {

				 matriz[i][j] = random.nextInt(100);		//Generamos un número aleatorio entre 0 y 99

				 

			}	 

		 }

				 

			 

			 }

			 

	MatrizEnterosCuadrada(int [][]m) {

		//Reservamos memoria para la matriz 

		int n = m.length;

		matriz = new int [n][n];

		

		for (int i = 0; i < n; i++) {

			System.arraycopy(m[i], 0, matriz[i], 0, n);

	}

		 }



	

public static void ordenacionSeleccion(int [] array) {

	for (int i = 0; i < array.length-1 ; i++) {

		int minimo = i;

		for (int j = i+1; j < array.length; j++) {

			if (array[j] < array[minimo]) {

				minimo = j;

			}

		}

	//Intercambiamos los valores 

	int	aux = array[i];

	array[i] = array[minimo];

	array[minimo] = aux;

	}

}

	MatrizEnterosCuadrada matrizOrdenadaPorFilas() {

	//Creamos una copia 

	int n = matriz.length;

	int [][] nuevaMatriz = new int [n][n];

	

	//Copiamos la matriz en nuevaMatriz 

	for (int i = 0; i < n; i++) {

		System.arraycopy(matriz[i], 0, nuevaMatriz[i], 0, n);

		//Ordenamos la fila i 

		ordenacionSeleccion(nuevaMatriz[i]);

	}

	

	return new MatrizEnterosCuadrada(nuevaMatriz);

}



	public String toString() {

		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < matriz.length; i++) {

			for(int j = 0; j < matriz[i].length; j++) {

				sb.append(matriz[i][j]).append("\t");

			}

			sb.append("\n");

		}

		return sb.toString();

	}

	

}

	 