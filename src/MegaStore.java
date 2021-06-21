import java.util.ArrayList;

public class MegaStore {
    private String megaName;
    private String website;
    private ArrayList<Phonestore> stores;

    MegaStore(String megaName, String website) {
        this.megaName = megaName;
        this.website = website;
        this.stores = new ArrayList<Phonestore>();
    }

    // method to set up an individual store as part of the megaStore (a setter)

    public void setPhoneStore(Phonestore ps) {
        stores.add(ps);
    }

    // method to get a reference to a particular store

    public Phonestore getphonestore(int index) {
        return stores.get(index);
    }

    // method to display inventory of all stores

    public void showCompleteInventory() {
        for( Phonestore p : stores)
            p.showAll();            // Call the showAll() method in PhoneStore (we already wrote this code!)
        }


    // methoed to search each store's inventory for phones with a specified operating-system
    public void searchMegaStore(String opsys) {
        for(Phonestore p : stores) {
            int index = p.search(opsys);
            if (index >= 0) {
                p.show();
            }
        }
    }
}
