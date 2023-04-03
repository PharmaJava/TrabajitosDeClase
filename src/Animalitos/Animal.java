package Animalitos;

public class Animal {

    private String raza, caracter;
    private double peso;
    private boolean muerde;


    //constructor sin parametros
    public Animal (){

    }
    //constructor con parametros
    public Animal (String raza, String caracter,double peso,boolean muerde){
        this.raza = raza;
        this.caracter = caracter;
        this.peso = peso;
        this.muerde = muerde;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isMuerde() {
        return muerde;
    }

    public void setMuerde(boolean muerde) {
        this.muerde = muerde;
    }


    //metodos mostrar animal
        public void mostrarAnimal(){
        System.out.println("La raza del animal es: "+ getRaza());
        System.out.println("El caracter del animal es: "+ getCaracter());
        System.out.println("El animal pesa: "+getPeso());
        System.out.println("¿Muerde?: "+ (isMuerde() ? "si": "no"));
}
    public void sonidoAnimal(){
        System.out.println("Este animal hace: ");
    }


}
