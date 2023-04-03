package bateriaEjerciciosUnidad6;

public class Amigos {
    private String nombre;
    private int telefono;
    private boolean confirmado;
    public Amigos(String nombre, int telefono, boolean confirmado) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.confirmado = confirmado;
    }



    public Amigos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }


}
