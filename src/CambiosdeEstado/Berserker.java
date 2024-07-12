package CambiosdeEstado;

public class Berserker implements estadoPersonaje{
    private Personaje personaje;


    public Berserker(Personaje personaje){
        this.personaje = personaje;
    }

    @Override
    public void atacar(){
        System.out.println("Ataque furioso");
    }

    @Override
    public void recibirDanio(int puntos){
        System.out.println("Recibe poco daño ");
    }

    @Override
    public void curar(){
        System.out.println("Curacion imposible ");
    }
}
