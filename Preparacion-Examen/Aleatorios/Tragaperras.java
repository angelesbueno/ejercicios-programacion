/**
 * 6. Números aleatorios.
 *
 * 16. Realiza un simulador de máquina tragaperras simplificada que cumpla los
       siguientes requisitos:
       a) El ordenador mostrará una tirada que consiste en mostrar 3 figuras. Hay 5
       figuras posibles: corazón, diamante, herradura, campana y limón.
       b) Si las tres figuras son diferentes se debe mostrar el mensaje “Lo siento,
       ha perdido”.
       c) Si hay dos figuras iguales y una diferente se debe mostrar el mensaje “Bien,
       ha recuperado su moneda”.
       d) Si las tres figuras son iguales se debe mostrar “Enhorabuena, ha ganado
       10 monedas”.
 *
 * @author Ángeles Bueno
 */
 
public class Tragaperras {
  public static void main(String[] args) {
    
    int moneda = 1;
    String figura1 = "";
    String figura2 = "";
    String figura3 = "";
    
    do {
      
      int tirada1 = ((int)(Math.random() * 5) + 1);
      int tirada2 = ((int)(Math.random() * 5) + 1);
      int tirada3 = ((int)(Math.random() * 5) + 1);

     switch (tirada1) {
        
        case 1:
          figura1 = "corazón";
          break;
          
        case 2:
          figura1 = "diamante";
          break;
          
        case 3:
          figura1 = "herradura";
          break;
          
        case 4:
          figura1 = "campana";
          break;
          
        case 5:
          figura1 ="limón";
          break;
          
        default:
      }
      
      switch (tirada2) {
        
        case 1:
          figura2 = "corazón";
          break;
          
        case 2:
          figura2 = "diamante";
          break;
          
        case 3:
          figura2 = "herradura";
          break;
          
        case 4:
          figura2 = "campana";
          break;
          
        case 5:
          figura2 ="limón";
          break;
          
        default:
      }
      
      switch (tirada3) {
        
        case 1:
          figura3 = "corazón";
          break;
          
        case 2:
          figura3 = "diamante";
          break;
          
        case 3:
          figura3 = "herradura";
          break;
          
        case 4:
          figura3 = "campana";
          break;
          
        case 5:
          figura3 ="limón";
          break;
          
        default:
      }
      if (((tirada1 != tirada2) && (tirada2 != tirada3)) && ((tirada1 != tirada3))) {
        
        System.out.println(figura1 + " | " + figura2 + " | " + figura3);
        System.out.println();
        System.out.println("Lo siento, ha perdido");
        moneda --;
        System.out.println("Le queda/n " + moneda + " moneda/s");
        System.out.println();
        System.console().readLine();
      }
      
      if (((tirada1 == tirada2) && (tirada2 != tirada3)) || ((tirada2 == tirada3) && (tirada3 != tirada1)) || ((tirada1 == tirada3) && (tirada1 != tirada2))) {
        
        System.out.println(figura1 + " | " + figura2 + " | " + figura3);
        System.out.println();
        System.out.println("Bien, ha recuperado su moneda");
        System.out.println("Le queda/n " + moneda + " moneda/s");
        System.out.println();
        System.console().readLine();
      }
      
      
      if ((tirada1 == tirada2) && (tirada2 == tirada3)) {
        
        System.out.println(figura1 + " | " + figura2 + " | " + figura3);
        System.out.println();
        System.out.println("Enhorabuena, ha ganado 10 monedas"); 
        moneda --;
        moneda += 10; 
        System.out.println("Le queda/n " + moneda + " moneda/s");
        System.out.println();
        System.console().readLine();
      }
      
    } while (moneda >= 1);
  }
}
      
      
      
      
