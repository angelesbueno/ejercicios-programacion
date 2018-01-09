 /** 
  * Ejercicio 3.
  * 
  * 09/01/2018
  * Recuperación DAW Primer Trimestre
  * 
  * @author Ángeles Bueno Aguilar
 */
 
public class Ex04aba3 {
  public static void main(String[] args) {
    
    int [] numero = new int[20];
    int cifra = 0;
    int contadorCifra = 0;
    
    for (int i= 0; i < 20; i++) {
      numero[i] = ((int)(Math.random() * 100) + 1);
    }
    
    System.out.println("Array generado:");
    for (int i= 0; i < 20; i++) {
      System.out.print(numero[i] + " ");
    }
    System.out.println();
    System.out.println("A continuación, contaré los números que terminan en una cifra determinada.");
    System.out.print("Elija una cifra: ");
    cifra = Integer.parseInt(System.console().readLine());
    
    for (int i= 0; i < 20; i++) {
      if (cifra == numero[i] % 10) {
        contadorCifra ++;
      }
    }
    if (contadorCifra == 1) {
      System.out.print("Hay 1 número que termina por " + cifra); 
    }
    if (contadorCifra > 1) {
      System.out.print("Hay " + contadorCifra + " números que terminan por " + cifra);
    }
    if (contadorCifra == 0) {
      System.out.print("No hay ningún número que termine por " + cifra); 
    }
  }
}
