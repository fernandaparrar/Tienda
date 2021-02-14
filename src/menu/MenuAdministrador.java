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
                + "4) Mostrar lista de clientes \n"
                + "5) Agregar producto al sistema \n"
                + "6) Editar producto \n"
                + "7) Eliminar producto \n"
                + "8) Salir"
                + "Ingrese una opción:";

        SuperMercado superMercado = new SuperMercado();
        Administrador administrador = new Administrador();

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(opciones));
            switch (opcion) {
                case 1: superMercado.mostrarListaCliente();
                        administrador.agregarCliente(superMercado.getListaClientes());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
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
