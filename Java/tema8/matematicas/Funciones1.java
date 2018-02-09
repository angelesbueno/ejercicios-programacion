/**
 * Funciones matemáticas.
 *
 * @author Ángeles Bueno
 */
 
package matematicas;
public class Funciones {
  /**
   * Comprobar si un número es capicúa o no.
   * Devuelve verdadero si el número que se pasa como parámetro es capicúa y falso en caso contrario.
   * @param x un número entero positivo
   * @return <code>true</code> si el número es capicúa
   * @return <code>false</code> en caso contrario
   */
  public static boolean esCapicua(int x) {
    int aux = x;
    int nuevoNumero = 0;
    
    while (x > 0) {
      nuevoNumero = nuevoNumero + x % 10; 
      nuevoNumero = nuevoNumero * 10;
      x /= 10;
    }
    nuevoNumero /= 10;
    
    if(aux == nuevoNumero) { 
      return true;
    
    } else {
      return false;
    }
  }
  /**
   * Comprobar si un número es primo o no.
   * Devuelve verdadero si el número que se pasa como parámetro es primo y falso en caso contrario.
   * @param x un número entero positivo
   * @return <code>true</code> si el número es primo
   * @return <code>false</code> en caso contrario
   */
  public static boolean esPrimo(int x) {
    for (int i = 2; i < x; i++) { 
      if ((x % i) == 0) {
        return false; 
      }
    }
    return true; 
  }
  /**
   * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
   * @param x un número entero positivo
   * @return el menor número primo que es mayor a x
   */
  public static int siguientePrimo(int x) {
    int aux = x;
    aux ++;
    int siguientePrimo = 0;
    do {
      boolean esPrimo = true;
      for (int j = 2; j < aux; j++) {
        if ((aux % j) == 0) {
          esPrimo = false;
          aux ++;
        }
      }
      if (esPrimo) {
        siguientePrimo = aux;
      }
    } while (siguientePrimo == 0);
    return siguientePrimo;
  }
  /**
   * Dada una base y un exponente devuelve la potencia.
   * @param base la base de un número entero positivo
   * @param exponente el exponente de una base
   * @return la potencia de una base y su exponente
   */
  public static int potencia(int base, int exponente) {
    int potencia = base;
    if (base == 0) {
      potencia = 0;
    }
    if (exponente == 0) {
      potencia = 0;
    }
    if (exponente == 1) {
      potencia = base;
    }
    if (exponente > 1) {
      for (int i = 1; i < exponente; i++) {
        potencia *= base;
      }
    }
    return potencia;
  }
  /**
   * Cuenta el número de dígitos de un número entero.
   * @param x un número entero positivo
   * @return la cantidad de dígitos de x
   */
  public static int digitos(int x) {
    int digitos = 1;
    while (x > 9) {
      digitos ++;
      x /= 10;
    }
    return digitos;
  }
  /**
   * Le da la vuelta a un número.
   * @param x un número entero positivo
   * @return x dado la vuelta
   */
  public static int voltea(int x) {
    int voltea = 0;
    while (x > 0) {
      voltea = (voltea*10) + x%10;
      x /= 10;
    }
    return voltea;
  }
  /**
   * Devuelve el dígito que está en la posición n de un número entero. Se empieza contando por el 0 y de izquierda a derecha.
   * @param x un número entero positivo
   * @param posicion un número entero positivo que determina el dígito que queremos extraer
   * @return el dígito que está en la posición solicitada
   */
  public static int digitoN(int x, int posicion) {
    int aux = x;
    int voltea = 0;
    int digito = 0;
    while (aux > 0) {
      voltea = (voltea*10) + aux%10;
      aux /= 10;
    }
    for (int i = 0; i < posicion; i ++) {
      voltea /= 10;
    }
    digito = voltea % 10;
    return digito;
  }
  /**
   * 8. Da la posición de la primera ocurrencia de un dígito dentro de un número entero. Si no se encuentra, devuelve -1.
   */
  public static int posicionDeDigito(int x, int y) {
    
    int z = matematicas.Funciones.voltea(x);
    int cifra;
    int posicion = 0;
    
    do {
      cifra = z % 10;
      z /= 10;
      if (cifra == y) {
        return posicion;
      }
      posicion++;
    } while (z > 0);
    
    return -1;
  }
  /**
   * Le quita a un número n dígitos por detrás (por la derecha).
   * @param x un número entero positivo
   * @param digitos un número que determina cuántos digitos se quieren eliminar por la derecha
   * @return x sin los dígitos 
   */
  public static int quitaPorDetras(int x, int digitos) {
    for (int i = 0; i < digitos; i++) {
      x /= 10;
    }
    return x;
  }
  /**
   * Le quita a un número n dígitos por delante (por la izquierda).
   * @param x un número entero positivo
   * @param digitos un número que determina cuántos digitos se quieren eliminar por la izquierda
   * @return x sin los dígitos  
   */
  public static int quitaPorDelante(int x, int digitos) {
    int voltea = voltea(x);
    for (int i = 0; i < digitos; i++) {
      voltea /= 10;
    }
    while (voltea > 0) {
      x = (x*10) + voltea%10;
      voltea /= 10;
    }
    return x;
  }
  /**
   * Añade un dígito a un número por detrás.
   * @param x un número entero positivo
   * @param digito un número que que se añade por detrás a x
   * @return x más el dígito añadido por detrás
   */
  public static int pegaPorDetras(int x, int digito) {
    int nuevoNumero = x * 10 + digito;
    return nuevoNumero;
  }
  /**
   * Añade un dígito a un número por delante.
   * @param x un número entero positivo
   * @param digito un número que que se añade por delante a x
   * @return x más el dígito añadido por delante
   */
  public static int pegaPorDelante(int x, int digito) {
    int voltea = voltea(x);
    voltea = (voltea * 10) + digito;
    x = voltea(voltea);
    return x;
  }
  /**
   * Toma como parámetros las posiciones inicial y final dentro de un número y devuelve el trozo correspondiente.
   */
  //public static int trozoDeNumero(int x) {
  //}
  /**
   * Pega dos números para formar uno.
   */
  //public static int juntaNumeros(int x) {
  //}
}
