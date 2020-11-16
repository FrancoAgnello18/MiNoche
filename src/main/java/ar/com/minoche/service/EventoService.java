
package ar.com.minoche.service;

import ar.com.minoche.domain.Evento;
import java.util.List;

public interface EventoService {
    List<Evento> listarEventos();
    
    public void guardar (Evento evento);
    public void eliminar (Evento evento);
    public Evento encontrarEvento(Evento evento);
}
