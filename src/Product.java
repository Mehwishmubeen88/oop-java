class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    static int counter=0;
    private Date Dd;


    Product(String name, double price, int quantity,Date Dd){
        System.out.println("Constructor is called");
        this.id=counter++;
        this.name=name;
        this.price=price;
       this.quantity=quantity;

  }
/*
    public Product isLatestMonth(Product p1,Product p2){
       Date temp=Dd.isRecentMonth(p1.Dd,p2.Dd);
       return temp==p1.Dd?p1:p2;
    }*/
    public Product isLatestYear(Product p1,Product p2){
        Date temp=Dd.isRecentYear(p1.Dd,p2.Dd);
        return temp==p1.Dd?p1:p2;
  }
 public void setDate(Date Dd){
    this.Dd=Dd;
   }
    public Date getDate(){
        return Dd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
  }



    public String toString(){
        String productDetails=String.format("%04d\t%-20s%,.2f\t%d,%s",id,name,price,quantity,Dd);
      return productDetails;
   }


} class Shop {
    public static void main(String[] args) {

       Product p2 = new Product("pen", 1, 1,new Date(15,9,2022));
        Product p1 = new Product("LCD", 50000, 2 ,new Date(3,11,2019));
      Product p4= new Product("Keboard", 700, 10,new Date(12,4,2023));
       // Product p3 = new Product("Keboard wireless", 700, 10,15);
       System.out.println(p1);
        System.out.println(p2);
        System.out.println();
       // Product latestProduct = p4.isLatestMonth(p1, p2);
        //System.out.println("Latest Product on basis of month " + latestProduct);
        Product latestProducts = p4.isLatestYear(p1, p2);
        System.out.println("Latest Product on basis of year " + latestProducts);

    }
}


