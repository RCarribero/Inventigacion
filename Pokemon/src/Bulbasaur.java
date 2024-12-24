public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur(int num_pokedex, String nom_pokemon, double peso, String sexo, String temporada) {
        super(num_pokedex, nom_pokemon, peso, sexo, temporada);
    }

    @Override
    protected void setNum_pokedex(int num_pokedex) {
        super.setNum_pokedex(0002);
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
    public void atacarParalizar() {
        System.out.println("Ataque paralizar");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Ataque drenaje");
    }

    @Override
    public void atacarHojaAfilada() {
        System.out.println("Ataque Hoja afilada");
    }

    @Override
    public void atacarLatigoCepa() {
        System.out.println("Ataque Latigo Cepa");
    }
}
