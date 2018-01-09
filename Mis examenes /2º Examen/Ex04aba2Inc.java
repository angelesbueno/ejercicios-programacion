 /** 
  * Ejercicio 2.
  * 
  * @author Ángeles Bueno
 */
 
public class Ex04aba2Copia {
  public static void main(String[] args) {
    
    int [] numero = new int[10];
    int [] auxiliar = new int[10];
    int contadorPrimo = 0;
    int contadorNoPrimo = 0;
    int nuevoNumero = 0;
    int capicua = 0;
    int noCapicua = 0;
    int contadorCapicua = 0;
    int contadorNoCapicua = 0;
    
    for (int i = 0; i < 10; i ++) {
      numero[i] = ((int)(Math.random() * 99) + 2);
      auxiliar[i] = numero[i];
    }
    
    for (int i = 0; i < 10; i ++) {
      System.out.print(numero[i] + " ");
    }
    System.out.println();
    System.out.println();
    
    for (int i = 0; i < 10; i++) {
      
      boolean esPrimo = true;
    
      for (int j = 2; j < numero[i]; j++) {
        if ((numero[i] % j) == 0) {
          esPrimo = false;
          contadorNoPrimo ++;
        } else {
          contadorPrimo ++;
        }
      }
      boolean esCapicua = false;
      while (numero[i] > 0) {
        nuevoNumero = nuevoNumero + numero[i] % 10; nuevoNumero = nuevoNumero * 10;
        numero[i] /= 10;
      }
      
      nuevoNumero /= 10;
      
      if(auxiliar[i] == nuevoNumero) { 
        esCapicua = true;
        contadorCapicua ++;
      } else {
        contadorNoCapicua ++;
      }
      
      if (esPrimo && esCapicua) {
        
        System.out.println("El número " + auxiliar[i] + " es primo y es capicúa.");
        
      } else if (esPrimo && !esCapicua) {
        
        System.out.println("El número " + auxiliar[i] + " es primo y no es capicúa.");
        
      } else if (!esPrimo && esCapicua) {
        
        System.out.println("El número " + auxiliar[i] + " no es primo y es capicúa.");
        
      } else {
        System.out.println("El número " + auxiliar[i] + " no es primo y no es capicúa.");
      }
      
    }
    
    int [] numerosPrimos = new int[contadorPrimo];
    int [] numerosNoPrimos = new int[contadorNoPrimo];
    int [] numerosCapicua = new int[contadorCapicua];
    int [] numerosNoCapicua = new int[contadorNoCapicua];
    int k = 0;
    int l = 0; 
    int m = 0;
    int n = 0; 
    
    for (int i = 0; i < 10; i++) {
      
      boolean esPrimo = true;
    
      for (int j = 2; j < numero[i]; j++) {
        if ((numero[i] % j) == 0) {
          esPrimo = false;
          numerosNoPrimos[k] = numero[i];
          k ++;
        } else {
          numerosPrimos[l] = numero[i];
          l ++;
        }
      }
      boolean esCapicua = false;
      while (numero[i] > 0) {
        nuevoNumero = nuevoNumero + numero[i] % 10; nuevoNumero = nuevoNumero * 10;
        numero[i] /= 10;
      }
      
      nuevoNumero /= 10;
      
      if(auxiliar[i] == nuevoNumero) { 
        esCapicua = true;
        numerosCapicua[m] = auxiliar[i];
      } else {
        numerosNoCapicua[m] = auxiliar[i];
      }
    }
    
    
    
    System.out.print("Números primos : ");
    for (int i = 0; i < contadorPrimo; i++) {
      System.out.print(numerosPrimos[i] + " ");
    }
    System.out.println();
    System.out.println();
    
    System.out.print("Números no primos : ");
    for (int i = 0; i < contadorNoPrimo; i++) {
      System.out.print(numerosNoPrimos[i] + " ");
    }
    System.out.println();
    System.out.println();
    
    System.out.print("Números capicúas : ");
    for (int i = 0; i < contadorCapicua; i++) {
      System.out.print(numerosCapicua[i] + " ");
    }
    System.out.println();
    System.out.println();
    
    System.out.print("Números no capicúas : ");
    for (int i = 0; i < contadorNoCapicua; i++) {
      System.out.print(numerosNoCapicua[i] + " ");
    }
    System.out.println();
    System.out.println();
    
    
    
  
  }
    
}
    
