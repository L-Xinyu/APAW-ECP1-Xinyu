import java.time.LocalDateTime;

public class Comentario {
    private String idComentario;
    private Boolean negative;
    private String descripcion;
    private LocalDateTime momentoComentario;

    public Comentario(String id,Boolean negative,String descripcion,LocalDateTime momentoComentario){
        this.idComentario = idComentario;
        this.negative = negative;
        this.descripcion = descripcion;
        this.momentoComentario = momentoComentario;
    }

    public String getIdComentario() {
        return idComentario;
    }

    public void setIdComentario(String idComentario) {
        this.idComentario = idComentario;
    }

    public Boolean getNegative() {
        return negative;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDateTime getMomentoComentario() {
        return momentoComentario;
    }
}
