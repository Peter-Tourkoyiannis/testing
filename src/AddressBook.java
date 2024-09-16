import java.util.ArrayList;

public class AddressBook extends BuddyInfo {

    //String address;
    //String phoneNumber;
    ArrayList<BuddyInfo> buddyList = new ArrayList<>();


    public void addbuddy(BuddyInfo buddy) {

        buddyList.add(buddy);

    }

    public void removeBuddy(BuddyInfo buddy) {

        buddyList.remove(buddy);

    }
    public static void main(String[] args) {

        System.out.println("Address Book");

    }
}
