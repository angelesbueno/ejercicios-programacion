/** 
  * 
 * @author Ángeles Bueno
 */
 
public class PiramideHueca2 {
  public static void main(String[] args) {
    
    System.out.print("Introduzca la altura de la pirámide: ");
    int alturaIntroducida = Integer.parseInt(System.console().readLine());
    
    System.out.print("Introduzca el caracter para pintar la pirámide: ");
    String caracter = System.console().readLine();
  
    int altura = 1;
    int espacios = alturaIntroducida - 1;
    int espaciosInternos = 1;
    int contadorCaracteres = 1;
    
    for(int i = 1; i <= espacios; i++) {
      System.out.print(" ");
    }
    
    System.out.print(caracter);
    altura ++;
    System.out.println();
    espacios --;
    contadorCaracteres += 2;
    
    
    while (altura < alturaIntroducida) {
      
      for(int i = 1; i <= espacios; i++) {
      System.out.print(" ");
      }
      
      System.out.print(caracter);
      
      for (int i = 1; i<= espaciosInternos; i++) {
      System.out.print(" ");
      }
      
      espaciosInternos += 2;
      System.out.print(caracter);
      altura ++;
      System.out.println();
      espacios --;
      contadorCaracteres += 2;
      
    }
      
      for (int i= 1; i <= contadorCaracteres; i++) {
      System.out.print(caracter);
      }
      
    
    
    
    
  }
}
  
      
  
  
