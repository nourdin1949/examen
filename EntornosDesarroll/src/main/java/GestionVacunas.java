
import java.util.Scanner;

public class GestionVacunas {
	/**
	 * @user NOureddine El Qaddoury
	 * @version 1.0.0 3/06/2021
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * La variables que usaremos abajo
		 */
		String nombre, dni, numeroVacuna = "", vacuna1 = "", vacuna2 = "", mesVacunacion1 = "", mesVacunacion2 = "";

		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca el nombre del paciente:");
		nombre = teclado.next();
		System.out.println("Introduzca el dni del paciente:");
		dni = teclado.next();
		System.out.println("�Vacuna 1 o 2?");
		numeroVacuna = teclado.next();

		if (numeroVacuna.equals("1")) {
			System.out.println("Introduzca la vacuna 1: ");
			vacuna1 = teclado.next();
			System.out.println("Introduzca el mes de vacunaci�n de vacuna 1:");
			mesVacunacion1 = teclado.next();

		} else if (numeroVacuna.equals("2")) {

			System.out.println("Introduzca la vacuna 2: ");
			vacuna2 = teclado.next();
			System.out.println("Introduzca el mes de vacunaci�n de vacuna 2:");
			mesVacunacion2 = teclado.next();

		} else {
			System.out.println("Error");
		}

		comprobarPacienteVacunado(nombre, dni, vacuna1, vacuna2, mesVacunacion1, mesVacunacion2);

	}

	/**
	 * .
	 * 
	 * @param nombre del paciente
	 * @param dni del paciente
	 * @param vacuna1 nombre de la primera vacuna inyectada
	 * @param vacuna2 nombre de la segunda vacuna inyectada
	 * @param mesVacunacion1 mes de la inyeccion de la primera vacuna1
	 * @param mesVacunacion2 mes de la inyeccion de la primera vacuna2
	 */
	private static void comprobarPacienteVacunado(String nombre, String dni, String vacuna1, String vacuna2,
			String mesVacunacion1, String mesVacunacion2) {
		System.out.println("VACUNACI�N PACIENTE " + nombre + "-" + dni + "_________________");
		System.out.println("Vacuna 1 " + vacuna1 + " Fecha:" + mesVacunacion1);
		System.out.println("Vacuna 2 " + vacuna2 + " Fecha:" + mesVacunacion2);
		if (vacuna1.equals("Moderna")) {
			System.out.println("El paciente " + nombre + " debe esperar 5 meses para la vacuna 2 ");
		} else if (vacuna1.equals("Pfizer")) {
			System.out.println("El paciente " + nombre + "debe esperar 4 meses para la vacuna 2 ");
		} else if (vacuna1.equals("Janssen")) {
			System.out.println("El paciente est� ya vacuando");
		} else {
			System.out.println("El paciente " + nombre + " est� ya vacunado ");
		}

	}
}
