package Examenes.PrimerParcial2022.Productos.Seguridad;

import Examenes.PrimerParcial2022.Fecha;
import Examenes.PrimerParcial2022.Productos.SeguridadPersonal;

public class VigilanteSeguridad extends SeguridadPersonal {

    private int jornadasContrato;

    private boolean cualificados;

    public VigilanteSeguridad(double coste, Fecha inicioContrato, Fecha finContrato, int jornadasContrato, boolean cualificados) {
        super(coste, inicioContrato, finContrato, cualificados);
        this.jornadasContrato = jornadasContrato;
    }


}
