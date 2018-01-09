/**
 * Examen Turno 1.
 *
 * Ejercicio 2.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio2 {
  public static void main(String[] args) {
    
    int [] numero = new int[20];
    int contadorUno = 0;
    int contadorDos = 0;
    int contadorTres = 0;
    int contadorCuatro = 0;
    int contadorCinco = 0;
    int contadorSeis = 0;
    int contadorSiete = 0;
    int contadorOcho = 0;
    int contadorNueve = 0;
    int contadorDiez = 0;
    
    System.out.println("Array generado:");
    
    for (int i = 0; i < 20; i++) {
      numero[i] = ((int)(Math.random() * 10) + 1);
      System.out.print(numero[i] + " ");
      switch (numero[i]) {
        case 1:
          contadorUno ++;
          break;
        case 2:
          contadorDos ++;
          break;
        case 3:
          contadorTres ++;
          break;
        case 4:
          contadorCuatro ++;
          break;
        case 5:
          contadorCinco ++;
          break;
        case 6:
          contadorSeis ++;
          break;
        case 7:
          contadorSiete ++;
          break;
        case 8:
          contadorOcho ++;
          break;
        case 9:
          contadorNueve ++;
          break;
        case 10:
          contadorDiez ++;
          break;
        default:
      }
    }
    System.out.println();
    System.out.println();
    System.out.println("Repeticiones de cada número:");
    
    if (contadorUno > 0) {
      if (contadorUno == 1) {
        System.out.println("El 1 aparece una vez");
      }
      if (contadorUno > 1) {
        System.out.println("El 1 aparece " + contadorUno + " veces");
      }
    } else {
      System.out.println("El 1 no aparece");
    }
    if (contadorDos > 0) {
      if (contadorDos == 1) {
        System.out.println("El 2 aparece una vez");
      }
      if (contadorDos > 1) {
        System.out.println("El 2 aparece " + contadorDos + " veces");
      }
    } else {
      System.out.println("El 2 no aparece");
    }
    if (contadorTres > 0) {
      if (contadorTres == 1) {
        System.out.println("El 3 aparece una vez");
      }
      if (contadorTres > 1) {
        System.out.println("El 3 aparece " + contadorTres + " veces");
      }
    } else {
      System.out.println("El 3 no aparece");
    }
    if (contadorCuatro > 0) {
      if (contadorCuatro == 1) {
        System.out.println("El 4 aparece una vez");
      }
      if (contadorCuatro > 1) {
        System.out.println("El 4 aparece " + contadorCuatro + " veces");
      }
    } else {
      System.out.println("El 4 no aparece");
    }
    if (contadorCinco > 0) {
      if (contadorCinco == 1) {
        System.out.println("El 5 aparece una vez");
      }
      if (contadorCinco > 1) {
        System.out.println("El 5 aparece " + contadorCinco + " veces");
      }
    } else {
      System.out.println("El 5 no aparece");
    }
    if (contadorSeis > 0) {
      if (contadorSeis == 1) {
        System.out.println("El 6 aparece una vez");
      }
      if (contadorSeis > 1) {
        System.out.println("El 6 aparece " + contadorSeis + " veces");
      }
    } else {
      System.out.println("El 6 no aparece");
    }
    if (contadorSiete > 0) {
      if (contadorSiete == 1) {
        System.out.println("El 7 aparece una vez");
      }
      if (contadorSiete > 1) {
        System.out.println("El 7 aparece " + contadorSiete + " veces");
      }
    } else {
      System.out.println("El 7 no aparece");
    }
    if (contadorOcho > 0) {
      if (contadorOcho == 1) {
        System.out.println("El 8 aparece una vez");
      }
      if (contadorOcho > 1) {
        System.out.println("El 8 aparece " + contadorOcho + " veces");
      }
    } else {
      System.out.println("El 8 no aparece");
    }
    if (contadorNueve > 0) {
      if (contadorNueve == 1) {
        System.out.println("El 9 aparece una vez");
      }
      if (contadorNueve > 1) {
        System.out.println("El 9 aparece " + contadorNueve + " veces");
      }
    } else {
      System.out.println("El 9 no aparece");
    }
    if (contadorDiez > 0) {
      if (contadorDiez == 1) {
        System.out.println("El 10 aparece una vez");
      }
      if (contadorDiez > 1) {
        System.out.println("El 10 aparece " + contadorDiez + " veces");
      }
    } else {
      System.out.println("El 10 no aparece");
    }
        
  }
}
  
