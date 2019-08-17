
public class Personas {

	String nombre;
	String dni;
	int edad;

	public Personas(String nombre, String dni, int edad) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
	}

	public Personas() {

	}

	public void Imprimir() {

		System.out.println("DATOS DE LA PERSONA: ");
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		System.out.println("Edad: " + edad);
	}

}
