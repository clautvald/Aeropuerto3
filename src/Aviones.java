public class Aviones {

	String aerolinea;
	String modelo;
	int cant_pasajeros;

	public Aviones(String aerolinea, String modelo, int cant_pasajeros) {
		this.aerolinea = aerolinea;
		this.modelo = modelo;
		this.cant_pasajeros = cant_pasajeros;
	}

	public Aviones() {
		aerolinea = "Latam";
		modelo = "Comercial";
		cant_pasajeros = 180;
	}

	public void Imprimir() {
		System.out.println("************************");
		System.out.println("DATOS DEL AVIÓN");
		System.out.println("Aerolínea: " + aerolinea);
		System.out.println("Modelo de avión: " + modelo);
		System.out.println("Cantidad de pasajeros: " + cant_pasajeros);
	}

}
