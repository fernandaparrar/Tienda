package menu;

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

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(opciones));
            switch (opcion) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
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
