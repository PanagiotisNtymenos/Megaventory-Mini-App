package model;

import org.json.JSONObject;

import java.lang.reflect.Array;

public class Sale {

    private int clientID;
    private String productSKU;
    private Warehouse warehouseID;
    private String quantity;
    private double tax = 0.24;

    public Sale(int clientID, String productSKU, Warehouse warehouseID, String quantity) {
        this.clientID = clientID;
        this.productSKU = productSKU;
        this.warehouseID = warehouseID;
        this.quantity = quantity;
    }

    public Sale(int clientID, String productSKU, Warehouse warehouseID, String quantity, double tax) {
        this.clientID = clientID;
        this.productSKU = productSKU;
        this.warehouseID = warehouseID;
        this.quantity = quantity;
        this.tax = tax;
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

    public Warehouse getWarehouseID() {
        return warehouseID;
    }

    public void setWarehouseID(Warehouse warehouseID) {
        this.warehouseID = warehouseID;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
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
