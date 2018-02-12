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
public class PruebaEntradas {
  public static void main(String[] args) {
    
    Zona principal = new Zona(1000);
    Zona compraVenta = new Zona(200);
    Zona vip = new Zona(25);
    
    Scanner s = new Scanner(System.in);
    int opcion = 0;
    
    do {
      
      System.out.println("1. Mostrar número de entradas libres");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      System.out.print("Elige una opción: ");
      opcion = s.nextInt();
      System.out.println("");
      switch (opcion) {
        case 1:
          System.out.println("En la zona principal quedan " + principal.getEntradasPorVender() + " entradas libres");
          System.out.println("En la zona de compra-venta quedan " + compraVenta.getEntradasPorVender() + " entradas libres");
          System.out.println("En la zona VIP quedan " + vip.getEntradasPorVender() + " entradas libres");
          System.out.println("");
          break;
          
        case 2: 
          System.out.print("¿Para qué zona quieres las entradas? (principal=1, compra-venta=2, Vip=3): ");
          int eleccionZona = s.nextInt();
          System.out.print("¿Cuántas quieres?: ");
          int cantidadSolicitad = s.nextInt();
          switch (eleccionZona) {
            case 1:
              principal.vender(cantidadSolicitad);
              break;
            case 2:
              compraVenta.vender(cantidadSolicitad);
              break;
            case 3:
              vip.vender(cantidadSolicitad);
              break;
            default:
          }
        default:
      }
    } while (opcion != 3);
  }
}
