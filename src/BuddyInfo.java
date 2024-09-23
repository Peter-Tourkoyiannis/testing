public class BuddyInfo {

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String name;
    private String address;
    private String phoneNumber;

    public BuddyInfo(String inName, String inAddress, String inPhoneNumber)  {

        setName(inName);
        setAddress(inAddress);
        setPhoneNumber(inPhoneNumber);

    }


    public static void main (String[] args){

        //BuddyInfo inputName = new BuddyInfo();
        //inputName.setName("Homer");
        //System.out.println("Hello " + inputName.getName() + "!");

    }
}
