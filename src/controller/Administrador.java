package controller;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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

    public void agregarCliente(List<Cliente> listaClientes) {
        String cedula, nombre, direccion, telefono, idCliente = "";
        List carrito = null;
        Cliente aux = new Cliente();
        int sw = 1;
        while (sw == 1) {
            int cont = 0;
            cedula = JOptionPane.showInputDialog("Ingrese la cedula del nuevo cliente: ");
            nombre = JOptionPane.showInputDialog("Ingrese el nombre completo del nuevo cliente: ");
            direccion = JOptionPane.showInputDialog("Ingrese la dirección del nuevo cliente: ");
            telefono = JOptionPane.showInputDialog("Ingrese el teléfono del nuevo cliente: ");
            idCliente = JOptionPane.showInputDialog("Ingrese el id del nuevo cliente: ");
            aux.setIdCliente(idCliente);
            aux.setCedula(cedula);
            aux.setNombreCompleto(nombre);
            aux.setDireccion(direccion);
            aux.setTelefono(telefono);
            aux.setCarrito(carrito);
            if (listaClientes.contains(aux)) {
                JOptionPane.showMessageDialog(null, "El cliente ya existe");
            } else {
                listaClientes.add(aux);
            }
            // }
            cont++;
            //}
            sw = Integer.parseInt(JOptionPane.showInputDialog("Desea continuar agregando clientes: Si = 1, No = 2"));

        }
    }
}


