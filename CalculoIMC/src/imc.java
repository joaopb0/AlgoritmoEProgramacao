import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        

        Scanner teclado = new Scanner(System.in);

        System.out.println("Altura");
        Double n1 = teclado.nextDouble();

        System.out.println("Peso");
        Double n2 = teclado.nextDouble();

        Double imc = n2 / (n1 * n1);

        System.out.println("O seu IMC é");
        System.out.println(imc);

    }
}
