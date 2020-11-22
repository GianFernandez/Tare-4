package Package;

public class Enlace {
	
	private static Enlace single;
	
	Enlace() {
		
	}
	
	
	public static Enlace getSingle() {
		if(single == null) {
			single = new Enlace();
		}
		return single;
	}
	
	public void conexion() {
		System.out.println("Enlace a internet establecido");
	}
	
	public void desconexion() {
		System.out.println("Enlace a internet se ha desactivado");
	}

}
