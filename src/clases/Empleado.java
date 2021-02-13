package clases;

public class Empleado extends Persona{

    private String idEmpleado;
    private String turno;
    private float salarioMensual;

    public Empleado() {
    }

    public Empleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public Empleado(String cedula, String nombreCompleto, String direccion, String telefono, String idEmpleado, String turno, float salarioMensual) {
        super(cedula, nombreCompleto, direccion, telefono);
        this.idEmpleado = idEmpleado;
        this.turno = turno;
        this.salarioMensual = salarioMensual;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public float getSalarioMensual() {
        return salarioMensual;
    }

    public void setSalarioMensual(float salarioMensual) {
        this.salarioMensual = salarioMensual;
    }
}
