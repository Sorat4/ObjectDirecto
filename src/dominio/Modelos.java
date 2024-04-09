package dominio;

public class Modelos {
	private String nomModelo;//key hashmasp
	private float precio;
	private String color;
	private int existencia;
	Marcas marcas;
	
	public Modelos() {
	}

	public Modelos(String nombre) {
		super();
		this.nomModelo = nombre;
	}

	public Modelos(String nombre, float precio, String color, int existencia, dominio.Marcas Marcas) {
		super();
		this.nomModelo = nombre;
		this.precio = precio;
		this.color = color;
		this.existencia = existencia;
		this.marcas = Marcas;
	}

	@Override
	public String toString() {
		return "modelos [nombre=" + nomModelo + ", precio=" + precio + ", color=" + color + ", existencia=" + existencia
				+ ", marcas=" + marcas + "]\n";
	}

	public String getNombre() {
		return nomModelo;
	}

	public void setNombre(String nombre) {
		this.nomModelo = nombre;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getExistencia() {
		return existencia;
	}

	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}

	public Marcas getMarcas() {
		return marcas;
	}

	public void setMarcas(Marcas Marcas) {
		this.marcas = Marcas;
	}
	
	
}
