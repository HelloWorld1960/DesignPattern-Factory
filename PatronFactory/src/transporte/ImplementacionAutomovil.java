package transporte;
/* Clase hija que implementa los metodos declarados en la clase padre Transporte(interface).
 * Una clase puede implementar una o varias interfaces: en ese caso, la clase debe proporcionar la declaración y definición 
   de todos los métodos de cada una de las interfaces o bien declararse como clase abstract. */
public class ImplementacionAutomovil implements Transporte {

	@Override
	public void arrancar() {
		System.out.println("Estoy arrancando el automovil...");
	}

	@Override
	public void detener() {
		System.out.println("Estoy deteniendo el automovil...");
	}

	@Override
	public String tipo() {
		// TODO Auto-generated method stub
		return "Automovil";
	}

}
