public class idade {
    public static void main(String[] args) {
        
        Teclado teclado = new Teclado();

        System.out.println("Insira o ano atual");
        Integer anoAtual = teclado.leInt();

        System.out.println("Insira o ano de nascimento");
        Integer anoNascimento = teclado.leInt();

        Integer somaIdade = anoAtual - anoNascimento;

        System.out.println("idade");
        System.out.println(somaIdade);

        Integer Idade2030 = 2030 - anoAtual + somaIdade;

        System.out.println("Sua idade em 2030");
        System.out.println(Idade2030);

    }
}
