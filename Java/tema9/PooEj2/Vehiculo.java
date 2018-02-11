/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class Vehiculo {
  
  // atributos de clase: vehiculosCreados, kilometrosTotales.
  
  private static int vehiculosCreados;
  private static int kilometrosTotales;
  
  // atributo de instancia: kilometrosRecorridos, nombre.
  
  private int kilometrosRecorridos;
  private String nombre;
  
  // constructor
  
  public Vehiculo() {
  }

  public Vehiculo(String nombre) {
    this.nombre = nombre;
  }
  
  public Vehiculo(int kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }
  
  // setter

  public static void setVehiculosCreados(int vehiculosCreados) {
    Vehiculo.vehiculosCreados = vehiculosCreados;
  }

  public static void setKilometrosTotales(int kilometrosTotales) {
    Vehiculo.kilometrosTotales = kilometrosTotales;
  }

  public void setKilometrosRecorridos(int kilometrosRecorridos) {
    this.kilometrosRecorridos = kilometrosRecorridos;
  }
  
  // getter

  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }

  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }

  public int getKilometrosRecorridos() {
    return kilometrosRecorridos;
  }
  
  public void anda(int km) {
    kilometrosRecorridos += km;
    kilometrosTotales += km;
  }
  
  // toString

  @Override
  public String toString() {
    return nombre + ": KilometrosRecorridos = " + kilometrosRecorridos;
  }
}
