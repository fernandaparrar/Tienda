package controller;

import java.util.ArrayList;

public class Administrador extends Persona {

    private String idAdministrador;

    public Administrador() {

    }

    public Administrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }

    public String getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(String idAdministrador) {
        this.idAdministrador = idAdministrador;
    }


}
