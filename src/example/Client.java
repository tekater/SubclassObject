package example;

public class Client extends Person {
    protected String contactNumber;
    protected boolean gold;


    // Генерируем Getters and Setters


    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public boolean isGold() {
        return gold;
    }

    public void setGold(boolean gold) {
        this.gold = gold;
    }
}
