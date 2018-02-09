/**
 * 6. Números aleatorios.
 *
 * 2. Realiza un programa que muestre al azar el nombre de una carta de la 
      baraja francesa. Esta baraja está dividida en cuatro palos: picas, 
      corazones, diamantes y tréboles. Cada palo está formado por 13 cartas, 
      de las cuales 9 cartas son numerales y 4 literales: 2, 3, 4, 5, 6, 7, 8,
      9, 10, J, Q, K y A (que sería el 1).
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio2 {
  public static void main(String[] args) {
    
    int num1 = ((int)(Math.random() * 4));
    String palo = "";
    palo = String.valueOf(num1);
    
    switch (palo) {
      
      case "0":
      
      palo = "picas";
      break;
      
      case "1":
      palo = "corazones";
      break;
      
      case "2":
      palo = "diamantes";
      break;
      
      case "3":
      palo = "tréboles";
      break;
      
      default:
      
    }
    
    int num2 = ((int)(Math.random()*13) + 2);
    String carta = "";
    carta = String.valueOf(num2);
    
    switch (carta) {
 
      case "1":
      carta = "AS";
      break;
      
      case "11":
      carta = "J";
      break;
      
      case "12":
      carta = "Q";
      break;
      
      case "13":
      carta = "K";
      break;
      
      default:
      
    }
    
    System.out.println("Carta: " + carta + " de " + palo);
  }
}
