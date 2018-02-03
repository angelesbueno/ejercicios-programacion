/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class Caballo {
  
  //atributos de la clase Caballo
  String peso;
    String altura;
    String edad;
    String color;
    String nombre; 
    String sexo;
    
  //constructor
  Caballo (String s) {
    this.sexo = s;
  }
  
  //getter
  String getSexo() {
    return this.sexo;
  }
  
  //hace que el caballo relinche
  void relincha() {
    System.out.println("Yiiiii");
  }
  
  //hace que el caballo sale
  void salta() {
    System.out.println("Hop");
  }
  
/**
* Hace que el caballo coma.
* A los caballos les gustan las zanahorias, si le damos otra comida
* la rechazará.
*/
  void come(String comida) {
    if (comida.equals("zanahorias")) {
      System.out.println("Mmmmm, gracias");
    } else {
      System.out.println("Lo siento, yo solo como zanahorias");
    }
  }
}
