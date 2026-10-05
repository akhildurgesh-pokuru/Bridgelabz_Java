package ObjectModeling;

import java.util.ArrayList;
import java.util.List;

class Book{
    String title;
    String author;

    Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public void display_books(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }

}

class library{
    static String libraryname = "SRM Library";
    List<Book> books;

    library(){
        this.books = new ArrayList<>();
    }

    public void addBooks(Book obj){
        books.add(obj);
    }

    public void library_books(){
        for(Book book : books){
            book.display_books();
            System.out.println();
        }
    }

}


public class LibraryBookAggregation {
    public static void main(String[] args){

        Book obj = new Book("DSA","Akhil");
        Book obj2 = new Book("OS","Charan");

        library obj3 = new library();
        obj3.addBooks(obj);
        obj3.addBooks(obj2);

        obj3.library_books();
    }
}
