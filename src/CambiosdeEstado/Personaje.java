package CambiosdeEstado;

public class Personaje {
    private estadoPersonaje estado;

    public Personaje() {
        this.estado = new Sano(this);
    }

    public void setEstado(estadoPersonaje estado) {
        this.estado = estado;
    }

    public void atacar() {
        estado.atacar();
    }

    public void recibirDanio(int puntos) {
        estado.recibirDanio(puntos);
    }

    public void curar() {
        estado.curar();
    }
}
