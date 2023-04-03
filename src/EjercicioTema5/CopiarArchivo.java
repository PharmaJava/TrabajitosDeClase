package EjercicioTema5;

import java.io.*;

public class CopiarArchivo {
    public static void main(String[] args) {
        String rutaFicheroALeer = System.getProperty("user.dir") + "/archivo.txt";
        String rutaFicheroAEscribir = System.getProperty("user.dir") + "/copia.txt";

        try {
            FileInputStream inputStream = new FileInputStream(rutaFicheroALeer);
            FileOutputStream outputStream = new FileOutputStream(rutaFicheroAEscribir);

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }

            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
