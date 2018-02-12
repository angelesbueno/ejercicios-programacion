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

  // constructor
  
  public Coche() {
  }

  public Coche(int kilometrosRecorridos) {
    super(kilometrosRecorridos);
  }

  public Coche(String nombre) {
    super(nombre);
  }
  
  // método quema rueda
 
  public void quemaRueda() {
    System.out.println("Mira cómo quemo rueda con el coche: XIIIIIIIII!");
  }
}
  

