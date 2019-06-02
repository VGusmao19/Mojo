package loja.virtual;
import java.util.ArrayList;
import java.util.ArrayList;

public class Catalogo {
    ArrayList<Produtos> stock = new ArrayList();
    
    Produtos Camisa;
    Produtos Notebook;
    Produtos Geladeira;

    public Catalogo() {
        this.Camisa = new Produtos(1, "Camisa", 50.00, 20);
        this.Notebook = new Produtos(2, "Notebook", 3000.0, 10);
        this.Geladeira = new Produtos(3, "Geladeira", 2000.0, 8);
        
        stock.add(Camisa);
        stock.add(Notebook);
        stock.add(Geladeira);
    }

    
    public void Listar(){
        for(int i = 0; i < stock.size(); i++){
              System.out.println("ID: " + stock.get(i).ID);
              System.out.println("Descrição: " + stock.get(i).Descricao);
              System.out.println("Valor: " + stock.get(i).Valor);
              System.out.println("Quantidade no estoque: " + stock.get(i).QntEstoque);
              System.out.println();
        }
    }
}