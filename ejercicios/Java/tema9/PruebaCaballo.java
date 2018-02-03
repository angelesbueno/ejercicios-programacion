
/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class PruebaCaballo {
  public static void main(String[] args) {
    
    //instancias (Objetos)
    Caballo miCaballo = new Caballo("macho");
    System.out.println("Mi caballo:");
    System.out.println("Hola caballito");
    miCaballo.relincha();
    System.out.println("Toma arroz");
    miCaballo.come("arroz negro");
    System.out.println("Toma zanahorias, a ver si esto te gusta más");
    miCaballo.come("zanahorias");
    miCaballo.salta();
    System.out.println();
    Caballo rocinante = new Caballo("macho");
    System.out.println("Rocinante:");
    rocinante.relincha();
    rocinante.salta();
    System.out.println();
    Caballo pequenoTio = new Caballo("macho");
    System.out.println("Pequeño tío:");
    System.out.println("Toma unas cuantas albóndigas");
    pequenoTio.come("albóndigas");
    System.out.println("Vale, toma zanahorias");
    pequenoTio.come("zanahorias");
  }
}
