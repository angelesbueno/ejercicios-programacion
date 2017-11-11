/**
 * 5. Bucles.
 *
 * 17. Realiza un programa que sume los 100 números siguientes a un número 
       entero y positivo introducido por teclado. Se debe comprobar que el 
       dato introducido es correcto (que es un número positivo).
 *
 * @author Ángeles Bueno
 */
//sumar todos los números entre dos números introducidos por teclado
public class Ejercicio17 {
  public static void main(String[] args) {
    
    System.out.print("Introduce el primer número: ");
    int num1 = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduce el segundo número: ");
    int num2 = Integer.parseInt(System.console().readLine());
    
    int i = num1;
    
    int suma = 0;
    
    while (i < num2) {   //i = 3    num2 = 5    suma = 2
    
      
      suma += i;
      i++;
      
    }
    
    System.out.print("El valor total e la suma es :" + suma);
    
  }
}
    
    
    
    
    
      
    
    
    




