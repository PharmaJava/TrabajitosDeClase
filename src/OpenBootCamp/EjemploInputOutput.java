package OpenBootCamp;

import java.io.*;

public class EjemploInputOutput {

    public static void copiaFichero(String fileIn, String fileOut) throws IOException {
        InputStream in = null;
        PrintStream out = null;
        try {
            in = new FileInputStream(fileIn);
            out = new PrintStream(new FileOutputStream(fileOut));
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }

    public static void main(String[] args) {
        try {
            copiaFichero("archivoEntrada.txt", "archivoSalida.txt");
            System.out.println("Archivo copiado con éxito.");
        } catch (IOException e) {
            System.out.println("Error al copiar el archivo: " + e.getMessage());
        }
    }
}
