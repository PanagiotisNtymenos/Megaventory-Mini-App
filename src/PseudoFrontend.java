import API.APICalls;
import model.*;

public class PseudoFrontend {

    public static void main(String args[]) {

//        get API Class instance
        APICalls API = new APICalls();

//        make tax object
        Tax tax = new Tax("Default", "The default tax, 24%", 24);

//        make discount object
        Discount discount = new Discount("Loyalty", "The Loyalty discount, 50%", 50);

//        3. make product object
        Product product = new Product("1112256", "Nike shoes", 99.99, 44.99);

//        4. make client object
        Client client = new Client("babis", "babis@exampletest.com", "Example 8, Athens", "1235698967");

//        5. make warehouse object
        Warehouse warehouse = new Warehouse("Main2", "Main Location 2", "Example 20, Athens");

//        7. make warehouse object
        Sale sale = new Sale(24, "1112256", 4, "2");
        sale.setTaxID(1);
        sale.setDiscountID(2);

//        add product to API
        API.addProduct(product);

//        add client to API
        API.addClient(client);

//        add client to API
        API.addWarehouse(warehouse);

//        add tax to API
        API.addTax(tax);

//        add discount to API
        API.addDiscount(discount);

//        add sales to API
        API.addDiscount(discount);

//        make a sale
        API.makeSale(sale);
        
    }
}
