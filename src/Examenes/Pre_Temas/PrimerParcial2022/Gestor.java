package Examenes.Pre_Temas.PrimerParcial2022;

public class Gestor {
    private Contrato[] contratos;

    public Gestor(Contrato[] contratos) {
        this.contratos = contratos;
    }

    public void mostrarCliente(String DNI){
        for(Contrato c : contratos){
            if(c!= null && c.compararDNI(DNI)){
                System.out.println(c);
            }
        }
    }

    public void posteriorA(Fecha fecha){
        for(Contrato c : contratos){
            if(c!= null && c.inicioPosteriorA(fecha)){
                System.out.println(c);
            }
        }
    }
}
