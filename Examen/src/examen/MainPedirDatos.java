package examen;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class MainPedirDatos {
	private final static Logger LOGGER = LogManager.getLogger(MainPedirDatos.class);
	public static void main(String[] args) {
		
		List lista = new ArrayList();
		Scanner teclado = new Scanner(System.in);
		
		int valor;
		do {
			System.out.println("Introduzca un valor: (0 para salir)");
			valor = teclado.nextInt();
			Nodo nodo = new Nodo(valor);
			
			if(valor!=0) {
				lista.add(nodo);
			}
		}while(valor!=0);
	}
}
