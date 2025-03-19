public class ARV_Circulo {

    int id;
    double radio;
    String color;

    public ARV_Circulo(Integer id, Double radio, String color) {

        this.id = id;
        this.radio = radio;
        this.color = color;
    }

    public Integer getid() {
        return id;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public Double getradio() {
        return radio;
    }

    public void setradio(Double radio) {
        this.radio = radio;
    }

    public String getcolor() {
        return color;
    }

    public void setcolor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "arv_Circulo [id=" + id + ", radio=" + radio + ", color=" + color + "]";
    }

    public static void extracted(ARV_Circulo circulo1) {
        double radio1 = circulo1.getradio();
        double area2 = radio1 * 3.14;
        System.out.println("Area circulo: " + area2);
    }

}