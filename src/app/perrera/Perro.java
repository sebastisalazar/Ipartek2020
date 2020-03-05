package app.perrera;

public class Perro {

	int id;
	String nombre;
	String raza;

	// Constructor
	public Perro() {
		super();
		// un peroo inicialmente
		// id 0
		// nombre ""
		// raza "cruce"

		id = 0;
		nombre = "";
		raza = "Cruce";
	}

	public Perro(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Perro(String nombre, int id) {
		super();
		this.nombre = nombre;
		this.id = id;
		raza = "Cruce";
	}

	public Perro(String nombre, int id, String raza) {
		super();
		this.nombre = nombre;
		this.id = id;
		this.raza = raza;
	}

	// GETERS seTTERS

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "ID: " + id + ", Nombre: " + nombre + ", Raza: " + raza;
	}

}
