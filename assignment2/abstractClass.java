abstract class Product {
    abstract double getPrice();
    abstract String getDescription();
    void Shop() {
        System.out.println("Welcome To Happy Shop!");
    }
}

class Electronics extends Product {
    String des;
    double price;

    Electronics(String d, double p) {
        des = d;
        price = p;
    }

    double getPrice() {
        return price;
    }

    String getDescription() {
        return des;
    }
}

class Clothing extends Product {
    String des;
    double price;

    Clothing(String d, double p) {
        des = d;
        price = p;
    }

    double getPrice() {
        return price;
    }

    String getDescription() {
        return des;
    }
}

public class abstractClass {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("macbook", 1231.21);
        Clothing tshirt = new Clothing("tshirt", 23.123);

        laptop.Shop();
        System.out.println("product: " + laptop.getDescription() + ", price: $" + laptop.getPrice());
        System.out.println("product: " + tshirt.getDescription() + ", price: $" + tshirt.getPrice());
    }
}
