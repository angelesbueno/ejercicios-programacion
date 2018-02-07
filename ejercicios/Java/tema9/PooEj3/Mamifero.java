/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej3;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class Mamifero extends Animal {
  int numMamas;
  int tiempoGestacion;

  public Mamifero(int numMamas, int tiempoGestacion, String nombre) {
    super(nombre);
    this.numMamas = numMamas;
    this.tiempoGestacion = tiempoGestacion;
  }
  
  public Mamifero(String nombre) {
    super(nombre);
  }
}