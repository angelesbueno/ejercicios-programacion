/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class Pizza {
  
  // atributos
  
  private String tamano;
  private String tipo;
  private String  estado;
  private static int totalPedidas;
  private static int totalServidas;
  private boolean esServida = false;
  
  // constructor
  
  public Pizza() {
    
  }

  public Pizza(String tipo, String tamano) {
    this.tamano = tamano;
    this.tipo = tipo;
    this.estado = "pedida";
    totalPedidas ++;
    
  }
  
  // setter

  public void setTamano(String tamano) {
    this.tamano = tamano;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public void setTotalPedidas(int totalPedidas) {
    this.totalPedidas = totalPedidas;
  }

  public void setTotalServidas(int totalServidas) {
    this.totalServidas = totalServidas;
  }
  
  // getter 

  public String getTamano() {
    return tamano;
  }

  public String getTipo() {
    return tipo;
  }

  public String getEstado() {
    return estado;
  }

  public static int getTotalPedidas() {
    return totalPedidas;
  }

  public static int getTotalServidas() {
    return totalServidas;
  }
  
  // toString

  @Override
  public String toString() {
    return "pizza " + tipo + " " + tamano + ", " +  estado;
  }
  
  // métodos específicos
  
  public void sirve() {
    if (esServida) {
      System.out.println("esa pizza ya se ha servido");
    } else {
      totalServidas ++;
      esServida = true;
      this.estado = "servida";
    }
  }
  
  
  
  
  
  
  
  
  
}
