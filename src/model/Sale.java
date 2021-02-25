package model;

import org.json.JSONObject;

import java.lang.reflect.Array;

public class Sale {

    private int taxID;
    private int discountID;
    private int clientID;
    private String productSKU;
    private int warehouseID;
    private String quantity;

    public Sale(int clientID, String productSKU, int warehouseID, String quantity) {
        this.clientID = clientID;
        this.productSKU = productSKU;
        this.warehouseID = warehouseID;
        this.quantity = quantity;
    }

    public int getClientID() {
        return clientID;
    }

    public void setClientID(int clientID) {
        this.clientID = clientID;
    }

    public String getProductSKU() {
        return productSKU;
    }

    public void setProductSKU(String productSKU) {
        this.productSKU = productSKU;
    }

    public int getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(int warehouseID) {
        this.warehouseID = warehouseID;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public int getTaxID() {
        return taxID;
    }

    public void setTaxID(int taxID) {
        this.taxID = taxID;
    }

    public void setDiscountID(int discountID) {
        this.discountID = discountID;
    }

    public int getDiscountID() {
        return discountID;
    }

    public JSONObject toJSON() {
//      creating the json object
        JSONObject json = new JSONObject();

//        Insert action
        json.put("mvRecordAction", "Insert");

//        creating the sale details
        JSONObject mvSalesOrder = new JSONObject();

//        creating the sale's product details
        JSONObject SalesOrderDetails = new JSONObject();

        SalesOrderDetails.put("SalesOrderRowProductSKU", this.getProductSKU());
        SalesOrderDetails.put("SalesOrderRowQuantity", this.getQuantity());
        SalesOrderDetails.put("SalesOrderInventoryLocationID", this.getWarehouseID());
        SalesOrderDetails.put("SalesOrderRowTaxID", this.getTaxID());
        SalesOrderDetails.put("SalesOrderRowDiscountID", this.getDiscountID());

//        create array of json objects
        JSONObject[] jsonArray = new JSONObject[1];
        jsonArray[0] = SalesOrderDetails;

        mvSalesOrder.put("SalesOrderClientId", this.getClientID());
        mvSalesOrder.put("SalesOrderDetails", jsonArray);

//        add sale details to final json
        json.put("mvSalesOrder", mvSalesOrder);

        return json;
    }

}
