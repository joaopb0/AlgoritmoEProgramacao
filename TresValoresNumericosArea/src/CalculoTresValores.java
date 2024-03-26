import java.util.Scanner;

public class CalculoTresValores {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Informe o valor de a");
        double a = teclado.nextDouble();

        System.out.println("Informe o valor de b");
        double b = teclado.nextDouble();

        System.out.println("Informe o valor de c");
        double c = teclado.nextDouble();

        double areaCirculo = 3.14 *(c * c);
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;
        double areaTrianguloRetangulo = (a * b) / 2;

        System.out.println("Area do circulo:");
        System.out.println(areaCirculo);

        System.out.println();

        System.out.println("Area do quadrado");
        System.out.println(areaQuadrado);

        System.out.println();

        System.out.println("Area do retangulo");
        System.out.println(areaRetangulo);

        System.out.println();

        System.out.println("Area do Triangulo/Retangulo");
        System.out.println(areaTrianguloRetangulo);

    }
}
