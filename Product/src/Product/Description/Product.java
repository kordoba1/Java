package Product.Description;

public class Product {
    private int id;
    private String name;
    private String manufacturer;
    private double price;
    private int lifetime;
    private int count;

    public Product()
    {
        id = 0;
        name = "";
        manufacturer = "";
        price = 0;
        lifetime = 0;
        count = 0;
    }
    public Product(int _id, String _name, String _manufacturer, double _price, int _lifetime, int _count) {
        id = _id;
        name = _name;
        manufacturer = _manufacturer;
        price = _price;
        lifetime = _lifetime;
        count = _count;
    }

    @Override
    public String toString() {
        return String.format("id=%5d, name=%15s, manufacturer=%15s, price=%8.2f, lifetime=%5d, count=%5d",
                id, name, manufacturer, price, lifetime, count);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public int getLifetime() {
        return lifetime;
    }

    public int getCount() {
        return count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setLifetime(int lifetime) {
        this.lifetime = lifetime;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

