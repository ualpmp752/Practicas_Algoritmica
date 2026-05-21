package practica2;

public class Legendre {

	    public static double legendre(int n, double x) {
	        if (n == 0) {
	            return 1.0;
	        } else if (n == 1) {
	            return x;
	        } else {
	            double term1 = ((2.0 * n - 1.0) / n) * x * legendre(n - 1, x);
	            double term2 = ((n - 1.0) / n) * legendre(n - 2, x);
	            
	            return term1 - term2;
	        }
	    }

	    public static void main(String[] args) {
	        int n = 2;     
	        double x = 2;
	        
	        System.out.println("P" + n + "(" + x + ") = " + legendre(n, x));
	    }
	}
