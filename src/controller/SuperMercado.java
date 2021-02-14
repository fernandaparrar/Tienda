package controller;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SuperMercado {

    private String idSuperMercado;
    private String nombreSuperMercado;
    private List<Producto> listaProductos = new ArrayList<>();
    private List<Cliente> listaClientes = new ArrayList<>();


    public SuperMercado() {
        listaProductos.add(new Producto("PR01", "ALCOHOL JGB 300ML", "FARMACEUTICO", 25, 1200, 2500, "VEN: 02/02/21"));
        listaProductos.add(new Producto("PR02", "DESENGRASANTE BRILLA KING 500ML", "ASEO", 45, 3700, 5000, "VEN: 02/02/21"));
        listaProductos.add(new Producto("PR03", "LIMPIDO ROPA COLOR 1000ML", "ASEO", 100, 4500, 6200, "VEN: 02/02/21"));
        listaProductos.add(new Producto("PR04", "DETERGENTE LIQUIDO 1000ML", "ASEO", 10, 6000, 8600, "VEN: 02/02/21"));
        listaProductos.add(new Producto("PR05", "GOMINA EGO 110ML", "ASEO-PERSONAL", 65, 3900, 3000, "VEN: 02/02/21"));
        listaProductos.add(new Producto("PR06", "TALCO MEXANA 85G", "ASEO-PERSONAL", 23, 8500, 2500, "VEN: 02/02/21"));
        listaProductos.add(new Producto("PR07", "CENTRUM ADVANCE 100 TABLETAS", "FARMACEUTICO", 74, 48000, 2500, "VEN: 02/02/21"));
        listaProductos.add(new Producto("PR08", "PAPAS MARGARITA NATURAL 100G", "COMIDA", 12, 2600, 3600, "VEN: 02/02/21"));
        listaProductos.add(new Producto("PR09", "COCA-COLA 1200ML", "COMIDA", 49, 3000, 3800, "VEN: 02/02/21"));
        listaProductos.add(new Producto("PR10", "LECHE COLANTA 1000ML", "COMIDA", 17, 2500, 3600, "VEN: 02/02/21"));

        listaClientes.add(new Cliente("1006117174","Fernanda","calle 7", "5800694", "CL01", null));
        listaClientes.add(new Cliente("1152702267","Aldahir","calle 8", "5800695", "CL02", null));
        listaClientes.add(new Cliente("42866832","Panchito","calle 9", "5800696", "CL03", null));
    }

    public SuperMercado(String idSuperMercado) {
        this.idSuperMercado = idSuperMercado;
    }

    public SuperMercado(String idSuperMercado, String nombreSuperMercado, List<Producto> listaProductos, List<Cliente> listaClientes) {
        this.idSuperMercado = idSuperMercado;
        this.nombreSuperMercado = nombreSuperMercado;
        this.listaProductos = listaProductos;
        this.listaClientes = listaClientes;
    }

    public String getIdSuperMercado() {
        return idSuperMercado;
    }

    public void setIdSuperMercado(String idSuperMercado) {
        this.idSuperMercado = idSuperMercado;
    }

    public String getNombreSuperMercado() {
        return nombreSuperMercado;
    }

    public void setNombreSuperMercado(String nombreSuperMercado) {
        this.nombreSuperMercado = nombreSuperMercado;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public String mostrarListaProductos() {
        Iterator<Producto> it = listaProductos.iterator();
        String concat = "**Lista de Productos**\n\n";
        int i = 1;
        Producto aux;
        while (it.hasNext()) {
            aux = it.next();
            concat += i +") "+"Cod: "+aux.getIdProducto()+ " "+ aux.getNombreProducto() +
                    " cantidad: "+ aux.getCantidad() +" Precio: "+ aux.getPrecio() + "\n";
            i++;
        }
        return concat;
    }

    public void mostrarListaCliente() {
        Iterator<Cliente> it = listaClientes.iterator();
        String concat = "**Lista de Clientes**\n\n";
        int i = 1;
        Cliente aux;
        while (it.hasNext()) {
            aux = it.next();
            concat += i +") "+"Cod: "+aux.getIdCliente()+ " "+ aux.getNombreCompleto() +"\n";
            i++;
        }
        JOptionPane.showMessageDialog(null, concat);
    }

}
