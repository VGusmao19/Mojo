public class Produtos {
    private String name;
    private String description;
    private int amount;
    private double price;
    private String category;
    private String id;

    //construtor
    public Produtos(String name, String description, int amount, double price, String category, String id){
           this.name = name;
           this.description = description;
           this.amount = amount;
           this.price = price;
           this.category = category;
           this.id = id;
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
    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }
    // category
    public String getCategory(){
        return this.category;
    }

    public void setCategory(String category){
        this.category = category;
    }  
    // id
    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }
    

 
 }
