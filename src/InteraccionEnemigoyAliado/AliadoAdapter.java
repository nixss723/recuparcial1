package InteraccionEnemigoyAliado;

public class AliadoAdapter implements Objetivo{

    private Aliado aliado;

    public AliadoAdapter(Aliado aliado) {
        this.aliado = aliado;
    }

    public void interactuar(){
        aliado.ayudar();
        aliado.proteger();
    }
}
