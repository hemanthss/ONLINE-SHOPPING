import java.util.*;
public interface IOrder 
{
    boolean addProduct(Product p);
    boolean removeProduct(String pid) throws ProductNotFoundException;
    Collection getCartDetails();
    Product getProductFromCart(String pid) throws ProductNotFoundException;
    int productCount();
    double getCartPrice();
}
