 /** 
  * Ejercicio 3.
  * 
  * @author Ángeles Bueno
 */
 
public class Ex04aba3 {
  public static void main(String[] args) {
    
    String[] alumnos = new String[6];
    alumnos[0] = "Adrián Aguilar";
    alumnos[1] = "Manuel Alcántara";
    alumnos[2] = "Jorge Alcaraz";
    alumnos[3] = "Joaquín Bello";
    alumnos[4] = "María Margarita Benítez";
    alumnos[5] = "Francisco Casasola";
    int numAleatorio = ((int)(Math.random() * 6));
    
    System.out.print("Le ha tocado salir a... " + alumnos[numAleatorio]);
  }
}
    
    
    
