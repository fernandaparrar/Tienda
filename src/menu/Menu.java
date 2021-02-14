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
                + "2) Ingresar como empleado\n"
                + "3) Ingresar como cliente\n"
                + "4) Salir\n"
                + "Ingrese una opción:";

        SuperMercado superMercado = new SuperMercado();
        MenuCliente menuCliente = new MenuCliente();
        MenuAdministrador menuAdministrador = new MenuAdministrador();
        MenuEmpleado menuEmpleado = new MenuEmpleado();


        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(opciones));
            switch (opcion) {
                case 1: menuAdministrador.menuAdministrador();
                    break;
                case 2: menuEmpleado.menuEmpleado();
                    break;
                case 3: menuCliente.menuCliente();
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
