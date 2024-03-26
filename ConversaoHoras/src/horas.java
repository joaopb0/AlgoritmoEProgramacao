public class horas {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Informe a quantidade de horas");
        int horas = teclado.leInt();

        int minutos = horas * 60;

        System.out.println("Resultado em minutos");
        System.out.println(minutos);

    }
}
