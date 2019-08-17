
public class Pasajeros extends Personas {

	String sexo;

	public Pasajeros(String nombre, String dni, int edad, String sexo) {
		super(nombre, dni, edad);
		this.sexo = sexo;
	}

	public void Imprimir() {
		System.out.println("************************");
		System.out.println("DATOS DEL PASAJERO");
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		System.out.println("Edad: " + edad);
		System.out.println("Sexo: " + sexo);
		System.out.println("************************");

	}

}