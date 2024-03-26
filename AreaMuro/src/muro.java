public class muro {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Informe o comprimento do muro");
        Double comprimento = teclado.leDouble();

        System.out.println("Informe a altura do muro");
        Double altura = teclado.leDouble();

        Double AreaMuro = comprimento * altura;

        System.out.println("Area do Muro");
        System.out.println(AreaMuro);

    }
}
