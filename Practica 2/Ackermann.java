package practica2;

public class Ackermann {


	    public static long ackermann(long m, long n) {
	        if (m == 0) {
	            return n + 1;
	        } else if (m > 0 && n == 0) {
	            return ackermann(m - 1, 1);
	        } else {
	            return ackermann(m - 1, ackermann(m, n - 1));
	        }
	    }

	    public static void main(String[] args) {
	        long m = 3;
	        long n = 3;
	        System.out.println("Ackermann(" + m + ", " + n + ") = " + ackermann(m, n));
	    }
	}
