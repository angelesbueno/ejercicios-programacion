/**
 * 4. Sentencia condicional
 *
 * 22. Realiza un programa que, dado un día de la semana (de lunes a viernes) 
 *     y una hora (horas y minutos), calcule cuántos minutos faltan para el fin de 
 *     semana. Se considerará que el fin de semana comienza el viernes a las 
 *     15:00h. Se da por hecho que el usuario introducirá un día y hora correctos, 
 *     anterior al viernes a las 15:00h.
 *
 * @author Ángeles Bueno
 */
 
 
public class Ejercicio22 {
  public static void main(String[] args) {
    System.out.print("Dime un día de la semana (de lunes a viernes): ");
    String dia = System.console().readLine().toLowerCase();
    System.out.print("Dime una hora de ese día (de 0 a 23): ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Dime los minutos de esa hora (de 0 a 59): ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    int diaNumerico = 0;
    int minutosTotales = 6660;
    int minutosAhora = ((diaNumerico * 24 * 60) + (hora * 60) + minutos);
    
    switch (dia) {
      
      case "lunes":
      diaNumerico = 0;
      break;
      
      case "martes":
      diaNumerico = 1;
      break;
      
      case "miércoles":
      case "miercoles":
      diaNumerico = 2;
      break;
      
      case "jueves":
      diaNumerico = 3;
      break;
      
      case "viernes":
      diaNumerico = 4;
      break;
      
      default:
    }
    
    System.out.print("Faltan " + (minutosTotales - minutosAhora) + " minutos para llegar al fin de semana.");
  }
}
    
      
      
        
    
  
