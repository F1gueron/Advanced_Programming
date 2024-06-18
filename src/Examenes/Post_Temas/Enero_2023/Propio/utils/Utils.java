package Examenes.Post_Temas.Enero_2023.Propio.utils;

public class Utils {
    /**
     * Recibe una cadena con una fecha y se comprueba que tenga el formato
     * DD/MM/AAAA
     *
     * @param date String con una fecha
     * @return Valor lógico que indica si la cadena cumple el formato esperado o no.
     */
    public static boolean validDateFormat(String date) {
        int firstOffset = date.indexOf('/');
        int lastOffset = date.lastIndexOf('/');
        return (firstOffset > 0 && lastOffset > firstOffset && lastOffset < date.length() - 1);
    }
}
