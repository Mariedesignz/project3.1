public class MegaApp {
    public static void main(String[] args) {

        // Create a MegaStore
        MegaStore ms = new MegaStore("ACME MegaCompany","http://www.megacompany.com");

// Add some stores and inventory

// Set up PhoneStore 1 ------------------------------------

        Phonestore ps1 = new Phonestore("Best Buy", "123 Main St, Hollywood, CA");
        ms.setPhoneStore(ps1);    	// Add this PhoneStore to the MegaStore

        ps1.setSmartphoneInInventory(new Smartphone("Samsung", "Galaxy", "Android", 512, "mystic bronze", "double", 99.99));
        ps1.setSmartphoneInInventory(new Smartphone("Apple", "iPhone 11", "ios 12", 1024, "silver", "triple", 699.99));
        ps1.setSmartphoneInInventory(new Smartphone("Google", "Pixel 12", "Android", 512, "mystic black", "double", 499.99));


// Set up PhoneStore 2 ------------------------------------

        Phonestore ps2 = new Phonestore("Bestest Buy", "55 Ave of Americas, NY, NY");
        ms.setPhoneStore(ps2); 		// Add this PhoneStore to the MegaStore

        ps2.setSmartphoneInInventory(new Smartphone("Samsung", "Galaxy", "Android", 256, "mystic bronze", "double", 99.99));
        ps2.setSmartphoneInInventory(new Smartphone("Apple", "iPhone 11", "ios 12", 1024, "silver", "triple", 699.99));
        ps2.setSmartphoneInInventory(new Smartphone("Google", "Pixel 12", "Android", 1024, "crazy red", "double", 899.99));


// Set up PhoneStore 3 ------------------------------------

        Phonestore ps3 = new Phonestore("Phranks Phones", "42 Infinite Loop, SF, CA");
        ms.setPhoneStore(ps3);  	// Add this PhoneStore to the MegaStore

        ps3.setSmartphoneInInventory(new Smartphone("Samsung", "Galaxy", "Android", 512, "mystic orange", "double", 99.99));
        ps3.setSmartphoneInInventory(new Smartphone("Apple", "iPhone 11", "ios 12", 1024, "purple", "triple", 1199.99));
        ps3.setSmartphoneInInventory(new Smartphone("Google", "Pixel 12", "android", 512, "mystic black", "double", 455.99));


// Search for certain types of phones (either “android” or “ios”)

        System.out.println("Searching for ‘android’ phones...");
        ms.searchMegaStore("android");    // does this find all the android phones?

        System.out.println("Searching for ‘ios’ phones...");
        ms.searchMegaStore("ios");   	   // does this find all the ios phones?
    }
}
