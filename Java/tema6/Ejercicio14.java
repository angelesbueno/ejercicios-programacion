/**
 * 6. Números aleatorios.
 *
 * 14. Realiza un programa que haga justo lo contrario a lo que hace el ejercicio 6.
       El programa intentará adivinar el número que estás pensando - un número
       entre 0 y 100 - teniendo para ello 5 oportunidades. En cada intento fallido, el
       programa debe preguntar si el número que estás pensando es mayor o menor
       que el que te acaba de decir.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio14 {
  public static void main(String[] args) {
    
    int contador = 10;
    int numeroAzar = ((int)(Math.random() * 101));
    int maximo = 100;
    int minimo = 0;
    
    System.out.println("Piensa un número entre 0 y 100, intentaré adivinarlo. Pulsa INTRO para comenzar.");
    System.console().readLine();
    
    System.out.print("¿Es " + numeroAzar + " ? (s/n): ");
    String respuesta = System.console().readLine();
    System.out.println();
    
    if (respuesta.equals ("s")) {
      
      System.out.println("😎 ¡He ganado!");
      
    } else {

        for (int i = 0; i < 10; i++) {
          
          System.out.println("Me queda/n " + contador + " intento/s.");
          System.out.println();
          System.out.print("¿El número que estás pensando es mayor o menor que el te acabo de decir? (mayor/menor): ");
          respuesta = System.console().readLine().toLowerCase();
          System.out.println();
          
        
          if (respuesta.equals ("mayor")) {
            
            minimo = numeroAzar;
            
          } else {
            
              maximo = numeroAzar;
              
            }
            
          System.out.println(maximo);
          System.out.println(minimo);  
            
          numeroAzar = ((int)(Math.random() * ((maximo - minimo) - 1) + (minimo + 1)));
            
          System.out.print("¿Es " + numeroAzar + " ? (s/n): ");
          respuesta = System.console().readLine();
          System.out.println();
          
          if (respuesta.equals ("s")) {
      
            
            System.out.println("😎  ¡He ganado!");
            i = 10;
          }
          
          if ((respuesta.equals ("n")) && (i == 9)) {
            
            System.out.println("😭  ¡Has ganado!");
          }
          
          contador --;
        }
        
      }
  }
}

