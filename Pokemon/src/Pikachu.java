public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu() {
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
