import java.util.Scanner;

public class exercicios12 {
    public static void main(String[] args) {
        try (Scanner leitor = new Scanner (System.in)) {
            System.out.println("digite o valor de a :");
            double valor1 = leitor.nextDouble() ;
            
            System.out.println("digite o valor de b");
            double valor2 = leitor.nextDouble() ;
            
            System.out.println("digite o valor de x");
            double valor3 = leitor.nextDouble() ;
            
            double soma = valor1 * valor2 + valor3 ;
            
            System.out.println("valor de y é:" + soma);
        }
    }
}
