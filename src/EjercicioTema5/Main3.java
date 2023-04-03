package EjercicioTema5;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main3 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("archivo.txt");
            FileWriter fw = new FileWriter("archivo2.txt");
            int c;
            while ((c = fr.read()) != -1) {
                fw.write(c);
            }
            fr.close();
            fw.close();
            System.out.println("Se ha creado el archivo archivo2.txt");
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        }
    }
}
