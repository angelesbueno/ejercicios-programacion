/**
 * 5. Bucles.
 *
 * 7. Realiza el control de acceso a una caja fuerte. La combinación será un 
      número de 4 cifras. El programa nos pedirá la combinación para abrirla. 
      Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la 
      combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto 
      satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio7 {
  public static void main(String[] args) {
  
  
    int combiOk = 2610;
    
    System.out.print("Introduce la combinación de la caja fuerte: ");
    int combi1 = Integer.parseInt(System.console().readLine());
    
    
