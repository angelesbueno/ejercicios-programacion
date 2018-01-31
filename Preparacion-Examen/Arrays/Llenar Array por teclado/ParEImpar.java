/**
 * 7. Arrays.
 *
 * 9. Realiza un programa que pida 8 números enteros y que luego muestre esos
      números junto con la palabra “par” o “impar” según proceda.
 *
 * @author Ángeles Bueno
 */
 
public class ParEImpar {
  public static void main(String[] args) {
    
    int [] numero = new int[8];
    
    for (int i = 0; i < 8; i++) {
      
      System.out.print("Introduzca un número entero: ");
      numero[i] = Integer.parseInt(System.console().readLine());
    }
    
    System.out.println();
    
    for (int i = 0; i < 8; i++) {
      
      if (numero[i] % 2 == 0) {
        System.out.println(numero[i] + " par");
      } else {
          System.out.println(numero[i] + " impar");
        }
    }
  }
}
