package loja.virtual;

public class LojaVirtual {    
    
    public static void main(String[] args) {
       public static void main(String[] args) {
        String id;
        Scanner input = new Scanner(System.in);
    
        // criando os produtos
        Produtos p1 = new Produtos("Camisa", "Camisa de menino chavoso", 5, 35.00, "Vestuário", "12345");
        Produtos p2 = new Produtos("Mouse gamer Multilaser", "Mouse transformer que tem menos ips que mouse branco de bolinha", 20, 15.00, "Jogos", "67890");
        Produtos p3 = new Produtos("Notebook Samsung Essentials E30", "Intel Core I3, 4GB, 1TB, tela antirreflexo", 3, 1500.00, "Jogos", "61600");
        Produtos p4 = new Produtos("Cosplay de JoJo", "Você achou que era um cosplay mas na verdade era eu, DIO!!!", 1, 400.00, "Vestuário", "76089");
        //inserindo numa ArrayList
        ArrayList <Produtos>estoque = new ArrayList<>();
        estoque.add(p1);
        estoque.add(p2);
        estoque.add(p3);
        estoque.add(p4);
        
        Catalogo C = new Catalogo(estoque); 
        
        // lista o catalogo
        C.Listar();
        System.out.println("");
        
        // filtra o catalogo
        //ArrayList <Produto>filtro = C.filtrarCategoria(estoque);
        Catalogo filtro = new Catalogo(C.filtrarCategoria(estoque));
        filtro.Listar();
        
        // pesquisa produto pelo ID
        System.out.println("Informe um ID que deseja procurar: ");
        id = input.nextLine();
        C.Pesquisar(id);
        

    }
}
