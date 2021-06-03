

/**
 * Clase que ofrece la funcionalidad para trabajar con datos covid.
 * @author dam/daw
 *
 */
public class Covid {

	/**
	 * M�todo que calcula la prioridad de vacunaci�n de un paciente,
	 * sabiendo la edad y el n�mero de dosis 
	 * que lleva
	 * @param numeroDosis
	 * @param edad
	 * @return prioridad para la vacunaci�n. Valor comprendido entre 1 (mayor) - 3 (menor)
	 */
	public int calcularPrioridadVacunacion(int edad, int numeroDosis) {
		
		int prioridad=1;
		
		if(edad > 60 && numeroDosis==1) {
			prioridad = 2;
		}
		else if(edad > 40 && edad <=60 && numeroDosis==1) {
			prioridad = 3;
		}
		else {
			prioridad = 1;
		}
		
		return prioridad;
	}
}
