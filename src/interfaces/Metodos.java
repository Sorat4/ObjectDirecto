package interfaces;

public interface Metodos {
	public void guardar(Object object, String nomClase);

	public void listarMarcas();

	public void listarModelos();
	
	public Object buscar(Object object, String nomClase);
	
	public void editar(Object object, String nomClase);
	
	public void eliminar(Object object, String nomClase);
}
