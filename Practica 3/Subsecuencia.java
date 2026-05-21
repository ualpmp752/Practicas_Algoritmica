
import java.util.Random;

public class Subsecuencia {
	int[] array;
	int primer;
	int ultimo;
	int suma;

	public Subsecuencia(int numeroElementos) {
		array = new int[numeroElementos];
		for (int i = 0; i < numeroElementos; i++) {
			array[i] = (int)((Math.random() * 199 )- 99);
		}
	}

	public Subsecuencia(int[] arrayEnteros) {
		array = new int[arrayEnteros.length];
		for (int i = 0; i < arrayEnteros.length; i++) {
			array[i] = arrayEnteros[i];
		}
	}

	public int getPrimer() {
		return primer;
	}

	public int getUltimo() {
		return ultimo;
	}

	public int getSuma() {
		return suma;
	}

	public void SubsecuenciaFuerzaBruta() {
		int maxSum = 0;
		primer = 0;
		ultimo = -1;
		suma = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = i; j < array.length; j++) {
				int thisSum = 0;
				for (int k = i; k <= j; k++) {
					thisSum += array[k];
				}
				if (thisSum > maxSum) {
					maxSum = thisSum;
					primer = i;
					ultimo = j;
				}
			}
		}
		suma = maxSum;
	}

	public void SubsecuenciaMejorado() {
		int maxSum = 0;
		primer = 0;
		ultimo = -1;
		suma = 0;
		for (int i = 0; i < array.length; i++) {
			int thisSum = 0;
			for (int j = i; j < array.length; j++) {
				thisSum += array[j];
				if (thisSum > maxSum) {
					maxSum = thisSum;
					primer = i;
					ultimo = j;
				}
			}
		}
		suma = maxSum;
	}

	public void SubsecuenciaLineal() {
		int maxSum = 0;
		int thisSum = 0;
		int tempPrimer = 0;
		primer = 0;
		ultimo = -1;
		suma = 0;
		for (int j = 0; j < array.length; j++) {
			thisSum += array[j];
			if (thisSum > maxSum) {
				maxSum = thisSum;
				primer = tempPrimer;
				ultimo = j;
			}
			if (thisSum < 0) {
				thisSum = 0;
				tempPrimer = j + 1;
			}
		}
		suma = maxSum;
	}
}
