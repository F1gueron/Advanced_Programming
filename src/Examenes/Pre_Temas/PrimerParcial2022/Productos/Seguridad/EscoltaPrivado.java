package Examenes.Pre_Temas.PrimerParcial2022.Productos.Seguridad;

import Examenes.Pre_Temas.PrimerParcial2022.Fecha;
import Examenes.Pre_Temas.PrimerParcial2022.Productos.SeguridadPersonal;

public class EscoltaPrivado extends SeguridadPersonal {

    private int horasContrato;

    private boolean cualificados;

    public EscoltaPrivado(double coste, Fecha inicioContrato, Fecha finContrato, int horasContrato, boolean cualificados) {
        super(coste, inicioContrato, finContrato, cualificados);
        this.horasContrato = horasContrato;
    }


}
