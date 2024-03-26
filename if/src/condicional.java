public class condicional {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Informe um número inteiro");
        int numero = teclado.leInt();

        if(numero >= 0){
            System.out.println("Número positivo");
        }
        else {
            System.out.println("Número negativo");
        }

        System.out.println("Bye!!!");

    }
}
