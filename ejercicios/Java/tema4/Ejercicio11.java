/**
 * 4. Sentencia condicional
 *
 * 11. Escribe un programa que dada una hora determinada (horas y minutos), 
       calcule los segundos que faltan para llegar a la medianoche.
 *
 * @author Ángeles Bueno
 */

public class Ejercicio11 {
  public static void main(String[] args) {
    
    System.out.print("Escribe una hora del día en sistema horario de 24 horas: ");
    int hora = Integer.parseInt(System.console().readLine());
    System.out.print("Escribe los minutos de esa hora del día: ");
    int minutos = Integer.parseInt(System.console().readLine());
    
    final int segundosDia = 86400;
    final int segundosHora = 3600;
    final int segundosMinuto = 60;
    
    
    if ((hora >= 0) && (hora <= 23)) { 
    System.out.print("Faltan " +  (segundosDia - (hora * segundosHora)) + " segundos para acabar el día");
    } else {
        System.out.print("Ese horario no existe.");
      }
      
    if ((minutos <=0) && (minutos >=59)) {
    System.out.print("Ese horario no existe.");
    } else {
      }
      
  }
}
