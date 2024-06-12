package Examenes.SolucionSegundoParcial2024;


import Examenes.SolucionSegundoParcial2024.exceptions.FechaInexistenteException;
import Examenes.SolucionSegundoParcial2024.pedidos.menus.Menu;
import Examenes.SolucionSegundoParcial2024.exceptions.MenuCompletoException;
import Examenes.SolucionSegundoParcial2024.pedidos.Pedido;
import Examenes.SolucionSegundoParcial2024.pedidos.Plato;
import Examenes.SolucionSegundoParcial2024.pedidos.menus.MenuLigero;
import Examenes.SolucionSegundoParcial2024.utils.Fecha;

import java.util.*;

public class JornadaGastronomica {
    private String ciudad;
    private Fecha fecha;

    private List<Pedido> pedidos;


    private int numeroMenusPedidos;

    public JornadaGastronomica(String ciudad, Fecha fecha) {
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.numeroMenusPedidos = 0;
        this.pedidos = new ArrayList<>();
    }

    public void añadirPedido(Pedido p) {
        if (!p.platoUnico()) {
            this.numeroMenusPedidos++;
        }
        this.pedidos.add(p);
    }

    public int getNumeroMenusPedidos() {
        return this.numeroMenusPedidos;
    }

    public int getNumeroPlatosUnicosPedidos() {
        return this.pedidos.size() - this.numeroMenusPedidos;
    }

    public int getNumeroPedidos() {
        return this.pedidos.size();
    }

    public void mostrarPedidosPorIngrediente(String ingrediente) {
        System.out.println("Pedidos realizados con ingrediente: " + ingrediente);
        for (Pedido p : this.pedidos) {
            if (p.tieneIngrediente(ingrediente))
                System.out.println(p);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JornadaGastronomica that = (JornadaGastronomica) o;
        return Objects.equals(ciudad, that.ciudad) && Objects.equals(fecha, that.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ciudad, fecha);
    }

    public boolean mismaCiudad(String ciudad) {
        return this.ciudad.equalsIgnoreCase(ciudad);
    }

    public Fecha getFecha() {
        return this.fecha;
    }

    @Override
    public String toString() {
        return "JornadaGastronomica celebrada en " +
                this.ciudad + ", el " + this.fecha +
                "\n Número de menús pedidos: " + this.getNumeroMenusPedidos() +
                "\n Número de platos únicos pedidos: " + this.getNumeroPlatosUnicosPedidos()
                + "\n Número de pedidos total: " + this.getNumeroPedidos();
    }

    public static void main(String[] args) {
        Set<String> ingredientes = new HashSet<>();
        ingredientes.add("pasta");
        ingredientes.add("tomate");
        ingredientes.add("sal");
        ingredientes.add("agua");
        Plato p1 = new Plato(8, "Macarrones con tomate", ingredientes);
        //System.out.println(p1);

        Menu menu = new MenuLigero();
        ingredientes = new HashSet<>();
        ingredientes.add("cebolla");
        ingredientes.add("vino blanco");
        Plato p2 = new Plato(6.5, "sopa de cebolla", ingredientes);

        ingredientes = new HashSet<>();
        ingredientes.add("queso");
        ingredientes.add("huevos");
        ingredientes.add("azucar");
        ingredientes.add("harina");
        ingredientes.add("nata");
        Plato p3 = new Plato(5, "tarta de queso", ingredientes);
        try {
            menu.añadirPlato(p2);
            menu.añadirPlato(p3);
        } catch (MenuCompletoException e) {
            throw new RuntimeException(e);
        }

        //System.out.println(menu);


        Fecha fecha1 = new Fecha(11, 1, 2024);
        JornadaGastronomica jornada1 = new JornadaGastronomica("Madrid", fecha1);
        jornada1.añadirPedido(p1);
        jornada1.añadirPedido(menu);

        //System.out.println("***************************");
        //System.out.println(jornada1);

        Fecha nuevaFecha = new Fecha(20, 12, 2023);
        JornadaGastronomica jornada2 = new JornadaGastronomica("Segovia", nuevaFecha);
        jornada2.añadirPedido(p1);
        jornada2.añadirPedido(menu);
        jornada2.añadirPedido(menu);

        Fecha otraFecha = new Fecha(5, 10, 2023);

        JornadaGastronomica jornada3 = new JornadaGastronomica("Segovia", otraFecha);
        jornada3.añadirPedido(p1);
        jornada3.añadirPedido(menu);
        jornada3.añadirPedido(menu);
        jornada3.añadirPedido(menu);
        jornada3.añadirPedido(menu);
        jornada3.añadirPedido(p1);


        GestorJornadasGastronomicas gestor = new GestorJornadasGastronomicas();
        gestor.añadirJornada(jornada1);
        gestor.añadirJornada(jornada2);
        gestor.añadirJornada(jornada3);

        System.out.println(gestor);


        Fecha otraaaa = new Fecha(5, 10, 2023);

        try {
            List<JornadaGastronomica> jornadas = gestor.jornadasEnFecha(otraaaa);
            System.out.println("Las jornadas gastronómicas celebradas en la fecha " + otraaaa + " son:\n");
            for (JornadaGastronomica jg : jornadas) {
                System.out.println(jg);
            }
        } catch (FechaInexistenteException e) {
            throw new RuntimeException(e);
        }

        System.out.println();

        String ciudad = "Segovia";
        List<JornadaGastronomica> jornadas = gestor.jornadasPorCiudad(ciudad);
        System.out.println("Las jornadas gastronómicas celebradas en " + ciudad + " son:\n");
        for (JornadaGastronomica jg : jornadas) {
            System.out.println(jg);
        }

        gestor.mostrarPedidosPorIngrediente("cebolla");
    }


}
