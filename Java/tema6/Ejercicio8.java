/**
 * 6. Números aleatorios.
 *
 * 8. Modifica el programa anterior para que la probabilidad de que salga un 1 sea
      de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga
      2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio8 {
  public static void main(String[] args) {
    

    for (int i = 1; i <= 15; i++) {

      String columna1 = "";
      String columna2 = "";
      String columna3 = "";
        
      int col1 = ((int)(Math.random() * 6) + 1 );
      columna1 = String.valueOf(col1);
      int col2 = ((int)(Math.random() * 6) + 1 );
      columna2 = String.valueOf(col2);
      int col3 = ((int)(Math.random() * 6) + 1 );
      columna3 = String.valueOf(col3);
      
      switch (columna1) {
        case "1":
        columna1 = "1";
        break;
        
        case "2":
        columna1 = "2"; 
        break;
        
        case "3":
        columna1 = "1";
        break;
        
        case "4":
        columna1 = "1";
        break;
        
        case "5":
        columna1 = "X";
        break;
        
        case "6":
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
        columna2= "1";
        break;
        
        case "4":
        columna2 = "1";
        break;
        
        case "5":
        columna2 = "X";
        break;
        
        case "6":
        columna2 = "X";
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
        columna3 = "1";
        break;
        
        case "4":
        columna3 = "1";
        break;
        
        case "5":
        columna3 = "X";
        break;
        
        case "6":
        columna3 = "X";
        break;
        
        default:
      }

      
      System.out.println(i + ".   " + columna1 + "|" + columna2 + "|" + columna3);
      //System.out.printf("%-3s . %-3s %-3s %-3s %n", i, columna2, columna3);
      
      
    }
  }
}
    
    
