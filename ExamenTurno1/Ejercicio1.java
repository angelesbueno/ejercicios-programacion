/**
 * Examen Turno 1.
 *
 * Ejercicio 1.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio1 {
  public static void main(String[] args) {
    
    int [] numero = new int[20];
    int contadorMultDos = 0;
    int contadorMultTres = 0;
    int contadorMultCinco = 0;
    
    
    System.out.println("Array generado:");
    
    for (int i = 0; i < 20; i++) {
      numero[i] = ((int)(Math.random() * 100) + 1);
      System.out.print(numero[i] + " ");
      if (numero[i] % 2 == 0) {
        contadorMultDos ++;
      } 
      if (numero[i] % 3 == 0) {
        contadorMultTres ++;
      } 
      if (numero[i] % 5 == 0) {
        contadorMultCinco ++;
      }
        
    }
    System.out.println();
    System.out.println();
    int [] numeroDos = new int[contadorMultDos];
    int [] numeroTres = new int[contadorMultTres];
    int [] numeroCinco = new int[contadorMultCinco];
    int j = 0;
    for (int i = 0; i < 20; i++) {
      if (numero[i] % 2 == 0) {
        numeroDos[j] = numero[i];
        j ++;
      }
    }
    j = 0;
    for (int i = 0; i < 20; i++) {
      if (numero[i] % 3 == 0) {
        numeroTres[j] = numero[i];
        j ++;
      }
    }
    j = 0;
    for (int i = 0; i < 20; i++) {
      if (numero[i] % 5 == 0) {
        numeroCinco[j] = numero[i];
        j ++;
      }
    }
    System.out.print("Múltiplos de 2: ");
    for (int i = 0; i < contadorMultDos; i++) {
      System.out.print(numeroDos[i] + " ");
    }
    System.out.println();
    System.out.println();  
    System.out.print("Múltiplos de 3: ");
    for (int i = 0; i < contadorMultTres; i++) {
      System.out.print(numeroTres[i] + " ");
    }
    System.out.println();
    System.out.println(); 
    System.out.print("Múltiplos de 5: ");
    for (int i = 0; i < contadorMultCinco; i++) {
      System.out.print(numeroCinco[i] + " ");
    }
    System.out.println();
    System.out.println(); 
  }
}
