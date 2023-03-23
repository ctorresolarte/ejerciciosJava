import java.util.Scanner;

public class TestTriangulo {
    public static void main(String[] args) {
        double baseTriangulo;
        double alturaTriangulo;
        String colorTriangulo;

        Scanner tec = new Scanner(System.in);

        System.out.println("Introduzca el color del triangulo: ");
        colorTriangulo= tec.nextLine();

        System.out.println("Introduzca la base del triangulo: ");
        baseTriangulo = tec.nextDouble();

        System.out.println("Introduzca la altura del triangulo: ");
        alturaTriangulo = tec.nextDouble();

        Triangulo triangulo1 = new Triangulo(colorTriangulo, baseTriangulo, alturaTriangulo);

        System.out.println("El area del triangulo es "+ triangulo1.CalcularArea());

    }
}
