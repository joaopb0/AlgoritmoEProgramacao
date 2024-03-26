public class produto {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Insira o valor do produto");
        Double valor = teclado.leDouble();

        System.out.println("Insira a quantidade do produto");
        Double quantidade = teclado.leDouble();

        Double soma = valor * quantidade;

        System.out.println("Valor total");
        System.out.println(soma);

    }
}
