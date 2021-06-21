public class Phonestore {
    String name;
    String address;
    Smartphone[] inventory;

    Phonestore(String sname, String addr) {
        name = sname;
        address = addr;
        inventory = new Smartphone[3];      // discuss array constraints
    }

    void show() {
        System.out.println(name + ":" + address + ":");
        for (int i = 0; i < inventory.length; i++) {
            inventory[i].show();
        }
    }

    public void setSmartphoneInInventory(Smartphone smartphone) {
    }

    public int search(String opsys) {
        return 0;
    }

    public void showAll() {
    }
}
