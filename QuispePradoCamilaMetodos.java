package QuispePradoCamilaMetodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuispePradoCamilaMetodos {
	
	public static void main (String [] arges) throws NumberFormatException, IOException {
		boolean salir= false;
			try {
				
				System.out.println("=== CALASANZ GAMES ===");
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
					
						break;
					case 2:
					
						break;
					case 3:
					
						break;
					case 4:
					
						break;
					case 5:
					
						break;
					case 6:
						salir = true;
						System.out.println("¡Hasta luego!");
						break;
					default:
						System.out.println("Opción no válida");
					}
				} while (!salir);

			} catch (NumberFormatException | IOException e) {
				System.out.println("Entrada invalida. Introduce un numero.");
			} catch (ArithmeticException e) {
				System.out.println("Opción no valida");
			}
			int opcion = leerInt("Elige una opción: Seleccione una opción:");
	}

	
	
	public static int leerInt(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		int num = Integer.parseInt(leer.readLine());
		return num;
	
	}
	
}
