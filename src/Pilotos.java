
public class Pilotos extends Personas {

	// TODO Auto-generated constructor stub

	String empresa;

	public Pilotos(String nombre, String dni, int edad, String empresa) {
		super(nombre, dni, edad);
		this.empresa = empresa;
	}

	public Pilotos() {
		nombre = "Jose";
		dni = "70008889";
		edad = 35;
		empresa = "Latam";
	}

	public void Imprimir() {
		System.out.println();
		System.out.println("DATOS DEL PILOTO: ");
		System.out.println("Nombre: " + nombre);
		System.out.println("DNI: " + dni);
		System.out.println("Edad: " + edad);
		System.out.println("Empresa: " + empresa);
	}
}