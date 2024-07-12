package ReaccionEventosJuego;

import java.util.ArrayList;
import java.util.List;

public class Observer {
    private List<Observador> observadores = new ArrayList<>();

    public void agregarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void eliminarObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void notificarObservadores(Evento evento) {
        for (Observador observador : observadores) {
            observador.actualizar(evento);
        }
    }
}
