package sr.unasat.jdbc.importbedrijf.entities;

public class Customer {
    private int customer_ID;
    private String first_Name;
    private String last_Name;
    private String street_Name;
    private int house_Number;
    private String identification_Number;
    private String mobile_Number;

    public Customer(int customer_ID, String first_Name, String last_Name, String street_Name, int house_Number, String identification_Number, String mobile_Number) {
        this.customer_ID = customer_ID;
        this.first_Name = first_Name;
        this.last_Name = last_Name;
        this.street_Name = street_Name;
        this.house_Number = house_Number;
        this.identification_Number = identification_Number;
        this.mobile_Number = mobile_Number;
    }

    public int getCustomer_ID() {
        return customer_ID;
    }

    public void setCustomer_ID(int customer_ID) {
        this.customer_ID = customer_ID;
    }

    public String getFirst_Name() {
        return first_Name;
    }

    public void setFirst_Name(String first_Name) {
        this.first_Name = first_Name;
    }

    public String getLast_Name() {
        return last_Name;
    }

    public void setLast_Name(String last_Name) {
        this.last_Name = last_Name;
    }

    public String getStreet_Name() {
        return street_Name;
    }

    public void setStreet_Name(String street_Name) {
        this.street_Name = street_Name;
    }

    public int getHouse_Number() {
        return house_Number;
    }

    public void setHouse_Number(int house_Number) {
        this.house_Number = house_Number;
    }

    public String getIdentification_Number() {
        return identification_Number;
    }

    public void setIdentification_Number(String identification_Number) {
        this.identification_Number = identification_Number;
    }

    public String getMobile_Number() {
        return mobile_Number;
    }

    public void setMobile_Number(String mobile_Number) {
        this.mobile_Number = mobile_Number;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_ID=" + customer_ID +
                ", first_Name='" + first_Name + '\'' +
                ", last_Name='" + last_Name + '\'' +
                ", street_Name='" + street_Name + '\'' +
                ", house_Number=" + house_Number +
                ", identification_Number='" + identification_Number + '\'' +
                ", mobile_Number=" + mobile_Number +
                '}';
    }
}
