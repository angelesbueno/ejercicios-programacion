/**
 * 6. Números aleatorios.
 *
 * 22. Realiza un programa que pinte por pantalla una serpiente con un “serpenteo”
       aleatorio. La cabeza se representará con el carácter @ y se debe colocar
       exactamente en la posición 13 (con 12 espacios delante). A partir de ahí,
       el cuerpo irá serpenteando de la siguiente manera: se generará de forma
       aleatoria un valor entre tres posibles que hará que el siguiente carácter se
       coloque una posición a la izquierda del anterior, alineado con el anterior o una
       posición a la derecha del anterior. La longitud de la serpiente se pedirá por
       teclado y se supone que el usuario introducirá un dato correcto.
 *
 * @author Ángeles Bueno
 */
 
public class Serpiente {
  public static void main(String[] args) {
  
    System.out.print("Por favor, introduzca la longitud de la serpiente en caracteres contando la cabeza: ");
    int longitudIntroducida = Integer.parseInt(System.console().readLine());
    int altura = 1;
    int espacios = 12;
    
    System.out.println("            @");
    
    while (altura <= longitudIntroducida - 1) {

      espacios += ((int)(Math.random() * 3) -1);

      for (int i = 0; i < espacios; i++) {
        
          System.out.print(" ");
      }
      System.out.println("*");
      altura++;
    }
  }
}

 
