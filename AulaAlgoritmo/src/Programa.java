import java.util.Scanner;

public class Programa {
    
    public static void main(String[] args){

        Scanner teclado = new Scanner(System.in);

        System.out.println("Informe um valor:");
        int valor1 = teclado.nextInt();

        System.out.println("Informe um segundo valor:");
        int valor2 = teclado.nextInt();

        int valor3 = valor1 +valor2;

        System.out.print(valor3);


    }

}
