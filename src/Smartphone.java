class Smartphone {
    String manufacturer;
    String model;
    String operatingSystem;
    int ram;
    String color;
    int camera_type;
    double price;

    public Smartphone (String man, String mod, String opsys, int ramsize, String phonecolor, int cam, double cost) {
        manufacturer = man;
        model = mod;
        operatingSystem = opsys;
        ram = ramsize;
        color = phonecolor;
        camera_type = cam;
        price = cost;
    }

    public Smartphone(String apple, String mod, String opsys, int ramsize, String silver, String triple, double cost) {
    }

    public void show(){
        System.out.println(manufacturer + ":" +
                model + ":" +
                operatingSystem + ":" +
                ram + ":" +
                color + ":" +
                camera_type + ":" +
                price);
    }
}

