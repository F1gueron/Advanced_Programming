package Tema_7.Listado_II;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Database {
//    public static void main(String[] args) throws IOException {
//        FileInputStream file = new FileInputStream("src/Resources/database.csv");
//        BufferedReader br = new BufferedReader(new InputStreamReader(file));
//        char lineSplitter = ';';
//
//
//        while(br.readLine() != null){
//            String line = br.readLine();
//            System.out.println(line + "\n");
//        }
//    }

    public static void main(String[] args) {
        String filePath = "src/Resources/database.csv"; // Reemplaza esto con la ruta a tu archivo
        Path path = Paths.get(filePath);


        // Ejercicio 1
        System.out.println("Ejercicio 1:");
        try (Stream<String> stream = Files.lines(path)) {
            stream.map(line -> line.split(";"))
                    .filter(fields -> fields.length > 0)
                    .map(fields -> fields[0])
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Ejercicio 2
        System.out.println("Ejercicio 2:");
        String sex = "Female";
        try (Stream<String> stream = Files.lines(path)) {
            stream.map(line -> line.split(";"))
                    .filter(fields -> fields[1].contains(sex))
                    .map(fields -> fields[0])
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 3
        System.out.println("Ejercicio 3:");
        Set<String> location =  new HashSet<>();
        try(Stream<String> stream = Files.lines(path)){
            /*stream.map(line -> line.split(";"))
                    .map(fields -> fields[4])
                    .forEach(location::add);*/
            stream.map(line -> line.split(";"))
                    .map(fields -> fields[4])
                    .distinct() // Elimina duplicados
                    .sorted() // Ordena las localizaciones
                    .forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }

        //Ejercicio 4:
        System.out.println("Ejercicio 4:");
        try(Stream<String> stream = Files.lines(path)){
            stream.skip(1)
                    .map(lines -> lines.split(";"))
                    .filter(fields -> Integer.parseInt(fields[2]) > 0 && fields[5].equals("Europe"))
                    .forEach(fields->System.out.println(fields[0]+"\t"+fields[1]));
        }catch (IOException e){
            e.printStackTrace();
        }

        //Ejercicio 5:
        System.out.println("Ejercicio 5:");
        try(Stream<String> stream = Files.lines(path)){
            int sum = stream.skip(1)
                    .map(lines -> lines.split(";"))
                    .map(columns -> Integer.parseInt(columns[10]))
                    .reduce(0,Integer::sum);
            System.out.println("Count: "+sum);
        }catch (IOException e){
            e.printStackTrace();
        }

        //Ejercicio 6:
        System.out.println("Ejercicio 6:");
        Scanner s =  new Scanner(System.in);
        //String job = s.nextLine();
        String job = "Philosopher";
        try(Stream<String> stream = Files.lines(path)){
            double max = stream.map(lines -> lines.split(";"))
                    .filter(column ->column[6].equals(job))
                    .mapToDouble(column -> Double.parseDouble(column[12]))
                    .max()
                    .orElse(0);
            System.out.println("El valor máximo de popularidad para la ocupación '" + job + "' es: " + max);
        }catch (IOException e){
            e.printStackTrace();
        }

        //Ejercicio 7
        System.out.println("Ejercicio 7:");
        try(Stream<String> stream = Files.lines(path)) {
            Optional<String[]> personajeMasPopular = stream
                    .skip(1) // Saltar la línea del encabezado
                    .map(line -> line.split(";"))
                    .filter(columns -> columns.length >= 13) // Asegurarse de que hay suficientes columnas
                    .max((columns1, columns2) -> {
                        // Comparador para encontrar el máximo basado en la popularidad
                        try {
                            double popularity1 = Double.parseDouble(columns1[12].trim());
                            double popularity2 = Double.parseDouble(columns2[12].trim());
                            return Double.compare(popularity1, popularity2);
                        } catch (NumberFormatException e) {
                            // Manejar valores que no se pueden convertir
                            return 0;
                        }
                    });

            // Imprimir el personaje más popular encontrado
            personajeMasPopular.ifPresent(columns -> {
                String nombrePersonaje = columns[1].trim(); // Nombre del personaje (asumiendo que está en la columna 1)
                String popularidad = columns[12].trim(); // Popularidad del personaje (asumiendo que está en la columna 12)
                System.out.println("Personaje más popular: " + nombrePersonaje + ", Popularidad: " + popularidad);
            });

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
