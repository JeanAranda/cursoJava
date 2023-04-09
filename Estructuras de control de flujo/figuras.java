class figuras{
	public static void main(String[] args) {
		int altura = 10; // altura del triángulo
for (int i = 1; i <= altura; i++) { // iterar sobre las filas
    for (int j = 1; j <= i; j++) { // iterar sobre las columnas
        System.out.print("* ");
    }
    System.out.println(); // saltar a la siguiente línea después de imprimir una fila completa
}


	}
}