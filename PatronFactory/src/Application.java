import transporte.Fabrica;
import transporte.Transporte;

/**El patron de diseño Factory es usado principalmente cuando tenemos una clase o interfaz con muchas sub-clases o 
implementaciones y queremos que una clase (en este caso Factory) tenga la responsabilidad de la creacion 
de los objetos segun el tipo de parametro que se le pasa, para que no sea el programador quien decida que clase instanciara. 
*/
public class Application {
	public static void main(String args[]) {
		
		//Transporte t1 = Fabrica.construir("Motocicleta");
		Transporte t1 = Fabrica.construir("Automovil");
		
		t1.arrancar();
		t1.detener();
		System.out.println(t1.tipo());
	}
}
