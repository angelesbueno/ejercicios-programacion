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
public class Animal {
  String nombre;
  String raza;
  String color;
  String sexo;
  int altrua;
  double peso;

  public Animal(String nombre) {
    this.nombre = nombre;
  }
  
  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public int getAltrua() {
    return altrua;
  }

  public void setAltrua(int altrua) {
    this.altrua = altrua;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  @Override
  public String toString() {
    return "Animal{" + "nombre=" + nombre + ", raza=" + raza + 
            ", color=" + color + ", sexo=" + sexo + ", altrua=" + 
            altrua + ", peso=" + peso + '}';
  }
  
  
}

