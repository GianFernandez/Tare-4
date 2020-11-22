/**
 * 
 */
package Package;

import Package.Enlace;
import java.util.Scanner;
/**
 * @author Gian's PC
 *
 */
public class Aplicacion {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Enlace U = Enlace.getSingle();
		
		String key;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Presione 'ENTER' para establecer conexion al internet ");
		key = keyboard.nextLine();
		U.conexion();
		System.out.println();
		
		System.out.println("Presione 'ENTER' nuevamente para desestablecer la conexion al internet ");
		key = keyboard.nextLine();
		U.desconexion();

	}

}
