 package cl.org.thread;
 
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class HiloVerficador extends Thread {

    public HiloVerficador() {
    }

    @Override
    public void run() {
        //contador para saber que hilo esta "corriendo"
        System.out.println("Hilo iniciado" + this.getId());
        try {
            try {

                Properties p = new Properties();

                File archivo = new File("archivo.properties");

                if (archivo.exists()) {
                    FileReader fr = new FileReader(archivo);

                    p.load(fr);

                    String botones, texto;
                    botones = p.getProperty("Color Botones:");
                    texto = p.getProperty("Color Texto Botones");

                    System.out.println(botones + "" + texto);
                    System.out.println("Ruta: " + archivo.getAbsolutePath()
                            + "\nTamaño: " + archivo.length() + " bytes");
                    fr.close();
                } else {
                    Properties prop = new Properties();
                    //Aqui debe colocarse los valores por defecto (colores "normales") 
                    prop.put("color", "verde");
                    prop.put("texto", "negro");
                    try {
                        archivo = new File("archivo.properties");
                        FileWriter fw = new FileWriter(archivo);
                        System.out.println("Ruta: " + archivo.getAbsolutePath()
                                + "\nTamaño: " + archivo.length() + " bytes");
                        fw.close();
                    } catch (IOException e) {
                        //Aqui deberia mandar un error
                    }

                }
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        } catch (IOException e) {
        }

    }
}
