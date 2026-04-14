public class exercicios16 {
    

    public static void main(String[] args) {
    
        int a = 3, b = 0, c = 4, d = -1, f = 10;
        double g = 3.2;
        boolean e = true, h = false;

        boolean res1 = !(a + b <= Math.pow(10, 2) || a * c > (double) d / f);
        
        
        boolean res2 = h && true || (b != 0) || a > d;
        
       
        boolean res3 = (10 % 3.2) > b && !e || (b == 0);
        
        
        boolean res4 = Math.sqrt(Math.abs(f * g * c / 2 * d)) <= 0;
        
 
        boolean res5 = 10 % 3 <= 1 && -Math.sqrt(Math.abs(-2)) >= -1;

        System.out.println("Resultado i: " + res1);
        System.out.println("Resultado ii: " + res2);
        System.out.println("Resultado iii: " + res3);
        System.out.println("Resultado iv: " + res4);
        System.out.println("Resultado v: " + res5);
    }
}