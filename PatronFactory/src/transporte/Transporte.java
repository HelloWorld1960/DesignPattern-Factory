/* Una interface es una variante de una clase abstracta con la condici�n de que todos sus m�todos deben ser asbtractos.
 * Si la interface va a tener atributos, �stos deben llevar las palabras reservadas static final y con un valor inicial 
   ya que funcionan como constantes por lo que, por convenci�n, su nombre va en may�sculas. 
 * Una clase implementa una o m�s interfaces (separadas con comas ",") con la palabra reservada implements. 
 * Con el uso de interfaces se puede "simular" la herencia m�ltiple que Java no soporta. 
 * Todos los m�todos de una interfaz se declaran impl�citamente como abstractos y p�blicos.
 * La clase que implementa una interface tiene dos opciones:
    1) Implementar todos los m�todos de la interface.
    2) Implementar s�lo algunos de los m�todos de la interface pero esa clase debe ser una 
       clase abstracta (debe declararse con la palabra abstract). */
package transporte;

public interface Transporte {
	
	/*Metodos*/
	public void arrancar();
	
	public void detener();
	
	public String tipo();

}

/**Una interfaz puede parecer similar a una clase abstracta, pero existen una serie de diferencias entre una interfaz y una 
clase abstracta:
* Todos los m�todos de una interfaz se declaran impl�citamente como abstractos y p�blicos.
* Una clase abstracta no puede implementar los m�todos declarados como abstractos, una interfaz no puede implementar ning�n 
m�todo (ya que todos son abstractos).
* Una interfaz no declara variables de instancia.
* Una clase puede implementar varias interfaces, pero s�lo puede tener una clase ascendiente directa.
* Una clase abstracta pertenece a una jerarqu�a de clases mientras que una interfaz no pertenece a una jerarqu�a de clases. 
En consecuencia, clases sin relaci�n de herencia pueden implementar la misma interfaz.
**/