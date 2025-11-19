package QuispePradoCamilaMetodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ejempo {
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
	public static double leerDouble(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		Double num = Double.parseDouble(leer.readLine());
		return num;
	
	}
}

	
	if (edad>=15 && edad <=18) {
		System.out.println("¿Los padres han autorizado la salida? (S/N): ");
		char autorizacion= leer.readLine().charAt(0);
		if(autorizacion=='S' || autorizacion=='N') {
			puedesalir=true;
			}
	} else if (edad>=18){
			puedesalir=true;
			
	}
	 if (premium.equals("S") || premium.equals("N")) {
	        return premium;
	    } else {
	        System.out.println("Entrada inválida. Debe ser S o N.");
	        return pedirPremium(); // vuelve a pedir (recursivo pero válido)
	    }
	 }
	 public static void opcionAñadirJuegos() throws IOException {

		    int cantidad = leerInt("¿Cuántos juegos quieres añadir?: ");
		    
		    double totalPrecio = 0;
		    int totalJuegos = 0;

		    for (int i = 1; i <= cantidad; i++) {

		        String nombre = leerString("Nombre del juego: ");

		        double tamaño = 0;
		        boolean tamañoValido = false;

		        while (!tamañoValido) {
		            try {
		                tamaño = Double.parseDoubleleerString("Tamaño en GB de " + nombre + ": "));
		                tamañoValido = true;
		            } catch (NumberFormatException e) {
		                System.out.println("Entrada inválida. Introduce un número.");
		            }
		        }

		        double precio = 0;
		        boolean precioValido = false;

		        while (!precioValido) {
		            try {
		                precio = Double.parseDouble(leerString("Precio de " + nombre + ": "));
		                precioValido = true;
		            } catch (NumberFormatException e) {
		                System.out.println("Entrada inválida. Introduce un número.");
		            }
		        }

		        totalJuegos++;
		        totalPrecio += precio;

		    }

		    System.out.println("Total de juegos: " + totalJuegos);
		    System.out.println("Total gastado: " + totalPrecio + "€");
		}
	 }

	// Pide y valida la plataforma favorita (con try-catch y bucle)
	 public static String pedirPlataforma() {
	     String plataforma = "";
	     boolean valida = false;
	     Scanner scLocal = sc; // usa el Scanner global si lo tienes

	     while (!valida) {
	         try {
	             System.out.print("Plataforma favorita (PC, PlayStation, Xbox, Nintendo): ");
	             plataforma = scLocal.nextLine().trim();

	             if (plataforma.equalsIgnoreCase("PC") ||
	                 plataforma.equalsIgnoreCase("PlayStation") ||
	                 plataforma.equalsIgnoreCase("Play STATION") || // por si alguien escribe con espacio
	                 plataforma.equalsIgnoreCase("Playstation") ||
	                 plataforma.equalsIgnoreCase("XBOX") ||
	                 plataforma.equalsIgnoreCase("Nintendo")) {
	                 // Normalizamos la salida para imprimir bonito
	                 if (plataforma.equalsIgnoreCase("PC")) return "PC";
	                 if (plataforma.equalsIgnoreCase("XBOX")) return "Xbox";
	                 if (plataforma.equalsIgnoreCase("NINTENDO")) return "Nintendo";
	                 return "PlayStation";
	             } else {
	                 System.out.println("Plataforma incorrecta. Las opciones válidas son: PC, PlayStation, Xbox, Nintendo.");
	             }
	         } catch (Exception e) {
	             // Capturamos cualquier excepción inesperada (entrada, I/O, etc.) y volvemos a pedir
	             System.out.println("Error al leer la plataforma. Intenta de nuevo.");
	             scLocal.nextLine(); // limpiamos buffer por si acaso
	         }
	     }
	     return plataforma; // no se debería llegar aquí
	 }

	 // Pide y valida la suscripción premium (S/N) con try-catch
	 public static String pedirPremium() {
	     String premium = "";
	     Scanner scLocal = sc;

	     while (true) {
	         try {
	             System.out.print("¿Tiene suscripción premium? (S/N): ");
	             premium = scLocal.nextLine().trim().toUpperCase();

	             if (premium.equals("S") || premium.equals("N")) {
	                 return premium; // devuelve "S" o "N"
	             } else {
	                 System.out.println("Entrada inválida. Responde S (sí) o N (no).");
	             }
	         } catch (Exception e) {
	             System.out.println("Error al leer la respuesta. Intenta de nuevo.");
	             scLocal.nextLine(); // limpiar buffer si fuese necesario
	         }
	     }
	 }

}
}
}
public static void opcionEspacioTotal() throws IOException {

    double memoriaTotal = Double.parseDouble(leerString("Memoria disponible en GB: "));
    int cantidad = leerInt("¿Cuántos juegos vas a instalar?: ");

    double espacioTotal = 0;

    for (int i = 1; i <= cantidad; i++) {
        double tamaño = Double.parseDouble(leerString("Tamaño del juego " + i + " en GB: "));

        espacioTotal += tamaño;

        if (espacioTotal > memoriaTotal) {
            System.out.println("¡Memoria superada! No puedes instalar más juegos.");
            System.out.println("Espacio total ocupado: " + (espacioTotal - tamaño) + " GB");
            return;
        }
    }

    System.out.println("Espacio total ocupado: " + espacioTotal + " GB");
}
}
//Añádelo en tu clase (usa tus métodos leerString / leerInt)
public static void sistemaValoraciones() throws IOException {
 System.out.println("\n--- SISTEMA DE VALORACIONES ---");
 String nombreJuego = leerString("Nombre del juego a valorar: ");
 int numUsuarios = leerInt("¿Cuántos usuarios han valorado el juego " + nombreJuego + " ?: ");

 double suma = 0.0;
 for (int i = 1; i <= numUsuarios; i++) {
     double valor = -1;
     boolean valida = false;

     while (!valida) {
         try {
             String entrada = leerString("Valoración del usuario " + i + " (0-10): ");
             valor = Double.parseDouble(entrada);

             if (valor < 0 || valor > 10) {
                 System.out.println("Nota inválida. Debe estar entre 0 y 10.");
             } else {
                 valida = true; // valor correcto
             }

         } catch (NumberFormatException e) {
             System.out.println("Entrada inválida. Introduce un número.");
         }
     }

     suma += valor;
 }

 double media = (numUsuarios > 0) ? (suma / numUsuarios) : 0.0;
 System.out.println("Nota media: " + media);
 System.out.println("Resumen: " + resumenValoracion(media));
}

//Método auxiliar que devuelve el texto según la nota media
public static String resumenValoracion(double nota) {
 if (nota >= 9.5 && nota <= 10.0) {
     return "Obra Maestra";
 } else if (nota >= 8.5) { // 8.5 - 9.4...
     return "Excelente";
 } else if (nota >= 7.0) { // 7.0 - 8.4
     return "Bueno";
 } else if (nota >= 5.0) { // 5.0 - 6.9
     return "Aceptable";
 } else { // 0.0 - 4.9
     return "Decepcionante";
 }
}


}
