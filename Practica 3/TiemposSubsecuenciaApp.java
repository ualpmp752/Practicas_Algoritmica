

public class TiemposSubsecuenciaApp {
	public static void main(String[] args) {
		int[] tamanos = {64, 128, 256, 512, 1024, 2048, 4096, 8192 };

		System.out.println("n\tFuerzaBruta\tMejorado\tLineal");

		for (int n : tamanos) {
			Subsecuencia sub = new Subsecuencia(n);
			int[] copia = new int[n];
			for (int i = 0; i < n; i++) {
				copia[i] = sub.array[i];
			}

			long tiempoFuerzaBruta = 0;
			long tiempoMejorado = 0;
			long tiempoLineal = 0;

			for (int vez = 0; vez < 10; vez++) {
				Subsecuencia sFuerzaBruta = new Subsecuencia(copia);
				long inicio = System.nanoTime();
				sFuerzaBruta.SubsecuenciaFuerzaBruta();
				long fin = System.nanoTime();
				tiempoFuerzaBruta += (fin - inicio);

				Subsecuencia sMejorado = new Subsecuencia(copia);
				inicio = System.nanoTime();
				sMejorado.SubsecuenciaMejorado();
				fin = System.nanoTime();
				tiempoMejorado += (fin - inicio);

				Subsecuencia sLineal = new Subsecuencia(copia);
				inicio = System.nanoTime();
				sLineal.SubsecuenciaLineal();
				fin = System.nanoTime();
				tiempoLineal += (fin - inicio);
			}

			long mediaFuerzaBruta = tiempoFuerzaBruta / 10;
			long mediaMejorado = tiempoMejorado / 10;
			long mediaLineal = tiempoLineal / 10;

			System.out.println(n + "\t" + mediaFuerzaBruta + "\t\t" + mediaMejorado + "\t\t" + mediaLineal);
		}
	}
}
