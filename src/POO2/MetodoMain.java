package POO2;

public class MetodoMain {
    public static void main(String[] args) {
        Gerente jefazo=new Gerente("manolito",18,3000.00,"Informatica");
        Secretario jefazo2=new Secretario("sddfsf",18234,1200.00,2);
        jefazo.mostrarDatos();
        System.out.println();
        jefazo2.mostrarDatos();
    }
}
