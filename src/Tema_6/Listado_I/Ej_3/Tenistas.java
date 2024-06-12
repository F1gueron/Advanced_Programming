package Tema_6.Listado_I.Ej_3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Tenistas {
    private Set<String> names = new HashSet<>();

    private void addFromFile(String nombre) {
        File f = new File(nombre);
        if (!f.exists() || !f.isFile()) {
            throw new IllegalArgumentException("El archivo no existe o no es válido.");
        }
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split(" ");
                if (partes.length > 0) {
                    names.add(partes[0]);
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
