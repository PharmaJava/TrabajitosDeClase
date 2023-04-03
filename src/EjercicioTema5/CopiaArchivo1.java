package EjercicioTema5;

import java.io.*;

public class CopiaArchivo1 {
    public static void main(String[] args) {
        String rutaFicheroALeer = System.getProperty("user.dir") + "/archivo.txt";
        String rutaFicheroAEscribir = System.getProperty("user.dir") + "/archivo1.txt";

        try {
            BufferedReader reader = new BufferedReader(new FileReader(rutaFicheroALeer));
            BufferedWriter writer = new BufferedWriter(new FileWriter(rutaFicheroAEscribir));

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }

            reader.close();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
