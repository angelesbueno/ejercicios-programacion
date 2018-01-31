




public class Melodia {
  public static void main(String[] args) {
    
    int notas;
    int compas = (int)(Math.random()*7);
    String notaAleatoria = "";
    String notaFinal = "";
    
    for(int i = 0; i <= compas; i++){
      for(int j = 0; j <= 3; j++){
        notas = (int)(Math.random()*7);
        
        switch(notas) {
          case 0:
            notaAleatoria = String.valueOf(" do "); 
            break;
          case 1:
            notaAleatoria = String.valueOf(" re "); 
            break;
          case 2:
            notaAleatoria = String.valueOf(" mi "); 
            break;
          case 3:
            notaAleatoria = String.valueOf(" fa "); 
            break;
          case 4:
            notaAleatoria = String.valueOf(" sol "); 
            break;
          case 5:
            notaAleatoria = String.valueOf(" la ");  
            break;
          case 6:
            notaAleatoria = String.valueOf(" si ");
            break;
            default:
        }
        
        //Aqui se comprueba cual es la primera nota y se guarda en notaFinal
        
        if((i == 0) && (j == 0)){
          notaFinal = notaAleatoria; 
        }
        
        //En la ultima posición que salga aleatoriamente se imprime notaFinal
        
        if((i == compas) && (j == 3)){
          System.out.print(notaFinal);
          
          //En las demás posiciones se imprime la notaAleatoria
          
        }else{
          System.out.print(notaAleatoria);
        }
      }
      System.out.print("|");
    }
    System.out.print("|");
  }
}
