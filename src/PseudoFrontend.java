import API.APICalls;
import model.Client;
import model.Product;
import model.Warehouse;

public class PseudoFrontend {

    public static void main(String args[]) {

//        get API Class instance
        APICalls API = new APICalls();

//        3. make product
        Product product = new Product("1112256", "Nike shoes", 99.99, 44.99);

//        4. make client
        Client client = new Client("babis", "babis@exampletest.com", "Example 8, Athens", "1235698967");

//        5. make warehouse
        Warehouse warehouse = new Warehouse("Main", "Main Location", "Example 20, Athens");

//        add product to API
        API.addProduct(product);

//        add client to API
        API.addClient(client);

    }
}
