/**
 * Examen Turno 1.
 *
 * Ejercicio 4.
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio4 {
  public static void main(String[] args) {
    
    int aerobicoNum = ((int)(Math.random() * 3) + 1);
    String aerobico = "";
    int musculoGrandeNum = ((int)(Math.random() * 3) + 1);
    String musculoGrande = "";
    int musculoPequeñoNum = ((int)(Math.random() * 3) + 1);
    String musculoPequeño = "";
    int finNum = ((int)(Math.random() * 2) + 1);
    String fin = "";
    int finEjercicioNum = 0;
    String finEjercicio = "";
    
    switch (aerobicoNum) {
      case 1:
        aerobico = "bicicleta";
        break;
      case 2:
        aerobico = "elíptica";
        break;
      case 3:
        aerobico = "cinta";
        break;
      default:
    }
    
    switch (musculoGrandeNum) {
      case 1:
        musculoGrande = "espalda";
        break;
      case 2:
        musculoGrande = "pecho";
        break;
      case 3:
        musculoGrande = "piernas";
        break;
      default:
    }
    switch (musculoPequeñoNum) {
      case 1:
        musculoPequeño = "bíceps";
        break;
      case 2:
        musculoPequeño = "tríceps";
        break;
      case 3:
        musculoPequeño = "hombros";
        break;
      default:
    }
    System.out.print("Introduzca el día de la semana: ");
    String diaIntroducido = System.console().readLine().toLowerCase();
    System.out.println();
    if (diaIntroducido.equals("miércoles") || diaIntroducido.equals("miercoles") || diaIntroducido.equals("domingo")) { 
      System.out.print("Hoy es día de descanso.");
    } else {
      if (finNum == 1) {
        System.out.print("Su entrenamiento de hoy es el siguiente: ");
        System.out.print(aerobico + ", " + musculoGrande + ", " + musculoPequeño + " y abdominales.");
      } else {
        finEjercicioNum = ((int)(Math.random() * 3) + 1);
        if (aerobicoNum == finEjercicioNum) {
          int i = 0;
          while (aerobicoNum == finEjercicioNum) {
            finEjercicioNum = ((int)(Math.random() * 3) + 1); 
            i ++;
          }
          switch (finEjercicioNum) {
          case 1:
            finEjercicio = "bicicleta";
            break;
          case 2:
            finEjercicio = "elíptica";
            break;
          case 3:
            finEjercicio = "cinta";
            break;
          default:
          }
        System.out.print("Su entrenamiento de hoy es el siguiente: ");
        System.out.print(aerobico + ", " + musculoGrande + ", " + musculoPequeño + " y " + finEjercicio + ".");
        } else {
          switch (finEjercicioNum) {
          case 1:
            finEjercicio = "bicicleta";
            break;
          case 2:
            finEjercicio = "elíptica";
            break;
          case 3:
            finEjercicio = "cinta";
            break;
          default:
          }
          System.out.print("Su entrenamiento de hoy es el siguiente: ");
          System.out.print(aerobico + ", " + musculoGrande + ", " + musculoPequeño + " y " + finEjercicio + ".");
        }
      }
    }
  }
}
