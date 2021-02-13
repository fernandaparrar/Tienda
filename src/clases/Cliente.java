package clases;

import java.util.ArrayList;

public class Cliente extends Persona{

    private String idCliente;
    private ArrayList listaProductos;

    public Cliente() {
    }

    public Cliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(String cedula, String nombreCompleto, String direccion, String telefono, String idCliente, ArrayList listaProductos) {
        super(cedula, nombreCompleto, direccion, telefono);
        this.idCliente = idCliente;
        listaProductos = listaProductos;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public ArrayList getIstaProductos() {
        return listaProductos;
    }

    public void setIstaProductos(ArrayList istaProductos) {
        this.listaProductos = istaProductos;
    }
}
