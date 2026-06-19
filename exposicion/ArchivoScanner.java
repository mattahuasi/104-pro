package exposicion;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArchivoScanner {

    public static void main(String[] args) {
        // Definimos la ruta y el nombre del archivo
        String ruta = "./exposicion/archivo_scanner.txt";

        // ----------------- ESCRITURA -----------------
        try {
            // APERTURA: FileWriter abre (o crea) el archivo en modo escritura
            FileWriter escritor = new FileWriter(ruta);

            // ESCRITURA: Metemos texto dentro del documento
            escritor.write("Hola, esta es la primera linea.\n");
            escritor.write("Esta es la segunda linea con FileWriter.");

            // CIERRE: ¡Obligatorio! Si no cierras, el texto no se guarda en el disco
            escritor.close();
            System.out.println("Archivo guardado y cerrado con exito.");
        } catch (IOException e) {
            // Atrapa cualquier error, por ejemplo, si no hay permisos para escribir
            System.out.println("Error al escribir: " + e.getMessage());
        }

        // ----------------- LECTURA -----------------
        try {
            // Objeto File que representa nuestro archivo físico
            File archivo = new File(ruta);

            // APERTURA: Inicializamos el Scanner pasándole el archivo a leer
            Scanner lector = new Scanner(archivo);

            System.out.println("\nContenido leído:");

            // LECTURA: Un ciclo que verifica si existe una siguiente línea
            while (lector.hasNextLine()) {
                // Extrae la línea actual y la guarda en un String
                String linea = lector.nextLine();
                // Imprime la línea en la consola
                System.out.println(linea);
            }

            // CIERRE: Liberamos el archivo para que otros programas puedan usarlo
            lector.close();
        } catch (IOException e) {
            System.out.println("Archivo no encontrado: " + e.getMessage());
        }
    }
}
