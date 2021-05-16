package informatica.prodottinegozioonline;

public class CuboDigitale extends ProdottoDigitale{
    
    private String nome;

    public CuboDigitale(String nome, float prezzoAcquisto, double dimensione, String processore, double ram) {
        super(prezzoAcquisto, dimensione, processore, ram);
        this.nome = nome;
    }
    public CuboDigitale(String nome, float prezzoAcquisto, float prezzoVendita, double dimensione, String processore, double ram) {
        super(prezzoAcquisto, prezzoVendita, dimensione, processore, ram);
        this.nome = nome;
    }
    public CuboDigitale(String nome, float prezzoAcquisto, float prezzoVendita, float iva, String descrizione, float sconto, double dimensione, String processore, double ram) {
        super(prezzoAcquisto, prezzoVendita, iva, descrizione, sconto, dimensione, processore, ram);
        this.nome = nome;
    }
    public CuboDigitale(String nome, ProdottoDigitale pd) {
        super(pd);
        this.nome = nome;
    }

    public CuboDigitale() {
        this.nome = "nome nullo";
    }
    
    
    
}
