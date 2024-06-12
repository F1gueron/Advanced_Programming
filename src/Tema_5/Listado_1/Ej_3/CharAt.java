package Tema_5.Listado_1.Ej_3;

import Tema_5.Listado_1.Ej_3.Excepciones.InvalidPositionException;

public class CharAt {
    private String word;

    public CharAt(String word) {
        this.word = word;
    }

    public void getChar() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println("Position " + i + " : " + calcChar(word, i));
            } catch (InvalidPositionException e) {
                System.out.println("Error en la posición " + i);
                e.printStackTrace();
                System.out.println("Message: " + e.getMessage());
            }
        }
    }

    public char calcChar(String word, int i) throws InvalidPositionException {
        if (i < 0 || i >= word.length()) {
            throw new InvalidPositionException("Posición fuera de rango: " + i);
        } else {
            return word.charAt(i);
        }
    }

    public static void main(String[] args) {
        CharAt word = new CharAt("Hola");
        word.getChar();
    }
}
