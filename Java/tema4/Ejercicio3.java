/**
 * 4. Sentencia condicional
 *
 * 3. Escribe un programa en que dado un número del 1 a 7 escriba el 
 *    correspondiente nombre del día de la semana.
 *
 * @author Ángeles Bueno
 */

public class Ejercicio3 {
  public static void main(String[] args) {
    
    System.out.print("Escribe un número del 1 al 7: ");
    int numero = Integer.parseInt(System.console().readLine());
    
    String dia = "";
    
    switch (numero) {
      
      case 1:
      dia = "Lunes";
      break;
      
      case 2:
      dia = "Martes";
      break;
      
      case 3:
      dia = "Miércoles";
      break;
      
      case 4:
      dia = "Jueves";
      break;
      
      case 5:
      dia = "Viernes";
      break;
      
      case 6:
      dia = "Sábado";
      break;
      
      case 7:
      dia = "Domingo";
      break;
      
      default:
      
    }
    
    if ((numero >=1) && (numero <=7)) {
      System.out.print("El número " + numero + " corresponde al día " + dia + " .");
    } else {
      System.out.print("Te dije un número entre el 1 y el 7.");
    }  
    
      
  }
}
