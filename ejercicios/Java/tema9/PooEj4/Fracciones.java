/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej4;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class Fracciones {
  
  // atributos
  
  String nombre;
  int numerador;
  int denominador;
  
  // constructor

  public Fracciones(String nombre) {
    this.nombre = nombre;
  }
  
  // setter

  public void setNumerador(int numerador) {
    this.numerador = numerador;
  }

  public void setDenominador(int denominador) {
    this.denominador = denominador;
  }
  
  // getter

  public int getNumerador() {
    return numerador;
  }

  public int getDenominador() {
    return denominador;
  }
  
  // métodos: invierte, simplifica, multiplica, divide
  
  public void invierte(String orden) {
    switch (orden) {
      case ("hazlo"):
        int aux = numerador;
        int aux2 = denominador;
        System.out.println(aux2);
        System.out.println("-");
        System.out.println(aux);
        break;
      default:
        System.out.println("¿No quieres? vale, me estoy quieta xD");
    }
  }
  
  /*public void multiplica(String orden) {
    switch (orden) {
      case ("hazlo"):
        int resultadoNumerador = 
    }
    
  }*/
}
