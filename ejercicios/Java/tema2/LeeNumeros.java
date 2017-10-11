public class LeeNumeros {
  public static void main(String [] args) {
  System.out.print("Por favor, introduce un número: ");
  int primerNumero = Integer.parseInt(System.console().readLine());
  
  System.out.print("Introduce otro, por favor: ");
  int segundoNumero = Integer.parseInt(System.console().readLine());
  
  System.out.println("El primer número es " + primerNumero);
  System.out.println("El segundo número es " + segundoNumero);
  System.out.print("El doble del primer número más el segundo es ");
  System.out.print((2 * primerNumero) + segundoNumero);
  }
}
