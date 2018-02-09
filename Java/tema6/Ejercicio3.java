/**
 * 6. Números aleatorios.
 *
 * 2. Igual que el ejercicio anterior pero con la baraja española. 
      Se utilizará la baraja de 40 cartas: 2, 3, 4, 5, 6, 7, sota, caballo, rey y as.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio3 {
  public static void main(String[] args) {
    
        int num1 = ((int)(Math.random()*4));
    String palo = "";
    palo = String.valueOf(num1);
    
    switch (palo) {
      
      case "0":
      
      palo = "bastos";
      break;
      
      case "1":
      palo = "oros";
      break;
      
      case "2":
      palo = "copas";
      break;
      
      case "3":
      palo = "espadas";
      break;
      
      default:
      
    }
    
    int num2 = ((int)(Math.random()*10) + 1);
    String carta = "";
    carta = String.valueOf(num2);
    
    switch (carta) {
 
      case "1":
      carta = "AS";
      break;
      
      case "8":
      carta = "Sota";
      break;
      
      case "9":
      carta = "Caballo";
      break;
      
      case "10":
      carta = "Rey";
      break;
      
      default:
      
    }
    
    System.out.println("Carta: " + carta + " de " + palo);
  }
}
