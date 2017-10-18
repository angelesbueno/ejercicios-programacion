/**
 * 4. Sentencia condicional
 *
 * 7. Realiza un programa que calcule la media de tres notas.
 *
 * @author Ángeles Bueno
 */


 public class Ejercicio7 {
  public static void main(String[] args) {
    
    System.out.println("Vamos a calcular la media de tres notas.");
    System.out.print("Introduce la primera nota: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la segunda nota: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    
    System.out.print("Introduce la tercera nota: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double media = (nota1+nota2+nota3)/3;
    
    System.out.print("La nota media será " + media);
    
  }
}
    
    
    
    
    
    
    
