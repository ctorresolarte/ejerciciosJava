import java.util.Scanner;

public class TestFiguras {
    public static void main(String[] args) {
        String colorCuadrado;
        double LadoCuadrado;

        Scanner tec = new Scanner(System.in);
        System.out.println("Introduzca el color del cuadrado: ");
        colorCuadrado = tec.nextLine();

        System.out.println("Introduzca el lado del cuadrado: ");
        LadoCuadrado= tec.nextDouble();

        Cuadrado cuadrado1 = new Cuadrado(colorCuadrado, LadoCuadrado);

        System.out.println("El area del cuadrado "+cuadrado1.getColor()+ " es "+cuadrado1.calcularArea());
    

   

}

}
