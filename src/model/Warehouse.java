package model;

public class Warehouse {

    private String abbreviation;
    private String name;
    private String address;

    public Warehouse(String abbreviation, String name, String address) {
        this.abbreviation = abbreviation;
        this.name = name;
        this.address = address;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
