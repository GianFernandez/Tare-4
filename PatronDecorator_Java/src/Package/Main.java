package Package;
/**
 * @author Gian's PC
 *
 */
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Impresora i = new Impresora();
		i.setHoja("a4");
		i.setColor(true);
		i.setTipoDocumento("pdf");
		i.setTexto("texto 1");
		i.imprimirDocumento();
		
		
		Impresora i1 = new Impresora();
		i1.setHoja("a4");
		i1.setColor(true);
		i1.setTipoDocumento("word");
		i1.setTexto("texto 3");
		i1.imprimirDocumento();
	
		
	}
}