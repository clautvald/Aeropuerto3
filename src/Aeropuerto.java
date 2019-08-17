import java.util.ArrayList;
import java.util.List;

public class Aeropuerto {

	String nombre;
	String ciudad;
	List<Vuelos> listavuelos = new ArrayList<Vuelos>();

	public Aeropuerto(String nombre, String ciudad) {
		this.nombre = nombre;
		this.ciudad = ciudad;
	}

	public Aeropuerto() {
		nombre = "Internacional Jorge Chavez";
		ciudad = "Lima";
		AgregarVuelos();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public void AgregarVuelos() {
		Pilotos piloto1 = new Pilotos();

		Vuelos nacional1 = new Vuelos("AQP", "LIM", piloto1, "18:45", "LA457", "Lima");
		Vuelos nacional2 = new Vuelos("LIM", "CUZ", piloto1, "07:05", "LA378", "Cusco");
		Vuelos internacional1 = new Vuelos("LIM", "BOG", piloto1, "20:00", "FE407", "Bogota");
		Vuelos internacional2 = new Vuelos("LIM", "SANT", piloto1, "10:30", "ERA017", "Santiago de Chile");

		Pasajeros nuevo = new Pasajeros("Antonio", "29748565", 35, "hom");
		internacional2.getListapasajeros().add(nuevo);

		List<Pasajeros> nuevalista = new ArrayList<Pasajeros>();
		nuevalista.add(new Pasajeros("Duber", "70008889", 32, "hom"));
		nuevalista.add(new Pasajeros("Paola", "43878189", 27, "fem"));
		nuevalista.add(new Pasajeros("Jesus", "294781569", 45, "hom"));

		nacional1.setListapasajeros(nuevalista);

		listavuelos.add(nacional1);
		listavuelos.add(nacional2);
		listavuelos.add(internacional1);
		listavuelos.add(internacional2);
	}

	public void Imprimir() {
		System.out.println("***********************************************************************");
		System.out.println("BIENVENIDO AL AEROPUERTO " + nombre + " - Ciudad de " + ciudad);
		System.out.println("***********************************************************************");
		System.out.println("VUELOS DISPONIBLES");
		for (Vuelos v : listavuelos) {
			v.Imprimir();

		}

	}

}