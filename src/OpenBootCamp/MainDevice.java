package OpenBootCamp;

public class MainDevice {
    public static void main(String[] args) {

        SmartPhone smartphone1 = new SmartPhone("Negro", true, 2020,
                "Apple",8045.50);
        SmartPhone smartphone2 = new SmartPhone("Azul",false,2022,
                "Samsung", 995.50);
        SmartWatch smartwatch1= new SmartWatch("Rosa", false, 2021,
                42.5, "apple");
        SmartWatch smartwatch2= new SmartWatch("Negro",true,2021,
                38.5,"Samsung");

        System.out.println("El color del smartphone es: " + smartphone1.getColor());
        System.out.println("¿Trae el cargador?: " + (smartphone1.isTieneCargador() ? "Si" : "No"));
        System.out.println("El año de lanzamiento fué en: " + smartphone1.getAñoLanzamiento());
        System.out.println("La marca es: " + smartphone1.getMarca());
        System.out.println("Su precio es de: " + smartphone1.getPrecio());

        System.out.println("El color del smartphone es: " + smartphone2.getColor());
        System.out.println("¿Trae el cargador?: " + (smartphone2.isTieneCargador() ? "Si" : "No"));
        System.out.println("El año de lanzamiento fué en: " + smartphone2.getAñoLanzamiento());
        System.out.println("La marca es: " + smartphone2.getMarca());
        System.out.println("Su precio es de: " + smartphone2.getPrecio());

        System.out.println("El color es: " + smartwatch1.getColor());
        System.out.println("¿Trae el cargador? :" + (smartwatch1.isTieneCargador() ? "Si":"No"));
        System.out.println("El año de lanzamiento fué en: " + smartwatch1.getAñoLanzamiento());
        System.out.println("El tamaño es de: "+ smartwatch1.getAñoLanzamiento());
        System.out.println("La marca es: " + smartwatch1.getMarca());

        System.out.println("El color es: " + smartwatch2.getColor());
        System.out.println("¿Trae el cargador? :" + (smartwatch2.isTieneCargador() ? "Si":"No"));
        System.out.println("El año de lanzamiento fué en: " + smartwatch2.getAñoLanzamiento());
        System.out.println("El tamaño es de: "+ smartwatch2.getAñoLanzamiento());
        System.out.println("La marca es: " + smartwatch2.getMarca());

    }
}
