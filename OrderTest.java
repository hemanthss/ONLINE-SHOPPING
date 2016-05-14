public class OrderTest {
 
    public static void main (String[] s) throws Exception 
      {
 
        Order o = new Order("rohit");
        o.addProduct(new Product("p101","ball",6,120));
        o.addProduct(new Product("p102","bat",2,140));
 
        System.out.println("\nNo. of Product : "+o.productCount());
        System.out.println ("Order Places By: "+o.uid);
 
 
        System.out.println (o.getCartPrice());
        final Iterator it = o.getCartDetails().iterator();
        while(it.hasNext()){
            System.out.println (it.next());
        }
    }
 
}
