import java.util.Scanner;

public class Practica_1_evaluacion {
	public static void main(String[] args) {
		// Declaración de atributos
		String palabra, respuesta, acertar;
		char intento;
		int numero_posiciones, valor_intento, contador = 0, total_intentos = 4;
		boolean continuar = true;

		// Creo objeto de la clase Scanner
		Scanner S = new Scanner(System.in);

		// Título de el juego
		do {
			System.out.println("                          ***** JUEGO DE AHORCADO *****");
			System.out.println();

			// Comienza ***1ª jugador.*** El programa te pide que introduzca la
			// palabra.
			System.out.println("***1º JUGADOR***");
			System.out.println();
			// Un poco de explicación
			System.out.println("Introduce un palabra para que el segundo jugador intente adivinarla.\n"
					+ "El segundo jugador no puede estar presente cuando se introduce la palabra secreta.\n"
					+ "Los aciertos no descuentan vidas, solo los fallos\n"
					+ "La palabra se deberá introducir en minúsculas, y los intentos de aciertos también.\n\n");
			System.out.println("NUMERO DE INTENTOS: " + total_intentos);
			// Se introduce la palabra por teclado.
			System.out.print("Introduce una palabra: ");
			palabra = S.next();
			// Cuento las posiciones que tiene la palabra para representar la gráfica de espacios.
			numero_posiciones = palabra.length();
			System.out.println("LA PALABRA SECRETA CONTIENE: " + numero_posiciones + " CARACTERES ");
			System.out.println();
			// Hago tantos espacios como letras tiene la palabra
			for (int i = 1; i <= numero_posiciones; i++) {
				System.out.print(" _ ");
			}

			// ***2ªjugador***
			// Hago un bucle para repetir el proceso 4 veces
			for (int i = 0; i < 4; i++) {
				System.out.println("\n\n***2º JUGADOR***");

				// Imprimo el muñeco con todas las vidas.(Solo cuando las vidas, con un if anidado.
				//Cuatro vidas
				
				if (total_intentos == 4) {
					System.out.println(" ---------------------");
					for (int j = 0; j < 15; j++) {
						System.out.println(" |");
					}
					// 3 vidas 
				} else {
					if (total_intentos == 3) {
						System.out.println(" ---------------------");
						System.out.println(" |                     |");
						System.out.println(" |                     |");
						System.out.println(" |                  -------");
						System.out.println(" |                 | -  -  |");
						System.out.println(" |                 |   o   |");
						System.out.println(" |                  -------");
						for (int j = 0; j < 10; j++) {
							System.out.println(" |");

						}
						System.out.println("__________");
						//2 vidas
					} else {
						if (total_intentos == 2) {
							System.out.println(" ---------------------");
							System.out.println(" |                     |");
							System.out.println(" |                     |");
							System.out.println(" |                  -------");
							System.out.println(" |                 | -  -  |");
							System.out.println(" |                 |   o   |");
							System.out.println(" |                  -------");
							System.out.println(" |                     |   ");
							System.out.println(" |                   / |   ");
							System.out.println(" |                 /   |   ");
							System.out.println(" |                /    |   ");
							System.out.println(" |                     |   ");
							for (int j = 0; j < 5; j++) {
								System.out.println(" |");

							}
							System.out.println("__________");
							//1 vida
						} else {
							if (total_intentos == 1) {
								System.out.println(" ---------------------");
								System.out.println(" |                     |");
								System.out.println(" |                     |");
								System.out.println(" |                  -------");
								System.out.println(" |                 | -  -  |");
								System.out.println(" |                 |   o   |");
								System.out.println(" |                  -------");
								System.out.println(" |                     |   ");
								System.out.println(" |                   / | \\ ");
								System.out.println(" |                  /  |   \\ ");
								System.out.println(" |                 /   |     \\ ");
								System.out.println(" |                     |   ");
								System.out.println(" |                    /  ");
								System.out.println(" |                   /      ");
								System.out.println(" |                  /       ");
								for (int j = 0; j < 2; j++) {
									System.out.println(" |");

								}
								System.out.println("__________");
							} 
						}
					}
				}

				// jugador 2. Introduce una letra por teclado.
				System.out.print("Introduce una letra: ");
				intento = S.next().charAt(0);

				// Comprobamos si existe la letra introducida.(si el valor es
				// >-1 el metodo indexOf indica que si que hay acierto.
				valor_intento = palabra.indexOf(intento);
				if (valor_intento >= 0) {
					System.out.println("CORRECTO EXISTE");

					// Comprobamos el número de veces que existe.Recorro la
					// palabra con bucle,
					for (int j = 0; j < palabra.length(); j++) {
						if (palabra.charAt(j) == intento) {
							contador++;
							// Imprimimos la posicion en la que se encuentra la
							// letra.
							// De esta forma el jugador 2 podra en un papel
							// situar la posicion de cada letra en cada palabra.
							System.out.println("Posicion: " + (j + 1));

						}

					}
					// numero de intentos restantes.Si acertó, no se le restaran
					// intentos y si falló si.
					System.out.println("ElNÚMERO DE VIDAS: " + total_intentos);
					System.out.println("NÚMERO DE VECES QUE SE REPITE LA LETRA INTRODUCIDA: " + contador);

					contador = 0;
					valor_intento = 0;
					// Como ha acertado el contador no avanza.
					i--;

				} else {
					System.out.println("LA LETRA INTRODUCIDA **NO EXISTE**");
					total_intentos--;
					System.out.println("EL NÚMERO DE VIDAS: " + total_intentos);

				}

			}
			if (total_intentos == 0) {
				System.out.println(" ---------------------");
				System.out.println(" |                     |");
				System.out.println(" |                     |");
				System.out.println(" |                  -------");
				System.out.println(" |                 | X  X  |");
				System.out.println(" |                 |   o   |");
				System.out.println(" |                  -------");
				System.out.println(" |                     |   ");
				System.out.println(" |                   / | \\ ");
				System.out.println(" |                  /  |   \\ ");
				System.out.println(" |                 /   |     \\ ");
				System.out.println(" |                     |   ");
				System.out.println(" |                    / \\");
				System.out.println(" |                   /   \\  ");
				System.out.println(" |                  /     \\ ");
				for (int j = 0; j < 2; j++) {
					System.out.println(" |");

				}
				System.out.println("__________");
				System.out.println("YA NO DISPONES DE MAS VIDAS \n\n");
				System.out.println("*** INTENTE ACERTAR LA PALABRA ***\n\n\n");
				System.out.println("Introduce una palabra:");
				acertar = S.next();
				// Convertimos los dos nombres a mayusculas(cadena.toUppercase)
				palabra = palabra.toUpperCase();
				acertar = acertar.toUpperCase();
				// Hacemos la conparacion (cadena.equals())
				if (palabra.equals(acertar)) {
					System.out.println("***ACERTASTE***\n\n\n");
					System.out.println(" *** GANASTE ***");
				} else {
					System.out.println("NO ACERTASTE");
					System.out.println("*** PERDISTE ***\n" + "*** GAME OVER ***");
				}

			}

			System.out.println("¿QUIERES VOLVER A JUGAR?");
			System.out.println("CONTESTAR \"si o no\"");
			respuesta = S.next();
			if (respuesta.charAt(0) == 's' || respuesta.charAt(0) == 'S') {
				total_intentos = 4;
			}
			if (respuesta.charAt(0) == 'n' || respuesta.charAt(0) == 'N') {
				continuar = false;
			}
		} while (continuar);

		if (continuar == false) {
			System.out.println("FIN DE EL PROGRAMA");
		}

	}

}
