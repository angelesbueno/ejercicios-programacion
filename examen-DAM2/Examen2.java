 /** Examen DAM 2.
 *
 * Ejercicio 2.
 *
 * @author Ángeles Bueno
 */
 
public class Examen2 {
  public static void main(String[] args) {
    
    int [] primavera = new int[16];
    int [] verano = new int[21];
    int [] otono = new int[11];
    int [] invierno = new int[26];
    int tempMinima = 0;
    int tempMaxima = 0;
    int minAbPrimavera = 15;
    int minAbVerano = 25;
    int minAbOtono = 20;
    int minAbInvierno = 0;
    int SoleadoNubladoNum = 0;
    String SoleadoNublado = "";
    
    for (int i = 0; i < 16; i++) {
      primavera[i] = minAbPrimavera;
      minAbPrimavera ++;
    }
    for (int i = 0; i < 21; i++) {
      verano[i] = minAbVerano;
      minAbVerano ++;
    }
    for (int i = 0; i < 11; i++) {
      otono[i] = minAbOtono;
      minAbOtono ++;
    }
    for (int i = 0; i < 26; i++) {
      invierno[i] = minAbInvierno;
      minAbInvierno ++;
    }
    
    System.out.println("1. Primavera");
    System.out.println("2. Verano");
    System.out.println("3. Otoño");
    System.out.println("4. Invierno");
    System.out.print("Seleccione la estación del año: ");
    int eleccion = Integer.parseInt(System.console().readLine());
    System.out.println();
    
    switch (eleccion) {
      case 1://primavera
        tempMaxima = ((int)(Math.random() * 16) + primavera[0]);
        tempMinima = ((int)(Math.random() * (tempMaxima - primavera[0]) + primavera[0]));
        SoleadoNubladoNum = ((int)(Math.random() * 10) + 1);
        switch (SoleadoNubladoNum) {
          case 1:
            SoleadoNublado = "Soleado";
            break;
          case 2:
            SoleadoNublado = "Soleado";
            break;
          case 3:
            SoleadoNublado = "Soleado";
            break;
          case 4:
            SoleadoNublado = "Soleado";
            break;
          case 5:
            SoleadoNublado = "Soleado";
            break;
          case 6:
            SoleadoNublado = "Soleado";
            break;
          case 7:
            SoleadoNublado = "Nublado";
            break;
          case 8:
            SoleadoNublado = "Nublado";
            break;
          case 9:
            SoleadoNublado = "Nublado";
            break;
          case 10:
            SoleadoNublado = "Nublado";
            break;
          default:
        }
        break;
            
      case 2: //verano
        tempMaxima = ((int)(Math.random() * 21) + verano[0]);
        tempMinima = ((int)(Math.random() * (tempMaxima - verano[0]) + verano[0]));
        SoleadoNubladoNum = ((int)(Math.random() * 10) + 1);
        switch (SoleadoNubladoNum) {
          case 1:
            SoleadoNublado = "Soleado";
            break;
          case 2:
            SoleadoNublado = "Soleado";
            break;
          case 3:
            SoleadoNublado = "Soleado";
            break;
          case 4:
            SoleadoNublado = "Soleado";
            break;
          case 5:
            SoleadoNublado = "Soleado";
            break;
          case 6:
            SoleadoNublado = "Soleado";
            break;
          case 7:
            SoleadoNublado = "Soleado";
            break;
          case 8:
            SoleadoNublado = "Soleado";
            break;
          case 9:
            SoleadoNublado = "Nublado";
            break;
          case 10:
            SoleadoNublado = "Nublado";
            break;
          default:
        }
        break;
      case 3: //otoño
        tempMaxima = ((int)(Math.random() * 11) + otono[0]);
        tempMinima = ((int)(Math.random() * (tempMaxima - otono[0]) + otono[0]));
        SoleadoNubladoNum = ((int)(Math.random() * 10) + 1);
        switch (SoleadoNubladoNum) {
          case 1:
            SoleadoNublado = "Soleado";
            break;
          case 2:
            SoleadoNublado = "Soleado";
            break;
          case 3:
            SoleadoNublado = "Soleado";
            break;
          case 4:
            SoleadoNublado = "Soleado";
            break;
          case 5:
            SoleadoNublado = "Nublado";
            break;
          case 6:
            SoleadoNublado = "Nublado";
            break;
          case 7:
            SoleadoNublado = "Nublado";
            break;
          case 8:
            SoleadoNublado = "Nublado";
            break;
          case 9:
            SoleadoNublado = "Nublado";
            break;
          case 10:
            SoleadoNublado = "Nublado";
            break;
          default:
        }
        break;
      case 4: //invierno
        tempMaxima = ((int)(Math.random() * 26) + invierno[0]);
        tempMinima = ((int)(Math.random() * (tempMaxima - invierno[0]) + invierno[0]));
        SoleadoNubladoNum = ((int)(Math.random() * 10) + 1);
        switch (SoleadoNubladoNum) {
          case 1:
            SoleadoNublado = "Soleado";
            break;
          case 2:
            SoleadoNublado = "Soleado";
            break;
          case 3:
            SoleadoNublado = "Nublado";
            break;
          case 4:
            SoleadoNublado = "Nublado";
            break;
          case 5:
            SoleadoNublado = "Nublado";
            break;
          case 6:
            SoleadoNublado = "Nublado";
            break;
          case 7:
            SoleadoNublado = "Nublado";
            break;
          case 8:
            SoleadoNublado = "Nublado";
            break;
          case 9:
            SoleadoNublado = "Nublado";
            break;
          case 10:
            SoleadoNublado = "Nublado";
            break;
          default:
        }
        break;
      default:
    }
    System.out.println("Previsión del tiempo para mañana");
    System.out.println("--------------------------------");
    System.out.println("Temperatura mínima: "+ tempMinima + "ºC");
    System.out.println("Temperatura máxima: "+ tempMaxima + "ºC");
    System.out.println(SoleadoNublado);
  }
}
      
