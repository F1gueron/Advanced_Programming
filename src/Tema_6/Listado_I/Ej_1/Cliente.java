package Tema_6.Listado_I.Ej_1;

import Tema_6.Listado_I.Ej_1.Excepciones.TelefonoNotFoundException;

import java.util.HashSet;
import java.util.Set;

public class Cliente {
    private String name;
    private String[] apellidos = new String[2];
    private String DNI;
    private Set<Integer> telefonos = new HashSet<>();

    public void addTelefono(int telefono){
        this.telefonos.add(telefono);
    }

    public void deleteTelefono(int telefono) throws TelefonoNotFoundException {
        if (telefonos.contains(telefono)) {
            telefonos.remove(telefono);
        } else {
            throw new TelefonoNotFoundException();
        }
    }


}
