class figuras {
	public static void main(String[] args) {
        //Triangulo izquierdo 
        int numero=10;
        System.out.println("\nEsta figura es el triangulo de lado izquierdo\n");
        for (int i=1;i<=numero;i++) {
            for (int j=1;j<=i;j++) {
                System.out.print("*");
            } 
            System.out.println();            
        }
        //Triangulo derecho 
        System.out.println("\nEsta figura es el triangulo de lado derecho\n");
        for (int i = 1; i <= numero; i++) {
            for (int j = 1; j <= numero; j++) {
                if (j <= numero - i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        } 

        // rombo
        int altura = 2;
        int espacios = altura -1;
        int asteriscos = 1;

        // Imprimir triángulo hacia arriba
        System.out.println("\nEsta figura es el rombo\n");
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= asteriscos; j++) {
                System.out.print("*");
            }
            System.out.println();
            espacios--;
            asteriscos += 2;
        }

        // Imprimir triángulo hacia abajo
        espacios = 1;
        asteriscos = altura * 2 - 3;
        for (int i = 1; i < altura; i++) {
            for (int j = 1; j <= espacios; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= asteriscos; j++) {
                System.out.print("*");
            }
            System.out.println();
            espacios++;
            asteriscos -= 2;
        }
    } 
}
    
    