/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotaizquierdaarray;

import java.util.Scanner;

/** Rota n posiciones a la izquierda el array
 *
 * @author Ángeles Bueno Aguilar
 */
public class RotaIzquierdaArray {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] numero = {0, 459, 18904, 1, 4576, 3573, 13, 4, 6777, 23};
    matematicas.FuncionesArrays.muestraArrayInt(numero);
    System.out.print("¿Cuántas posiciones quieres rotar el array hacia la izquierda?: ");
    int posiciones = s.nextInt();
    int[] rotado = matematicas.FuncionesArrays.rotaIzquierdaArrayInt(numero, posiciones);
    matematicas.FuncionesArrays.muestraArrayInt(rotado);
  }
}
