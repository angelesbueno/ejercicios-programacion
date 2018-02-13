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

  // atributo de instancia
  
  private int kilometrosRecorridos;
  
  // constructor
  
  public Bicicleta() {
  }
 
  public Bicicleta(int kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }
  
  // métodos concretos bicicleta
  
  public void hazCaballito() {
    System.out.println("Mira cómo hago el caballito: FIUUUUUUUUU!");
  }
  
  public void anda(int km) {
    kilometrosRecorridos += km;
    super.setKilometrosTotales(km);
    
  }
  
  // getter

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }
  
  
  // setter

  public void setKilometrosRecorridos(int kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }
  
  
  
  
}
