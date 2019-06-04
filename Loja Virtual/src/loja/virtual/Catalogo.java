package loja.virtual;
import java.util.ArrayList;
import java.util.ArrayList;

public class Catalogo {
    ArrayList <Produto>estoque = new ArrayList<>();
    
    public Catalogo(ArrayList <Produto>estoque){
        this.estoque = estoque;
    }
    
    public void Listar(){
            for (Produto obj : estoque) {
                System.out.println("NOME: " + obj.getName());
                System.out.println("CATEGORIA: " + obj.getCategory());
                System.out.println("DESCRIÇÃO: " + obj.getDescription());
                String resultado = String.format("%.2f", obj.getPrice()); // formatação do preço
                System.out.println("PRECÇO: R$" + resultado);
                System.out.println("QUANTIDADE EM ESTOQUE: " + obj.getAmount());
                System.out.println("===============================================");
            }
    }
    
    public ArrayList <Produto> filtrarCategoria(ArrayList <Produto>estoque){
            ArrayList <Produto>filtro = new ArrayList<>();
            Scanner input = new Scanner(System.in);
            System.out.println("Selecione a categoria: "); // menuzinho
            System.out.println("1 - Vestuário");
            System.out.println("2 - Jogos");
            System.out.println("3 - Colecionáveis");
            System.out.println("4 - Decoração");
            System.out.println("5 - Leitura");
            int choice = input.nextInt();
            switch(choice){
                case 1:
                    for(Produto obj: estoque){
                        if(obj.getCategory().equals("Vestuário")){
                            filtro.add(obj);
                        }
                    }
                    break;
                case 2:
                    for(Produto obj: estoque){
                        if(obj.getCategory().equals("Jogos")){
                            filtro.add(obj);
                        }
                    }
                    break;
                case 3:
                    for(Produto obj: estoque){
                        if(obj.getCategory().equals("Colecionáveis")){
                            filtro.add(obj);
                        }
                    }
                    break;
                case 4:
                    for(Produto obj: estoque){
                        if(obj.getCategory().equals("Decoração")){
                            filtro.add(obj);
                        }
                    }
                    break;
                case 5:
                    for(Produto obj: estoque){
                        if(obj.getCategory().equals("Leitura")){
                            filtro.add(obj);
                        }
                    }
                    break;
            }
            return filtro;
    }
}
