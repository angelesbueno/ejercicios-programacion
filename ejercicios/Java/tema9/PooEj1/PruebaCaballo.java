/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej1;
import java.util.Scanner;
/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class PruebaCaballo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

      Caballo rocinante=new Caballo("Rocinante");
      Caballo princesa = new Caballo("Princesa");
      Caballo bucefalo = new Caballo("Bucéfalo");
      Persona pepe =new Persona("Pepe", "Pérez");

      rocinante.setRaza("flaco");
      rocinante.setSexo("macho");
      bucefalo.setSexo("macho");
      princesa.setSexo("hembra");
      rocinante.setColor("blanco");
      rocinante.setJinete(pepe);

      System.out.println(pepe);

      pepe.espolea("cariñosa");
      System.out.println("");
      System.out.println(rocinante);
      System.out.println("----------------------");
      System.out.println("¡Hora de aparearse!");
      Caballo cria1 = rocinante.seApareaCon(princesa, "Rosa", "Pequeño tío");
      Caballo cria2 = rocinante.seApareaCon(bucefalo, "Kate", "Snoopy");
      System.out.println(cria1);
      System.out.println(cria2);
  }
}
