public class Squilter extends Pokemon implements IAgua {

    public Squilter(int num_pokedex, String nom_pokemon, double peso, String sexo, String temporada) {
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
    public void atacarHidrobomba() {
        System.out.println("Ataque hidrobomba");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Ataque Pistola agua");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Ataque Burbujas");
    }

    @Override
    public void atacarHidropulso() {
        System.out.println("Ataque Hidropulso");
    }

}
