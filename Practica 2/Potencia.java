package practica2;

public class Potencia {

	public static long potencia(int x, int n) {
		if (n < 0) {
			throw new IllegalArgumentException("El exponente debe ser no negativo");
		}
		if (n == 0) {
			return 1;
		}else {
			return x * potencia(x, n - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(potencia(2, 8));

	}

}
