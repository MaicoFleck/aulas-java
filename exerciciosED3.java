import java.util.Scanner;
public class exerciciosED3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (system.in);

        System.out.println("Insira valor negativo ou positivo:");
        double valor = entrada.nextDouble();
        entrada.nextLine();

        if(valor > 0.0) {
            System.out.println("positivo");
        } else if (valor ==0.0) {
            System.out.println("zero");

        } else {
        System.out.println("negativo");
        }

        entrada.close();
        
    }
}
