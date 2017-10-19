/**
 * 4. Sentencia condicional
 *
 * 10. Escribe un programa que nos diga el horóscopo a partir del día y el 
 *     mes de nacimiento.
 *
 * @author Ángeles Bueno
 */


 public class Ejercicio10 {
  public static void main(String[] args) {
    
    System.out.print("Escribe el número de tu día de nacimiento: ");
    int dia = Integer.parseInt(System.console().readLine());
    System.out.print("Escribe el número de tu mes de nacimiento: ");
    int mes = Integer.parseInt(System.console().readLine());
  
    String horoscopo = "";
    
    switch (mes) {
      case 1:
        if ((dia>=21) && (dia<=31)) {
          horoscopo = "acuario";
        } else {
          horoscopo = "capricornio";
        }
        break;
        
      case 2:
        if (dia <= 18) {
          horoscopo = "acuario";
        } else {
          horoscopo = "piscis";
        }
        break;
        
      case 3:
        if (dia <= 20) {
          horoscopo = "piscis";
        } else {
          horoscopo = "aries";
        }
        break;
        
      case 4: 
        if (dia <= 20) {
          horoscopo = "aries";
        } else {
          horoscopo = "tauro";
        }
        break;
        
      case 5:
        if (dia <= 21) {
          horoscopo ="tauro";
        } else {
          horoscopo ="géminis";
        }
        break;
        
      case 6:
        if (dia <= 21) {
          horoscopo = "géminis";
        } else {
          horoscopo = "cáncer";
        }
        break;
        
      case 7:
        if (dia <=22) {
          horoscopo = "cáncer";
        } else {
          horoscopo = "leo";
        }
        break;
        
      case 8:
        if (dia <= 22) {
          horoscopo = "leo";
        } else {
          horoscopo ="virgo";
        }
        break;
        
      case 9:
        if (dia <=23) {
          horoscopo ="virgo";
        } else {
          horoscopo ="libra";
        }
        break;
        
      case 10:
        if (dia <= 22) {
          horoscopo ="libra";
        } else {
          horoscopo ="escorpio";
        }
        break;
        
      case 11:
        if (dia <=22) {
          horoscopo = "escorpio";
        } else {
          horoscopo = "sagitario";
        }
        break;
        
      case 12:
        if (dia <=21) {
          horoscopo ="sagitario";
        } else {
          horoscopo ="capricornio";
        }
        break;
        
      default:
    }    
        
    System.out.println("Tu horóscopo es " + horoscopo); 
    
  }
}
