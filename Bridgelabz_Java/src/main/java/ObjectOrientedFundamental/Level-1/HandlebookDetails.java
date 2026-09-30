import java.util.Scanner;

public class HandlebookDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the book");
        String name = sc.next();

        System.out.println("Enter the author of the book");
        String author = sc.next();

        System.out.println("Enter the price of the book");
        double price = sc.nextDouble();

        handle obj = new handle();
        obj.setName(name);
        obj.setAuthor(author);
        obj.setPrice(price);

        System.out.println("Book Name: " + obj.getName());
        System.out.println("Book Author: " + obj.getAuthor());
        System.out.println("Book Price: " + obj.getPrice());

    }
}


class handle{
    private String book;
    private String author;
    private double price;

    public void setName(String book){
        this.book = book;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public String getName(){
        return this.book;
    }

    public String getAuthor(){
        return this.author;
    }

    public double getPrice(){
        return this.price;
    }

    
}