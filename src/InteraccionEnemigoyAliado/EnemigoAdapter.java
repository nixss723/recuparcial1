package InteraccionEnemigoyAliado;

public class EnemigoAdapter implements Objetivo{

    private Enemigo enemigo;

    public EnemigoAdapter(Enemigo enemigo) {
        this.enemigo = enemigo;
    }

    @Override
    public void interactuar(){
        enemigo.atacar();
        enemigo.defender();
    }
}
