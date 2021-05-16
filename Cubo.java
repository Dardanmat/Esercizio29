package informatica.prodottinegozioonline;

public class Cubo extends ProdottoMateriale{

    private String nome;

    public Cubo(String nome, float larghezza, float altezza, float profondita, float peso, float prezzoAcquisto) {
        super(larghezza, altezza, profondita, peso, prezzoAcquisto);
        this.nome = nome;
    }
    public Cubo(String nome, float larghezza, float altezza, float profondita, float peso, float prezzoAcquisto, float prezzoVendita) {
        super(larghezza, altezza, profondita, peso, prezzoAcquisto, prezzoVendita);
        this.nome = nome;
    }
    public Cubo(String nome, float larghezza, float altezza, float profondita, float peso, float prezzoAcquisto, float prezzoVendita, float iva, String descrizione, float sconto) {
        super(larghezza, altezza, profondita, peso, prezzoAcquisto, prezzoVendita, iva, descrizione, sconto);
        this.nome = nome;
    }
    public Cubo(String nome, float larghezza, float altezza, float profondita, float peso, ProdottoMateriale pm) {
        super(larghezza, altezza, profondita, peso, pm);
        this.nome = nome;
    }
    public Cubo() {
        super();
        this.nome = "nome nullo";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
