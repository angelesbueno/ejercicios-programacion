/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciocaballo;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class Caballo {
  
  //atributos de la clase Caballo
    double peso; // peso en kg.
    int altura; // altura en cm.
    String edad;
    String color;
    String nombre; 
    Persona jinete;

  public Caballo(String nombre) {
    this.nombre = nombre;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public void setAltura(int altura) {
    this.altura = altura;
  }

  public void setEdad(String edad) {
    this.edad = edad;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public void setJinete(Persona jinete) {
    this.jinete = jinete;
  }

  @Override
  public String toString() {
    return "Caballo{" + "color=" + color + ", nombre=" + nombre + ", jinete=" + jinete + '}';
  }

  public double getPeso() {
    return peso;
  }
  
  
}
   
  
  
    
   /** 
  //constructor
  public Caballo (String s) {
    this.color = s;
  }

  
  
  //getter
   public String getSexo() {
    return this.color;
  }
  
  //hace que el caballo relinche
  public void relincha() {
    System.out.println("Yiiiii");
  }
  
  //hace que el caballo sale
  public void salta() {
    System.out.println("Hop");
  }
  
/**
* Hace que el caballo coma.
* A los caballos les gustan las zanahorias, si le damos otra comida
* la rechazará.

  public void come(String comida) {
    if (comida.equals("zanahorias")) {
      System.out.println("Mmmmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como zanahorias");
    }
  }
}
*/
