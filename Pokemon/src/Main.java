public class Main {
    public static void main(String[] args) {
        Squilter squilter = new Squilter(0001,"bulbasaur",10.00,"Male","Temporada1");
        Charmander charmander = new Charmander(0001,"bulbasaur",10.00,"Male","Temporada1");
        Bulbasaur bulbasaur = new Bulbasaur(68,"bulbasaur",10.00,"Male","Temporada1");
        Pikachu pikachu = new Pikachu(0001,"bulbasaur",10.00,"Male","Temporada1");
        Charizad charizar =new Charizad(0001,"bulbasaur",10.00,"Male","Temporada1");
        squilter.atacarArañazo();
        squilter.atacarHidrobomba();
        charmander.atacarArañazo();
        charmander.atacarLanzallamas();
        bulbasaur.atacarArañazo();
        bulbasaur.atacarDrenaje();
        pikachu.atacarArañazo();
        pikachu.atacarImpactrueno();
        charizar.atacarVuelo();
        System.out.println(bulbasaur.getNum_pokedex());
    }
}
