/**
 * 4. Sentencia condicional
 *
 * 8. Amplía el programa anterior para que diga la nota del boletín 
 *    (insuficiente, suficiente, bien, notable o sobresaliente).
 *
 * @author Ángeles Bueno
 */


 public class Ejercicio8 {
  public static void main(String[] args) {
    
    
    System.out.println("Vamos a calcular la media de tres notas.");
    System.out.print("Introduce la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1+nota2+nota3)/3;
    
    System.out.println("La nota media será " + media);
    
  
    if ((media >= 0) && (media < 5)) {
      System.out.println("Tienes un Insuficiente.");
    }
      
    if ((media >= 5) && (media < 6)) {
      System.out.println("Tienes un Aprobado.");
    }
      
    if ((media >= 6) && (media < 7)) {
      System.out.println("Tienes un Bien.");
    }
      
    if ((media >= 7) && (media < 9)) {
      System.out.println("Tienes un Notable.");
    }
      
    if ((media >= 9) && (media <=10)) {
      System.out.println("Tienes un Sobresaliente.");
    }
    
    if ((media > 10)) {
      System.out.println("Esa nota no es posible.");
    }
    
    
    
    
  }
}
