public class Ejercicio8 {
  public static void main(String[] args) {
    System.out.print("Escribe el total de horas semanales trabajadas:");
    double horas = Double.parseDouble(System.console().readLine());
    System.out.print("Tu salario semanal es de " + (horas*12) + "€");
  }
}
