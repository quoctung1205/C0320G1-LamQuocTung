package model;

public class Customer {
    private int ID;
    private String name;
    private String email;
    private String adress;
    public Customer(){

    }

    public Customer(int ID, String name, String email, String adress){
        this.ID = ID;
        this.name = name;
        this.email = email;
        this.adress =adress;
    }
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
