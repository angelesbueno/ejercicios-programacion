/**
 * 6. Números aleatorios.
 *
 * 18. Sinestesio y Casilda van a pintar los tres dormitorios de su casa, quieren
       sustituir el color blanco por colores más alegres. Realiza un programa que
       genere de forma aleatoria una secuencia de tres colores aleatorios (uno para
       cada dormitorio) de tal forma que no se repita ninguno. Los colores entre los
       que debe elegir el programa son los siguientes: rojo, azul, verde, amarillo,
       violeta y naranja.
 *
 * @author Ángeles Bueno
 */
 
public class ColoresHabitacion {
  public static void main(String[] args) {

    int color1 = ((int)(Math.random() * 6) + 1);
    int color2 = ((int)(Math.random() * 6) + 1);
    int color3 = ((int)(Math.random() * 6) + 1);
    String habitacion1 = "";
    String habitacion2 = "";
    String habitacion3 = "";
    String rojo = "\033[31m";
    String verde = "\033[32m";
    String naranja = "\033[33m";
    String morado = "\033[35m";
    String amarillo = "\033[33m";
    String azul = "\033[34m";
    
    switch (color1) {
      
      case 1:
        habitacion1 = rojo + "rojo";
        break;
        
      case 2: 
        habitacion1 = azul + "azul";
        break;
        
      case 3:
        habitacion1 = verde + "verde";
        break;
        
      case 4:
        habitacion1 = amarillo + "amarillo";
        break;
        
      case 5:
        habitacion1 = morado + "violeta";
        break;
        
      case 6:
        habitacion1 = naranja + "naranja";
        break;
        
      default:
    }
    
    switch (color2) {
      
      case 1:
        habitacion2 = rojo + "rojo";
        break;
        
      case 2: 
        habitacion2 = azul + "azul";
        break;
        
      case 3:
        habitacion2 = verde + "verde";
        break;
        
      case 4:
        habitacion2 = amarillo + "amarillo";
        break;
        
      case 5:
        habitacion2 = morado + "violeta";
        break;
        
      case 6:
        habitacion2 = naranja + "naranja";
        break;
        
      default:
    }
    
    switch (color3) {
      
      case 1:
        habitacion3 = rojo + "rojo";
        break;
        
      case 2: 
        habitacion3 = azul + "azul";
        break;
        
      case 3:
        habitacion3 = verde + "verde";
        break;
        
      case 4:
        habitacion3 = amarillo + "amarillo";
        break;
        
      case 5:
        habitacion3 = morado + "violeta";
        break;
        
      case 6:
        habitacion3 = naranja + "naranja";
        break;
        
      default:
    }
    
    if (((color1 != color2) && (color2 != color3)) && ((color1 != color3))) {
  
      System.out.println(habitacion1 + " | " + habitacion2 + " | " + habitacion3);
    
    } else {
      
        do {
          
          color1 = ((int)(Math.random() * 6) + 1);
          color2 = ((int)(Math.random() * 6) + 1);
          color3 = ((int)(Math.random() * 6) + 1); 
              
          switch (color1) {
      
            case 1:
              habitacion1 = rojo + "rojo";
              break;
              
            case 2: 
              habitacion1 = azul + "azul";
              break;
              
            case 3:
              habitacion1 = verde + "verde";
              break;
              
            case 4:
              habitacion1 = amarillo + "amarillo";
              break;
              
            case 5:
              habitacion1 = morado + "violeta";
              break;
              
            case 6:
              habitacion1 = naranja + "naranja";
              break;
              
            default:
          }
          
          switch (color2) {
            
            case 1:
              habitacion2 = rojo + "rojo";
              break;
              
            case 2: 
              habitacion2 = azul + "azul";
              break;
              
            case 3:
              habitacion2 = verde + "verde";
              break;
              
            case 4:
              habitacion2 = amarillo + "amarillo";
              break;
              
            case 5:
              habitacion2 = morado + "violeta";
              break;
              
            case 6:
              habitacion2 = naranja + "naranja";
              break;
              
            default:
          }
          
          switch (color3) {
            
            case 1:
              habitacion3 = rojo + "rojo";
              break;
              
            case 2: 
              habitacion3 = azul + "azul";
              break;
              
            case 3:
              habitacion3 = verde + "verde";
              break;
              
            case 4:
              habitacion3 = amarillo + "amarillo";
              break;
              
            case 5:
              habitacion3 = morado + "violeta";
              break;
              
            case 6:
              habitacion3 = naranja + "naranja";
              break;
              
            default:
          }
          
          
        } while (((color1 == color2) && (color2 != color3)) || ((color2 == color3) && (color3 != color1)) || ((color1 == color3) && (color1 != color2)) || ((color1 == color2) && (color2 == color3)));

        System.out.println(habitacion1 + " | " + habitacion2 + " | " + habitacion3);

      }
  }
}

