/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class Caballo {
  String nombre;
  double peso;//peso en kg
  int altura;//altura en cm
  String color;
  int velocidad = 0;
  String raza;
  String sillaDeMontar;
  Persona jinete;

  public Caballo(String nombre) {
    this.nombre = nombre;
  }
  
  public String getNombre() {
    return nombre;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public int getAltura() {
    return altura;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public int getVelocidad() {
    return velocidad;
  }

  public void setVelocidad(int velocidad) {
    this.velocidad = velocidad;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getSillaDeMontar() {
    return sillaDeMontar;
  }

  public void setSillaDeMontar(String sillaDeMontar) {
    this.sillaDeMontar = sillaDeMontar;
  }

  public Persona getJinete() {
    return jinete;
  }

  public void setJinete(Persona jinete) {
    this.jinete = jinete;
  }
  
  

  @Override
  public String toString() {
    return "Caballo\n --------\n" + "nombre: " + nombre + "\npeso: " + peso + "\naltura: " + altura + "\ncolor: " + color + "\nvelocidad: " + velocidad + "\nraza: " + raza + "\nsillaDeMontar: " + sillaDeMontar;
  }
}
