import java.util.ArrayList;
import java.util.List;

public class Vuelos {

	String aeropuerto_partida;
	String aeropuerto_llegada;
	Pilotos piloto;
	String hora;
	String nro_vuelo;
	String destino;
	Aviones av;
	List<Pasajeros> listapasajeros = new ArrayList<Pasajeros>();

	public Vuelos(String aeropuerto_partida, String aeropuerto_llegada, Pilotos piloto, String hora, String nro_vuelo,
			String destino) {

		this.aeropuerto_partida = aeropuerto_partida;
		this.aeropuerto_llegada = aeropuerto_llegada;
		this.piloto = piloto;
		this.hora = hora;
		this.nro_vuelo = nro_vuelo;
		this.destino = destino;
		AgregarPasajeros();
	}

	public List<Pasajeros> getListapasajeros() {
		return listapasajeros;
	}

	public void setListapasajeros(List<Pasajeros> listapasajeros) {
		this.listapasajeros = listapasajeros;
	}

	public void AgregarPasajeros() {

		Pasajeros p1 = new Pasajeros("Clau", "46678545", 29, "fem");
		Pasajeros p2 = new Pasajeros("Mary", "43673674", 33, "fem");
		Pasajeros p3 = new Pasajeros("Juan", "70008889", 18, "hom");

		listapasajeros.add(p1);
		listapasajeros.add(p2);
		listapasajeros.add(p3);

	}

	public void Imprimir() {

		System.out.println("*----------------------*");
		System.out.println("VUELO NRO: " + nro_vuelo);
		System.out.println("Destino: " + destino);
		System.out.println("Aeropuerto de Salida: " + aeropuerto_partida);
		System.out.println("Aeropuerto de Llegada: " + aeropuerto_llegada);
		System.out.println("Hora: " + hora);
		av = new Aviones();
		av.Imprimir();

		piloto.Imprimir();

		for (Pasajeros p : listapasajeros) {
			p.Imprimir();
		}

	}

	public String getAeropuerto_partida() {
		return aeropuerto_partida;
	}

	public void setAeropuerto_partida(String aeropuerto_partida) {
		this.aeropuerto_partida = aeropuerto_partida;
	}

	public String getAeropuerto_llegada() {
		return aeropuerto_llegada;
	}

	public void setAeropuerto_llegada(String aeropuerto_llegada) {
		this.aeropuerto_llegada = aeropuerto_llegada;
	}

	public Pilotos getPiloto() {
		return piloto;
	}

	public void setPiloto(Pilotos piloto) {
		this.piloto = piloto;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getNro_vuelo() {
		return nro_vuelo;
	}

	public void setNro_vuelo(String nro_vuelo) {
		this.nro_vuelo = nro_vuelo;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

}