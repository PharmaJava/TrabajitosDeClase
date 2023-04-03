package OpenBootCamp;

public class SmartPhone extends SmartDevice {
    private String marca;
    private double precio;

    public SmartPhone() {
    }

    public SmartPhone(String color, boolean tieneCargador, int añoLanzamiento,
                      String marca, double precio) {
        super(color, tieneCargador, añoLanzamiento);
        this.marca = marca;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
