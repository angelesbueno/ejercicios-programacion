/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class Tiempo {
  
  private int horas;
  private int minutos;
  private int segundos;
  
  // constructor

  public Tiempo(int horas, int minutos, int segundos) {
    this.horas = horas;
    this.minutos = minutos;
    this.segundos = segundos;
  }
  
  // setter

  public void setHoras(int horas) {
    this.horas = horas;
  }

  public void setMinutos(int minutos) {
    this.minutos = minutos;
  }

  public void setSegundos(int segundos) {
    this.segundos = segundos;
  }
  
  // getter

  public int getHoras() {
    return horas;
  }

  public int getMinutos() {
    return minutos;
  }

  public int getSegundos() {
    return segundos;
  }
  
  // toString

  @Override
  public String toString() {
    return horas + "h " + minutos + "m " + segundos + "s";
  }
  
  // métodos suma y resta
  
  public Tiempo suma(Tiempo otroTiempo, int h, int m, int s) {
    int resulHoras = this.horas + h;
    int resulMinutos = this.minutos + m;
    int resulSegundos = this.segundos + s;
    
    if (this.segundos + s >= 60) {
      resulMinutos ++;
      resulSegundos = (this.segundos + s) - 60;
    }
    
    if (this.minutos + m >= 60) {
      resulHoras ++;
      resulMinutos = (this.minutos + m) - 60;
    }
 
    return new Tiempo(resulHoras, resulMinutos, resulSegundos);
  }
  
  public Tiempo resta(Tiempo otroTiempo, int h, int m, int s) {
    int resulHoras = this.horas - h;
    int resulMinutos = this.minutos - m;
    int resulSegundos = this.segundos - s;
    
    if (this.horas - h == 0) {
      resulHoras = 0;
    }
    
    if (this.horas - h < 0) {
      resulHoras = 0;
      resulMinutos = 0;
      resulSegundos = 0;
    }
    
    if (this.minutos - m == 0) {
      resulMinutos = 0;
    }
    
    if (this.minutos - m < 0) {
      resulMinutos = 0;
      resulSegundos = 0;
    }
    
    if (this.segundos - s <= 0) {
      resulSegundos = 0;
    }
    
    return new Tiempo(resulHoras, resulMinutos, resulSegundos);
  }
}
