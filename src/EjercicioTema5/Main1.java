package EjercicioTema5;
import java.io.*;

public class Main1 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("archivo.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write("FICHERO QUE USAREMOS PARA LEER SU CONTENIDO");


            bw.close();
            System.out.println("Se ha creado el archivo archivo.txt");
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());
        }

        try {
            FileInputStream fis = new FileInputStream("archivo.txt");
            FileOutputStream fos = new FileOutputStream("copia.txt");
            int c;
            while ((c = fis.read()) != -1) {
                fos.write(c);
            }
            fis.close();
            fos.close();
            System.out.println("Se ha creado el archivo copia.txt");
        } catch (IOException e) {
            System.out.println("Error de E/S: " + e.getMessage());

        }
    }
}
