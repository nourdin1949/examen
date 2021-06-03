package examen;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Nodo {
	
	private final static Logger LOGGER = LogManager.getLogger(Nodo.class);
	public int valor;
	public Nodo siguiente;
	
	public Nodo(int valor) {
		
		this.valor=valor;
		if(valor%2==0) {
			LOGGER.info("SE HA INTRODUCIDO UN VALOR PAR A LAS ");
		}else {
			LOGGER.warn("SE HA INTRODUCIDO UN VALOR IMPAR EL DIA  "+"A LAS ");
		}
	}
	

}
