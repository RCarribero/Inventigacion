public class Empleado extends persona {
    int id_empleado;
    String cargo;
    double sueldo;

    public Empleado(int id, String dni, String nombre, String apellido, String domicilio, String telefono,
            int id_empleado, String cargo, double sueldo) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.id_empleado = id_empleado;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public Empleado() {
    }

    public int getId_empleado() {
        return id_empleado;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setId_empleado(int id_empleado) {
        this.id_empleado = id_empleado;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

}
