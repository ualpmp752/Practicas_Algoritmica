package practica2;

public class MCD {

	public static long mcd(int m, int n) {
		if(n <= m && m % n == 0) {
			return n;
		}else if (m < n) {
			return mcd(n ,m);
		}else {
			return mcd(n, m % n);
		}
	}
	
	public static void main(String[] args) {
		int m = 48;
		int n = 18;
		System.out.println("El MCD de " + m + " y " + n + " es: " + mcd(m, n));
	}
}
