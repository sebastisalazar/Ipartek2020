package prueba;

/**
 * Creacion clase coche
 * 
 * @author Curso
 *
 */
public class Coche {

	// Encapsulacion de variables
	private String matricula;
	private String marca;
	private String modelo;
	private String color;
	private float potencia;
	private float cilindrada;

	// CONSTRUCTOR
	public Coche() {
		super();
		this.matricula = "";
		this.marca = "";
		this.modelo = "";
		this.color = "";
		this.potencia = 0;
		this.cilindrada = 0;
	}

	// GETTERS AND SETTERS
	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getPotencia() {
		return potencia;
	}

	public void setPotencia(float potencia) {
		this.potencia = potencia;
	}

	public float getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(float cilindrada) {
		this.cilindrada = cilindrada;
	}

	// TOSTRING
	@Override
	public String toString() {
		return "matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", potencia="
				+ potencia + ", cilindrada=" + cilindrada;
	}

}
