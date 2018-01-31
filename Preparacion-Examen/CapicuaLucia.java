public class Capicua {
  public static void main(String[] args) {
    
    System.out.print("Introduce un número entero (max 5 dígitos) y te diré si es capicua: ");
    int numero = Math.abs(Integer.parseInt(System.console().readLine())); 
    
    boolean esCapicua = false;
   
    if(numero < 10){
      esCapicua = true;
      if ((numero / 10) == (numero % 10)) {
        esCapicua = true;
      }
    }

    if ((numero >= 100) && (numero < 1000)) {
      if ((numero / 100) == (numero % 10)) {
        esCapicua = true;
      }
    }

    if ((numero >= 1000) && (numero < 10000)) {
      if (((numero / 1000) == (numero % 10)) && ((( numero / 100 ) % 10)== (( numero / 10) % 10))) {
        esCapicua = true;
      }
    }
    
    if (numero >= 10000) {
      if (((numero / 10000) == (numero % 10) ) && ((((numero / 1000) % 10)) == ((numero / 10) % 10))) {
        esCapicua = true;
      }
    }
    
    if (esCapicua) {
      System.out.println("El número es capicúa.");
    } else {
      System.out.println("El número no es capicúa.");
    }
  }
}
