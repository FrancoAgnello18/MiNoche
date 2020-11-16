
package ar.com.minoche.service;

import ar.com.minoche.domain.Entrada;
import java.util.List;

public interface EntradaService {
    List<Entrada> listarEntradas();
    
    public void guardar (Entrada entrada);
    public void eliminar (Entrada entrada);
    public Entrada encontrarEntrada(Entrada entrada);
}
