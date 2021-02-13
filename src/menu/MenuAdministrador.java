package menu;

import javax.swing.*;

public class MenuAdministrador {

    private int opcion;
    private String opciones;

    public MenuAdministrador() {
    }

    public void menuPrincipal() {
        this.opciones = "\t**Bienvenido al menú del administrador**\n\n"
                + "1) Agregar cliente\n"
                + "2) Editar datos del cliente\n"
                + "3) Eliminar cliente\n"
                + "4) Agregar empleado\n"
                + "5) Editar empleado \n"
                + "6) Eliminar empleado \n"
                + "7) Agregar producto al sistema \n"
                + "8) Editar producto \n"
                + "9) Eliminar producto \n"
                + "10) Salir"
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
                    break;
                case 10:
                    break;
                case 11:
                    opcion = 11;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta \n " +
                            "Seleccione una de las opciones del menú");
                    break;
            }
        } while (opcion != 11);


    }


}
