public class Charizad extends Pokemon implements IFuego {

    public Charizad(int num_pokedex, String nom_pokemon, double peso, String sexo, String temporada) {
        super(num_pokedex, nom_pokemon, peso, sexo, temporada);
    }

    @Override
    public void atacarPunioFuego() {
        throw new UnsupportedOperationException("Unimplemented method 'atacarPunioFuego'");
    }

    @Override
    public void atacarAscuas() {
        throw new UnsupportedOperationException("Unimplemented method 'atacarAscuas'");
    }

    @Override
    public void atacarLanzallamas() {
        throw new UnsupportedOperationException("Unimplemented method 'atacarLanzallamas'");
    }

    @Override
    protected void atacarPlacaje() {
        throw new UnsupportedOperationException("Unimplemented method 'atacarPlacaje'");
    }

    @Override
    protected void atacarArañazo() {
        throw new UnsupportedOperationException("Unimplemented method 'atacarArañazo'");
    }

    @Override
    protected void atacarMordisco() {
        throw new UnsupportedOperationException("Unimplemented method 'atacarMordisco'");
    }
    protected void atacarVuelo(){
        System.out.println("Que vuela el chivooo");
    }

}
