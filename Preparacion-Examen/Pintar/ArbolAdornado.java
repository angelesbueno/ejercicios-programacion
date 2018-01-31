
/**
 * @author Juan Francisco Bernal Rodríguez
 *
 * Crear un árbol de navidad, adornado con #, @ y & aleatoriamente en cada fila.
 *
 */
import java.lang.reflect.Array;
import java.util.Scanner;

public class ArbolAdornado {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    System.out.print("Introduce la altura del árbol: ");
    int altura = s.nextInt();

    for (int i = 0; i < altura; i++) {
      for (int e = 0; e < altura * 2 - 1; e++) {
        if (i == altura - 1) {
          System.out.print("*");
        } else if (e + i == altura - 1 || (altura * 2 - 1) - e + i == altura) {
          System.out.print("*");
        } else if (e + i > altura - 1 && (altura * 2 - 1) - e + i > altura) {
          switch ((int) (Math.random() * 21)) {
            case 0:
              System.out.print("#");
              break;
            case 1:
              System.out.print("@");
              break;
            case 2:
              System.out.print("&");
              break;
            default:
              System.out.print(" ");
          }
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
    //tronco

    for (int i = 0; i < altura / 2; i++) {
      for (int e = 0; e < altura * 2 - 1; e++) {
        if (e == altura - 2 || e == altura) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
