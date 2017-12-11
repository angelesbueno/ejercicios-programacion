 /** Examen DAM 2.
 *
 * Ejercicio 4.
 *
 * @author Ángeles Bueno
 */
 
public class Examen4 {
  public static void main(String[] args) {
    
    System.out.println("Este programa pinta una pecera con un pez");
    System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine()); 
    System.out.print("\nAhora introduzca la anchura (como mínimo 4): ");
    int anchura = Integer.parseInt(System.console().readLine()); 
    System.out.println();
    int altura = 1;//para controlar la altura actual de la imagen
    int espacios = 1;
    
    int pez = 0;
    int caracola = 0;
    int caballito = 0;
    
    while((pez == caracola) || (caracola == caballito) || (pez == caballito)){
      pez = (int)(Math.random()*(anchura-2) * (alturaIntroducida-2)+1);
      caracola = (int)(Math.random()*(anchura-2) * (alturaIntroducida-2)+1);
      caballito = (int)(Math.random()*(anchura-2) * (alturaIntroducida-2)+1);
    }
    
    for(int i = 1; i <= anchura; i++){
      System.out.print("*");
    }
    altura++;
    System.out.println();
    
    int espaciosInternos = anchura -2;
    while (altura < alturaIntroducida){
      System.out.print("*");
      for(int i = 1; i <= espaciosInternos; i++){
        if(espacios == pez){
          System.out.print("&");
        }else if(espacios == caracola){
          System.out.print("@");
        }else if(espacios == caballito){
          System.out.print("$");
        }else{
          System.out.print(" ");
        }
        espacios++;
      }
      System.out.print("*");
      altura++;
      System.out.println();
    }
    for(int i = 1; i <= anchura; i++){
      System.out.print("*");
    }
  }
}
