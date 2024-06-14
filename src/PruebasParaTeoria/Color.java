package PruebasParaTeoria;

public enum Color {
    azul("AZUL", 1), rojo("ROJO", 2), verde("VERDE", 3);
    private int valor;
    private String nombre;

    // Constructor privado por definición
    Color(String s, int val) {
        nombre = s;
        valor = val;
    }

    public int getValor() {
        return this.valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
    public void mostrar() {
        System.out.println(this.nombre+ " - "+this.valor);
    }
    public static void main(String[] args) {
        Color color1 = Color.azul;
        color1.mostrar();
        Color color2 = Color.verde;
        color2.mostrar();
        color2.setValor(8);
        color2.mostrar();
    }
}
