class Facortial{
	public static void main(String[] args) {
		int numero = 4;
		int factorial = 1;
		String multiplicar = "";

		for (int i=numero;i>0;i--) {
			factorial*=i;
			multiplicar += i+"x"; 
		}
		multiplicar = multiplicar.substring(0, multiplicar.length() -1);

		System.out.println("El factorial de "+numero+"! es "+ multiplicar+" = "+factorial);
	}
}