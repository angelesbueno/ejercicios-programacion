/**
 * 4. Sentencia condicional
 *
 * 23. Escribe un programa que calcule el precio final de un producto según 
       su base imponible (precio antes de impuestos), el tipo de IVA aplicado 
       (general, reducido o superreducido) y el código promocional. 
       Los tipos de IVA general, reducido y superreducido son del 21%, 10% y 
       4% respectivamente. Los códigos promocionales pueden ser nopro, mitad, 
       meno5 o 5porc que significan respectivamente que no se aplica promoción, 
       el precio se reduce a la mitad, se descuentan 5 euros o se descuenta el 5%. 
       El ejercicio se da por bueno si se muestran los valores correctos, aunque 
       los números no estén tabulados.
 *
 * @author Ángeles Bueno
 */


public class Ejercicio23 {
  public static void main(String[] args) {
    System.out.print("Dime la base Imponible del producto: ");
    int baseImponible = Integer.parseInt(System.console().readLine());
    System.out.print("Dime el tipo de IVA a aplicar (general, reducido o superreducido): ");
    String iva = System.console().readLine().toLowerCase();
    System.out.print("Dime si tienes código promocional (nopro, mitad, meno5 o 5porc): ");
    String codPro = System.console().readLine().toLowerCase();
    
    
    int ivaNum = 0;
    
    switch (iva) {
      case "general":
      ivaNum = 21;
      break;
      
      case "reducido":
      ivaNum = 10;
      break;
      
      case "superreducido":
      ivaNum = 4;
      break;
      
      default:
    }
    
    
    double codProFinal = 0;
    
  
    switch (codPro) {
      case "nopro":
      codProFinal = 0;
      break;
      
      case "mitad":
      codProFinal = ((baseImponible + (baseImponible * ivaNum / 100)) / 2);
      break;
      
      case "meno5":
      codProFinal = 5;
      break;
      
      case "5porc":
      codProFinal = ((baseImponible + (baseImponible * ivaNum / 100)) * 0.05);
      break;
      
      default:
    }
    
    System.out.println("");
    System.out.println("Base imponible                                         " + baseImponible);
    System.out.println("IVA                                                    " + ivaNum);
    System.out.println("Código promocional                                     " + codPro);
    System.out.println("-----------------------------------------------------------------");
    System.out.println("Precio final                                               " + ((baseImponible + (baseImponible * ivaNum / 100)) - codProFinal));
    
    
    
  }
}

    
    
     
      
        
