class EjemploIf{
	public static void main(String[] args) {
		System.out.println("Prube buena");
		int edad=18;
		boolean esMayorDeEdad=edad>=18;
		if (esMayorDeEdad) {
			System.out.println("Puede ingresar al lugar");
		}else if (edad<=15){
			System.out.println("No puedes ingresar, por chivolo pulpin gonorreay te haran buuling");
		}else{
			System.out.println("No ingresas saca la cola");
		}
	}
}
