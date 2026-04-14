import java.util.Scanner;
public class aula1 {
    public static void main(String[] args) {
        //Construa um algotimo que calcule a media aritmetica de quatro numeros quaisquer fornecidos pelo usuario.
        Scanner entrada = new Scanner(System.in);

        System.out.println("digite 3 numeros");

        System.out.print("digite o numero 1: ");
        double  num1 = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("digite o valor2: ");
        double  num2 = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("digite o valor3: ");
        double  num3 = entrada.nextDouble();
        entrada.nextLine();

        double soma = num1 + num2 + num3 ;

        double media = soma /4 ;

        System.out.print("media da soma é : " + media);

        entrada.close();
    }
}
