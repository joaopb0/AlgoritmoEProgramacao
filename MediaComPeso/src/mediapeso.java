import java.util.Scanner;

public class mediapeso {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o valor com peso um");
        Double n1 = teclado.nextDouble();

        System.out.println("Insira o valor com peso dois");
        Double n2 = teclado.nextDouble();

        System.out.println("Insira o valor com peso tres");
        Double n3 = teclado.nextDouble();

        Double soma1 = n1 * 1;
        Double soma2 = n2 * 2;
        Double soma3 = n3 * 3;

        Double mais = soma1 + soma2 + soma3;

        Double dividir = mais / 6;

        System.out.println("Resultado da media");
        System.out.println(dividir);

    }
}
