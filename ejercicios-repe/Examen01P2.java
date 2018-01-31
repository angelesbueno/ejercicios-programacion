 /** @author Ángeles Bueno
  * 
  * examen1
  * 
 */
 
public class Examen01P2 {
  public static void main(String[] args) {
    
    double palmera = 0;
    int donut = 0;
    double aceite = 0;
    double tortilla = 0;
    double zumo = 0;
    double cafe = 0;
    String tipoPitufo = "" ;
    
    System.out.print("¿Qué ha tomado de comer? palmera, donut o pitufo: ");
    String comer = System.console().readLine();
    
    if (comer.equals ("palmera")) {
      palmera = 1.40;
    }
    
    if (comer.equals ("donut")) {
      donut = 1;
    }
    
    if (comer.equals ("pitufo")) {
      System.out.print("¿Con qué se ha tomado el pitufo? aceite o tortilla: ");
      tipoPitufo = System.console().readLine();
      
      if (tipoPitufo.equals ("aceite")) {
        aceite = 1.20;
        
      } else {
          tortilla = 1.80;
        }
    }
    
    System.out.print("¿Qué ha tomado de beber? zumo o café: ");
    String beber = System.console().readLine();
    
    if (beber.equals ("zumo")) {
      zumo = 1.50;
      
    } else {
      
      cafe = 1.25;
      }
      
    double total = palmera + donut + aceite + tortilla + zumo + cafe;
    
    if (comer.equals ("pitufo")) {
        
      if (tipoPitufo.equals ("aceite")) {
        System.out.println("Pitufo con aceite: 1.20");
      
      } else {
         System.out.println("Pitufo con tortilla: 1.80"); 
       }
    }
 
    if (comer.equals ("donut")) {
      System.out.println("Donut: 1"); 
    }
    
    if (comer.equals ("palmera")) {
      System.out.println("Palmera: 1.40");
    }
      
    
    if (beber.equals ("zumo")) {
      System.out.println("Zumo: 1.50");
    
    } else {
        System.out.println("Café: 1.25");
      }

    System.out.println("Total desayuno : " + total);
      
  }
}
    
    
    
    
