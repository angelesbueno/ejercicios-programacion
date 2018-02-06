
package ejerciciocaballo;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class Persona {
  
  // atributos de la clase persona
  
  String nombre;
  String apellidos;
  double peso;
  
  // constructor 

  public Persona(String nombre, String apellidos) {
    this.nombre = nombre;
    this.apellidos = apellidos;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setApellidos(String apellidos) {
    this.apellidos = apellidos;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

  public String getNombre() {
    return nombre;
  }

  public String getApellidos() {
    return apellidos;
  }

  public double getPeso() {
    return peso;
  }

  @Override
  public String toString() {
    return "Persona:" + "nombre:" + nombre + ", apellidos:" + apellidos + ", peso:" + peso + "Kg.";
  }
  
  public void espolea(String actitud) {
    
    if (actitud.equals("agresiva")) {
      System.out.println("Yiiiiiijaaaa");
    
    } else if (actitud.equals("cariñosa")) {
      System.out.println("Corre caballito");
    
    } else {
      System.out.println("Arre arre");
    }
  }

}
