package controller;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cliente extends Persona {

    private String idCliente;
    private List<Producto> carrito = new ArrayList();

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

    public void agregarProductoCarrito(List<Producto> listGeneral) {
        Producto aux;
        int sw = 1;
        while (sw == 1) {
            int cont = 0;
            String codigo = JOptionPane.showInputDialog("Ingrese el codigo del producto que desea agregar al carrito");
            int cant = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad que desea llevar: "));
            for (Producto producto : listGeneral) {
                if (producto.getIdProducto().equals(codigo)) {
                    aux= producto;
                    aux.setCantidad(cant);
                    aux.setPrecio(producto.getPrecio()*cant);
                    carrito.add(aux);
                }
                if (cont > listGeneral.size()) {
                    JOptionPane.showMessageDialog(null, "El codigo del producton no fue identificado");
                }
                cont++;
            }
            sw = Integer.parseInt(JOptionPane.showInputDialog("Desea continuar agregando productos: Si = 1, No = 2"));
            mostrarCarrito();
        }
    }

    public void eliminarProductoCarrito(){
        mostrarCarrito();
        String opcion = JOptionPane.showInputDialog("Ingrese el codigo del producto que desea eliminar: ");
        for(Producto producto: carrito){
            if(producto.getIdProducto().equals(opcion)) {
                carrito.remove(producto);
                JOptionPane.showMessageDialog(null, "Producto eliminado");
                mostrarCarrito();
            }else {
                JOptionPane.showMessageDialog(null, "El producto no existe");
            }
        }
    }

    public void mostrarCarrito(){
        Iterator<Producto> it = carrito.iterator();
        String concat = "**Mi Carrito**\n\n";
        int i = 1;
        Producto aux;
        while (it.hasNext()) {
            aux = it.next();
            concat += i +") "+"Cod: "+aux.getIdProducto()+ " "+ aux.getNombreProducto() +" cantidad: "+ aux.getCantidad() + "\n";
            i++;
        }
        JOptionPane.showMessageDialog(null, concat);
    }


}

