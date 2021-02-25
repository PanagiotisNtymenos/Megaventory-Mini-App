package model;

import org.json.JSONObject;

public class Tax {
    private String name;
    private String description;
    private double taxValue;

    public Tax(String name, String description, double taxValue) {
        this.name = name;
        this.description = description;
        this.taxValue = taxValue;
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

    public void setDescription(String description) {
        this.description = description;
    }

    public double getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(double taxValue) {
        this.taxValue = taxValue;
    }

    public JSONObject toJSON() {
        //      creating the json object
        JSONObject json = new JSONObject();

//        Insert action
        json.put("mvRecordAction", "Insert");

//        creating the tax details
        JSONObject mvTax = new JSONObject();

        mvTax.put("TaxName", this.getName());
        mvTax.put("TaxDescription", this.getDescription());
        mvTax.put("TaxValue", this.getTaxValue());

//        add tax details to final json
        json.put("mvTax", mvTax);

        return json;
    }
}
