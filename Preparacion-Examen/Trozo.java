public class Trozo {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca un número entero positivo: ");
    
    long numeroIntroducido = Integer.parseInt(System.console().readLine()); 
    long aux = numeroIntroducido;
    long nuevoNumero = 0;
    
    while (numeroIntroducido > 0) {
      nuevoNumero = nuevoNumero + numeroIntroducido % 10; nuevoNumero = nuevoNumero * 10;
      numeroIntroducido /= 10;
    }
    
    nuevoNumero /= 10;
    
    if(aux == nuevoNumero) { 
      System.out.println("Es capicúa");
    
    } else {
    System.out.println("No es capicúa");
    }
  }
}
