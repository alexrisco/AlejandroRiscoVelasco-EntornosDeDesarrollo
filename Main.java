public class Main {
    public static void main(String[] args) {
        ARV_Circulo circulo1 = new ARV_Circulo(10, 10.5, "rojo");
        ARV_Rectangulo rectangulo1 = new ARV_Rectangulo(1, 10.1, 10.2, "rojo");

        double ladoA = rectangulo1.getladoA();
        double ladoB = rectangulo1.getladoB();
        double area1 = ladoA * ladoB;
        System.out.println("Area rectangulo: " + area1);

        double radio1 = circulo1.getradio();
        double area2 = radio1 * 3.14;
        extracted(area2);

        double diferencia = area1 - area2;
        System.out.println("Diferencnia area: " + diferencia);

        extracted2(rectangulo1);
        extracted3(circulo1);
        extracted(diferencia);

    }

    private static void extracted3(ARV_Circulo circulo1) {
        System.out.println("Area circulo: " + circulo1);
    }

    private static void extracted2(ARV_Rectangulo rectangulo1) {
        System.out.println("rectangulo: " + rectangulo1);
    }

    private static void extracted(double diferencia) {
        System.out.println("Area circulo: " + diferencia);
    }
}
