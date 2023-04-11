class Persona {
	//Atributos
	String nombre;
	int edad;
	char genero;

	//Metodos
	void imprimirInformacion(){
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Genero: "+genero);
	}

	public static void main(String[] args) {
		Persona p = new Persona();
		p.nombre="Jean";
		p.edad=31;
		p.genero='M';
		p.imprimirInformacion();

		Persona p1=new Persona();
		p1.nombre="Juan";
		p1.edad=61;
		p1.genero='F';
		p1.imprimirInformacion();
	}
}
