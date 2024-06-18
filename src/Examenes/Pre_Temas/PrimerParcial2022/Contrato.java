package Examenes.Pre_Temas.PrimerParcial2022;

public class Contrato {

    private Fecha fechaSolicitudProducto;
    private Cliente cliente;
    private ProductoSeguridad producto;

    public Contrato(Fecha fechaSolicitudProducto, Cliente c, ProductoSeguridad producto) {
        this.fechaSolicitudProducto = fechaSolicitudProducto;
        this.cliente = c;
        this.producto = producto;
    }

    public String toString() {
        return "********************\nSolicitud de contrato: " + this.fechaSolicitudProducto + "\n" +
                this.cliente + "\n" +
                this.producto+"\n********************";
    }


    public boolean compararDNI(String DNI) {
        return this.cliente.compararDNI(DNI);
    }

    public boolean inicioPosteriorA(Fecha fecha) {
        return this.producto.inicioPosteriorA(fecha);
    }
}
