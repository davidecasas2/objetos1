package objetos;

public class Coche {

	// variables miembro o variables de instancia
	private String modelo;
	private String marca;
	private int potencia;
	private int velocidad;
	private int velocidadMax;
	public int otra;
	public Coche() {
		velocidad=0;
	}
	
	
	
	public Coche(String modelo, String marca) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.velocidad=0;
	}
	
	

	public Coche(String modelo, String marca, int potencia, int velocidadMax) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.potencia = potencia;
		this.velocidadMax = velocidadMax;
		velocidad=0;
	}



	// comportamiento o los métodos
	public void acelerar() {
		if (velocidad+10<=velocidadMax) {
			velocidad=velocidad+10;
		}
	}
	
	public void frenar() {
		velocidad=velocidad-15;
		if(velocidad<0) {
			velocidad=0;
		}
	}
	
	public int getVelocidad() {
		return velocidad;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public int getVelocidadMax() {
		return velocidadMax;
	}

	public void setVelocidadMax(int velocidadMax) {
		this.velocidadMax = velocidadMax;
	}
	
	
	
}
