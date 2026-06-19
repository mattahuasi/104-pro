package exposicion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoBuffer {

    public static void main(String[] args) {
        String ruta = "./exposicion/archivo_buffer.txt";

        // ----------------- ESCRITURA -----------------
        // APERTURA: Declarar el BufferedWriter dentro del try() asegura el CIERRE AUTOMÁTICO
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(ruta))) {
            // ESCRITURA: Escribimos la primera línea en la memoria buffer
            bw.write("Linea 1 escrita con BufferedWriter.");

            // Agrega un salto de línea compatible con cualquier sistema operativo (Windows/Mac/Linux)
            bw.newLine();

            // ESCRITURA: Escribimos la segunda línea
            bw.write("Linea 2, ideal para archivos pesados.");

            System.out.println(
                "Archivo escrito (Se cierra solo al terminar el bloque try)."
            );
        } catch (IOException e) {
            // Imprime toda la traza del error en rojo si algo falla
            e.printStackTrace();
        }

        // ----------------- LECTURA -----------------
        // APERTURA: Instanciamos el BufferedReader, también con CIERRE AUTOMÁTICO
        try (BufferedReader br = new BufferedReader(new FileReader(ruta))) {
            // Variable temporal para ir guardando la línea leída
            String linea;

            System.out.println("\nContenido leído:");

            // LECTURA: Asigna la línea leída a la variable. Si es "null", significa que el archivo terminó
            while ((linea = br.readLine()) != null) {
                // Imprime la línea actual
                System.out.println(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
