import java.util.Scanner;

public class media {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o primeiro valor");
        Double n1 = teclado.nextDouble();

        System.out.println("Informe o segundo valor");
        Double n2 = teclado.nextDouble();

        System.out.println("Informe o terceiro valor");
        Double n3 = teclado.nextDouble();

        System.out.println("Informe o quarto valor");
        Double n4 = teclado.nextDouble();

        Double soma = n1 + n2 + n3 + n4;

        Double dividir = soma / 4;
        
        System.out.println("Media");
        System.out.println(dividir);

    }
}
