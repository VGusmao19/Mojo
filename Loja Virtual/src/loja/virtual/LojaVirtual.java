package loja.virtual;

public class LojaVirtual {    
    
    public static void main(String[] args) {
        // criando os produtos
        Produto p1 = new Produto("Camisa", "Camisa de menino chavoso", 5, 35.00, "Vestuário");
        Produto p2 = new Produto("Mouse gamer Multilaser", "Mouse transformer que tem menos ips que mouse branco de bolinha", 20, 15.00, "Pereféricos");
        Produto p3 = new Produto("Notebook Samsung Essentials E30", "Intel Core I3, 4GB, 1TB, tela antirreflexo", 3, 1500.00, "Computadores e Notebooks");
        
        //inserindo numa ArrayList
        ArrayList <Produto>estoque = new ArrayList<>();
        estoque.add(p1);
        estoque.add(p2);
        estoque.add(p3);
        
        Catalogo C = new Catalogo(estoque); 
        
        C.Listar();
        System.out.println("");
        //ArrayList <Produto>filtro = C.filtrarCategoria(estoque);
        Catalogo filtro = new Catalogo(C.filtrarCategoria(estoque));
        filtro.Listar();

    }
}
