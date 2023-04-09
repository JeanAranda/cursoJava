class CicloFactorial {
	public static void main(String[] args) {
		int n = 4; // número para calcular el factorial
		int factorial = 1;
		String multiplicacion = "";
		
		for (int i = n; i > 0; i--) {
			factorial *= i;
			multiplicacion += i + "*";
		}
		multiplicacion = multiplicacion.substring(0, multiplicacion.length() - 1); // eliminar el último asterisco
		
		System.out.println("El ciclo factorial de " + n + "! es " + multiplicacion + " = " + factorial);
	}
}
