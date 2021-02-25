package model;

public class Sale {

    private Client client;
    private Product product;
    private Warehouse warehouse;
    private int quantity;

    public Sale(Client client, Product product, Warehouse warehouse, int quantity) {
        this.client = client;
        this.product = product;
        this.warehouse = warehouse;
        this.quantity = quantity;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
