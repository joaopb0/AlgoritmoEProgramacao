import java.util.Scanner;

public class doacoes {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe o valor 1 doado");
        Integer doa1 = teclado.nextInt();

        System.out.println("Informe o valor 2 doado");
        Integer doa2 = teclado.nextInt();

        System.out.println("Informe o valor 3 doado");
        Integer doa3 = teclado.nextInt();

        System.out.println("Informe o valor 4 doado");
        Integer doa4 = teclado.nextInt();

        System.out.println("Informe o valor 5 doado");
        Integer doa5 = teclado.nextInt();

        System.out.println("Informe o valor 6 doado");
        Integer doa6 = teclado.nextInt();

        System.out.println("Informe o valor 7 doado");
        Integer doa7 = teclado.nextInt();

        System.out.println("Informe o valor 8 doado");
        Integer doa8 = teclado.nextInt();

        System.out.println("Informe o valor 9 doado");
        Integer doa9 = teclado.nextInt();

        System.out.println("Informe o valor 10 doado");
        Integer doa10 = teclado.nextInt();

        Integer soma = doa1 + doa2 + doa3 + doa4 + doa5 + doa6 + doa7 + doa8 + doa9 + doa10;
        System.out.println("Valor total das doações:");
        System.out.println(soma);

    }
}
