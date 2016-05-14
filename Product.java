public class Product  
  {
 
    public String pid;
    public String pname;
    public int qty;
    public double price;
 
    public Product(){}
    public Product(String pid, String pname, int qty, double price)
    {
        this.pid = pid;
        this.pname = pname;
        this.qty = qty;
        this.price = price;
    }
    public String getPid()
    {
      return pid;
    }
    public double getPrice()
    {
     return price;
    }
    public int getQty()
    {
     return qty;
    }
    public void setPrice(double price) 
    {
       this.price = price;
    }
    public void setQty(int qty) 
    {
       this.qty = qty;
    }

}
