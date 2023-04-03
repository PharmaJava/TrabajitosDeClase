package Animalitos;

public class Pajaro extends Animal {
    private String color;
    private boolean tienePlumas;

    // constructor sin parámetros
    public Pajaro() {
        super();
    }


    //constructor con parametros
    public Pajaro(String raza, String caracter, double peso, boolean muerde,String color,
                  boolean tienePlumas) {
        super(raza, caracter, peso, muerde);
        this.color = color;
        this.tienePlumas = tienePlumas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isTienePlumas() {
        return tienePlumas;
    }

    public void setTienePlumas(boolean tienePlumas) {
        this.tienePlumas = tienePlumas;
    }
        // sobreescribiendo el método sonidoAnimales de la clase padre
        public void sonidoAnimal() {
            super.sonidoAnimal();
            System.out.println("pío, pío");
    }
}