package Tema_3.Listado_1.Ej_1;

import java.time.LocalDate;

public class Cliente {
    private String name;
    private Long DNI;
    private Cuenta[]cuentas;
    private int numCuentas;

    public Cliente(String name, Long DNI, Cuenta[] cuentas) {
        this.name = name;
        this.DNI = DNI;
        this.cuentas = cuentas;
        this.numCuentas = (cuentas != null) ? cuentas.length : 0;
    }

    public int cuentasDescubiertas() {
        int numDescubiertas = 0;
        for(Cuenta cuenta : this.cuentas){
            if(cuenta.descubierta()){
                numDescubiertas++;
            }
        }
        return numDescubiertas;
    }

    public Long getDni() {
        return this.DNI;
    }

    public void pertenecenA() {
        System.out.println("Nombre: "+ this.name + "Cuentas: ");
        for(Cuenta c : this.cuentas){
            System.out.println(c);
        }
    }

    public Cuenta[] getCuentas() {
        return cuentas;
    }

    public void darDeBajaCuenta(int nCuenta) {
        for (int i = 0; i < numCuentas; i++) {
            if (cuentas[i].getNCuenta() == nCuenta) {
                for (int j = i; j < numCuentas - 1; j++) {
                    cuentas[j] = cuentas[j + 1];
                }
                cuentas[numCuentas - 1] = null;
                numCuentas--;
                System.out.println("La cuenta con número " + nCuenta + " ha sido dada de baja.");
                return;
            }
        }
        System.out.println("La cuenta con número " + nCuenta + " no fue encontrada.");
    }

    public void darDeAltaCuenta(int nCuenta, int saldo) {
        LocalDate fechaActual = LocalDate.now();
        Fecha fecha = new Fecha(fechaActual.getDayOfMonth(), fechaActual.getMonthValue(), fechaActual.getYear());
        cuentas[numCuentas++] = new Cuenta(saldo, nCuenta, fecha);
    }

    public String getName(){
        return this.name;
    }

    public Long getDNI(){
        return this.DNI;
    }
}
