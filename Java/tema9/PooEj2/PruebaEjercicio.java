/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ángeles Bueno Aguilar
 */
import java.util.Scanner;
public class PruebaEjercicio {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    Coche coche1 = new Coche();
    Bicicleta bici1 = new Bicicleta();
    
    int opcion = 0;
    
     do {
    
      System.out.println("VEHÍCULOS");
      System.out.println("=========");
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.print("Elige una opción (1-8): ");
      opcion = s.nextInt();
      System.out.println("");

      switch (opcion) {
        case 1: // anda con la bici
          bici1.anda(15);
          System.out.println("Me encanta salir con la bici");
          System.out.println("");
          break;

        case 2: // haz el caballito con la bici
          bici1.hazCaballito();
          System.out.println("");
          break;

        case 3: // anda con el coche
          coche1.anda(133);
          System.out.println("¡Me encanta conducir!");
          System.out.println("");
          break;

        case 4: // quema rueda con el coche
          coche1.quemaRueda();
          System.out.println("");
          break;

        case 5: // ver kms. con la bici
           System.out.println("He andado con la bicicleta " + bici1.getKilometrosRecorridos() + "km/s.");
           System.out.println("");
           break;

        case 6: // ver kms. con el coche
          System.out.println("He andado con el coche " + coche1.getKilometrosRecorridos() + "km/s.");
          System.out.println("");
          break;

        case 7: // ver kilometraje total
          System.out.println("En total, con la bici y con el coche, he recorrido " + Vehiculo.getKilometrosTotales() + "km/s.");
          System.out.println("");
          break;

        default: 
         
      } // switch
    } while (opcion != 8);
  }
}
   
