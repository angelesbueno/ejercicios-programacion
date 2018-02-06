
import ejerciciocaballo.Caballo;
import ejerciciocaballo.Persona;


/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class PruebaCaballo {
  public static void main(String[] args) {
    
    Caballo rocinante = new Caballo("Rocinante");
    Persona pepe = new Persona("Pepe", "Pérez");
    
    pepe.setPeso(50);
    
    rocinante.setColor("marrón");
    rocinante.setJinete(pepe);
    rocinante.setPeso(200);
    
    System.out.println(pepe);
    pepe.espolea("cariñosa");
    System.out.println(rocinante);
    System.out.println(rocinante.getPeso());
    
    
    
    
    
    
    /**
    //instancias (Objetos)
    Caballo miCaballo = new Caballo("marrón");
    System.out.println("Mi caballo:");
    System.out.println("Hola caballito");
    miCaballo.relincha();
    System.out.println("Toma arroz");
    miCaballo.come("arroz negro");
    System.out.println("Toma zanahorias, a ver si esto te gusta más");
    miCaballo.come("zanahorias");
    miCaballo.salta();
    System.out.println();
    Caballo rocinante = new Caballo("blanco");
    System.out.println("Rocinante:");
    rocinante.relincha();
    rocinante.salta();
    System.out.println();
    Caballo pequenoTio = new Caballo("manchas");
    Persona pepe = new Persona("Pepe", "Pérez");
    System.out.println("Pequeño tío:");
    System.out.println(pepe);
    System.out.println("Toma unas cuantas albóndigas");
    pequenoTio.come("albóndigas");
    System.out.println("Vale, toma zanahorias");
    pequenoTio.come("zanahorias");
    */
  }
}
