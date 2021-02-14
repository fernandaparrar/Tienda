package controller;

public class Producto {

    private String idProducto;
    private String nombreProducto;
    private String tipoProducto;
    private int cantidad;
    private int costo;
    private int precio;
    private String fechaVencimiento;

    public Producto() {

    }

    public Producto(String idProducto, String nombreProducto, String tipoProducto, int cantidad, int costo, int precio, String fechaVencimiento) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.cantidad = cantidad;
        this.costo = costo;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
    }

    public Producto(String idProducto, String nombreProducto, int cantidad, int precio) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Producto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Producto:\n" +
                "\nidProducto = " + idProducto +
                "\nnombreProducto = " + nombreProducto +
                "\ntipoProducto = " + tipoProducto +
                "\ncantidad = " + cantidad +
                "\ncosto = " + costo +
                "\nprecioVenta = " + precio +
                "\nfechaVencimiento = " + fechaVencimiento;
    }
}


