package EjercicioTema5;

import java.io.IOException;
import java.io.RandomAccessFile;

public class BingEjem {
    try {
        // Crear una instancia de RandomAccessFile con el modo "rw"
        RandomAccessFile file = new RandomAccessFile("example.txt", "rw");

        // Escribir algunos datos en el archivo
        file.writeUTF("Hello, world!");

        // Mover el puntero al principio del archivo
        file.seek(0);

        // Leer los datos desde el archivo
        String data = file.readUTF();

        // Imprimir los datos leídos
        System.out.println(data);

        // Cerrar el archivo
        file.close();
    } catch (
    IOException e) {
        e.printStackTrace();
    }
}
