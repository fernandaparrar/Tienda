package clases;

import java.util.ArrayList;

public class Administrador extends Persona{

    private String idAdministrador;
    private ArrayList listaProductosTienda;

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

    public ArrayList getListaProductosTienda() {
        return listaProductosTienda;
    }

    public void setListaProductosTienda(ArrayList listaProductosTienda) {
        this.listaProductosTienda = listaProductosTienda;
    }
}
