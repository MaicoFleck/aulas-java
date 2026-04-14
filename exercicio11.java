import java.util.Scanner;

public class exercicio11 {
    public static void main(String args[]) {
        try (Scanner leitor = new Scanner (System.in)) {
            System.out.println("digite o valor1 :");
            double valor1 = leitor.nextDouble() ;
            
            System.out.println("digite o valor2");
            double valor2 = leitor.nextDouble() ;
            
            double soma = valor2 + valor1;
            
            System.out.println("a soma desses valores: " + (valor1 + valor2));
            System.out.println("a soma desses valore: " + soma);
        }

    }
}
