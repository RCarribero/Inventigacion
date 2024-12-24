public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu(int num_pokedex, String nom_pokemon, double peso, String sexo, String temporada) {
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
    public void atacarImpactrueno() {
        System.out.println("Ataque Impactrueno");
    }

    @Override
    public void atacarPunioTrueno() {
        System.out.println("Ataque Puño trueno");
    }

    @Override
    public void atacarRayo() {
        System.out.println("Ataque Rayo");
    }

    @Override
    public void atacarRayoCarga() {
        System.out.println("Ataque Rayo carga");
    }

}
