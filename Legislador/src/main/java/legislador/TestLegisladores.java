package legislador;

public class TestLegisladores {

    public static void main(String[] args) {
        Legislador leg1 = new Diputado(15, "Provincia 1", "Partido 1", 51, "Julio", "Trujillo", 56, true);
        Legislador leg2 = new Diputado(14, "Provincia 2", "Partido 2", 150, "Jose", "Galindo", 42, false);
        Legislador leg3 = new Diputado(20, "Provincia 3", "Partido 3", 24, "Cristian", "Torres", 35, true);

        Legislador leg4 = new Senador(5, "Garcia Rovira", "Partido 1", 303, "Julian", "Perez", 50, true);
        Legislador leg5 = new Senador(15, "Sulia tercera", "Partido 1", 550, "Pedro", "Escamozo", 65, false);

        NominaLegisladores listaCongreso = new NominaLegisladores();
        listaCongreso.agregaLegislador(leg1);
        listaCongreso.agregaLegislador(leg2);
        listaCongreso.agregaLegislador(leg3);
        listaCongreso.agregaLegislador(leg4);
        listaCongreso.agregaLegislador(leg5);

        System.out.println("\f");
        System.out.println("El total de legisladores es de " + listaCongreso.getTamaño());
        System.out.println("");
        listaCongreso.muestraContenido();
    }
}
