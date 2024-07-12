package CambiosdeEstado;

public class Sano implements estadoPersonaje{
    private Personaje personaje;


    public Sano(Personaje personaje) {
        this.personaje = personaje;
    }

    @Override
    public void atacar(){
        System.out.println("Ataque Normal");
    }

    @Override
    public void recibirDanio(int puntos) {
        System.out.println("Recibe daño normal");
        if(puntos > 50){
            personaje.setEstado(new Herido(personaje));
        }
    }
    @Override
    public void curar(){
        System.out.println("Curacion Normal");
    }
}
