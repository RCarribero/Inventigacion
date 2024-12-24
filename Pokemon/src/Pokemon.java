public abstract class Pokemon {

    public Pokemon(int num_pokedex, String nom_pokemon, double peso, String sexo, String temporada) {
        this.num_pokedex = num_pokedex;
        this.nom_pokemon = nom_pokemon;
        this.peso = peso;
        this.sexo = sexo;
        this.temporada = temporada;
    }

    protected int num_pokedex = 0;

    protected String nom_pokemon = "";

    protected double peso = 0;

    protected String sexo = "";

    protected String temporada = "";

    protected abstract void atacarPlacaje();

    protected abstract void atacarArañazo();

    protected abstract void atacarMordisco();

    protected  int getNum_pokedex() {
        return num_pokedex;
    }

    protected  void setNum_pokedex(int num_pokedex) {
        this.num_pokedex = num_pokedex;
    }

    protected  String getNom_pokemon() {
        return nom_pokemon;
    }

    protected  void setNom_pokemon(String nom_pokemon) {
        this.nom_pokemon = nom_pokemon;
    }

    protected  double getPeso() {
        return peso;
    }

    protected  void setPeso(double peso) {
        this.peso = peso;
    }

    protected  String getSexo() {
        return sexo;
    }

    protected  void setSexo(String sexo) {
        this.sexo = sexo;
    }

    protected  String getTemporada() {
        return temporada;
    }

    protected  void setTemporada(String temporada) {
        this.temporada = temporada;
    }
    
}
