package controller;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente extends Persona {

    private String idCliente;
    private List<Producto> carrito = new ArrayList();
    private int totalPagar = 0;

    public Cliente() {

    }

    public Cliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public Cliente(String cedula, String nombreCompleto, String direccion, String telefono, String idCliente, ArrayList carrito) {
        super(cedula, nombreCompleto, direccion, telefono);
        this.idCliente = idCliente;
        carrito = carrito;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public List<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Producto> carrito) {
        this.carrito = carrito;
    }

    public void agregarProductoCarrito(SuperMercado superMercado) {
        int sw = 1;
        while (sw == 1) {
            int cont = 0;
            String codigo = JOptionPane.showInputDialog(superMercado.mostrarListaProductos() + "\n\nIngrese el codigo del producto que desea agregar al carrito\nEjemplo: (PR06)");
            int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea llevar: "));
            for (Producto producto : superMercado.getListaProductos()) {
                if (producto.getIdProducto().equals(codigo)) {
                    producto.setCantidad(producto.getCantidad() - cant);
                    totalPagar = totalPagar + producto.getPrecio() * cant;
                    carrito.add(new Producto(producto.getIdProducto(), producto.getNombreProducto(), cant, producto.getPrecio() * cant));
                    break;
                }
                cont++;
                if (cont == superMercado.getListaProductos().size()) {
                    JOptionPane.showMessageDialog(null, "El codigo del producto que fue ingresado no existe");
                }
            }
            sw = Integer.parseInt(JOptionPane.showInputDialog("Desea continuar agregando productos: Si = 1, No = 2"));
            JOptionPane.showMessageDialog(null, mostrarCarrito());
        }
        if (sw != 1) {
            JOptionPane.showMessageDialog(null, "El total a pagar es: " + totalPagar);
        }
    }

    public void eliminarProductoCarrito() {
        String opcion = JOptionPane.showInputDialog(mostrarCarrito() + "Ingrese el codigo del producto que desea eliminar: ");
        int sw = 1;
        while (sw == 1) {
            int i = 0;
            for (Producto producto : carrito) {
                if (producto.getIdProducto().equals(opcion)) {
                    carrito.remove(producto);
                    JOptionPane.showMessageDialog(null, "Producto eliminado");
                    JOptionPane.showMessageDialog(null, mostrarCarrito());
                    break;
                }
                i++;
                if(i == carrito.size()){
                    JOptionPane.showMessageDialog(null, "El producto no existe");
                }
            }
            sw = Integer.parseInt(JOptionPane.showInputDialog("Desea continuar eliminado productos? Si = 1, No = 2"));
        }
    }

    public String mostrarCarrito() {
        Iterator<Producto> it = carrito.iterator();
        String concat = "**Mi Carrito**\n\n";
        int i = 1;
        Producto aux;
        while (it.hasNext()) {
            aux = it.next();
            concat += i + ") " + "Cod: " + aux.getIdProducto() + " " + aux.getNombreProducto() + " cantidad: " +
                    aux.getCantidad() + " Precio: " + aux.getPrecio() + "\n";
            i++;
        }
        return concat;
    }


}

