package QuispePradoCamilaMetodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.stream.Stream;

public class QuispePradoCamilaMetodos {
	
	public static void main (String[]args) throws IOException{
		boolean salir=false;
			do {
				try {
				mostrarMenuPrincipal();
			

			} catch (NumberFormatException e) {
				System.out.println("Entrada invalida. Introduce un numero.");
			}catch(InputMismatchException e){
				System.out.println("Elige una opción: Seleccione una opción:");
			}
			}while(!salir);
	}

	
	
	public static int leerInt(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
	
	}
	public static String leerString(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		String palabra =leer.readLine();
		return palabra;
	
	}
	
	public static void mostrarMenuPrincipal() throws NumberFormatException, IOException {
		boolean salir= false;
		do {
			// MOSTRAR MENU
			System.out.println("\n--- BIBLIOTECA Calasanz Games ---");

			System.out.println("1. Gestión de Usuarios");
			System.out.println("2. Catálogo de Juegos");
			System.out.println("3. Sistemas de Valoraciones");
			System.out.println("4. Estadisticas y Reportes");
			System.out.println("5. Calculadora de Descuentos");
			System.out.println("6. Salir");
			int opcion = leerInt("Elige una opción: ");
		
			
			switch (opcion) {
			case 1:
			mostrarMenuGestion1();

				break;
			case 2:
				System.out.println("2. Catálogo de Juegos");

				break;
			case 3:
				System.out.println("3. Sistemas de Valoraciones");

				break;
			case 4:
				System.out.println("4. Estadisticas y Reportes");

				break;
			case 5:
				System.out.println("5. Calculadora de Descuentos");

				break;
			case 6:
				salir = true;
				System.out.println("¡Hasta luego!");
				break;
			default:
				System.out.println("Opción no válida");
			}
		} while (!salir);

	}
	public static void mostrarMenuGestion1() throws NumberFormatException, IOException {
		boolean menuprincipal= false;

		do {
			try {
		
			System.out.println("--- GESTIÓN DE USUARIOS ---");
			System.out.println("1. Crear nuevo usuario");
			System.out.println("2. Calcular la edad del usuario nuevo");
			System.out.println("3.Volver al menu principal");
			int opcion = leerInt("Elige una opción: ");
		
			switch (opcion) {
			case 1:
				System.out.println("1. Crear nuevo usuario");
				String nombre = leerString("Introduce tu nombre:");
				int añoNacimiento = leerInt("Introduce tu año de nacimiento:");
				String plataformaFav = leerString("Plataforma favorita (PC, PlayStation, Xbox, Nintendo): ");
				String suscripcion = leerString("¿Tiene suscripción premium? (S/N):");
				
				int edad = calcularEdad(añoNacimiento);
			    String idUsuario = generarID(nombre, añoNacimiento);
			 
			    
			    System.out.println("ID Usuario: " + idUsuario);
			    System.out.println("Edad: " + edad + " años");
			    System.out.println("Tipo de usuario: "+tipoUsuario(edad));
			    System.out.println("Plataforma favorita: " + plataformaFav);
			    System.out.println("Premium: " + premium(suscripcion));

				break;
			case 2:
				System.out.println("2. Calcular la edad del usuario nuevo");

				break;
			case 3:
				mostrarMenuPrincipal();
				menuprincipal=true;
				break;
			default:
				System.out.println("Opción no válida");
			
		}
		

		} catch (NumberFormatException e) {
				System.out.println("Entrada invalida. Introduce un numero.");
		}
		}while (!menuprincipal);
		

	}
	public static int calcularEdad(int añoNacimiento ) throws NumberFormatException, IOException  {
	 int añoActual=2025;
		return añoActual-añoNacimiento;
	}
	public static String generarID(String nombre, int añoNacimiento) {
		String primeras3 = nombre.trim().toUpperCase();
		if(primeras3.length()>=3) {
			primeras3= primeras3.substring(0, 3);
		}else {
			while(primeras3.length()<3){
				primeras3+="x";	
			}
		}
		String idUsuario=primeras3+"GAME"+añoNacimiento;
		return idUsuario;
	}
	public static String tipoUsuario(int edad) {
		if(edad>=17) {
			return "Junior Gamer";
		}if(edad<=18 && edad>=30) {
			return "Pro Gamer";
		}else {
			return "Master Gamer";
			
		}	
	}
	public static String pedirPlataforma(String plataformaFav) {
		boolean valida= false;
		do(valida){
			try {
				if(plataformaFav.equalsIgnoreCase("PC") ||
		                 plataformaFav.equalsIgnoreCase("PlayStation") ||
		                 plataformaFav.equalsIgnoreCase("Play STATION") || // por si alguien escribe con espacio
		                 plataforma.equalsIgnoreCase("Playstation") ||
		                 plataforma.equalsIgnoreCase("XBOX") ||
		                 plataforma.equalsIgnoreCase("Nintendo")) 
			}catch(Exeception e) {
				 System.out.println("Error al leer la plataforma. Intenta de nuevo.");
			}
		}
	}
	public static String premium(String suscripcion) {
		
		if(suscripcion.equals('S') || suscripcion.equals('N')){
			return "Si";
		}else {
			return "No";
		}while(!valida)
	}
}
