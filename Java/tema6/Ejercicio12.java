/**
 * 6. Números aleatorios.
 *
 * 12. Realiza un programa que llene la pantalla de caracteres aleatorios (a lo Matrix)
       con el código ascii entre el 32 y el 126. Puedes hacer casting con (char) para
       convertir un entero en un carácter.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio12 {
  public static void main(String[] args) {
    
    for (long i = 0; i < 600000000; i++) {
    
      int num = ((int)(Math.random()*94) + 32);
    
      System.out.print((char)(num));
    }
  }
}
