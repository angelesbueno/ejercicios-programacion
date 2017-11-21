/**
 * 6. Números aleatorios.
 *
 * 6. Escribe un programa que piense un número al azar entre 0 y 100. 
      El usuario debe adivinarlo y tiene para ello 5 oportunidades. 
      Después de cada intento fallido, el programa dirá cuántas oportunidades 
      quedan y si el número introducido es menor o mayor que el número secreto.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio6 {
  public static void main(String[] args) {
    
    int contador = 4;
    int numeroAzar = ((int)(Math.random()*101));
    
    System.out.println("Introduce un número entero entre 0 y 100 (ambos incluídos): ");
    //System.out.println(numeroAzar);
    
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    if (numeroIntroducido == numeroAzar) {
    System.out.print("¡Enhorabuena, lo has adivinado!");
    
    } else {
      
        System.out.println("No es el número que estaba pensando, te queda/n 4 intento/s.");
        
        
        if (numeroAzar > numeroIntroducido) {
                
          System.out.println("El número que estoy pensando es mayor que " + numeroIntroducido);
                
        } else {
                
            System.out.println("El número que estoy pensando es menor que " + numeroIntroducido);
          }
    
        for (int i = 4; i > 0; i--) {
          
          numeroIntroducido = Integer.parseInt(System.console().readLine());
          
          if (numeroIntroducido == numeroAzar) {
          System.out.print("¡Enhorabuena, lo has adivinado!");
          i = -1;
          
          } else {
              
              contador --;
            
              if (contador == 0) {
                
                System.out.println("No te quedan más intentos y no has adivinado el número");
                System.out.println("El número que había pensado era " + numeroAzar);
                
              } else {
                
                  System.out.println("No es el número que estaba pensando, te queda/n " + (i - 1) + " intento/s.");
      
                  if (numeroAzar > numeroIntroducido) {
                
                    System.out.println("El número que estoy pensando es mayor que " + numeroIntroducido);
                
                  } else {
                
                      System.out.println("El número que estoy pensando es menor que " + numeroIntroducido);
                    }
                }
            }
        }
      }
  }
}


