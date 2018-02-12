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
public class Fraccion {
  
  // atributos
 
  int numerador;
  int denominador;
  
  // constructor

  public Fraccion(int numerador, int denominador) {
    this.numerador = numerador;
    this.denominador = denominador;
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

  @Override
  public String toString() {
    return "Fraccion: " + numerador + "/"
      + denominador;
  }
 
  // métodos: invierte, simplifica, multiplica, divide
  
  // invierte
  public Fraccion invierte() {
    return new Fraccion(this.denominador,this.numerador);
  }
  
  // multiplica
  public Fraccion multiplica(Fraccion fraccion2, int num, int den) {
    if(num == 0 || den == 0) {
      System.out.println("Lo siento, esa fracción no se puede multiplicar");
      return null;
    } else {
    int resulNum = this.numerador * num;
    int resulDen = this.denominador * den;
    return new Fraccion(resulNum, resulDen);
    }
  }
  
  // simplifica
  
  // divide
  
  public Fraccion divide(Fraccion fraccion2, int num, int den) {
    int resulNum = this.numerador * den;
    int resulDen = this.denominador * num;
    return new Fraccion(resulNum, resulDen);
  }
}
