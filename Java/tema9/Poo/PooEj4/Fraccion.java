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
  private int signo;
  
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
  
  public Fraccion simplifica() {
    
    int s = this.signo;
    int n = this.numerador;
    int d = this.denominador;
      
    for (int i = 2; i < Math.min(this.numerador, this.denominador); i++) {
      while (((n % i) == 0) && ((d % i) == 0)) {
        n /= i;
        d /= i;
      }
    }

    return new Fraccion(s * n, d);
  }
  
  // divide
  
  public Fraccion divide(Fraccion fraccion2, int num, int den) {
    int resulNum = this.numerador * den;
    int resulDen = this.denominador * num;
    return new Fraccion(resulNum, resulDen);
  }
}
