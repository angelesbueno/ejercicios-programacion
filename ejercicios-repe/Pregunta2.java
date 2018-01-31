/**
 * 5. Bucles.
 *
 * 2. La tienda online BanderaDeEspaña.es vende banderas personalizadas de la máxima calidad y nos
      ha pedido hacer un configurador que calcule el precio según el alto y el ancho. El precio base de una
      bandera es de un céntimo de euro el centímetro cuadrado. Si la queremos con un escudo bordado, el
      precio se incrementa en 2.50 € independientemente del tamaño. Los gastos de envío son 3.25 €. El
      IVA ya está incluido en todas las tarifas.
 *
 * @author Ángeles Bueno
 */
 
public class Pregunta2 {
  public static void main(String[] args) {

    System.out.print("Introduzca la altura de la bandera en cm: ");
    int altura = Integer.parseInt(System.console().readLine());
    
    System.out.print("Ahora introduzca la anchura: ");
    int anchura = Integer.parseInt(System.console().readLine());
    
    System.out.print("¿Quiere escudo bordado? (s/n): ");
    String escudo = System.console().readLine();
    
    int precioBase = altura * anchura;
    double gastosDeEnvio = 3.25;
    double precioEscudo = 2.50;
      
    System.out.println("Gracias. Aquí tiene el desglose de su compra.");
    System.out.println("Bandera de " + precioBase + " centímetros cuadrados: " + (double) precioBase / 100 + " €");
    
    if (escudo.equals ("s")) {
      System.out.println("Con escudo: " + precioEscudo);
    
    } else {
      System.out.println("Sin escudo: 0.0");
      precioEscudo = 0.0;
    }
    
    System.out.println("Gastos de envío: 3.25"); 
    System.out.println("Total: " + (precioBase / 100 + precioEscudo + gastosDeEnvio));
    
  }
}
    
    
    
    
    
    
