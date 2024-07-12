package InteraccionEnemigoyAliado;



public class Mago implements Aliado {

    @Override
    public void ayudar(){
        System.out.println("El mago lanza un hechizo de ayuda! ");
    }

    @Override
    public void proteger(){
        System.out.println("El mago crea un campo de fuerza! ");
    }
}
