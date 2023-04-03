package OpenBootCamp;

public class SmartWatch extends SmartDevice{
    public double milimetros;
    public String marca;

    public SmartWatch() {
    }

    public SmartWatch(String color, boolean tieneCargador, int añoLanzamiento,
                      double milimetros, String marca) {
        super(color, tieneCargador, añoLanzamiento);
        this.milimetros = milimetros;
        this.marca = marca;
    }

    public double getmilimetros() {
        return milimetros;
    }

    public void setmilimetros(double milimetros) {
        this.milimetros = milimetros;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}