/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej19;

/**
 *
 * @author Ángeles Bueno Aguilar
 */
import java.util.Scanner;
public class ConversorCualquierBase {
  public static void main(String[] args) {
    
    Scanner s = new Scanner(System.in);
    
    String resultado = "";
    long numeroIntroducido = 666;
    
    System.out.println(" 1) Binario -> Octal");
    System.out.println(" 2) Binario -> Decimal");
    System.out.println(" 3) Binario -> Hexadecimal");
    System.out.println(" 4) Octal -> Binario");
    System.out.println(" 5) Octal -> Decimal");
    System.out.println(" 6) Octal -> Hexadecimal");
    System.out.println(" 7) Decimal -> Binario");
    System.out.println(" 8) Decimal -> Octal");
    System.out.println(" 9) Decimal -> Hexadecimal");
    System.out.println("10) Hexadecimal -> Binario");
    System.out.println("11) Hexadecimal -> Octal");
    System.out.println("12) Hexadecimal -> Decimal");
    System.out.print("Elija una opción: ");
    int opcion = s.nextInt();
    
    System.out.print("Introduzca el número que quiere convertir: ");
    String numeroIntroducidoString = s.next();
    
    if (opcion < 10) {
      numeroIntroducido = Long.parseLong(numeroIntroducidoString);
    }
    
    switch (opcion) {
      case 1:
        resultado = Long.toString(matematicas.Funciones.binarioAOctal(numeroIntroducido));
        break;
      case 2:
        resultado = Long.toString(matematicas.Funciones.binarioADecimal(numeroIntroducido));
        break;
      case 3:
        resultado = matematicas.Funciones.binarioAHexadecimal(numeroIntroducido);
        break;
      case 4:
        resultado = Long.toString(matematicas.Funciones.octalABinario(numeroIntroducido));
        break;
      case  5:
        resultado = Long.toString(matematicas.Funciones.binarioADecimal(matematicas.Funciones.octalABinario(numeroIntroducido)));
        break;
      case  6:
        resultado = matematicas.Funciones.binarioAHexadecimal(matematicas.Funciones.octalABinario(numeroIntroducido));
        break;
      case  7:
        resultado = Long.toString(matematicas.Funciones.decimalABinario(numeroIntroducido));
        break;
      case  8:
        resultado = Long.toString(matematicas.Funciones.binarioAOctal(matematicas.Funciones.decimalABinario(numeroIntroducido)));
        break;
      case  9:
        resultado = matematicas.Funciones.binarioAHexadecimal(matematicas.Funciones.decimalABinario(numeroIntroducido));
        break;
      case 10:
        resultado = Long.toString(matematicas.Funciones.hexadecimalABinario(numeroIntroducidoString));
        break;
      case 11:
        resultado = Long.toString(matematicas.Funciones.binarioAOctal(matematicas.Funciones.hexadecimalABinario(numeroIntroducidoString)));
        break;
      case 12:
        resultado = Long.toString(matematicas.Funciones.binarioADecimal(matematicas.Funciones.hexadecimalABinario(numeroIntroducidoString)));
        break;
    }
    
    System.out.println(resultado);
  }
}
    

