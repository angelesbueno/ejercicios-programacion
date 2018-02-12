/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class GatoNuevo{
  
  // atributos
  
  private String nombre;
  private String color;
  private String raza;
  
  // constructor

  public GatoNuevo() {
    
  }
  
  // setter 

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }
  
  // getter

  public String getNombre() {
    return nombre;
  }

  public String getColor() {
    return color;
  }

  public String getRaza() {
    return raza;
  }
  
  // toString

  @Override
  public String toString() {
    return nombre + ", color=" + color + ", raza=" + raza;
  }
}
