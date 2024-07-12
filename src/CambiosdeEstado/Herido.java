package CambiosdeEstado;

public class Herido implements estadoPersonaje {
    private Personaje personaje;

    public Herido (Personaje personaje){
        this.personaje = personaje;
    }

    @Override
    public void atacar(){
        System.out.println("Ataque Debil");
    }

    @Override
    public void recibirDanio(int puntos){
        System.out.println("Recibe daño aumentado");
        if (puntos > 30){
            personaje.setEstado(new Envenenado(personaje));
        }
    }

    @Override
    public void curar(){
        System.out.println("Curacion lenta");
        personaje.setEstado(new Sano(personaje));
    }
}
