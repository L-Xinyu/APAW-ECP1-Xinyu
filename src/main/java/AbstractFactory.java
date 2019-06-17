import java.time.LocalDateTime;

public abstract  class AbstractFactory {
    public abstract Articulo crear(String articuloId, String articuloName, LocalDateTime articuloTime);

    public abstract boolean borrar(String idArticuloBorrar);
}
