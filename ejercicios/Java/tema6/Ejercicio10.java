/**
 * 6. Números aleatorios.
 *
 * 10. Realiza un programa que pinte por pantalla diez líneas formadas por carac-
       teres. El carácter con el que se pinta cada línea se elige de forma aleatoria
       entre uno de los siguientes: *, -, =, ., |, @. Las líneas deben tener una longitud
       aleatoria entre 1 y 40 caracteres.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio10 {
  public static void main(String[] args) {
    
    for (int i = 0; i < 10; i++) {
      
      int num = ((int)(Math.random()*6));
      String caracter = String.valueOf(num);
      
      
      switch (caracter) {
        
        case "0":
        
        caracter = "*";
        break;
        
        case "1":
        
        caracter = "-";
        break;
        
        case "2":
        
        caracter = "=";
        break;
        
        case "3":
        
        caracter = ".";
        break;
        
        case "4":
        caracter = "|";
        break;
        
        case "5":
        
        caracter = "@";
        break;
        
        default:
      }
      
      int num2 = ((int)(Math.random()*40) + 1);
      
      for (int j = 0; j <= num2; j++) {
        
        System.out.print(caracter);
      }
      
      System.out.println();
    }
  }
}
  
    
