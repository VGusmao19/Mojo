import java.util.ArrayList;

public class Carrinho {
    ArrayList <ItemCompra> itens = new ArrayList<>();
    private double totalCost = 0;
    
    public Carrinho(ArrayList <ItemCompra> itens){
         this.itens = itens;
    }
    
    public void addCarrinho(ArrayList <ItemCompra> itens, Produto produto, int quantidade, String id, int index){
        int aux = this.IndexOfCar(itens, id);
        if(itens.isEmpty() || aux == -1){ // se o carrinho estiver vazio ou se o item que quer inserir ja não tiver lá dentro
            ItemCompra item = new ItemCompra(produto.getID(), quantidade, produto.getPrice(), produto.getName());
            this.itens.add(item);
            produto.setAmount(produto.getAmount() - quantidade);
            this.setTotalCost(getTotalCost() + (produto.getPrice() * quantidade)); 
            System.out.println(produto.getName() + " adicionado ao carrinho !!!");
            System.out.println("");
        }else if(Math.abs(quantidade) <= itens.get(aux).getQuantBuy()){ // se o item já estiver dentro do carrinho; isso evita duplicar o item dentro do carrinho E a quantidade for menor ou igual a disponivel
            itens.get(aux).setQuantBuy(itens.get(aux).getQuantBuy() + quantidade);
            produto.setAmount(produto.getAmount() - quantidade);
            this.setTotalCost(getTotalCost() + (produto.getPrice() * quantidade));
            System.out.println(produto.getName() + " alterado no carrinho !!!");
            System.out.println("");
            if(itens.get(aux).getQuantBuy() == 0){
                itens.remove(itens.get(aux));
            }
        }else {
            System.out.println("Voce tentou remover mais do que há no carrinho");
        }
    }
    
    public int IndexOfCar(ArrayList <ItemCompra> itens, String id){
        int index = -1;
        for(ItemCompra obj : itens){
            if(obj.getIdBuy().equals(id)){
                index = itens.indexOf(obj);
            }
        }
        return index;
    }
    
    public int IndexOfProd(ArrayList <Produto> estoque, String id){
        int index = -1;
        for(Produto obj : estoque){
            if(obj.getID().equals(id)){
                index = estoque.indexOf(obj);
            }
        }
        return index;
    }
    
    public void removeCarrinho(ArrayList <ItemCompra> itens, Produto produto, String id){
        int aux = this.IndexOfCar(itens, id);
        if(itens.isEmpty() || aux == -1){
            System.out.println("Seu Carrinho Está Vazio");
        }else{
            produto.setAmount(produto.getAmount() + this.itens.get(aux).getQuantBuy());
            this.setTotalCost(getTotalCost() - (produto.getPrice() * this.itens.get(aux).getQuantBuy())); 
            this.itens.remove(aux);     
         }
    }
    
    public void Listar(){
        if(itens.size() == 0){
            System.out.println("Seu carrinho de compras está vazio: ");
            System.out.println("");
        }else {
                for (ItemCompra obj : itens) {
                    System.out.println("NOME: " + obj.getNameBuy());
                    System.out.println("ID: " + obj.getIdBuy());
                    String resultado = String.format("%.2f", obj.getPriceBuy()); // formatação do preço
                    System.out.println("PRECÇO: R$" + resultado);
                    System.out.println("QUANTIDADE: " + obj.getQuantBuy());
                    System.out.println("===============================================");
                }
                System.out.println("PREÇO ATUAL DA CONTA: " + this.getTotalCost());
        }
        
    }
    
    
    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    
}