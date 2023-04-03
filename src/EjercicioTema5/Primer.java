package EjercicioTema5;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Primer {
    public static void main(String[] args) {
            String ruta =  System.getProperty("user.dir") + "/archivo.txt";

                try {
                    File archivo = new File(ruta);
                    FileInputStream in = new FileInputStream("archivo.txt");
                    FileOutputStream out = new FileOutputStream("c   opia.txt");
                    int c;
                    while ((c = in.read()) != -1) {
                        out.write(c);

                    }
                    in.close();
                    out.close();
                    System.out.println("Se ha creado el archivo copia");
                }catch (IOException e){
                        System.out.println("Erro de escritura" + e.getMessage());
                    }

                }

        }


