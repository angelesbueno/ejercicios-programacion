/**
 * 7. Arrays.
 *
 * 5. Escribe un programa que pida 10 números por teclado y que luego muestre
      los números introducidos junto con las palabras “máximo” y “mínimo” al lado
      del máximo y del mínimo respectivamente.
 *
 * @author Ángeles Bueno
 */
 
public class MaximoMinimo {
  public static void main(String[] args) {
    
    int [] numero = new int[10];
    int maximo = 0;
    int minimo = 100;
    
    for (int i = 0; i < 10; i++) {
      
      System.out.print("Introduzca un número: ");
      numero[i] = Integer.parseInt(System.console().readLine());
      
      if (numero[i] > maximo) {
        
        maximo = numero[i];
      }
      
      if (numero[i] < minimo) {
        
        minimo = numero[i];
      }
    
    }
    
    for (int j = 0; j < 10; j++) {
      
      if (numero[j] == minimo) {
        System.out.println(numero[j] + " mínimo");
      
      } else if (numero[j] == maximo) {

        System.out.println(numero[j] + " máximo");
          
      } else {
      
        System.out.println(numero[j]);
      
      }
    }
  }
}
      
