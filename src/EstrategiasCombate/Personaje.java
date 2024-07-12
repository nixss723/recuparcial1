package EstrategiasCombate;

public class Personaje {
    private EstrategiaCombate estrategiaCombate;

    public void setEstrategiaCombate(EstrategiaCombate estrategiaCombate) {
        this.estrategiaCombate = estrategiaCombate;
    }

    public void ejecutarEstrategiaCombate() {
        estrategiaCombate.ejecutar();
    }
}

//Ejemplo de uso

//personaje.setEstrategiaCombate(new EstrategiaCuerpoACuerpo());
// personaje.ejecutarEstrategia();