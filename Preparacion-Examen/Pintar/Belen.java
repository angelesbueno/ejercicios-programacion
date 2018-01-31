
/**
 * @author Juan Francisco Bernal Rodríguez
 *
 *
 */
public class Belen {

  public static void main(String[] args) {
    

    final String JESUS = "o"; //este es el punto de referencia y estara entre e =[6,11] para dejar al menos un hueco libre
    final String VIRGEN = "V"; // este se genera aleatoriamente y en funcion de este, se genera jose en el otro lado; entre e=[4,14]
    final String JOSE = "J"; //este se genera en funcion del lado contrario donde este la virgen

    //el belen es un rectangulo de 19 x 4
    
    //las figuras solo van a estar en las posiciones 5 - 7 - 9 - 11 - 13
    
    
    int posJesus;
    int posJose;
    int posVirgen;
    
    
    // va a estar entre las posiciones 6 y 11 (dejando la posicion 5 y 13 libres y asi poder poner otro personaje en el filo)
    do {
      posJesus = (int) (Math.random() * (11 - 6) + 6); 
    } while (posJesus % 2 == 0); // para que este en una posicion impar

    
    //le asignamos a la virgen una posicion entre 5 - 7 - 9 - 11 - 13 que no sea la misma que la der jesú  er fleki
    do {
      posVirgen = (int) (Math.random() * (14 - 4 + 1) + 4);
    } while (posJesus == posVirgen || posVirgen % 2 == 0);


    //se mira en qué lado esta la maria y se genera ar joze en el otro lado
    //Nota: el jesú hace de TOPE, es decir, si jesus esta en la posicion 7 y la virgen en el 9 (a la derecha)
    //      jose solo podra estar entre los espacios 4-5-6, y como tiene que ser impar, pues su posicion sera la 5.
    
    do {
      if (posVirgen > posJesus) { //si esta a la derecha..
        posJose = (int) (Math.random() * (posJesus - 1 - 4) + 4); //posJesus-1 para no incluirla, también se podría poner en la condición del while
      } else {
        posJose = (int) (Math.random() * (14 - posJesus) + posJesus + 1); //posJesus+1 para no incluirla  también se podría poner en la condición del while
      }
    } while (posJose % 2 == 0);
    
    
    //imprime las posiciones de los bichos esos, curiosidad
    System.out.println("je=" + posJesus + "  v=" + posVirgen + " j=" + posJose);
    
    
    
    //El portal es un rectangulo de base = 19 y altura = 4
    
    for (int i = 0; i < 4; i++) { //vamos a tener 4 filas
      for (int e = 0; e < 19; e++) { //vamos a tener 19 columnas (espacios, *, y personajes)
        switch (i) { //como solo hay 4 filas pues se puede hace con esto, sino se haria con ifs
          case 0://PRIMERA FILA
            if (e > 2 && e < 16 && e % 2 != 0) { //si estamos entre la columna 3 y 15 (donde empieza y termina las paredes) y la columna es impar
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
            break;
          case 1: //SEGUNDA FILA
            if (e == 3 || e == 15) { //Solo se pinta las paredes que coinciden con la columna 3 y 15, el resto son espacios
              System.out.print("*");
            } else {
              System.out.print(" ");
            }
            break;
          case 2: //aqui van los personajes
            if (e == 3 || e == 15) { //PINTAMOS LAS PAREDES DE NUEVO
              System.out.print("*");
            } else if (e == posJesus) { //SI ESTAMOS EN LA COLUMNA QUE COINCIDE CON LA POSICION DER JESÚ, PO LO PINTA
              System.out.print(JESUS);
            } else if (e == posJose) { //IGUAL QUE LO ANTERIOR PERO CON JOSE
              System.out.print(JOSE);
            } else if (e == posVirgen) { //LO MISMO CON LA VIRGEN
              System.out.print(VIRGEN);
            } else {
              System.out.print(" "); //SI NO ES PARED NI PERSONAJE PUES PINTA ESPACIOS
            }
            break;
          case 3: //ultima fila, la de los guiones entera
            System.out.print("-");
            break;
        }
      }
      System.out.println(); //un salto de linea para cambiar a la fila siguiente I=0, I=1, I=2...
    }
  }
}
