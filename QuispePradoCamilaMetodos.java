package QuispePradoCamilaMetodos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
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
	public static double leerDouble(String mensaje) throws NumberFormatException, IOException {
		BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
		System.out.print(mensaje);
		Double num = Double.parseDouble(leer.readLine());
		return num;
	
	}
	
	public static void mostrarMenuPrincipal() throws NumberFormatException, IOException {
		boolean salir= false;
		do {

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
				
			mostrarMenuCatalogo2();
			
				break;
			case 3:
				System.out.println("3. Sistemas de Valoraciones");
			sistemaValoraciones();
				break;
			case 4:

			mostrarMenuEstadisticas4();
				break;
			case 5:
				calculadoraDescuentos();
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
				pedirPlataforma(plataformaFav);
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
				añoNacimiento=leerInt("Introduce tu año de nacimiento: ");
				int edad2 = calcularEdad(añoNacimiento);
				System.out.println("Edad: " + calcularEdad(añoNacimiento)+ " años");
				System.out.println("Puede jugar a juegos con etiqueta: " + etiquetaJuegos(edad2));
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

	public static int calcularEdad(int añoNacimiento ) throws NumberFormatException, IOException{

		    while (añoNacimiento < 1920 || añoNacimiento > 2025) {
		        System.out.println("Año fuera de rango (1920-2025). Intenta de nuevo.");
		        añoNacimiento = leerInt("Introduce un año válido: ");
		    }

		    int añoActual = 2025;
		    int edad= añoActual - añoNacimiento;
		    return edad;
		

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
		}if(edad<=30) {
			return "Pro Gamer";
		}else {
			return "Master Gamer";
			
		}	
	}
	public static String pedirPlataforma(String plataformaFav)  throws IOException{
		boolean valida= false;
		do {
			
				if(plataformaFav.equalsIgnoreCase("PC") || 
						plataformaFav.equalsIgnoreCase("PlayStation") ||
		                 plataformaFav.equalsIgnoreCase("Play STATION") ||
		                 plataformaFav.equalsIgnoreCase("Playstation") ||
		                 plataformaFav.equalsIgnoreCase("XBOX") ||
		                 plataformaFav.equalsIgnoreCase("Nintendo")) {
					
					valida=true;
					} else {
				 System.out.println("Error. Ingresa una de estas plataformas: PC, PlayStation, Xbox, Nintendo");
			}
		}while (!valida);
			
			return plataformaFav;
		}
		
	public static String premium(String suscripcion) {
		
		if(suscripcion.equalsIgnoreCase("S")){
			return "Si";
		}
		else if(suscripcion.equalsIgnoreCase("N")) {
			return "No";
		}else {
			 System.out.println("Error. Ingresa S o N.");
		        return "";
		        
		}
	}
	public static String etiquetaJuegos(int edad) {
		
		if(edad>=18) {
			return "PEGI 18";
		}if(edad>=16) {
			return "PEGI 16";
		}if(edad>=12) {
			return "PEGI 12";
			
		}if(edad>=7) {
			return "PEGI 7";
		} else{
			return "PEGI 3";
		}

	}
	public static void mostrarMenuCatalogo2() throws NumberFormatException, IOException {
		boolean menuprincipal= false;

		do {
			try {
		
			System.out.println("--- CATÁLOGO DE JUEGOS ---");
			System.out.println("1. Añadir juegos a la biblioteca");
			System.out.println("2. Calcular espacio total ocupado");
			System.out.println("3.Volver al menu principal");
			int opcion = leerInt("Elige una opción: ");
			
			switch (opcion) {
			case 1:
				System.out.println("1. Añadir juegos a la biblioteca");
				añadirJuegos();
				
				break;
			case 2:
				System.out.println("2. Calcular espacio total ocupado");
				calcularEspacioOcupado();
	
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
	public static void añadirJuegos() throws NumberFormatException, IOException {
	
		int juegosAñadir=leerInt("¿Cuántos juegos quieres añadir?: ");
		double totalPrecio=0;
		int totalJuegos=0;
		
		for (int i=1; i<= juegosAñadir; i++) {
			String nombre = leerString("Nombre del juego: ");
			double tamaño=0;
			boolean tamañoValido = false;
			while(!tamañoValido) {
				try {
					tamaño = leerDouble("Tamaño en GB de " + nombre + " : ");
					tamañoValido = true;
				}catch(NumberFormatException e) {
					System.out.println("Error. Introduce un número. ");
				}
			}
			double precio = 0;
			boolean precioValido = false;
			
			  while (!precioValido) {
		            try {
		                precio = leerDouble("Precio de " + nombre + ": ");
		                precioValido = true;
		            } catch (NumberFormatException e) {
		                System.out.println("Error. Introduce un número.");
		            }
		        }
			  totalJuegos++;
			  totalPrecio+= precio;
		}

	    System.out.println("Total de juegos: " + totalJuegos);
	    System.out.println("Total gastado: " + totalPrecio + "€");
		
	}
	public static void calcularEspacioOcupado() throws NumberFormatException, IOException {
		double memoriaTotal = leerDouble("Memoria disponible en GB: ");
		int cantidadJuego= leerInt("¿Cuántos juegos vas a instalar?: ");
		double espacioTotal=0;
		for(int i = 1; i<= cantidadJuego; i++) {
			double tamaño = leerDouble("Tamaño del juego"+ i + " en GB: ");
			espacioTotal += tamaño;
			if(espacioTotal> memoriaTotal) {
				System.out.println("¡Memoria superada! No puedes instalar más juegos. ");
				System.out.println("Espacio total ocupado: "+ (espacioTotal- tamaño) + " GB");
				return;
			}
		}
		System.out.println("Espacio total ocupado: "+ espacioTotal + " GB");
	}
	public static void sistemaValoraciones() throws IOException {
		
		
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
		                 valida = true;
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
	public static String resumenValoracion(double nota) {
		 if (nota >= 9.5 && nota <= 10.0) {
		     return "Obra Maestra";
		 } else if (nota >= 8.5) {
		     return "Excelente";
		 } else if (nota >= 7.0) {
		     return "Bueno";
		 } else if (nota >= 5.0) { 
		     return "Aceptable";
		 } else { 
		     return "Decepcionante";
		 }
		}
	public static void mostrarMenuEstadisticas4() throws NumberFormatException, IOException {
		boolean menuprincipal= false;

		do {
			try {
		
			System.out.println("--- ESTADÍSTICAS Y RESPORTES ---");
			System.out.println("1. Contador de juegos completados");
			System.out.println("2. Calcular horas totales del juego");
			System.out.println("3.Volver al menu principal");
			int opcion = leerInt("Elige una opción: ");
			
			switch (opcion) {
			case 1:
				System.out.println("1. Contador de juegos completados");
				contadorDeJuegos();
				break;
			case 2:
				System.out.println("2. Calcular horas totales del juego");
				calcularHorasTotalesJuego();
	
				break;
			case 3:
				mostrarMenuPrincipal();
				menuprincipal=true;
				break;
			default:
				System.out.println("Opción no válida");
			
		}
		

		} catch (NumberFormatException e) {
				System.out.println("Error. Introduce un numero.");
		}
		}while (!menuprincipal);
		

	}
	public static void contadorDeJuegos() throws NumberFormatException, IOException {

    int juegosCompletados = leerInt("¿Cuántos juegos completaste este año? (0-500): ");

    while (juegosCompletados < 0 || juegosCompletados > 500) {
        System.out.println("Número inválido. Introduce un valor entre 0 y 500.");
        juegos = leerInt("¿Cuántos juegos completaste este año?: ");
    }

    contarRecursivo(juegosCompletados);
}
	public static void contarRecursivo(int n) {
    if (n == 0) {
        return;
    }

    System.out.println("Has completado el juego número: " + n);
    contarRecursivo(n - 1);
}
public static void calcularHorasTotalesJuego() throws NumberFormatException, IOException {

    String opcion = leerString("¿Quieres introducir solo horas (H) o horas y minutos (HM)?: ");

    while (!opcion.equalsIgnoreCase("H") && !opcion.equalsIgnoreCase("HM")) {
        System.out.println("Opción inválida. Escribe H o HM.");
        opcion = leerString("¿Quieres introducir solo horas (H) o horas y minutos (HM)?: ");
    }

    if (opcion.equalsIgnoreCase("H")) {

        int horas = -1;
        while (horas < 0) {
            try {
                horas = leerInt("Horas: ");
                if (horas < 0) {
                    System.out.println("Las horas no pueden ser negativas.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error. Introduce un número válido.");
            }
        }

        double total = calcularHorasTotales(horas);
        System.out.println("Total de horas jugadas: " + total);

    } else {

        int horas = -1;
        while (horas < 0) {
            try {
                horas = leerInt("Horas: ");
                if (horas < 0) {
                    System.out.println("Las horas no pueden ser negativas.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error. Introduce un número válido.");
            }
        }

        int minutos = -1;
        while (minutos < 0 || minutos > 59) {
            try {
                minutos = leerInt("Minutos: ");
                if (minutos < 0 || minutos > 59) {
                    System.out.println("Los minutos deben estar entre 0 y 59.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Error. Introduce un número válido.");
            }
        }

        double total = calcularHorasTotales(horas, minutos);
        System.out.println("Total de horas jugadas: " + total);
    }
}
public static double calcularHorasTotales(int horas) {
    return horas;
}

public static double calcularHorasTotales(int horas, int minutos) {
    double horasExtra = minutos / 60.0;
    return horas + horasExtra;
}



public static void calculadoraDescuentos() throws NumberFormatException, IOException {

    double precio = -1;
    while (precio < 0) {
        try {
            precio = leerDouble("Introduce el precio del juego: ");
            if (precio < 0) System.out.println("El precio no puede ser negativo.");
        } catch (NumberFormatException e) {
            System.out.println("Error. Introduce un número válido.");
        }
    }

    int descuento = -1;
    while (descuento < 0 || descuento > 100) {
        try {
            descuento = leerInt("Introduce el porcentaje de descuento (0-100): ");
            if (descuento < 0 || descuento > 100) {
                System.out.println("Debe estar entre 0 y 100.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Error. Introduce un número válido.");
        }
    }

    double precioFinal = aplicarDescuento(precio, descuento);

    System.out.println("Precio original: " + precio + "€");
    System.out.println("Precio final: " + precioFinal + "€");
    System.out.println("Ahorro total: " + (precio - precioFinal) + "€");
}
	public static double aplicarDescuento(double precio, int descuento) {

    double precioConDescuento = precio - (precio * descuento / 100.0);

    if (precio > 15) {
        return aplicarDescuento(precioConDescuento, 5);
    }

    return precioConDescuento;
}


}

