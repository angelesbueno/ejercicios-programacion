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
      Persona pepe =new Persona("Pepe", "Pérez");

      rocinante.setRaza("flaco");
      rocinante.setColor("blanco");
      rocinante.setJinete(pepe);

      System.out.println(pepe);

      pepe.espolea("cariñosa");
      System.out.println("");
      System.out.println(rocinante);
  }
}
