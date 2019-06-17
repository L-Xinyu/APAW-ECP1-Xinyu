import java.time.LocalDateTime;
import java.util.ArrayList;

public class ArticuloBuilder {
    String id;
    String name;
    LocalDateTime writeTime;
    ArrayList<Escritor> escritors;

    public  ArticuloBuilder(String id,String name,LocalDateTime writeTime){
        this.id = id;
        this.name = name;
        this.writeTime = writeTime;
    }

    public String getId() { return id; }
    public void Id(String id) { this.id = id; }

    public String getName() { return name; }
    public void Name(String name) { this.name = name; }

    public LocalDateTime getWriteTime() { return writeTime; }
    public void WriteTime(LocalDateTime writeTime) { this.writeTime = writeTime; }

    public ArrayList<Escritor> getEscritors() { return escritors; }
    public void Escritors(ArrayList<Escritor> escritors) { this.escritors = escritors; }

    public Articulo buildArticulo(){ return new Articulo(id,name,writeTime);}
}
