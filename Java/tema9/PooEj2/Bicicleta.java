/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class Bicicleta extends Vehiculo{

  // constructor
  
  public Bicicleta() {
  }
  
  public Bicicleta(String nombre) {
    super(nombre);
  }

  public Bicicleta(int kilometrosRecorridos) {
    super(kilometrosRecorridos);
  }
  
  // métodos concretos bicicleta
  
  public void hazCaballito() {
    System.out.println("Mira cómo hago el caballito: FIUUUUUUUUU!");
  }
}
