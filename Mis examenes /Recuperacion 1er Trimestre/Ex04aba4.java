 /** 
  * Ejercicio 4.
  * 
  * 09/01/2018
  * Recuperación DAW Primer Trimestre
  * 
  * @author Ángeles Bueno Aguilar
 */
 
public class Ex04aba4 {
  public static void main(String[] args) {
    
    int jugadorUno = ((int)(Math.random() * 21) + 1);
    
    int jugadorDos = ((int)(Math.random() * 21) + 1);
    if (jugadorDos == jugadorUno) {
      do {
        jugadorDos = ((int)(Math.random() * 21) + 1);
        
      } while (jugadorDos == jugadorUno);
    }
    
    int jugadorTres = ((int)(Math.random() * 21) + 1);
    if ((jugadorTres == jugadorUno) || (jugadorTres == jugadorDos)) {
      do {
        jugadorTres = ((int)(Math.random() * 21) + 1);
        
      } while ((jugadorTres == jugadorUno) || (jugadorTres == jugadorDos));
    }
    
    int espaciosUno = jugadorUno - 1;
    int espaciosDos = jugadorDos - 1;
    int espaciosTres = jugadorTres - 1;
    int distanciaUno = 0;
    int distanciaDos = 0;
    int distanciaTres = 0;
    int distanciaMenor = 0;
    
    System.out.println("         ----------0----------");
    System.out.print("Jugador 1 ");
    for (int i = 1; i < espaciosUno; i++) {
      System.out.print(" ");
    }
    System.out.println("o");
    
    System.out.print("Jugador 2 ");
    for (int i = 1; i < espaciosDos; i++) {
      System.out.print(" ");
    }
    System.out.println("o");
    
    System.out.print("Jugador 3 ");
    for (int i = 1; i < espaciosTres; i++) {
      System.out.print(" ");
    }
    System.out.println("o");
    System.out.println();    
    if (jugadorUno == 10) {
      System.out.print("¡Gana el jugador 1!");
    }
    if (jugadorDos == 10) {
      System.out.print("¡Gana el jugador 2!");
    }
    if (jugadorTres == 10) {
      System.out.print("¡Gana el jugador 3!");
    } 
      
    if (jugadorUno < 10) {
      distanciaUno = 10 - jugadorUno;
    } else {
      distanciaUno = jugadorUno - 10;
    }
    if (jugadorDos < 10) {
      distanciaDos = 10 - jugadorDos;
    } else {
      distanciaDos = jugadorDos - 10;
    }
    if (jugadorTres < 10) {
      distanciaTres = 10 - jugadorTres;
    } else {
      distanciaTres = jugadorTres - 10;
    }
      
    if ((distanciaUno < distanciaDos) && (distanciaUno < distanciaTres)) {
      distanciaMenor = distanciaUno;
    
    } else if ((distanciaDos < distanciaUno) && (distanciaDos < distanciaTres)) {
    distanciaMenor = distanciaDos;
    
    } else {
    distanciaMenor = distanciaTres;
    }
    
    if (distanciaMenor == distanciaUno) {
      System.out.print("¡Gana el jugador 1!");
    }
    if (distanciaMenor == distanciaDos) {
      System.out.print("¡Gana el jugador 2!");
    }
    if (distanciaMenor == distanciaTres) {
      System.out.print("¡Gana el jugador 3!");
    }
    
    if ((distanciaUno == distanciaMenor) && (distanciaDos == distanciaMenor)) {
      if (distanciaUno < 10) {
        System.out.print("¡Gana el jugador 1!");
      } else {
        System.out.print("¡Gana el jugador 2!");
      }
    }
    if ((distanciaDos == distanciaMenor) && (distanciaTres == distanciaMenor)) {
      if (distanciaDos < 10) {
        System.out.print("¡Gana el jugador 2!");
      } else {
        System.out.print("¡Gana el jugador 3!");
      }
    }
    if ((distanciaUno == distanciaMenor) && (distanciaTres == distanciaMenor)) {
      if (distanciaUno < 10) {
        System.out.print("¡Gana el jugador 1!");
      } else {
        System.out.print("¡Gana el jugador 3!");
      }
    }
  }
}
    
