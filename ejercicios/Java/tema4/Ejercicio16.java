/**
 * 4. Sentencia condicional
 *
 * 16. Realiza un programa que nos diga si hay probabilidad de que nuestra 
 *     pareja nos está siendo infiel. El programa irá haciendo preguntas que el 
 *     usuario contestará con verdadero o falso. Cada pregunta contestada como 
 *     verdadero sumará 3 puntos. Las preguntas contestadas con falso no suman 
 *     puntos. Utiliza el fichero test_infidelidad.txt para obtener las 
 *     preguntas y las conclusiones del programa.
 *
 * @author Ángeles Bueno
 */

public class Ejercicio16 {
  public static void main(String[] args) {
    
    System.out.println("¿Qué probabilidades hay de que tu pareja te sea infiel?");
    System.out.println("Contesta con V o F (verdadero o falso)");
    System.out.println("Pulsa intro para comenzar");
    System.console().readLine();
    System.out.println("");
    System.out.println("1. Tu pareja parece estar más inquieta de lo normal sin ningún motivo aparente.");
    System.out.print("¿V/F?: ");
    String respuesta1 = System.console().readLine().toLowerCase();
    System.out.println("2. Ha aumentado sus gastos de vestuario.");
    System.out.print("¿V/F?: ");
    String respuesta2 = System.console().readLine().toLowerCase();
    System.out.println("3. Ha perdido el interés que mostraba anteriormente por ti.");
    System.out.print("¿V/F?: ");
    String respuesta3 = System.console().readLine().toLowerCase();
    System.out.println("4. Ahora se afeita y se asea con más frecuencia (si es hombre) o ahora se arregla el pelo y se asea con más frecuencia (si es mujer).");
    System.out.print("¿V/F?: ");
    String respuesta4 = System.console().readLine().toLowerCase();
    System.out.println("5. No te deja que mires la agenda de su teléfono móvil.");
    System.out.print("¿V/F?: ");
    String respuesta5 = System.console().readLine().toLowerCase();
    System.out.println("6. A veces tiene llamadas que dice no querer contestar cuando estás tú delante.");
    System.out.print("¿V/F?: ");
    String respuesta6 = System.console().readLine().toLowerCase();
    System.out.println("7. Últimamente se preocupa más en cuidar la línea y/o estar bronceado/a.");
    System.out.print("¿V/F?: ");
    String respuesta7 = System.console().readLine().toLowerCase();
    System.out.println("8. Muchos días viene tarde después de trabajar porque dice tener mucho más trabajo.");
    System.out.print("¿V/F?: ");
    String respuesta8 = System.console().readLine().toLowerCase();
    System.out.println("9. Has notado que últimamente se perfuma más");
    System.out.print("¿V/F?: ");
    String respuesta9 = System.console().readLine().toLowerCase();
    System.out.println("10. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
    System.out.print("¿V/F?: ");
    String respuesta10 = System.console().readLine().toLowerCase();
    
    int contador = 0;
    
    
    if (respuesta1.equals("v")) {
      contador += 3;
    } else {
        contador += 0;
      }
      
    if (respuesta2.equals("v")) {
      contador += 3;
    } else {
        contador += 0;
      }
      
    if (respuesta3.equals("v")) {
      contador += 3;
    } else {
        contador += 0;
      }
      
    if (respuesta4.equals("v")) {
      contador += 3;
    } else {
        contador += 0;
      }
    
    if (respuesta5.equals("v")) {
      contador += 3;
    } else {
        contador += 0;
      }
      
    if (respuesta6.equals("v")) {
      contador += 3;
    } else {
        contador += 0;
      }
      
    if (respuesta7.equals("v")) {
      contador += 3;
    } else {
        contador += 0;
      }
      
    if (respuesta8.equals("v")) {
      contador += 3;
    } else {
        contador += 0;
      }
      
    if (respuesta9.equals("")) {
      contador += 3;
    } else {
        contador += 0;
      }
      
    if (respuesta10.equals("v")) {
      contador += 3;
    } else {
        contador += 0;
      }
      
    
    /** RESULTADOS */
    
    System.out.println("");
    
    if ((contador >= 0) && (contador <= 10)) {
      System.out.print("¡Enhorabuena! tu pareja parece ser totalmente fiel.");
      
    }
    
    if ((contador >= 11) && (contador <=22)) {
      System.out.print("Quizás exista el peligro de otra persona en su vida o en su mente, aunque seguramente será algo sin importancia. No bajes la guardia.");
    }
    
    if ((contador >= 22) && (contador <= 30)) {
      System.out.print("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indagues un poco más y averigües qué es lo que está pasando por su cabeza.");
    }
    
  }
}
      
  
      
      
      
    
    
