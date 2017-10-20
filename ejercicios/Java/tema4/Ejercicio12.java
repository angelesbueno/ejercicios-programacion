/**
 * 4. Sentencia condicional
 *
 * 12. Realiza un minicuestionario con 10 preguntas tipo test sobre las asignaturas 
       que se imparten en el curso. Cada pregunta acertada sumará un punto. 
       El programa mostrará al final la calificación obtenida. 
       Pásale el minicuestionario a tus compañeros y pídeles que lo hagan para 
       ver qué tal andan de conocimientos en las diferentes asignaturas del curso.
 *
 * @author Ángeles Bueno
 */

public class Ejercicio12 {
  public static void main(String[] args) { 
    
    System.out.print("¿2 + 2 son 3, 4 ó 5?: ");
    int respuesta1 = Integer.parseInt(System.console().readLine());
    System.out.print("¿4 + 2 son 3, 4 ó 6?: ");
    int respuesta2 = Integer.parseInt(System.console().readLine());
    System.out.print("¿7 + 2 son 9, 4 ó 6?: ");
    int respuesta3 = Integer.parseInt(System.console().readLine());
    System.out.print("¿4 + 10 son 20, 14 ó 48?: ");
    int respuesta4 = Integer.parseInt(System.console().readLine());
    System.out.print("¿8 + 4 son 22, 23 ó 12?: ");
    int respuesta5 = Integer.parseInt(System.console().readLine());
    System.out.print("¿14 + 2 son 16, 60 ó 3?: ");
    int respuesta6 = Integer.parseInt(System.console().readLine());
    System.out.print("¿40 + 2 son 35, 42 ó 69?: ");
    int respuesta7 = Integer.parseInt(System.console().readLine());
    System.out.print("¿20 + 2 son 10, 80 ó 22?: ");
    int respuesta8 = Integer.parseInt(System.console().readLine());
    System.out.print("¿50 + 5 son 30, 55 ó 66?: ");
    int respuesta9 = Integer.parseInt(System.console().readLine());
    System.out.print("¿1 + 7 son 4, 8 ó 6?: ");
    int respuesta10 = Integer.parseInt(System.console().readLine());
    
    int respuestaFinal1;
    int respuestaFinal2;
    int respuestaFinal3;
    int respuestaFinal4;
    int respuestaFinal5;
    int respuestaFinal6;
    int respuestaFinal7;
    int respuestaFinal8;
    int respuestaFinal9;
    int respuestaFinal10;
    
    
    if (respuesta1 == 4) {
      respuestaFinal1 = 1;
    } else {
      respuestaFinal1 = 0;
    }
    
    if (respuesta2 == 6) {
      respuestaFinal2 = 1;
    } else {
      respuestaFinal2 = 0;
    }
    
    if (respuesta3 == 9) {
      respuestaFinal3 = 1;
    } else {
      respuestaFinal3 = 0;
    }
    
    if (respuesta4 == 14) {
      respuestaFinal4 = 1;
    } else {
      respuestaFinal4 = 0;
    }
    
    if (respuesta5 == 12) {
      respuestaFinal5 = 1;
    } else {
      respuestaFinal5 = 0;
    }
    
    if (respuesta6 == 16) {
      respuestaFinal6 = 1;
    } else {
      respuestaFinal6 = 0;
    }
    
    if (respuesta7 == 42) {
      respuestaFinal7 = 1;
    } else {
      respuestaFinal7 = 0;
    }
    
    if (respuesta8 == 22) {
      respuestaFinal8 = 1;
    } else {
      respuestaFinal8 = 0;
    }
    
    if (respuesta9 == 55) {
      respuestaFinal9 = 1;
    } else {
      respuestaFinal9 = 0;
    }
    
    if (respuesta10 == 8) {
      respuestaFinal10 = 1;
    } else {
      respuestaFinal10 = 0;
    }
    
    System.out.print("Tu puntuación es de " + (respuestaFinal1 + respuestaFinal2
    + respuestaFinal3 + respuestaFinal4 + respuestaFinal5 + respuestaFinal6 
    + respuestaFinal7 + respuestaFinal8 + respuestaFinal9 + respuestaFinal10) 
    + " puntos.");
    
  }
}
    
    
