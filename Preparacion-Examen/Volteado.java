public class Volteado {
  public static void main(String[] args) {
    
    int numeroIntroducido = 0;
    int volteado = 0;
    
    System.out.print("Por favor, introduzca un número entero positivo: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    while (numeroIntroducido > 0) {
      volteado = (volteado*10) + numeroIntroducido%10;
      numeroIntroducido /= 10;
    }
    
    System.out.println();
    System.out.println(volteado);
  }
}
