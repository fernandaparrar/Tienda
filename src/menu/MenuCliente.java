package menu;

import controller.Cliente;
import controller.SuperMercado;

import javax.swing.*;

public class MenuCliente {

    private int opcion;
    private String opciones;

    public MenuCliente() {

    }



    public void menuCliente() {
        this.opciones = "\t**Bienvenido al menú del cliente**\n\n"
                + "1) Agregar producto al carrito\n"
                + "2) Eliminar producto del carrito\n"
                + "3) Mi carrito \n"
                + "4) Salir\n"
                + "Ingrese una opción:";

        SuperMercado superMercado = new SuperMercado();
        Cliente cliente = new Cliente();

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(opciones));
            switch (opcion) {
                case 1: superMercado.mostrarListaProductos();
                        cliente.agregarProductoCarrito(superMercado.getListaProductos());
                    break;
                case 2: cliente.eliminarProductoCarrito();
                    break;
                case 3: cliente.mostrarCarrito();
                    break;
                case 4:
                    opcion = 5;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta \n " +
                            "Seleccione una de las opciones del menú");
                    break;
            }
        } while (opcion != 5);

    }

}
