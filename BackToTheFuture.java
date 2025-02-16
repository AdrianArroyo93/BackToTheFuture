package BackToTheFuture;

import java.util.Scanner;

public class BackToTheFuture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		boolean velocidad;

		// creamos las constantes de error por si se da una de las situaciones
		final String ERROR_NUMERO_NEGATIVO = "No se permite escribir números negativos";
		final String ERROR_CARACTERES = "Valor no válido, escriba al menos un número";
		final String ADVERTENCIA = "Recuerde escribir únicamente números enteros";
		final String VELOCIDAD_CORRECTA = "Ha escrito un valor correcto";
		final String VELOCIDAD_ALCANZADA = "Estás listo para viajar en el tiempo";

		String letra = "";
		int numero = 0;
		int vueltas = 0;
		int limiteVelocidad = 88;
		int contador = vueltas;

		do {
			velocidad = true;
			try {
				System.out.println("Ingrese la velocidad inicial del DeLorean (en mph)");
				int cantidadVelocidad = scanner.nextInt();
				//Calculamos cantidad de vueltas
				for (int i = 0; i < vueltas; i = i++) {
					
					System.out.println();
					
					if (!(cantidadVelocidad > 0)) {
						throw new Exception(ERROR_NUMERO_NEGATIVO);

					}
					/*if (!(cantidadVelocidad == numero && cantidadVelocidad == letra.indexOf(cantidadVelocidad) + 0)) {
					/	throw new Exception(ERROR_CARACTERES);
						
						
					}

			*/	}

				//System.out.println(VELOCIDAD_CORRECTA);

			} catch (Exception e) {
				System.out.println(e.getMessage());
				// TODO: handle exception
			}

		} while (velocidad);
		
		scanner.close();
	}

}
