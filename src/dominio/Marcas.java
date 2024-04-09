package dominio;

public class Marcas {
	private String marca;//key hashmap
	private String clave;
	private String fabricante;
	private String region;
	
	public Marcas() {
	}

	public Marcas(String marca, String clave, String fabricante, String region) {
		super();
		this.marca = marca;
		this.clave = clave;
		this.fabricante = fabricante;
		this.region = region;
	}

	@Override
	public String toString() {
		return "marcas [marca=" + marca + ", clave=" + clave + ", fabricante=" + fabricante + ", region=" + region + "]\n";
	}

	public Marcas(String marca) {
		super();
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
	
	
	
}
