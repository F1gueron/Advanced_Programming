package Examenes.Post_Temas.Enero_2023.CodigoSolucion;

import Examenes.Post_Temas.Enero_2023.CodigoSolucion.espacios.EspacioEventos;
import Examenes.Post_Temas.Enero_2023.CodigoSolucion.exceptions.NoValidDateFormat;
import Examenes.Post_Temas.Enero_2023.CodigoSolucion.exceptions.NoValidSpaceName;
import Examenes.Post_Temas.Enero_2023.CodigoSolucion.tiposeventos.TipoEvento;
import Examenes.Post_Temas.Enero_2023.CodigoSolucion.utils.Utils;

import java.util.*;

public class GestorEventos {

    // ordenados dentro de cada tipo de evento, los espacios estarán ordenados en
    // función de sus metros cuadrados. Como hay espacios que pueden celebrar más de un
    // tipo de eventos, entonces estarán referenciados en más de un sitio, pero no
    // se duplica el objeto, sino que se trata de la misma referencia.
    private Map<TipoEvento, Set<EspacioEventos>> espacios;

    // Aquí están todos con independencia del tipo de evento
    private Map<String, EspacioEventos> espaciosPorId;


    public GestorEventos() {
        this.espacios = new HashMap<>();
        this.espaciosPorId = new HashMap<>();
    }

    public void search(TipoEvento tipoEvento, int numeroPersonas, String date) throws NoValidDateFormat {

        if (!Utils.validDateFormat(date))
            throw new NoValidDateFormat();

        System.out.println("Espacios disponibles que cumplen los criterios: " + tipoEvento + " para " + numeroPersonas + " personas, el " + date);
        for (EspacioEventos espacio : this.espacios.get(tipoEvento)) {
            if (espacio.tieneCapacidad(numeroPersonas) &&
                    !espacio.isReserved(date)) {
                System.out.println(espacio);
            }
            System.out.println(("****************************"));
        }
    }

    public void search(TipoEvento tipoEvento) {

        System.out.println("Espacios disponibles para celebrar: " + tipoEvento);
        for (EspacioEventos espacio : this.espacios.get(tipoEvento)) {
            System.out.println(espacio);
            System.out.println(("****************************"));
        }
    }

    /**
     * Dado un espacio lo da de alta
     * en el sistema para que se pueda alquilar.
     *
     * @param espacio Espacio de eventos a dar de alta.
     */
    public void registrarEspacio(EspacioEventos espacio) {
        // se recorren todos los posibles valores del TipoEvento
        // IMPORTANTE, CON ESTO SE EVITA EL GET EN EspacioEventos para que diga los
        // eventos posibles
        this.espaciosPorId.put(espacio.getName(),espacio);

        TipoEvento[] eventos = TipoEvento.values();
        for (TipoEvento evento : eventos) {
            if (espacio.puedeCelebrar(evento)) {
                if (this.espacios.get(evento) == null) {
                    this.espacios.put(evento, new TreeSet<>());
                }
                this.espacios.get(evento).add(espacio);
            }
        }
    }


    public void reservar(String nombreEspacio, String date) throws NoValidSpaceName, NoValidDateFormat {

        if (this.espaciosPorId.get(nombreEspacio) == null)
            throw new NoValidSpaceName();
        if (!Utils.validDateFormat(date))
            throw new NoValidDateFormat();

        if (this.espaciosPorId.get(nombreEspacio).isReserved(date)) {
            System.out.println("No se puede reservar en la fecha dada porque ya está reservado");
        }
        else {
            this.espaciosPorId.get(nombreEspacio).reservar(date);
        }
    }

    public void borrarReserva(String nombreEspacio, String date) throws NoValidSpaceName, NoValidDateFormat {

        if (this.espaciosPorId.get(nombreEspacio) == null)
            throw new NoValidSpaceName();
        if (!Utils.validDateFormat(date))
            throw new NoValidDateFormat();

        if (!this.espaciosPorId.get(nombreEspacio).isReserved(date)) {
            System.out.println("No se puede borrar la reserva en la fecha dada porque no está reservado");
        }
        else {
            this.espaciosPorId.get(nombreEspacio).borrarReserva(date);
        }
    }
}

