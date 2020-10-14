package transporte;
/* Clase hija que implementa los metodos declarados en la clase padre Transporte(interface).
 * Una clase puede implementar una o varias interfaces: en ese caso, la clase debe proporcionar la declaración y definición 
   de todos los métodos de cada una de las interfaces o bien declararse como clase abstract. */
public class ImplementacionMotocicleta implements Transporte {

	@Override
	public void arrancar() {
		System.out.println("Estoy arrancando la motocicleta...");
	}

	@Override
	public void detener() {
		System.out.println("Estoy deteniendo la motocicleta...");
	}

	@Override
	public String tipo() {
		return "Motocicleta";
	}

}
