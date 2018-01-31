/**
 * 6. Números aleatorios.
 *
 * 17. Realiza un programa que pinte por pantalla una pecera con un pececito dentro.
       Se debe pedir al usuario el ancho y el alto de la pecera, que como mínimo
       serán de 4 unidades. No hay que comprobar que los datos se introducen
       correctamente; podemos suponer que el usuario los introduce bien. Dentro
       de la pecera hay que colocar de forma aleatoria un pececito, que puede estar
       situado en cualquiera de las posiciones que quedan en el hueco que forma el
       rectángulo.
 *
 * @author Ángeles Bueno
 */
 
public class RectanguloHueco {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca la altura del rectángulo (como mínimo 4): ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
    int anchuraIntroducida = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    int altura = 0;
    int alturaMedia = alturaIntroducida - 2;
    int espacios = anchuraIntroducida - 2;
    
    
    while (altura <= alturaIntroducida) {
    
      for (int i = 1; i <= anchuraIntroducida; i++) {
          
          System.out.print("*");
      }

      altura ++;
      System.out.println();
      
        while (altura <= alturaMedia) {
        
          System.out.print("*");
          
          for (int j = 1; j <= espacios; j++) {
          
            System.out.print(" ");
          }
          
          System.out.print("*");
          System.out.println();
          altura ++;
        }
        
      altura ++;  
    }
 
  }
}
