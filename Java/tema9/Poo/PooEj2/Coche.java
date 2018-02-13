/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class Coche extends Vehiculo{
  
  // atributo de coche
  
  private static int kilometrosRecorridos;

  // constructor
  
  public Coche() {
  }

  public Coche(int kilometrosRecorridos) {
    this.kilometrosRecorridos= kilometrosRecorridos;
  }

  // método quema rueda
 
  public void quemaRueda() {
    System.out.println("Mira cómo quemo rueda con el coche: XIIIIIIIII!");
  }
  
  public void anda(int km) {
    kilometrosRecorridos += km;
    super.setKilometrosTotales(km);
  }
  
  // setter

  public static void setKilometrosRecorridos(int kilometrosRecorridos) {
    Coche.kilometrosRecorridos = kilometrosRecorridos;
  }
  
  // getter

  public static int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }
}
  

