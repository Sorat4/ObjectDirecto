package implementacion;

import java.util.HashMap;

import dominio.Marcas;
import dominio.Modelos;
import interfaces.Metodos;

public class Implementacion implements Metodos {

	HashMap<String, Marcas> hashMarcas = new HashMap<String, Marcas>();
	HashMap<String, Modelos> hashModelos = new HashMap<String, Modelos>();

	Marcas marcas = null;
	Modelos modelos = null;
	Object objEncontrado = null;

	@Override
	public void guardar(Object object, String nomClase) {
		// TODO Auto-generated method stub
		if (nomClase.equals("marca")) {
			marcas = (Marcas) object;
			hashMarcas.put(marcas.getMarca(), marcas);
			System.out.println("Registro almacenado");
		} else if (nomClase.equals("modelo")) {
			modelos = (Modelos) object;
			hashModelos.put(modelos.getNombre(), modelos);
			System.out.println("Registro almacenado");
		}
	}

	@Override
	public void listarMarcas() {
		// TODO Auto-generated method stub
		System.out.println(hashMarcas);
	}

	@Override
	public void listarModelos() {
		// TODO Auto-generated method stub
		System.out.println(hashModelos);
	}

	@Override
	public Object buscar(Object object, String nomClase) {
		// TODO Auto-generated method stub
		if (nomClase.equals("marca")) {
			marcas = (Marcas) object;
			objEncontrado = hashMarcas.get(marcas.getMarca());
		} else if (nomClase.equals("modelo")) {
			modelos = (Modelos) object;
			objEncontrado = hashModelos.get(modelos.getNombre());
		}
		return objEncontrado;
	}

	@Override
	public void editar(Object object, String nomClase) {
		// TODO Auto-generated method stub
		if (nomClase.equals("marca")) {
			marcas = (Marcas) object;
			hashMarcas.put(marcas.getMarca(), marcas);
		} else if (nomClase.equals("modelo")) {
			modelos = (Modelos) object;
			hashModelos.put(modelos.getNombre(), modelos);
		}
	}

	@Override
	public void eliminar(Object object, String nomClase) {
		// TODO Auto-generated method stub
		if (nomClase.equals("marca")) {
			marcas=(Marcas) object;
			hashMarcas.remove(marcas.getMarca());
		}else if (nomClase.equals("modelo")) {
			modelos=(Modelos) object;
			hashModelos.remove(modelos.getNombre());
		}
	}

}
