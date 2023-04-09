class EjemploFor{
	//tabla de multiplicar solo pares
	/*public static void main(String argas[]){
		int tabla = 1;
		for  (int i=0;i<=10;i++){
			if(i%2==0){
				continue;
			}
			System.out.println(tabla+"x"+i+" = "+(tabla*i));
		}
			System.out.println("la tabla"+tabla+"bien");
	}
}*/

	public static void main(String[] args) {
		afuera: for (int j=10; j<=20; j++){
			System.out.println("\n"+"Imprimiendo tabla del "+j);
			adentro: for(int i=0;i<=10;i++){
				if (j%2==1) {
					continue;
				}
				System.out.println(j+"x"+i+"="+(j*i));
			}
		}
	}
}