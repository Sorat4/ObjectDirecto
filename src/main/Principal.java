package main;

import java.util.Scanner;

import dominio.Marcas;
import dominio.Modelos;
import implementacion.Implementacion;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombremar, clave, fabricante, region;// key hashmap

		String nombremod, colormod;// key hashmasp
		float preciomod;
		int existenciamod;

		Marcas marcas;
		Modelos modelos;

		Scanner scanner;

		int menu, menumarcas, menumodelos;

		Implementacion implementacion = new Implementacion();

		do {
			System.out.println(" -- Menu Principal -- ");
			System.out.println("1- Catalo de marcas");
			System.out.println("2- Catalogo de modelos");
			System.out.println("3- Salir");
			scanner = new Scanner(System.in);
			menu = scanner.nextInt();

			switch (menu) {
			case 1:// crud marcas

				do {
					System.out.println("1- Añadir");
					System.out.println("2- Listar");
					System.out.println("3- Buscar");
					System.out.println("4- Editar");
					System.out.println("5- Eliminar");
					System.out.println("6- Regresar");
					scanner = new Scanner(System.in);
					menumarcas = scanner.nextInt();

					switch (menumarcas) {
					case 1:// create
						System.out.println("\n Ingresa la marca: ");
						scanner = new Scanner(System.in);
						nombremar = scanner.nextLine();
						System.out.println("\n Ingresa la clave: ");
						scanner = new Scanner(System.in);
						clave = scanner.nextLine();
						System.out.println("\n Ingresa el frabicante: ");
						scanner = new Scanner(System.in);
						fabricante = scanner.nextLine();
						System.out.println("\n Ingresa la región: ");
						scanner = new Scanner(System.in);
						region = scanner.nextLine();

						marcas = new Marcas(nombremar, clave, fabricante, region);
						implementacion.guardar(marcas, "marca");
						System.out.println("Marca registrada");
						break;

					case 2:// list
						implementacion.listarMarcas();
						break;

					case 3:// search
						System.out.println("Ingresa la marca a buscar");
						scanner = new Scanner(System.in);
						nombremar = scanner.nextLine();
						marcas = new Marcas(nombremar);
						marcas = (Marcas) implementacion.buscar(marcas, nombremar);
						break;

					case 4:// update
						System.out.println("Ingresa la marca a editar");
						scanner = new Scanner(System.in);
						nombremar = scanner.nextLine();

						int submenmar = 0;
						marcas = new Marcas(nombremar);
						marcas = (Marcas) implementacion.buscar(marcas, nombremar);
						System.out.println("Se encontró " + marcas);

						do {
							System.out.println(" -- Submenu de edicion -- ");
							System.out.println("1- Clave");
							System.out.println("2- Región");
							System.out.println("3- Regresar");
							scanner = new Scanner(System.in);
							submenmar = scanner.nextInt();

							switch (submenmar) {
							case 1:// editar clave
								System.out.println("Ingresa la nueva clave");
								scanner = new Scanner(System.in);
								clave = scanner.nextLine();
								marcas.setClave(clave);
								implementacion.editar(marcas, "marca");
								System.out.println("Clave editada");
								break;
							case 2:// editar region
								System.out.println("Ingresa la nueva región");
								scanner = new Scanner(System.in);
								region = scanner.nextLine();
								marcas.setRegion(region);
								implementacion.editar(marcas, "marca");
								System.out.println("Región editada");
								break;
							case 3:// salir
								break;
							}
						} while (submenmar < 3);
						break;

					case 5:// delete
						System.out.println("Ingresa la marca a eliminar");
						scanner = new Scanner(System.in);
						nombremar = scanner.nextLine();
						marcas= new Marcas(nombremar);
						implementacion.eliminar(marcas, "marca");
						System.out.println("Marca eliminada con exito");
						break;

					case 6:
						
						break;
					}

				} while (menumarcas < 6);

				break;

			case 2:// crud modelos

				do {
					System.out.println("1- Añadir");
					System.out.println("2- Listar");
					System.out.println("3- Buscar");
					System.out.println("4- Editar");
					System.out.println("5- Eliminar");
					System.out.println("6- Regresar");
					scanner = new Scanner(System.in);
					menumodelos = scanner.nextInt();
					
					switch (menumodelos) {
					case 1:// create
						System.out.println("\n Ingresa el modelo: ");
						scanner = new Scanner(System.in);
						nombremod = scanner.nextLine();
						System.out.println("\n Ingresa el precio: ");
						scanner = new Scanner(System.in);
						preciomod = scanner.nextFloat();
						System.out.println("\n Ingresa el color: ");
						scanner = new Scanner(System.in);
						colormod = scanner.nextLine();
						System.out.println("\n Ingresa las existencias: ");
						scanner = new Scanner(System.in);
						existenciamod = scanner.nextInt();
						
						System.out.println("\nSelecciona a que marca pertence el modelo:");
						implementacion.listarMarcas();
						scanner = new Scanner(System.in);
						nombremar = scanner.nextLine();
						
						//buscar la marca seleccionada
						marcas= new Marcas(nombremar);
						marcas= (Marcas) implementacion.buscar(marcas, "marca");
						modelos= new Modelos(nombremod, preciomod, colormod, existenciamod, marcas);
						implementacion.guardar(modelos, "modelo");
						System.out.println("Modelo registrado");
						break;

					case 2:// list
						implementacion.listarModelos();
						break;

					case 3:// search
						System.out.println("Ingresa el modelo a buscar");
						scanner = new Scanner(System.in);
						nombremod = scanner.nextLine();
						modelos = new Modelos(nombremod);
						modelos = (Modelos) implementacion.buscar(modelos,nombremod);
						System.out.println("Registro encontrado: \n" + modelos);
						break;

					case 4:// update
						System.out.println("Ingresa el modelo a editar");
						scanner = new Scanner(System.in);
						nombremod = scanner.nextLine();

						modelos = new Modelos(nombremod);
						modelos = (Modelos) implementacion.buscar(modelos, "modelo");
						System.out.println("Se encontró: " + modelos.getNombre());
						
						System.out.println("Editar color... \nIngresa el nuevo color");
						scanner=new Scanner(System.in);
						colormod= scanner.nextLine();
						
						modelos.setColor(colormod);
						implementacion.editar(modelos, "modelo");
						System.out.println("Color actualizado");
						break;

					case 5:// delete
						System.out.println("Ingresa el modelo a eliminar");
						scanner = new Scanner(System.in);
						nombremod = scanner.nextLine();
						modelos= new Modelos(nombremod);
						implementacion.eliminar(modelos, "modelo");
						System.out.println("Modelo eliminado con exito");
						break;

					case 6:
						
						break;
					}
					
				} while (menumodelos < 6);

				break;

			case 3:// salir
				break;

			}
		} while (menu < 3);
	}
}
