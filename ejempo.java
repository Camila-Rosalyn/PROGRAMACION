package QuispePradoCamilaMetodos;

public class ejempo {

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
