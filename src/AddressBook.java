import java.util.ArrayList;

public class AddressBook {

    ArrayList<BuddyInfo> buddyList = new ArrayList<>();


    public void addbuddy(BuddyInfo buddy) {

        buddyList.add(buddy);

    }

    public void removeBuddy(BuddyInfo buddy) {

        buddyList.remove(buddy);

    }
    public static void main(String[] args) {

        BuddyInfo buddy = new BuddyInfo("Tom","Carleton","613");
        AddressBook addressBook = new AddressBook();
        addressBook.addbuddy(buddy);
        addressBook.removeBuddy(buddy);

    }
}
