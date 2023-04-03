package OpenBootCamp;

public class SmartDevice {

    private String color;
    private boolean tieneCargador;
    private int añoLanzamiento;

    public SmartDevice() {
    }

    public SmartDevice(String color, boolean tieneCargador, int añoLanzamiento) {
        this.color = color;
        this.tieneCargador = tieneCargador;
        this.añoLanzamiento = añoLanzamiento;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTieneCargador() {
        return tieneCargador;
    }

    public void setTieneCargador(boolean tieneCargador) {
        this.tieneCargador = tieneCargador;
    }

    public int getAñoLanzamiento() {
        return añoLanzamiento;
    }

    public void setAñoLanzamiento(int añoLanzamiento) {
        this.añoLanzamiento = añoLanzamiento;
    }
}