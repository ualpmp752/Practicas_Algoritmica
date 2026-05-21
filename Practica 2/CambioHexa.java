package practica2;

public class CambioHexa {
	
	public static StringBuilder cambioHexa(int n) {
		StringBuilder resultado = new StringBuilder();
		int cociente = n;
		int resto;
		
		while(cociente > 0) {
			resto = cociente % 16;
			cociente = cociente / 16;
			
			if(resto < 10) {
				resultado.append(resto);
			}else {
				resultado.append((char)(resto - 10 + 'A'));
			}
		}
		
		return resultado.reverse();
	}

	public static void main(String[] args) {
		int numero = 65029;
		System.out.println("El número " + numero + " en hexadecimal es: " + cambioHexa(numero));

	}

}
