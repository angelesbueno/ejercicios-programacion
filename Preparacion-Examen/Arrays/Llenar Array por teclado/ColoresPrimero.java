/**
 * 7. Arrays.
 *
 * 14. Escribe un programa que pida 8 palabras y las almacene en un array. A
       continuación, las palabras correspondientes a colores se deben almacenar al
       comienzo y las que no son colores a continuación. Puedes utilizar tantos arrays
       auxiliares como quieras. Los colores que conoce el programa deben estar en
       otro array y son los siguientes: verde, rojo, azul, amarillo, naranja, rosa, negro,
       blanco y morado.
 *
 * @author Ángeles Bueno
 */
 
public class ColoresPrimero {
  public static void main(String[] args) {
    
    String[] colores = new String[9];
    colores[0] = "verde";
    colores[1] = "rojo";
    colores[2] = "azul";
    colores[3] = "amarillo";
    colores[4] = "naranja";
    colores[5] = "rosa";
    colores[6] = "negro";
    colores[7] = "blanco";
    colores[8] = "morado";
    
    int contadorColores = 0;
    String[] palabras = new String[8];
    
    for (int i = 0; i < 8; i++) {
      
      System.out.print("Introduzca una palabra: ");
      palabras[i] = System.console().readLine();
      
      if (palabras[i].equals ("verde")) { 
        contadorColores ++;
      } 
      if (palabras[i].equals ("rojo")) { 
        contadorColores ++;
      }
      if (palabras[i].equals ("blanco")) { 
        contadorColores ++;
      }
      if (palabras[i].equals ("negro")) { 
        contadorColores ++;
      }
      if (palabras[i].equals ("morado")) { 
        contadorColores ++;
      }
      if (palabras[i].equals ("azul")) { 
        contadorColores ++;
      }
      if (palabras[i].equals ("amarillo")) { 
        contadorColores ++;
      }
      if (palabras[i].equals ("naranja")) { 
        contadorColores ++;
      }
      if (palabras[i].equals ("rosa")) { 
        contadorColores ++;
      }  
    }
    
    int contadorAuxPalabras = 8 - contadorColores;
    String[] auxiliarColores = new String[contadorColores];
    String[] auxiliarPalabras = new String[8 - contadorColores];
    int j = 0;
    int i = 0;
    
    do {
      
      if (palabras[i].equals ("verde")) {
        
        auxiliarColores[j] = palabras[i];
        j++;
      }
      if (palabras[i].equals ("amarillo")) {
        
        auxiliarColores[j] = palabras[i];
        j++;
      }
      if (palabras[i].equals ("rojo")) {
        
        auxiliarColores[j] = palabras[i];
        j++;
      }
      if (palabras[i].equals ("rosa")) {
        
        auxiliarColores[j] = palabras[i];
        j++;
      }
      if (palabras[i].equals ("azul")) {
        
        auxiliarColores[j] = palabras[i];
        j++;
      }
      if (palabras[i].equals ("blanco")) {
        
        auxiliarColores[j] = palabras[i];
        j++;
      }
      if (palabras[i].equals ("negro")) {
        
        auxiliarColores[j] = palabras[i];
        j++;
      }
      if (palabras[i].equals ("naranja")) {
        
        auxiliarColores[j] = palabras[i];
        j++;
      }
      if (palabras[i].equals ("morado")) {
        
        auxiliarColores[j] = palabras[i];
        j++;
      }
 
      i++;
      
    } while (j < contadorColores);
    
    j = 0;
    i = 0;
    
    do {
      
      if (palabras[i].equals ("verde")) {
      
      } else if (palabras[i].equals ("naranja")) {
      
      } else if (palabras[i].equals ("rojo")) {
      
      } else if (palabras[i].equals ("blanco")) {
        
      } else if (palabras[i].equals ("negro")) {
        
      } else if (palabras[i].equals ("amarillo")) {
        
      } else if (palabras[i].equals ("rosa")) {
        
      } else if (palabras[i].equals ("azul")) {
        
      } else if (palabras[i].equals ("morado")) {

      } else {
        auxiliarPalabras[j] = palabras[i];
        j++;
      }
      i++;
      
    } while (j < contadorAuxPalabras);
    System.out.println();
    System.out.println("Array original:");
    
    for (int q = 0; q < 8; q++) {
      System.out.print("    " + q + "    ");
    }
    
    System.out.println();
    
    for (int q = 0; q < 8; q++) {
      System.out.print(palabras[q] + "    ");
    }
    
    System.out.println();
    System.out.println();
    System.out.println("Array resultado:");
    
    for (int q = 0; q < 8; q++) {
      System.out.print("    " + q + "    ");
    }
    
    System.out.println();
    
    for (int q = 0; q < contadorColores; q++) {
      System.out.print(auxiliarColores[q] + "    ");
    }
    
    for (int q = 0; q < (contadorAuxPalabras); q++) {
      System.out.print(auxiliarPalabras[q] + "    ");
    }
  }
}
