/**
 * 4. Sentencia condicional
 *
 * 15. Escribe un programa que pinte una pirámide rellena con un carácter 
       introducido por teclado que podrá ser una letra, un número o un 
       símbolo como *, +, -, $, &, etc. El programa debe permitir al usuario 
       mediante un menú elegir si el vértice de la pirámide está apuntando 
       hacia arriba, hacia abajo, hacia la izquierda o hacia la derecha.
 *
 * @author Ángeles Bueno
 */
 
 
public class Ejercicio15 {
  public static void main(String[] args) {
    
    System.out.println("Vamos a pintar una pirámide");
    System.out.println("");
    System.out.print("Elige y escribe cualquier caracter: ");
    String simb = System.console().readLine();
    System.out.println("");
    System.out.println("Ahora escoge entre una de estas opciones:");
    System.out.println("1. El vértice de la pirámide mira hacia arriba");
    System.out.println("2. El vértice de la pirámide mira hacia abajo");
    System.out.println("3. El vértice de la pirámide mira hacia la izquierda");
    System.out.println("4. El vértice de la pirámide mira hacia la derecha");
    System.out.println("");
    System.out.print("¿Qué opción prefieres?: ");
    int opcion = Integer.parseInt(System.console().readLine());
    System.out.println("");
    
    
    switch (opcion) {
      case 1:
                
        System.out.println("                      " +simb);
        System.out.println("                     " +simb+simb+simb);
        System.out.println("                   " +simb+simb+simb+simb+simb+simb+simb);
        System.out.println("                  " +simb+simb+simb+simb+simb+simb+simb+simb+simb);
        System.out.println("                 " +simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb);
        System.out.println("                " +simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb);
        System.out.println("               " +simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb);
        System.out.println("              " +simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb);
        
        break;
        
      case 2:
        
        System.out.println("              " +simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb);
        System.out.println("               " +simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb);
        System.out.println("                " +simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb);
        System.out.println("                 " +simb+simb+simb+simb+simb+simb+simb+simb+simb+simb+simb);
        System.out.println("                  " +simb+simb+simb+simb+simb+simb+simb+simb+simb);
        System.out.println("                   " +simb+simb+simb+simb+simb+simb+simb);
        System.out.println("                     " +simb+simb+simb);
        System.out.println("                      " +simb);
        
        break;
        
      case 3:
      
        System.out.println("          " +simb); 
        System.out.println("         " +simb+simb);
        System.out.println("        " +simb+simb+simb);
        System.out.println("       " +simb+simb+simb+simb);
        System.out.println("      " +simb+simb+simb+simb+simb);
        System.out.println("     " +simb+simb+simb+simb+simb+simb);
        System.out.println("    " +simb+simb+simb+simb+simb+simb+simb);
        System.out.println("   " +simb+simb+simb+simb+simb+simb+simb+simb);
        System.out.println("    " +simb+simb+simb+simb+simb+simb+simb);
        System.out.println("     " +simb+simb+simb+simb+simb+simb);
        System.out.println("      " +simb+simb+simb+simb+simb);
        System.out.println("       " +simb+simb+simb+simb);
        System.out.println("        " +simb+simb+simb);
        System.out.println("         " +simb+simb);
        System.out.println("          " +simb); 
        
        break;
        
      case 4:
      
        System.out.println("     " +simb);
        System.out.println("     " +simb+simb);
        System.out.println("     " +simb+simb+simb);
        System.out.println("     " +simb+simb+simb+simb);
        System.out.println("     " +simb+simb+simb+simb+simb);
        System.out.println("     " +simb+simb+simb+simb+simb+simb);
        System.out.println("     " +simb+simb+simb+simb+simb+simb+simb);
        System.out.println("     " +simb+simb+simb+simb+simb+simb+simb+simb);
        System.out.println("     " +simb+simb+simb+simb+simb+simb+simb);
        System.out.println("     " +simb+simb+simb+simb+simb+simb);
        System.out.println("     " +simb+simb+simb+simb+simb);
        System.out.println("     " +simb+simb+simb+simb);
        System.out.println("     " +simb+simb+simb);
        System.out.println("     " +simb+simb);
        System.out.println("     " +simb);
        
        break;
        
      default:
      
        
      
    }
    
    /** cómo poner mensaje de error de símbolo si es distinto a "+, -, *, $ ó &". */
      
    
    
    if (opcion > 4) {
      System.out.println("Lo siento, esa opción del menú no está disponible");
    }

  }
}
        
        
        
         
        
        
        
        
      
                               
