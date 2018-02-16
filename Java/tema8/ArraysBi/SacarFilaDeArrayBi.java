/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sacarfilaarraybi;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
import java.util.Scanner;
public class SacarFilaDeArrayBi {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    
    int [][] array = matematicas.FuncionesArraysBi.generaArrayBiInt(6, 6, 100, 25);
    matematicas.FuncionesArraysBi.muestraArrayBi(array, 6, 6);
    System.out.print("¿Qué fila del array quieres extraer?: ");
    int nFila = s.nextInt();
    int[] arrayUni = matematicas.FuncionesArraysBi.filaDeArrayBiInt(array, 6, 6, nFila);
    System.out.println("");
    matematicas.FuncionesArrays.muestraArrayInt(arrayUni);
  }
}
