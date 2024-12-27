package POO;
public class consultor extends persona {
    String nombre_consultara;
    int num_consultor;

    public consultor() {
    }

    public consultor(int id, String dni, String nombre, String apellido, String domicilio, String telefono,
            String nombre_consultara, int num_consultor) {
        super(id, dni, nombre, apellido, domicilio, telefono);
        this.nombre_consultara = nombre_consultara;
        this.num_consultor = num_consultor;
    }

    public String getNombre_consultara() {
        return nombre_consultara;
    }

    public int getNum_consultor() {
        return num_consultor;
    }

    public void setNombre_consultara(String nombre_consultara) {
        this.nombre_consultara = nombre_consultara;
    }

    public void setNum_consultor(int num_consultor) {
        this.num_consultor = num_consultor;
    }

}
