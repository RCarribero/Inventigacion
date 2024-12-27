package Pokemon;
public class Charmander extends Pokemon implements IFuego {

    public Charmander(int num_pokedex, String nom_pokemon, double peso, String sexo, String temporada) {
        super(num_pokedex, nom_pokemon, peso, sexo, temporada);
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Ataque placaje");
    }

    @Override
    protected void atacarArañazo() {
        System.out.println("Ataque Arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Ataque mordisco");
    }

    @Override
    public void atacarPunioFuego() {
        System.out.println("Ataque puño fuego");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Ataque ascuas");

    }

    @Override
    public void atacarLanzallamas() {
        System.out.println("Ataque Lanzallamas");
    }

}
