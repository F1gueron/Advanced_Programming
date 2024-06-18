package Examenes.Post_Temas.Enero_2024;


import Examenes.SolucionSegundoParcial2024.exceptions.FechaInexistenteException;

import java.util.*;

public class JornadaGastronómica {
    private String ciudad;
    private Date fecha;
    private List<Pedido> pedidos;

    public JornadaGastronómica(String ciudad, Date fecha, List<Pedido> pedidos) {
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.pedidos = new ArrayList<>();
    }

    public JornadaGastronómica(String ciudad, Date fecha) {
        this.ciudad = ciudad;
        this.fecha = fecha;
        this.pedidos = new ArrayList<>();
    }

    public void nuevoPedido(Pedido pedido){
        this.pedidos.add(pedido);
    }

    public boolean ocupado(JornadaGastronómica jornadaGastronómica) {
        return this.ciudad == jornadaGastronómica.getCiudad() && this.fecha == jornadaGastronómica.getFecha();
    }

    public String getCiudad() {
        return this.ciudad;
    }

    public Date getFecha(){
        return this.fecha;
    }

    public int getNumeroPedidos(){
        return this.pedidos.size();
    }

    public boolean mismaCiudad(String ciudad) {
        return this.ciudad.equals(ciudad);
    }

    public void mostrarIngrediente(String ingrediente) {
        for (Pedido p : this.pedidos){
            if(p.tieneIngrediente(ingrediente)){
                System.out.println(p);
            }
        }
    }

    @Override
    public String toString() {
        return "JornadaGastronómica{" +
                "ciudad='" + ciudad + '\'' +
                ", fecha=" + fecha +
                ", pedidos=" + pedidos +
                '}';
    }

    public static void main(String[] args) {
        Set<String> ingredientes = new HashSet<>();
        ingredientes.add("pasta");
        ingredientes.add("tomate");
        ingredientes.add("sal");
        ingredientes.add("agua");
        Plato p1 = new Plato(8.0, "Macrrones con tomate", ingredientes);
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
        } catch (DemasiadosPlatoException e) {
            throw new RuntimeException(e);
        }

        //System.out.println(menu);


        Date fecha1 = new Date(2024, 1, 11);
        JornadaGastronómica jornada1 = new JornadaGastronómica("Madrid", fecha1);
        jornada1.nuevoPedido(p1);
        jornada1.nuevoPedido(menu);

        //System.out.println("***************************");
        //System.out.println(jornada1);

        Date nuevaFecha = new Date(2023, 12, 20);
        JornadaGastronómica jornada2 = new JornadaGastronómica("Segovia", nuevaFecha);
        jornada2.nuevoPedido(p1);
        jornada2.nuevoPedido(menu);
        jornada2.nuevoPedido(menu);

        Date otraFecha = new Date(2023, 10, 5);

        JornadaGastronómica jornada3 = new JornadaGastronómica("Segovia", otraFecha);
        jornada3.nuevoPedido(p1);
        jornada3.nuevoPedido(menu);
        jornada3.nuevoPedido(menu);
        jornada3.nuevoPedido(menu);
        jornada3.nuevoPedido(menu);
        jornada3.nuevoPedido(p1);


        GestorJornadas gestor = new GestorJornadas();
        gestor.nuevaJornada(jornada1);
        gestor.nuevaJornada(jornada2);
        gestor.nuevaJornada(jornada3);

        System.out.println(gestor);


        Date otraaaa = new Date(2023, 10, 5);

        List<JornadaGastronómica> jornadas = gestor.buscarJornadaPorFecha(otraaaa);
        System.out.println("Las jornadas gastronómicas celebradas en la fecha " + otraaaa + " son:\n");
        for (JornadaGastronómica jg : jornadas) {
            System.out.println(jg);
        }

        System.out.println();

        String ciudad = "Segovia";
        List<JornadaGastronómica> jornadas1 = gestor.buscarPorCiudad(ciudad);
        System.out.println("Las jornadas gastronómicas celebradas en " + ciudad + " son:\n");
        for (JornadaGastronómica jg : jornadas) {
            System.out.println(jg);
        }

        System.out.println("Pedidos con cebolla");
        gestor.pedidosPorIngrediente("cebolla");
    }
}
