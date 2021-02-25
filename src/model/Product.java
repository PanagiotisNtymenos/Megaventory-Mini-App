package model;

import org.json.JSONObject;

public class Product {

    private String SKU;
    private String description;
    private double salesPrice;
    private double purchasePrice;

    public Product(String SKU, String description, double salesPrice, double purchasePrice) {
        this.SKU = SKU;
        this.description = description;
        this.salesPrice = salesPrice;
        this.purchasePrice = purchasePrice;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(double salesPrice) {
        this.salesPrice = salesPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public JSONObject toJSON() {
//      creating the json object
        JSONObject json = new JSONObject();

//        Insert action
        json.put("mvRecordAction", "Insert");

//        creating the product details
        JSONObject mvProduct = new JSONObject();

        mvProduct.put("ProductSKU", this.getSKU());
        mvProduct.put("ProductDescription", this.getDescription());
        mvProduct.put("ProductSellingPrice", String.valueOf(this.getSalesPrice()));
        mvProduct.put("ProductPurchasePrice", String.valueOf(this.getPurchasePrice()));

//        add product details to final json
        json.put("mvProduct", mvProduct);

        return json;
    }
}
