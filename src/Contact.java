public class Contact {
    private String name;
    private int phoneNr;

    public Contact(String name, int phoneNr) {
        this.name = name;
        this.phoneNr = phoneNr;
    }

    public String getName() {
        return name;
    }

    public int getPhoneNr() {
        return phoneNr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Contact() {
    }

    @Override
    public String toString() {
        return name + " -> " + phoneNr;
    }
}
