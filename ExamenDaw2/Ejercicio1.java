 /** Examen DAW 2.
 *
 * Ejercicio 1
 *
 * @author Ángeles Bueno
 */
 
public class Ejercicio1 {
  public static void main(String[] args) {
    
    double total = 0;
    int tamaño = 0;
    String extraQueso = "";
    double precioBase = 0;
    double precioIngredientes = 0;
    double precioQueso = 0;
    double descuento = 0;
    
    System.out.println("Nuevo pedido de pizza.");
    System.out.print("Seleccione el tamaño. 1. Pequeña. 2. Mediana. 3. Familiar: ");
    tamaño = Integer.parseInt(System.console().readLine());
    System.out.print("¿Cuántos ingredientes quiere?: ");
    int numIngredientes = Integer.parseInt(System.console().readLine());
    System.out.print("¿Quiere extra de queso? (s/n): ");
    extraQueso = System.console().readLine();
    
    switch (tamaño) {
      
      case 1:
      
      precioBase = 8;
      break;
      
      case 2:
      
      precioBase = 11;
      break;
      
      case 3:
      
      precioBase = 14;
      break;
      
    }
      
    if (numIngredientes <= 3) {
      precioIngredientes = 0;
    } else {
        precioIngredientes = (numIngredientes - 3) * 2;
      }
      
    if (extraQueso.equals ("s")) {
      precioQueso = 3;
    } else {
        precioQueso = 0;
      }
      
    total = precioBase + precioQueso + precioIngredientes;
    System.out.println(total);
    
    if (total > 25) {
      
      descuento = - (10 * total / 100);
      total = total + descuento;
      
    }
    
    
    System.out.println("Gracias, aquí tiene su ticket.");
    System.out.println("Pizza Jat");
    System.out.println("Precio base                " + precioBase);
    System.out.println("Ingredientes  (" + numIngredientes + ")       " + precioIngredientes);
    
    if (extraQueso.equals ("s")) {
      System.out.println("Extra de queso             " + precioQueso);
    }
    
    if (descuento != 0) {
      System.out.println("Descuento             " + descuento);
    }
    System.out.println("Total             " + total);
    
  }
}
    
    
    
    
    
    
    
    
