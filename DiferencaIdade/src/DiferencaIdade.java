import java.util.Scanner;

public class DiferencaIdade {
    public static void main(String[] args) throws Exception {

       Scanner subtrair = new Scanner(System.in);
       
       System.out.println("Informe a primeira idade");
       Integer n1 = subtrair.nextInt();

       System.out.println("Informe a segunda idade");
       Integer n2 = subtrair.nextInt();

       Integer soma = n1 - n2;

       System.out.println("Anos de diferença de idade");
       System.out.println(soma);

    }
}