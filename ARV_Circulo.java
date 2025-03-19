public class ARV_Circulo {

    int id = 10;
    double radio = 10.5;
    String color = "rojo";

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
}