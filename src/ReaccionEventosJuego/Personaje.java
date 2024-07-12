package ReaccionEventosJuego;

public class Personaje implements Observador{
    private String nombre;

    public Personaje(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(Evento evento){
        System.out.println(nombre + " rreaccion al evento " + evento);
    }
}
