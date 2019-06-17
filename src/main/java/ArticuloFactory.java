import java.time.LocalDateTime;
import java.util.HashMap;

public class ArticuloFactory extends AbstractFactory{
    private HashMap<String,Articulo> myArticulo;
    private static ArticuloFactory articuloFactory;
    private static boolean allowInstance;

    public void ArticuloFactory(){
        if(!allowInstance){
            System.out.print("Debes usar getInstance()");
        }else{
            System.out.print("Se inicializó una instancia de ArtistaFactory");
        }
    }

    public boolean buscarArticulo(String id){
        if(myArticulo.get(id) != null)
            return true;
        else return false;
    }

     public ArticuloFactory getInstanceArticuloFactory(String id){
        if(buscarArticulo(id)){
            allowInstance = true;
            articuloFactory = new ArticuloFactory();
            allowInstance = false;
        }else {
            System.out.println("Se retorna la instancia existente");
        }
        return articuloFactory;
     }




    @Override
    public Articulo crear(String articuloId, String articuloName, LocalDateTime articuloTime) {
        myArticulo.put(articuloId,
                       new ArticuloBuilder(articuloId,
                               articuloName,
                               articuloTime)
                               .buildArticulo()
        );
        return myArticulo.get(articuloId);
    }

    @Override
    public boolean borrar(String articuloId) {
        if(myArticulo.containsKey(articuloId)){
            myArticulo.remove(articuloId);
            return true;
        }else
        return false;
    }
}
