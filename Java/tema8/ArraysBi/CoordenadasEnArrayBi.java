/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coordenadasenarraybi;
import java.util.Scanner;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
public class CoordenadasEnArrayBi {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    int [][] array = matematicas.FuncionesArraysBi.generaArrayBiInt(6, 6, 100, 25);
    matematicas.FuncionesArraysBi.muestraArrayBi(array, 6, 6);
    System.out.print("Dime un número del array y te diré sus coordenadas dentro del array: ");
    int num = s.nextInt();
    int[] coordenadas = matematicas.FuncionesArraysBi.coordenadasEnArrayBiInt(array, 6, 6, num);
    matematicas.FuncionesArrays.muestraArrayInt(coordenadas);
    
  }
  
}
