package informatica.prodottinegozioonline;


public class Main {
    public static void main(String[] args) {
        
        Contenitore c = new Contenitore();
        
        c.addProdotto(new Cubo("cubo 1", 2, 3, 4, 10, 100, 200, 22, "un bel cubo", 0));
        c.addProdotto(new Cubo("cubo 2", 4, 3, 4, 15, 1000, 2000, 10, "pane secco", 0));
        c.addProdotto(new Cubo("cubo 3", 2, 2, 2, 12, 300, 600, 25, "scontato", 20));
        
        c.addProdotto(new CuboDigitale("cuboDig1", 200, 500, 20, "cubo insesistente", 0, 100000, "uno forte", 2000));
        c.addProdotto(new CuboDigitale("cuboDig2", 1000, 3000, 25, "cubo insesistente", 0, 100000, "uno forte", 2000));
        
        System.out.println(c.toString());
        
    }
}
