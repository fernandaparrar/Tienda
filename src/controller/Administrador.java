package controller;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Administrador extends Persona {

    private String idAdministrador;
    private List<Cliente> clientes = new ArrayList();

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

    public void agregarCliente(List<Cliente> listaClientes, SuperMercado superMercado) {
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
                JOptionPane.showMessageDialog(null, "Cliente agregado\n\n" + superMercado.mostrarListaProductos());
            }
            // }
            cont++;
            //}
            sw = Integer.parseInt(JOptionPane.showInputDialog("Desea continuar agregando clientes: Si = 1, No = 2"));

        }
    }

    public void editarDatos(List<Cliente> listaClientes, SuperMercado superMercado) {
        superMercado.mostrarListaClienteAdmin();
        String nuevo;
        int sw = 1;
        while (sw == 1) {
            String cedula = JOptionPane.showInputDialog("Ingrese la cedula del cliente que quiere editar: ");
            int sw2 = 0;
            for (Cliente cliente1 : listaClientes) {
                if (cliente1.getCedula().equals(cedula)) {
                    String opcion;
                    opcion = JOptionPane.showInputDialog("Ingresa el número del dato que desea editar: \n\n" +
                            "1. Nombre \n" + "2. Direccion \n" + "3. Telefono \n" + "4. Id \n");
                    switch (opcion) {
                        case "1":
                            nuevo = JOptionPane.showInputDialog("Ingrese el nuevo nombre: ");
                            cliente1.setNombreCompleto(nuevo);
                            sw2 = 1;
                            break;
                        case "2":
                            nuevo = JOptionPane.showInputDialog("Ingrese la nueva dirección: ");
                            cliente1.setDireccion(nuevo);
                            sw2 = 1;
                            break;
                        case "3":
                            nuevo = JOptionPane.showInputDialog("Ingrese el nuevo teléfono: ");
                            cliente1.setTelefono(nuevo);
                            sw2 = 1;
                            break;
                        case "4":
                            nuevo = JOptionPane.showInputDialog("Ingrese el nuevo id: ");
                            cliente1.setIdCliente(nuevo);
                            sw2 = 1;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Opción incorrecta.\nPor favor ingrese una opcion valida");
                            break;
                    }
                    if( sw2 == 1 )
                        break;
                }
            }
            if( sw2 == 1 ){
                sw = Integer.parseInt(JOptionPane.showInputDialog("Cliente editado correctamente. \nDesea continuar editando clientes: Si = 1, No = 2"));
            }else{
                sw = Integer.parseInt(JOptionPane.showInputDialog("Cliente no encontrado.\nDesea continuar editando clientes: Si = 1, No = 2"));
            }
        }
    }

    public void eliminarCliente(List<Cliente> listaClientes, SuperMercado superMercado) {
       String cedula = JOptionPane.showInputDialog("Ingrese la cedula del cliente que desea eliminar: ");
        int sw = 1;
        while (sw == 1) {
            int i = 0;
            for (Cliente cliente : listaClientes) {
                if (cliente.getCedula().equals(cedula)) {
                    listaClientes.remove(cliente);
                    JOptionPane.showMessageDialog(null, "Cliente eliminado\n" + superMercado.mostrarListaProductos());
                    break;
                }
                i++;
                if(i == listaClientes.size()){
                    JOptionPane.showMessageDialog(null, "El cliente no existe");
                }
            }
            sw = Integer.parseInt(JOptionPane.showInputDialog("Desea continuar eliminando clientes? Si = 1, No = 2"));
        }
    }

    public void agregarnuevoProductoAdmin(List<Producto> listProductos, SuperMercado superMercado){
        JOptionPane.showMessageDialog(null, superMercado.mostrarListaProductos());
        String idProducto, nombre, tipo, fechaVencimiento = "";
        int cantidad, costo, precio = 0;
        Producto aux = new Producto();
        int sw = 1;
        while (sw == 1) {
            int cont = 0;
            idProducto = JOptionPane.showInputDialog("Ingrese el id del nuevo producto: ");
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del nuevo producto: ");
            tipo = JOptionPane.showInputDialog("Ingrese tipo del nuevo producto: ");
            fechaVencimiento = JOptionPane.showInputDialog("Ingrese la fecha de vencimiento del nuevo producto: ");
            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad del nuevo producto: "));
            costo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo del nuevo producto: "));
            precio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el precio del nuevo producto: "));
            aux.setIdProducto(idProducto);
            aux.setNombreProducto(nombre);
            aux.setTipoProducto(tipo);
            aux.setFechaVencimiento(fechaVencimiento);
            aux.setCantidad(cantidad);
            aux.setCosto(costo);
            aux.setPrecio(precio);
            if (listProductos.contains(aux)) {
                JOptionPane.showMessageDialog(null, "El producto ya existe");
            } else {
                listProductos.add(aux);
                JOptionPane.showMessageDialog(null, "Podructo agregado \n" + superMercado.mostrarListaProductos());
            }
            // }
            cont++;
            //}
            sw = Integer.parseInt(JOptionPane.showInputDialog("¡Desea continuar agregando productos?: Si = 1, No = 2"));

        }
    }

    public void eliminarProducto(List<Producto> listaProductos, SuperMercado superMercado) {
        String idProducto = JOptionPane.showInputDialog(superMercado.mostrarListaProductos()  +
                "\n\n Ingrese el id del producto que desea eliminar: ");
        int sw = 1;
        while (sw == 1) {
            int i = 0;
            for (Producto producto : listaProductos) {
                if (producto.getIdProducto().equals(idProducto)){
                    listaProductos.remove(producto);
                    JOptionPane.showMessageDialog(null, "Producto eliminado\n\n" + superMercado.mostrarListaProductos());
                    break;
                }
                i++;
                if(i == listaProductos.size()){
                    JOptionPane.showMessageDialog(null, "El producto no existe");
                }
            }
            sw = Integer.parseInt(JOptionPane.showInputDialog("Desea continuar eliminando productos? Si = 1, No = 2"));
        }
    }

    public void editarProducto(List<Producto> listaProductos, SuperMercado superMercado){
        superMercado.mostrarListaProductosAdmin();
        String nuevo;
        int sw = 1;
        while (sw == 1) {
            String idProducto = JOptionPane.showInputDialog("Ingrese el id del producto que desea eliminar: ");
            int sw2 = 0;
            for (Producto producto : listaProductos) {
                if (producto.getIdProducto().equals(idProducto)) {
                    String opcion;
                    opcion = JOptionPane.showInputDialog("Ingresa el número del dato que desea editar: \n\n" +
                            "1. idProducto \n" + "2. Nombre \n" + "3. Tipo \n" + "4. Cantidad \n" + "5. Costo \n" +
                            "6. Precio \n" + "7.Fecha de vencimiento \n");
                    switch (opcion) {
                        case "1":
                            nuevo = JOptionPane.showInputDialog("Ingrese el nuevo id: ");
                            producto.setIdProducto(nuevo);
                            sw2 = 1;
                            break;
                        case "2":
                            nuevo = JOptionPane.showInputDialog("Ingrese el nombre del producto: ");
                            producto.setNombreProducto(nuevo);
                            sw2 = 1;
                            break;
                        case "3":
                            nuevo = JOptionPane.showInputDialog("Ingrese el tipo del producto: ");
                            producto.setTipoProducto(nuevo);
                            sw2 = 1;
                            break;
                        case "4":
                            nuevo = JOptionPane.showInputDialog("Ingrese la cantidad del producto: ");
                            producto.setCantidad(Integer.parseInt(nuevo));
                            sw2 = 1;
                            break;
                        case "5":
                            nuevo = JOptionPane.showInputDialog("Ingrese el costo del producto: ");
                            producto.setCosto(Integer.parseInt(nuevo));
                            sw2 = 1;
                            break;
                        case "6":
                            nuevo = JOptionPane.showInputDialog("Ingrese el precio del producto: ");
                            producto.setPrecio(Integer.parseInt(nuevo));
                            sw2 = 1;
                            break;
                        case "7":
                            nuevo = JOptionPane.showInputDialog("Ingrese la fecha de vencimiento del producto: ");
                            producto.setFechaVencimiento(nuevo);
                            sw2 = 1;
                            break;
                        default:
                            JOptionPane.showMessageDialog(null,"Opción incorrecta.\nPor favor ingrese una opcion valida");
                            break;
                    }
                    if( sw2 == 1 )
                        break;
                }
            }
            if( sw2 == 1 ){
                sw = Integer.parseInt(JOptionPane.showInputDialog("Cliente editado correctamente. \nDesea continuar editando productos?: Si = 1, No = 2"));
            }else{
                sw = Integer.parseInt(JOptionPane.showInputDialog("Cliente no encontrado.\nDesea continuar editando productos?: Si = 1, No = 2"));
            }
        }
    }

}


