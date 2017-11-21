/**
 * 6. Números aleatorios.
 *
 * 1. Escribe un programa que muestre la tirada de tres dados. Se debe mostrar 
      también la suma total (los puntos que suman entre los tres dados).
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio1 {
  public static void main(String[] args) {
  
    int suma = 0;
    int contador = 1;
    String dibujo = "";
  
    for (int i = 0; i < 3; i++) {
      
      int dado = ((int)(Math.random()*6) + 1 );
      
      switch (dado) {
        case 1:
        dibujo = "⚀";
        break;
        
        case 2:
        dibujo = "⚁";
        break;
        
        case 3:
        dibujo = "⚂";
        break;
        
        case 4:
        dibujo = "⚃";
        break;
        
        case 5:
        dibujo = "⚄";
        break;
        
        case 6: 
        dibujo ="⚅";
        break;
        
        default:
      }
      
      
      System.out.println("Dado " + contador + ": " + dado + " " + dibujo);
      suma += dado;
      contador ++;
      dado = 0;
    }
    
    System.out.println("Suma: " + suma);

  }
}
    
    
    
    
