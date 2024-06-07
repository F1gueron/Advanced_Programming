package Tema_3.Listado_1.Ej_1;

public class EntidadBancaria {
    private Cliente[]clientes;
    private int clientesTot = 1;
    private final int CLIENTESMAX  = 100;

    public int cuentasDescubiertas(){
        int descubiertas = 0;
        for(Cliente cliente : this.clientes){
            descubiertas += cliente.cuentasDescubiertas();
        }
        return descubiertas;
    }

    public void perteneceA(Long DNI){
        for (Cliente c : this.clientes){
            if (c.getDni().equals(DNI)){
                c.pertenecenA();
            }
        }
    }

    public void posteriorA(Fecha fecha) {
        for (Cliente c : this.clientes) {
            for (Cuenta cuenta : c.getCuentas()) {
                cuenta.abiertaPosteriorA(fecha);
            }
        }
    }

    public void darDeBaja(int nCuenta){
        for (Cliente c : this.clientes){
            c.darDeBajaCuenta(nCuenta);
        }
    }

    public void darDeAltaCuenta(int nCuenta, int saldo, Cliente cliente){
        cliente.darDeAltaCuenta(nCuenta,saldo);
    }

    public void darDeAltaCliente(Cliente cliente){
        if (clientesTot < CLIENTESMAX) {
            clientes[clientesTot++] = cliente;
        } else {
            System.out.println("El banco ha alcanzado el número máximo de clientes.");
        }
    }

    public void transferencia(Cuenta fuente, Cuenta destino, int cantidad){
        if (!fuente.checkTransferencia(cantidad)){
            System.out.println("No hay suficiente dinero");
        }else{
            fuente.sacarDinero(cantidad);
            destino.ingresarDinero(cantidad);
        }
    }
}
