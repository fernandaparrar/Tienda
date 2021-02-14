package menu;

import controller.Administrador;
import controller.SuperMercado;

import javax.swing.*;

public class MenuAdministrador {

    private int opcion;
    private String opciones;

    public MenuAdministrador() {
    }

    public void menuAdministrador() {
        this.opciones = "\t**Bienvenido al menú del administrador**\n\n"
                + "1) Agregar cliente\n"
                + "2) Editar datos del cliente\n"
                + "3) Eliminar cliente\n"
                + "4) Ver lista de clientes \n"
                + "5) Agregar producto al sistema \n"
                + "6) Editar producto \n"
                + "7) Eliminar producto \n"
                + "8) Ver lista productos \n"
                + "9) Salir \n"
                + "Ingrese una opción:";

        SuperMercado superMercado = new SuperMercado();
        Administrador administrador = new Administrador();

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(opciones));
            switch (opcion) {
                case 1: superMercado.mostrarListaCliente();
                        administrador.agregarCliente(superMercado.getListaClientes(), superMercado);
                    break;
                case 2: superMercado.mostrarListaClienteAdmin();
                        administrador.editarDatos(superMercado.getListaClientes(), superMercado);
                    break;
                case 3: superMercado.mostrarListaClienteAdmin();
                        administrador.eliminarCliente(superMercado.getListaClientes(), superMercado);
                    break;
                case 4: superMercado.mostrarListaClienteAdmin();
                    break;
                case 5: superMercado.mostrarListaProductos();
                        administrador.agregarnuevoProductoAdmin(superMercado.getListaProductos(), superMercado);
                    break;
                case 6: administrador.editarProducto(superMercado.getListaProductos(), superMercado);
                    break;
                case 7: administrador.eliminarProducto(superMercado.getListaProductos(), superMercado);
                    break;
                case 8: superMercado.mostrarListaProductosAdmin();
                    break;
                case 9:
                    opcion = 10;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta \n " +
                            "Seleccione una de las opciones del menú");
                    break;
            }
        } while (opcion != 10);


    }


}
