/**
 * 6. Números aleatorios.
 *
 * 20. Realiza un programa que pinte por pantalla una cuba con cierta cantidad de
       agua. La capacidad será indicada por el usuario. La cuba se llenará con una
       cantidad aleatoria de agua que puede ir entre 0 y la capacidad máxima que
       pueda admitir. El ancho de la cuba no varía.
 *
 * @author Ángeles Bueno
 */
 
public class Cuba {
  public static void main(String[] args) {
    
    System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
    int capacidadIntroducida = Integer.parseInt(System.console().readLine());
    System.out.println();
    int cantidadAgua = ((int)(Math.random() * capacidadIntroducida));
    int altura = 1; 
    int espacioSinAgua = capacidadIntroducida - cantidadAgua; 
    

    
    while (altura <= capacidadIntroducida) {
      
      if (cantidadAgua == 0) {

        System.out.println("*    *");
        
      
      } else {
        
          for (int i = 1; i <= espacioSinAgua; i++) {
            
            System.out.println("*    *");
            altura++;
          }
      
          for (int j = 1; j <= cantidadAgua; j++) {
            
            System.out.println("*====*");
            altura++;
          }
        }  
      altura ++;
    }
    
    System.out.println("******");
    System.out.println();
    System.out.println("La cuba tiene una capacidad de " + capacidadIntroducida + " litros y contiene " + cantidadAgua + " litros de agua.");
  }
}
