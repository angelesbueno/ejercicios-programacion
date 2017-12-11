 /** Examen DAM 2.
 *
 * Escribe un programa que pida al usuario introducir sus 5 números favoritos. Estos números se deben
   guardar en un array. A continuación, se mostrarán todos los números del 1 al 100 junto con “ME
   GUSTA” o “no me gusta” según si el número en cuestión está o no está el el array de favoritos tal y
   como se muestra en el ejemplo. Nótese que “ME GUSTA” está en mayúsculas para que se pueda
   distinguir bien. Por cada 5 números mostrados hay un salto de línea.
 *
 * @author Ángeles Bueno
 */
 
public class Examen2 {
  public static void main(String[] args) {
    
    int [] numeroFavorito = new int[5];
    System.out.println("Por favor, introduzca sus 5 números favoritos: ");
    for (int i = 0; i < 5; i++) {
      numeroFavorito[i] = Integer.parseInt(System.console().readLine());
    }
    System.out.println();
  
    for (int i = 1; i <= 100; i++) {
      if ((i == numeroFavorito[0]) || (i == numeroFavorito[1]) || (i == numeroFavorito[2]) || (i == numeroFavorito[3]) || (i == numeroFavorito[4])) {
        System.out.print(i + " ME GUSTA, ");
      } else {
        System.out.print(i + " no me gusta, ");
      }
      
      if (i % 5 == 0) {
        System.out.println();
      }
    }
       
  }
}
