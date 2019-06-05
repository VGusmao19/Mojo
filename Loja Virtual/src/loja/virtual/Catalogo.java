import java.util.ArrayList;
import java.util.Scanner;

public class Catalogo {
    ArrayList <Produtos>estoque = new ArrayList<>();
    
    public Catalogo(ArrayList <Produtos>estoque){
        this.estoque = estoque;
    }
    
    public void Listar(){
            for (Produtos obj : estoque) {
                System.out.println("NOME: " + obj.getName());
                System.out.println("ID: " + obj.getID());
                System.out.println("CATEGORIA: " + obj.getCategory());
                System.out.println("DESCRIÇÃO: " + obj.getDescription());
                String resultado = String.format("%.2f", obj.getPrice()); // formatação do preço
                System.out.println("PRECÇO: R$" + resultado);
                System.out.println("QUANTIDADE EM ESTOQUE: " + obj.getAmount());
                System.out.println("===============================================");
            }
    }
    
    public ArrayList <Produtos> filtrarCategoria(ArrayList <Produtos>estoque){
            ArrayList <Produtos>filtro = new ArrayList<>();
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
                    for(Produtos obj: estoque){
                        if(obj.getCategory().equals("Vestuário")){
                            filtro.add(obj);
                        }
                    }
                    break;
                case 2:
                    for(Produtos obj: estoque){
                        if(obj.getCategory().equals("Jogos")){
                            filtro.add(obj);
                        }
                    }
                    break;
                case 3:
                    for(Produtos obj: estoque){
                        if(obj.getCategory().equals("Colecionáveis")){
                            filtro.add(obj);
                        }
                    }
                    break;
                case 4:
                    for(Produtos obj: estoque){
                        if(obj.getCategory().equals("Decoração")){
                            filtro.add(obj);
                        }
                    }
                    break;
                case 5:
                    for(Produtos obj: estoque){
                        if(obj.getCategory().equals("Leitura")){
                            filtro.add(obj);
                        }
                    }
                    break;
            }
            return filtro;
    }
    
    public void Pesquisar(String id){
        for(Produtos obj : estoque){
            if(obj.getID().equals(id)){
                System.out.println("ID: " + obj.getID());
                System.out.println("NOME: " + obj.getName());
                System.out.println("CATEGORIA: " + obj.getCategory());
                System.out.println("DESCRIÇÃO: " + obj.getDescription());
                String resultado = String.format("%.2f", obj.getPrice()); // formatação do preço
                System.out.println("PRECÇO: R$" + resultado);
                System.out.println("QUANTIDADE EM ESTOQUE: " + obj.getAmount());
                System.out.println("===============================================");
            }
            
        }
    }
}
