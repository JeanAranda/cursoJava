public class Cuadrado {
    public static void main(String[] args) {
        int size = 10; // Tamaño del cuadrado

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    // Imprimir un asterisco en los bordes del cuadrado
                    System.out.print("* ");
                } else {
                    // Imprimir un espacio en el centro del cuadrado
                    System.out.print("  ");
                }
            }
            // Saltar a la siguiente línea después de imprimir cada fila
            System.out.println();
        }
    }
}
