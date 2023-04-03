package Animalitos;

public class Perro extends Animal {

    private double edad;
    private boolean tienePelo;

    // constructor sin parámetros
    public Perro() {
        super();
    }

    // constructor con parámetros
    public Perro(String raza, String caracter, double peso, boolean muerde,double edad, boolean tienePelo){
        super(raza, caracter, peso,muerde);
        this.edad= edad;
        this.tienePelo= tienePelo;
    }

    public double getEdad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public boolean isTienePelo() {
        return tienePelo;
    }

    public void setTienePelo(boolean tienePelo) {
        this.tienePelo = tienePelo;
    }

    // sobreescribiendo el método mostrarAnimales de la clase padre

    public void mostrarAnimal() {
        super.mostrarAnimal();
        System.out.println("La edad es: " + getEdad());
        System.out.println("Tiene pelo: " + (isTienePelo() ? "si" : "no"));
    }

    // sobreescribiendo el método sonidoAnimales de la clase padre

    public void sonidoAnimal() {
        super.sonidoAnimal();
        System.out.println("guau, guau");
    }
}

