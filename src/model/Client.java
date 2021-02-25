package model;

import org.json.JSONObject;

public class Client {

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
        JSONObject mvProduct = new JSONObject();

        mvProduct.put("SupplierClientName", this.getName());
        mvProduct.put("SupplierClientEmail", this.getEmail());
        mvProduct.put("SupplierClientShippingAddress1", this.getShippingAddress());
        mvProduct.put("SupplierClientPhone1", this.getPhone());

//        add client details to final json
        json.put("mvSupplierClient", mvProduct);

        return json;
    }
}
