package informatica.prodottinegozioonline;
import java.util.ArrayList;


public class Contenitore {
    
    ArrayList<ProdottoGenerico> lista;

    public Contenitore() {
        this.lista = new ArrayList<>();
    }
    
    public boolean addProdotto(ProdottoGenerico e){
        return lista.add(e);
    }

    @Override
    public String toString() {
        String s = "Lista prodotti:\n";
        
        for (ProdottoGenerico pg : lista) {
            s += "\n" + pg.toString() + "\n";
        }
        return s;
    }
    
}
