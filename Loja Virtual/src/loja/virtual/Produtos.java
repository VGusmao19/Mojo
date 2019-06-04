package loja.virtual;

public class Produtos {
    private String name;
    private String description;
    private int amount;
    private float price;
    private String category;
    //construtor
    public Produtos(String name, String description, int amount, float price, String category){
           this.name = name;
           this.description = description;
           this.amount = amount;
           this.price = price;
           this.category = category;
    }
    
    
    //name
    public String getName(){
      return this.name;
    }
    public void setName(String name){
      this.name = name;
    }
    //description
    public String getDescription(){
      return this.description;
    }
    public void setDescription(String description){
      this.description = description;
    }
    // amount
    public int getAmount(){
      return this.amount;
    }
    public void setAmount(int amount){
      this.amount = amount;
    }
    // price
    public float getPrice(){
        return this.price;
    }

    public void setPrice(float price){
        this.price = price;
    }
    // category
    public String getCategory(){
        return this.category;
    }

    public void setCategory(String category){
        this.category = category;
    }    
    

 
}



