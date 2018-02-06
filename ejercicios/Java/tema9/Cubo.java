/**
 * Definición de la clase Cubo
 * @author Ángeles Bueno Aguilar
 */
public class Cubo {
  
  // atributos
  
  int capacidad;
  int contenido;
  
  // métodos
  
  //constructor
  Cubo(int c) {
    this.capacidad = c;
  }
  
  // métodos getter
  
  int getCapacidad() {
    return.this.capacidad;
  }
  
  int getContenido() {
    return.this.contenido;
  }
  
  // método setter
  
  void setContenido(int litros) {
    this.contenido = litros;
  }
  
  // otros métodos
  
  void vacia() {
    this.contenido = 0;
  }
  
  void llena() {
      this.contenido = this.capacidad;
  }
  
  /**
* Pinta el cubo en la pantalla.
* Se muestran los bordes del cubo con el carácter # y el
* agua que contiene con el carácter ~.
*/

  void pinta() {
    for (int nivel = this.capacidad; nivel > 0; nivel--) {
      if (this.contenido >= nivel) {
        System.out.println("#~~~~#");
      } else {
        System.out.println("##");
      }
    }
    System.out.println("######");
  }
}
