public class Product {
    public Product(int id, String name, String description,double price,int stockAmount,String color){//Constructor lar yapıcı method olarak düşünülebilir.
        System.out.println("Yapıcı blok çalıştı.");
        this.id = id;
        this.name = name;
        this.cod = cod;
        this.price = price;
        this.stockAmount = stockAmount;
        this.description = description;
        this.color = color;

    }
    // attribute | field
    //Class ortak operasyonları yapmak ve field veya attribute tutmak için kullanılır.
    private  int id;
    private String name;
    private String description;
    private double price;
    private int stockAmount;
    private String color;
    private String cod;

    //getter bloğu
    public int getId(){//bunun anlamı id yi okuyabilir demek.ama yazamaz.
        return id;
    }
    //setter bloğu
    public void setId(int id){
        this.id=id; //Best Practices
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCod() {
        return this.name.substring(0,1) + id;
    }


}
