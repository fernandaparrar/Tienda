package menu;

import controller.SuperMercado;

import javax.swing.*;

public class Menu {

    private int opcion;
    private String opciones;

    public Menu() {

    }

    public void menuPrincipal() {
        this.opciones = "\t**Bienvenido al menú principal**\n\n"
                + "1) Ingresar como administrador\n"
                + "2) Ingresar como cliente\n"
                + "3) Salir\n"
                + "Ingrese una opción:";

        SuperMercado superMercado = new SuperMercado();
        MenuCliente menuCliente = new MenuCliente();
        MenuAdministrador menuAdministrador = new MenuAdministrador();

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(opciones));
            switch (opcion) {
                case 1: menuAdministrador.menuAdministrador();
                    break;
                case 2: JOptionPane.showMessageDialog(null, superMercado.mostrarListaProductos());
                        menuCliente.menuCliente();
                    break;
                case 3:
                    opcion = 4;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta \n " +
                            "Seleccione una de las opciones del menú");
                    break;
            }
        } while (opcion != 4);
    }
}
