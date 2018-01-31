public class Cruz {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca la longitud del brazo de la cruz: ");
    int longitud = Integer.parseInt(System.console().readLine());
    
    for (int i = 0; i < longitud*2 +1; i++) { //+1 (el del medio)
      if (i == longitud) { //fila del medio (todo caracteres)
        for (int c = 0; c < longitud*2; c++) { 
          System.out.print("*");
        }
      } else {
        //espacios hasta la columna
        for (int e = 0; e < longitud; e++) {
          System.out.print(" ");
        }
      }
      System.out.print("*\n");
    }
  }
}
