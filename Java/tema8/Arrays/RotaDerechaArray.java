/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rotaderechaarray;

/** Rota n posiciones a la derecha el array
 *
 * @author Ángeles Bueno Aguilar
 */
import java.util.Scanner;
public class RotaDerechaArray {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    int[] numero = {0, 459, 18904, 1, 4576, 3573, 13, 4, 6777, 23};
    matematicas.FuncionesArrays.muestraArrayInt(numero);
    System.out.print("¿Cuántas posiciones quieres rotar el array hacia la derecha?: ");
    int posiciones = s.nextInt();
    int[] rotado = matematicas.FuncionesArrays.rotaDerechaArrayInt(numero, posiciones);
    matematicas.FuncionesArrays.muestraArrayInt(rotado);
    
  }
  
}
