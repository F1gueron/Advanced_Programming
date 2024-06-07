package Examenes.PrimerParcial2022.Productos;

import Examenes.PrimerParcial2022.Fecha;
import Examenes.PrimerParcial2022.ProductoSeguridad;

public class AlarmasHogar extends ProductoSeguridad {

    private int numeroCamaras;

    public AlarmasHogar(double coste, Fecha inicioContrato, Fecha finContrato, int numeroCamaras) {
        super(50, inicioContrato, finContrato);
        this.numeroCamaras = numeroCamaras;
        if (this.numeroCamaras > 5) {
            super.incrementarPrecio(this.numeroCamaras * 5);
        }
    }

    @Override
    protected String descripcionCoste() {
        return "Alarma de hogar con "+this.numeroCamaras;
    }
}
