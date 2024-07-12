package InteraccionEnemigoyAliado;

public class Monstruo implements Enemigo{

    @Override
    public void atacar(){
        System.out.println("El monstruo esta atacando!");
    }

    @Override
    public void defender(){
        System.out.println("El monstruo se esta defendiendo!");
    }
}
