/**
 * 6. Números aleatorios.
 *
 * 11. Escribe un programa que muestre 20 notas generadas al azar. Las notas deben
       aparecer de la forma: suspenso, suficiente, bien, notable o sobresaliente. Al
       final aparecerá el número de suspensos, el número de suficientes, el número
       de bienes, etc.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio11 {
  public static void main(String[] args) {
    
    int suspenso = 0;
    int suficiente = 0;
    int bien = 0;
    int notable = 0;
    int sobresaliente = 0;
    
    for (int i = 0; i < 20; i++) {
      
      int num = ((int)(Math.random()*5));
      String nota = String.valueOf(num);
      
      switch (nota) {
        
        case "0":
        
        nota = "suspenso";
        suspenso ++;
        break;
        
        case "1":
        
        nota = "suficiente";
        suficiente ++;
        break;
        
        case "2":
        
        nota = "bien";
        bien ++;
        break;
        
        case "3":
        
        nota = "notable";
        notable ++;
        break;
        
        case "4":
        
        nota = "sobresaliente";
        sobresaliente ++;
        break;
        
        default:
        
      }
      
      System.out.println(nota);
      
    }
    
    System.out.println();
    System.out.println("Suspenso/s: " + suspenso);
    System.out.println("Suficiente/s: " + suficiente);
    System.out.println("Bien/es: " + bien);
    System.out.println("Notable/s: " + notable);
    System.out.println("Sobresaliente/s: " + sobresaliente);
  }
}
      
      
  
  
      
  
