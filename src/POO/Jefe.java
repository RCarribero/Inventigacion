package POO;
public class Jefe {
    int id_jefe;
    String departamento_jefe;

    public int getId_jefe() {
        return id_jefe;
    }

    public void setId_jefe(int id_jefe) {
        this.id_jefe = id_jefe;
    }

    public String getDepartamento_jefe() {
        return departamento_jefe;
    }

    public void setDepartamento_jefe(String departamento_jefe) {
        this.departamento_jefe = departamento_jefe;
    }

    public Jefe(int id_jefe, String departamento_jefe) {
        this.id_jefe = id_jefe;
        this.departamento_jefe = departamento_jefe;
    }

    public Jefe() {
    }

}
