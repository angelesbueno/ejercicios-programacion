/**
 * 5. Bucles.
 *
 * 12. Escribe un programa que muestre los n primeros términos de la serie de 
       Fibonacci. El primer término de la serie de Fibonacci es 0, el segundo 
       es 1 y el resto se calcula sumando los dos anteriores, por lo que 
       tendríamos que los términos son 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 
       89, 144... El número n se debe introducir por teclado.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio12 {
  public static void main(String[] args) {
    
    System.out.print("¿Cuántos términos quieres que te muestre de la serie de Fibonacci?: ");
    int contador = Integer.parseInt(System.console().readLine()); 
    
    int termino1 = 0;
    int termino2 = 1;
    int termino3;
    
    if (contador == 0) {
      System.out.print("No te enseño nada");
    
    } else if (contador == 1) {
      System.out.print("El primer número de la serie de Fibonacci es 0.");
    
    } else if (contador == 2) {
      System.out.print("los 2 primeros números de la serie de Fibonacci son 0, 1.");
      
    } else {
      
      System.out.print("Los términos de la serie de Fibonacci son:");
      System.out.print(" "+termino1);
      System.out.print(" "+termino2);
        while (contador > 2) {
          termino3 = termino1 + termino2;
          System.out.print(" "+termino3);
          termino1=termino2;
          termino2=termino3;
          contador--;
        }
      }
  }
}
          
      
      
      

 
  

      
    
    
    
