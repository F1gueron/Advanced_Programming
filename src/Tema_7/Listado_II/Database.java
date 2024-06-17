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
        try (Stream<String> stream = Files.lines(path)) {
            /*Set<String> location =  new HashSet<>();
            stream.map(line -> line.split(";"))
                    .map(fields -> fields[4])
                    .forEach(location::add);*/
            stream.map(line -> line.split(";"))
                    .map(fields -> fields[4])
                    .distinct() // Elimina duplicados
                    .sorted() // Ordena las localizaciones
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 4:
        System.out.println("Ejercicio 4:");
        try (Stream<String> stream = Files.lines(path)) {
            stream.skip(1)
                    .map(lines -> lines.split(";"))
                    .filter(fields -> Integer.parseInt(fields[2]) > 0 && fields[5].equals("Europe"))
                    .forEach(fields -> System.out.println(fields[0] + "\t" + fields[1]));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 5:
        System.out.println("Ejercicio 5:");
        try (Stream<String> stream = Files.lines(path)) {
            int sum = stream.skip(1)
                    .map(lines -> lines.split(";"))
                    .map(columns -> Integer.parseInt(columns[10]))
                    .reduce(0, Integer::sum);
            System.out.println("Count: " + sum);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 6:
        System.out.println("Ejercicio 6:");
        Scanner s = new Scanner(System.in);
        //String job = s.nextLine();
        String job = "Philosopher";
        try (Stream<String> stream = Files.lines(path)) {
            double max = stream.map(lines -> lines.split(";"))
                    .filter(column -> column[6].equals(job))
                    .mapToDouble(column -> Double.parseDouble(column[12]))
                    .max()
                    .orElse(0);
            System.out.println("El valor máximo de popularidad para la ocupación '" + job + "' es: " + max);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 7
        System.out.println("Ejercicio 7:");
        try (Stream<String> stream = Files.lines(path)) {
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
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 8:
        System.out.println("Ejercicio 8:");
        //String domain = s.nextLine();
        String domain = "Institutions";
        try (Stream<String> stream = Files.lines(path)) {
            List<String[]> list = stream.map(lines -> lines.split(";"))
                    .filter(column -> column[8].equals(domain))
                    .toList();
            System.out.println("En la base de datos:");
            for (int i = 0; i < list.size(); i++) {
                String[] columns = list.get(i);
                System.out.println(columns[0] + (i + 1) + ",");
            }
            System.out.println("pertenecen al dominio de " + domain);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 9
        System.out.println("Ejercicio 9:");
        try (Stream<String> stream = Files.lines(path)) {
            List<String> industries = stream.skip(1)
                    .map(lines -> lines.split(";"))
                    .map(columns -> columns[7])
                    .distinct()
                    .toList();

            for (String industry : industries) {
                try (Stream<String> stream2 = Files.lines(path)) {
                    List<String> occupations = stream2.map(lines -> lines.split(";"))
                            .filter(columns -> columns[7].equals(industry))
                            .map(columns -> columns[6])
                            .distinct()
                            .toList();
                    System.out.println("For industry " + industry + " the occupations are:");
                    for (String occupate : occupations) {
                        System.out.println(occupate);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 10
        System.out.println("Ejercicio 10");
        //String word = s.nextLine().toLowerCase();
        String word = "ab";
        try (Stream<String> stream = Files.lines(path)) {
            stream.skip(1)
                    .filter(columns -> columns.toLowerCase().contains(word))
                    .map(lines -> lines.split(";"))
                    .map(columns -> columns[0])
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 11
        System.out.println("Ejercicio 11");
        //int longtidud = s.nextInt();
        int longtidud = 5;
        try (Stream<String> stream = Files.lines(path)) {
            stream.skip(1)
                    .map(lines -> lines.split(";"))
                    .filter(columns -> columns[0].length() == longtidud)
                    .forEach(columns -> System.out.println("Name: " + columns[0] + " Occupation: " + columns[6]));
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 12
        System.out.println("Ejercicio 12");
        //String column = s.nextLine();
        String column = "country";
        try (Stream<String> stream = Files.lines(path)) {
            String firstLine = stream.findFirst().orElse("");

            // Dividir la primera línea en un arreglo de cadenas usando ;
            List<String> headers = Arrays.stream(firstLine.split(";"))
                    .toList();

            System.out.println("Headers del archivo:");
            headers.forEach(System.out::println);
            int index = headers.indexOf(column);
            try (Stream<String> stream1 = Files.lines(path)) {
                int finalIndex = index;
                stream1.skip(1)
                        .map(lines -> lines.split(";"))
                        .map(columns -> columns[finalIndex])
                        .distinct()
                        .sorted((o1, o2) -> {
                            // Intentar convertir los elementos a enteros
                            Integer num1 = tryParseInt(o1);
                            Integer num2 = tryParseInt(o2);

                            if (num1 != null && num2 != null) {
                                return Integer.compare(num1, num2); // Orden numérico de menor a mayor
                            } else {
                                return o1.compareTo(o2); // Orden alfabético para cadenas
                            }
                        }).forEach(System.out::println);

            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Ejercicio 13
        System.out.println("Ejercicio 13");
        try{
            Stream<String> stream = Files.lines(path);
            stream.map(lines -> lines.split(";"))
                    .map(columns -> columns[0])
//                    .sorted((String o1,String o2) -> {
//                        if (o1.length() > o2.length()){
//                            return 1;
//                        } else if (o1.length() < o2.length()) {
//                            return -1;
//                        }
//                        return 0;
//                    })
                    .sorted(Comparator.comparingInt(String::length))
                    .forEach(System.out::println);
        }catch (IOException e){
            e.printStackTrace();
        }


        //Sol profe:

//        try {
//            Stream<String> lines = Files.lines(path);
//            List<String[]> data = lines.skip(1) // Saltar la primera línea (encabezados)
//                    .map(line -> line.split(";"))
//                    .toList();
//
//            List<String> industries = data.stream()
//                    .map(columns -> columns[7])
//                    .distinct()
//                    .toList();
//
//            for (String industry : industries) {
//                List<String> occupations = data.stream()
//                        .filter(columns -> columns[7].equals(industry))
//                        .map(columns -> columns[6])
//                        .distinct()
//                        .toList();
//
//                System.out.println("For industry " + industry + " the occupations are:");
//                occupations.forEach(System.out::println);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }
    private static Integer tryParseInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null; // Si no se puede convertir, devuelve null
        }
    }
}
