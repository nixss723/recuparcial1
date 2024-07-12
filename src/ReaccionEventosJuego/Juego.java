package ReaccionEventosJuego;

public class Juego extends Observer{
    public void generarEvento(String descripcion){
        Evento evento = new Evento(descripcion);
        System.out.println("Evento generado: " + descripcion);
        notificarObservadores(evento);
    }
}
