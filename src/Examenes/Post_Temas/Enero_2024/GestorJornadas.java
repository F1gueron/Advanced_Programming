package Examenes.Post_Temas.Enero_2024;

import java.util.*;

public class GestorJornadas {
    public Set<JornadaGastronómica> jornadas;
    public Map<Date, List<JornadaGastronómica>> jornadaFecha;

    public GestorJornadas() {
        this.jornadas = new TreeSet<>(new ComparadorJornada());
        this.jornadaFecha = new HashMap<>();
    }

    public void nuevaJornada(JornadaGastronómica jornada){
        if(this.jornadaDisponible(jornada)){
            this.jornadas.add(jornada);
            this.put(jornada.getFecha(),jornada,jornadaFecha);
        }
    }

    private void put(Date fecha, JornadaGastronómica jornada, Map<Date, List<JornadaGastronómica>> jornadaFecha) {
        jornadaFecha.computeIfAbsent(fecha, k -> new ArrayList<>()).add(jornada);
    }

    private boolean jornadaDisponible(JornadaGastronómica jornadaGastronómica) {
        for (JornadaGastronómica jornadaGastronómica1 : this.jornadas){
            if(jornadaGastronómica1.ocupado(jornadaGastronómica)){
                return false;
            }
        }
        return true;
    }

    public List<JornadaGastronómica> buscarJornadaPorFecha(Date fecha){
        try{
            List<JornadaGastronómica> jornadasEnFecha = jornadaFecha.get(fecha);
            return new ArrayList<>(jornadasEnFecha);
        }catch (NullPointerException e){
            e.printStackTrace();
            return null;
        }
    }

    public List<JornadaGastronómica> buscarPorCiudad(String ciudad){
        return this.jornadas.stream().filter(j -> j.mismaCiudad(ciudad)).toList();
    }

    public void pedidosPorIngrediente(String ingrediente){
        for(JornadaGastronómica j : this.jornadas){
            j.mostrarIngrediente(ingrediente);
        }
    }


}
