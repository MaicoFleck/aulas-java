import java.util.Scanner;

public class exerciciosaula6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maior = 2;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int n = sc.nextInt();
            if (n > maior) {
                maior = n;
                sc.close();
        System.out.println("Maior número: " + maior);
            }
        }
    }
}
    
