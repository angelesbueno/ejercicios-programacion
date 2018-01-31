public class SepararCifras {
  public static void main(String[] args) {
    
    System.out.print("Por favor, introduzca un número entero positivo: ");
    int numeroIntroducido = Integer.parseInt(System.console().readLine());
    int auxiliar = numeroIntroducido;
    int digito = 0;
    int contadorDigitos = 0;
    
    while (numeroIntroducido >= 1) {
        
      digito = (digito * 10) + (numeroIntroducido % 10);
      contadorDigitos ++;
      numeroIntroducido /= 10;
    }
    
    int [] numero = new int[contadorDigitos];
    int j = 0;
    
    while (auxiliar >= 1) {
        
      numero[j] = auxiliar % 10;
      auxiliar /= 10;
      j ++;
    }
    
    System.out.println(numeroIntroducido);
    System.out.println(auxiliar);
    System.out.println(contadorDigitos);
    
    for (int i = contadorDigitos - 1; i >= 0; i--) {
      System.out.print(numero[i] + " ");
    }
  }
  
}
