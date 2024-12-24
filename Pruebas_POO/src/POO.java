package Repaso.Pruebas_POO;

public class POO {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno(1, "Ruben", "Carribero");
        Alumno alu2 = new Alumno();

        System.out.println("La id del alumno 1 es: "+alu1.getId());
        System.out.println("El nombre es: "+alu1.getNombre());
        System.out.println("El apellido es: "+alu1.getApellido()+"\n");
        
        alu2.setId(2);
        alu2.setNombre("Emilio");
        alu2.setApellido("Carribero");

        System.out.println("La id del alumno 2 es: "+alu2.getId());
        System.out.println("El nombre es: "+alu2.getNombre());
        System.out.println("El apellido es: "+alu2.getApellido()+"\n");

        alu1.setNombre("Mario");
        System.out.println("El nombre es: "+alu1.getNombre());
        
    }
}