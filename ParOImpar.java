import java.util.Scanner;

public class ParOImpar {

  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    System.out.print("PAR O IMPAR\n"
        + "Introduce un número entero para saber si es par o impar: ");
    int primerNumero = Integer.parseInt(scan.next());
    
    System.out.print("Introduce un segundo número: ");
    int segundoNumero = Integer.parseInt(scan.next());
    
    if (segundoNumero < primerNumero) {
      System.out.print("Error, el segundo número debe ser mayor que el primero.");
    }
    
    else {
      if (primerNumero % 2 == 0 && segundoNumero % 2 == 1) {
        System.out.print(primerNumero + " es par, " + segundoNumero + " es impar");
      }
      
      if (segundoNumero % 2 == 0 && primerNumero % 2 == 1) {
        System.out.print(segundoNumero + " es par, " + primerNumero + " es impar");
      }
      
      if (primerNumero % 2 == 0 && segundoNumero % 2 == 0) {
        System.out.print("Ambos son pares");
      }
      
      if (primerNumero % 2 == 1 && segundoNumero % 2 == 1) {
        System.out.print("Ambos son impares");
      } 
      
    }
    
    
    
  }

}
