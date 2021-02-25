package model;

import org.json.JSONObject;

public class Discount {
    private String name;
    private String description;
    private double discountValue;

    public Discount(String name, String description, double discountValue) {
        this.name = name;
        this.description = description;
        this.discountValue = discountValue;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String descriptiom) {
        this.description = descriptiom;
    }

    public double getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(double discountValue) {
        this.discountValue = discountValue;
    }

    public JSONObject toJSON() {
        //      creating the json object
        JSONObject json = new JSONObject();

//        Insert action
        json.put("mvRecordAction", "Insert");

//        creating the discount details
        JSONObject mvDiscount = new JSONObject();

        mvDiscount.put("DiscountName", this.getName());
        mvDiscount.put("DiscountDescription", this.getDescription());
        mvDiscount.put("DiscountValue", this.getDiscountValue());

//        add discount details to final json
        json.put("mvDiscount", mvDiscount);

        return json;
    }
}
