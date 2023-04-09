class TablaMultiplicar {
    public static void main(String args[]) {
        // Tabla de multiplicar del 1 al 20
        // Solo los pares
        for (int j = 0; j <= 20; j++) {
            if (j % 2 == 0) {
                System.out.println("\n" + "Imprimir tabla del " + j);
                for (int i = 0; i <= 20; i++) {
                    if (i % 2 == 0) {
                        System.out.println(j + "x" + i + "=" + (j * i));
                    }
                }
            }
        }
    }
}
