package practica2;

public class Factorial {

	public static long factorial(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("El número debe ser no negativo");
		}
		if (n == 0) {
			return 1;
		}else {
			return n * factorial(n - 1);
		}
	}
	
	public static void main(String[] args) {
		System.out.println(factorial(7));

	}

}
