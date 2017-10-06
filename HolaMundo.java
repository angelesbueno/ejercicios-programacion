/**
 * Muestra por pantalla la frase "¡Hola mundo!"
 *
 * @author Luis J. Sánchez
 */

public class HolaMundo { // Clase principal
  public static void main(String[] args) {
		String morado = "\033[35m";
    System.out.println(morado+"¡Hola mundo!");
  }
}
