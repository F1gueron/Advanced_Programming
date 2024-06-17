package Tema_7.Listado_I;

import Tema_7.Listado_I.Utils.Chequeo;
import Tema_7.Listado_I.Utils.ConcatStrings;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AlumnoPA {
    private double nota;
    private int num_matricula;
    private String expediente;

    public AlumnoPA(double nota, int num_matricula, String expediente) {
        this.nota = nota;
        this.num_matricula = num_matricula;
        this.expediente = expediente;
    }

    public boolean notaEnRango(double min, double max) {
        return this.nota >= min && this.nota <= max;
    }

    public boolean mayorNumMatriculas(int matriculas) {
        return this.num_matricula > matriculas;
    }

    public String toString() {
        return "Alumno con expediente " + this.expediente + ", nota " +
                this.nota + " y " + this.num_matricula + " números de matrícula";
    }

    public int getNumMatricula() {
        return this.num_matricula;
    }

    public static boolean empiezaConMayuscula(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        char firstChar = str.charAt(0);
        return Character.isUpperCase(firstChar);
    }

    private Double getNota() {
        return this.nota;
    }

    public static void main(String[] args) {
        List<AlumnoPA> alumnos = new ArrayList<AlumnoPA>();

        alumnos.add(new AlumnoPA(5.5,2,"q0350"));
        alumnos.add(new AlumnoPA(2.5,4,"q0351"));
        alumnos.add(new AlumnoPA(7,4,"q0352"));

        int min = 5;
        int max = 10;

        Predicate<AlumnoPA> filtroNotaEnRango = alumno -> alumno.getNota()> min && alumno.getNota() < max;


        Chequeo par = (n1,n2) -> (n1 % 2 == 0) && (n2 % 2 == 0);
        Chequeo divisible = (n1,n2) -> (n2 != 0) && (n1 % n2 == 0);
        Chequeo mayor = (n1,n2) -> n1 > n2;
        Chequeo mayorQue50 = (n1,n2) -> n1+n2 > 50;

        String Primer = "Primer String";
        String Segundo = "Segundo String";

        ConcatStrings cs = (s1,s2) -> {
            if (empiezaConMayuscula(s1) && empiezaConMayuscula(s2)) {
                return s1 + s2;
            } else {
                return "Ambas cadenas deben empezar con mayúscula.";
            }
        };

        boolean resultado = par.chequear(alumnos.get(0).getNumMatricula(), alumnos.get(1).getNumMatricula());

        System.out.println(cs.concat(Primer,Segundo));
        System.out.println();

        System.out.println("Los números de matrícula de los dos primeros alumnos son pares: " + resultado);    }
}
