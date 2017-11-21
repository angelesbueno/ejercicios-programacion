/**
 * 6. Números aleatorios.
 *
 * 7. Escribe un programa que muestre tres apuestas de la quiniela en tres 
 *    columnas para los 14 partidos y el pleno al quince (15 filas).
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio7 {
  public static void main(String[] args) {

    for (int i = 1; i <= 15; i++) {

      String columna1 = "";
      String columna2 = "";
      String columna3 = "";
        
      int col1 = ((int)(Math.random()*3) + 1 );
      columna1 = String.valueOf(col1);
      int col2 = ((int)(Math.random()*3) + 1 );
      columna2 = String.valueOf(col2);
      int col3 = ((int)(Math.random()*3) + 1 );
      columna3 = String.valueOf(col3);
      
      switch (columna1) {
        case "1":
        columna1 = "1";
        break;
        
        case "2":
        columna1 = "2"; 
        break;
        
        case "3":
        columna1 = "X";
        break;
        
        default:
      }
      
      switch (columna2) {
        case "1":
        columna2 = "1";
        break;
        
        case "2":
        columna2 = "2"; 
        break;
        
        case "3":
        columna2= "X";
        break;
        
        default:
      }
      
      switch (columna3) {
        case "1":
        columna3 = "1";
        break;
        
        case "2":
        columna3 = "2"; 
        break;
        
        case "3":
        columna3 = "X";
        break;
        
        default:
      }

      
      System.out.println(i + ".   " + columna1 + "|" + columna2 + "|" + columna3);
      
      
    }
  }
}
      
      
    

