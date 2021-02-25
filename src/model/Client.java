package model;

import org.json.JSONObject;

public class Client {

    private String type;
    private int id;
    private String name;
    private String email;
    private String shippingAddress;
    private String phone;

    public Client(String name, String email, String shippingAddress, String phone) {
        this.name = name;
        this.email = email;
        this.shippingAddress = shippingAddress;
        this.phone = phone;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getID() {
        return id;
    }

    public void setID(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public JSONObject toJSON() {
//      creating the json object
        JSONObject json = new JSONObject();

//        Insert action
        json.put("mvRecordAction", "Insert");

//        creating the client details
        JSONObject mvSupplierClient = new JSONObject();

        mvSupplierClient.put("SupplierClientName", this.getName());
        mvSupplierClient.put("SupplierClientEmail", this.getEmail());
        mvSupplierClient.put("SupplierClientShippingAddress1", this.getShippingAddress());
        mvSupplierClient.put("SupplierClientPhone1", this.getPhone());

//        add client details to final json
        json.put("mvSupplierClient", mvSupplierClient);

        return json;
    }
}
