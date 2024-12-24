public class Main {
    public static void main(String[] args) {
        Squilter squilter = new Squilter();
        Charmander charmander = new Charmander();
        Bulbasaur bulbasaur = new Bulbasaur();
        Pikachu pikachu = new Pikachu();
        Charizad charizad =new Charizad();
        squilter.atacarArañazo();
        squilter.atacarHidrobomba();
        charmander.atacarArañazo();
        charmander.atacarLanzallamas();
        bulbasaur.atacarArañazo();
        bulbasaur.atacarDrenaje();
        pikachu.atacarArañazo();
        pikachu.atacarImpactrueno();
        charizad.atacarVuelo();
    }
}
