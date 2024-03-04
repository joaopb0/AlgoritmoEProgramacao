import java.util.Scanner;

public class subtrair {
    public static void main(String[] args) throws Exception {

       Scanner subtrair = new Scanner(System.in);
       
       System.out.println("Informe um valor");
       Integer n1 = subtrair.nextInt();

       System.out.println("Informe um segundo valor");
       Integer n2 = subtrair.nextInt();

       Integer soma = n1 - n2;

       System.out.println("Resultado da subtracao");
       System.out.println(soma);

    }
}
