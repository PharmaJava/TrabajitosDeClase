package EjercicioTema5;

import java.io.*;

public class CopiaArchivo2 {
    public static void main(String[] args) {
        String rutaFicheroALeer = System.getProperty("user.dir") + "/archivo.txt";
        String rutaFicheroAEscribir = System.getProperty("user.dir") + "/archivo2.txt";

        try {
            FileReader reader = new FileReader(rutaFicheroALeer);
            FileWriter writer = new FileWriter(rutaFicheroAEscribir);

            int c;
            while ((c = reader.read()) != -1) {
                writer.write(c);
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
