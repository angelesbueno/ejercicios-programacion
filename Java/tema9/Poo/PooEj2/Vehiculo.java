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
  
  // constructor
  
  public Vehiculo() {
  }

  // setter

  public static void setVehiculosCreados(int vehiculosCreados) {
    Vehiculo.vehiculosCreados = vehiculosCreados;
  }

  public static void setKilometrosTotales(int kilometrosTotales) {
    Vehiculo.kilometrosTotales += kilometrosTotales;
  }

  // getter

  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }

  public static int getKilometrosTotales() {
    return kilometrosTotales;
  }
}
