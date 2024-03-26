public class HorasDias {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Insira a quantidade de horas");
        Double horas = teclado.leDouble();

        Double soma = horas / 24;

        System.out.println("Resultado das horas em dias");
        System.out.println(soma);

    }
}
