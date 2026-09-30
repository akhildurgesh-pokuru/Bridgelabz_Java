import java.util.Scanner;

public class HandleMobilePhoneDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the mobile phone");
        String name = sc.next();

        System.out.println("Enter the brand of the mobile phone");
        String brand = sc.next();

        System.out.println("Enter the price of the mobile phone");
        double price = sc.nextDouble();

        MobilePhone obj = new MobilePhone();
        obj.setName(name);
        obj.setBrand(brand);
        obj.setPrice(price);

        System.out.println("Mobile Phone Name: " + obj.getName());
        System.out.println("Mobile Phone Brand: " + obj.getBrand());
        System.out.println("Mobile Phone Price: " + obj.getPrice());

    }
}

class MobilePhone {
    private String name;
    private String brand;
    private double price;

    public void setName(String name) {
        this.name = name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getBrand() {
        return this.brand;
    }

    public double getPrice() {
        return this.price;
    }
}

