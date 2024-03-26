public class caixa {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Valor a sacar");
        int valor = teclado.leInt();

        int notas200 = valor / 200;
        int resto = valor % 200;

        int notas100 = resto / 100;
        resto = resto % 100;

        int notas50 = resto / 50;
        resto = resto % 50;

        int notas20 = resto / 20;
        resto = resto % 20;

        int notas10 = resto / 10;
        resto = resto % 10;

        int notas5 = resto / 5;
        resto = resto % 5;
        
        int notas2 = resto / 2;
        resto = resto % 2;

        int notas1 = resto;

        System.out.println("Notas de 200" + notas200);
        System.out.println("Notas de 100" + notas100);
        System.out.println("Notas de 50" + notas50);
        System.out.println("Notas de 20" + notas20);
        System.out.println("Notas de 10" + notas10);
        System.out.println("Notas de 5" + notas5);
        System.out.println("Notas de 2" + notas2);
        System.out.println("Notas de 1" + notas1);

    }
}
