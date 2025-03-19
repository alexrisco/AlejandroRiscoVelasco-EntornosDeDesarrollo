public class ARV_Rectangulo {
    int id;
    double ladoA;
    double ladoB;
    String color;

    public ARV_Rectangulo(Integer id, Double ladoA, Double ladoB, String color) {

        this.id = id;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.color = color;
    }

    public Integer getid() {
        return id;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public Double getladoA() {
        return ladoA;
    }

    public void setladoA(Double ladoA) {
        this.ladoA = ladoA;
    }

    public Double getladoB() {
        return ladoB;
    }

    public void setladoB(Double ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public String toString() {
        return "ARV_Rectangulo [id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + "]";
    }

    public static void extracted(ARV_Rectangulo rectangulo1) {
        double ladoA = rectangulo1.getladoA();
        double ladoB = rectangulo1.getladoB();
        double area1 = ladoA * ladoB;
        System.out.println("Area rectangulo: " + area1);
    }
}
