package Examenes.Post_Temas.Enero_2023.CodigoSolucion;

import Examenes.Post_Temas.Enero_2023.CodigoSolucion.espacios.NaveChic;
import Examenes.Post_Temas.Enero_2023.CodigoSolucion.espacios.NaveChicHotel;
import Examenes.Post_Temas.Enero_2023.CodigoSolucion.exceptions.NoValidDateFormat;
import Examenes.Post_Temas.Enero_2023.CodigoSolucion.tiposeventos.TipoEvento;
import Examenes.Post_Temas.Enero_2023.CodigoSolucion.espacios.EspacioInfantil;
import Examenes.Post_Temas.Enero_2023.CodigoSolucion.espacios.Loft;

public class Main {

    public static void main(String[] args) {
        GestorEventos gestor = new GestorEventos();

        gestor.registrarEspacio(new EspacioInfantil(30, "dir 1", "Esp.Infantil 1", 50, 2023, 15));
        gestor.registrarEspacio(new EspacioInfantil(50, "dir 2", "Esp.Infantil 2", 70, 2023, 10));
        gestor.registrarEspacio(new Loft(300, "dir 3", "Loft 1", 100, 2023));
        gestor.registrarEspacio(new Loft(200, "dir 4", "Loft 2", 80, 2023));
        gestor.registrarEspacio(new Loft(350, "dir 5", "Loft 3", 120, 2023));
        gestor.registrarEspacio(new NaveChic(500, "dir 6", "Nave Chic 1", 300, 2023));
        gestor.registrarEspacio(new NaveChic(800, "dir 7", "Nave Chic 2", 500, 2023));
        gestor.registrarEspacio(new NaveChicHotel(750, "dir 8", "Nave Chic Hotel 1", 400, 2023, 15));
        gestor.registrarEspacio(new NaveChicHotel(1050, "dir 9", "Nave Chic Hotel 2", 400, 2023, 25));

        //gestor.search(TipoEvento.BODA);
        try {
            gestor.search(TipoEvento.FIESTA_INFANTIL,60, "22/01/2023");
        } catch (NoValidDateFormat e) {
            System.out.println(e);
        }


    }


}
