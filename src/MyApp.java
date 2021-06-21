
public class MyApp {

    public static void main(String[] argv) {

// Create a few Smartphones in our inventory.

        Smartphone one = new Smartphone("apple", "iphone 12", "ios",
                128, "black", 2, 699.00);
        Smartphone two = new Smartphone("samsung", "galaxy note", "android",
                256, "mystic bronze", 3, 349.00);
        Smartphone three = new Smartphone("samsung", "galaxy z", "android",
                128, "mystic black", 3, 1449.99);

        one.show();		// Which show() is being called?
        two.show();
        three.show();

// Create a Phonestore and add some phones to that store’s inventory.

        Phonestore store = new Phonestore("Best Buy", "123 Main St, NY, NY, 10010");
        store.inventory[0] = one;
        store.inventory[1] = two;
        store.inventory[2] = three;
        store.show();	// Which show() is being called?

// The last challenge was to show phones of a certain operatingSystem, eg, “Android”,
// “android” or “ANDROID”.  How/where would you add a searchOpSys(String target) method?

// Any other suggestions for internal data structure to use instead of an array?

// If Phonestore changed its internal data structure, what has to be changed in MyApp?
// Imagine if many other applications depended on your Phonestore design.
// 		They might have to change their code too.
//		What might be a better strategy?


    }
}
