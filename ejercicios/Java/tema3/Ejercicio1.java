public class Ejercicio1 {
  public static void main(String [] args) {
    System.out.print("Escribe un número:");
    int primerNumero = Integer.parseInt(System.console().readLine());
    System.out.print("Escribe otro número:");
    int segundoNumero = Integer.parseInt(System.console().readLine());
    System.out.print("La multiplicación de los dos números es " + (primerNumero*segundoNumero));
  }
}
  
