package CambiosdeEstado;


public class Envenenado implements estadoPersonaje {

    private Personaje personaje;

    public Envenenado(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void atacar(){
        System.out.println("Ataque envenenado");
    }

    @Override
    public void recibirDanio(int puntos){
        System.out.println("Recibe daño continuo");
    }
    @Override
    public void curar(){
        System.out.println("Curacion detox");
        personaje.setEstado(new Sano(personaje));
    }
}


