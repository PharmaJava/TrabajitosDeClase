package OpenBootCamp;

public class EjemploExcepcion {
    public static void DividePorCero() {
        int num1 = 5;
        int num2 = 0;
        if(num2==0){
            throw new ArithmeticException("División por cero");
        }
        int resultado = num1 / num2;
    }

    public static void main(String[] args) {
        try {
            DividePorCero();
        } catch (ArithmeticException e) {
            System.out.println("Esto no puede hacerse");
        } finally {
            System.out.println("Demo de código");
        }
    }
}
