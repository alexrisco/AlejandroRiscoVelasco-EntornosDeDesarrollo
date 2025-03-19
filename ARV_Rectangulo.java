public class ARV_Rectangulo {
    int id = 1;
    double ladoA = 10.1;
    double ladoB = 10.2;
    String color = "rojo";

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

    @Override
    public String toString() {
        return "ARV_Rectangulo [id=" + id + ", ladoA=" + ladoA + ", ladoB=" + ladoB + ", color=" + color + "]";
    }

    public void setladoB(Double ladoB) {
        this.ladoB = ladoB;
    }
}
