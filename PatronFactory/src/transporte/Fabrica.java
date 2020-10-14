package transporte;

public class Fabrica {
	
	public static Transporte construir(String tipo) {
		switch (tipo) {
			case "Motocicleta":
				return new ImplementacionMotocicleta();
			case "Automovil":
				return new ImplementacionAutomovil();
			default:
				System.out.println("No se encuentra dicho objeto en la fabrica");
				return null;
		}
	}
}
