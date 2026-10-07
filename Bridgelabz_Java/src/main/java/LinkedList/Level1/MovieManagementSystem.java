package LinkedList;

class Movie{
    String movie_title;
    String director;
    int year_of_release;
    Movie next;
    Movie prev;
    int rating;

    Movie(String movie_title, String director, int year_of_release, int rating){
        this.movie_title = movie_title;
        this.director = director;
        this.year_of_release = year_of_release;
        this.next = null;
        this.prev = null;
    }
}

class MovieOperations{
    Movie head = null,tail=null;
    public void addAtBeginning(String movie_title, String director, int year_of_release, int rating){
        Movie movie = new Movie(movie_title, director, year_of_release,rating);
        if(head==null){
            movie.next=null;
            movie.prev = null;
            head = movie;
        }else{
            movie.next = head;
            head.prev = movie;
            head = movie;
            movie.prev = null;
        }

    }

    public void addAtEnd(String movie_title, String director, int year_of_release, int rating){
        Movie movie = new Movie(movie_title, director, year_of_release, rating);
        Movie current = head;
        if(head==null){
            movie.next=null;
            movie.prev = null;
            head = movie;
        }else{
            while(current.next!=null){
                current = current.next;
            }
            current.next = movie;
            movie.prev = current;
        }
    }

    public void addAtPosition(String movie_title, String director, int year_of_release, int pos, int rating){
        Movie movie = new Movie(movie_title, director, year_of_release, rating);
        int i=1;
        Movie current = head;
        while(i!=(pos-1)){
            current = current.next;
            i++;
        }
        movie.next = current.next;
        current.next.prev = movie;
        movie.prev = current;
        current.next = movie;
    }

    public void removeMovieRecord(String title){
        Movie current = head;
        if(current==null){
            return;
        }

        while(current!=null && !current.movie_title.equals(title)){
            current = current.next;
        }

        if(current==null){
            return;
        }

        if(current==head){
            head = current.next;
            head.prev = null;
        }

        current.prev.next = current.next;

        if(current.next!=null){
            current.next.prev = current.prev;
        }

    }

    public void searchDirector(String director){
        Movie current = head;
        while(current!=null){
            if(current.director.equals(director)){
                System.out.println("Title: "+current.movie_title);
                System.out.println("Director: "+current.director);
                System.out.println("Year of Release: "+current.year_of_release);
                System.out.println("Rating: "+current.rating);
                current = current.next;
                System.out.println();
            }
        }
    }

    public void printForwardOrder(){
        Movie current = head;
        while(current!=null){
            System.out.println("Title: "+current.movie_title);
            System.out.println("Director: "+current.director);
            System.out.println("Year of Release: "+current.year_of_release);
            System.out.println("Rating: "+current.rating);
            System.out.println();
            current = current.next;
        }
    }

    public void printBackwardOrder(){
        Movie current = head;
        while(current!=null && current.next==null){
            current=current.next;
        }

        while(current!=null && current.prev!=null){
            System.out.println("Title: "+current.movie_title);
            System.out.println("Director: "+current.director);
            System.out.println("Year of Release: "+current.year_of_release);
            System.out.println("Rating: "+current.rating);
            System.out.println();
            current = current.prev;
        }
    }

    public void updateRating(String title, int rating){
        Movie current = head;
        while(current!=null){
            if(current.movie_title.equals(title)){
                current.rating = rating;
            }else{
                current = current.next;
            }
        }
    }

}


public class MovieManagementSystem {
    public static void main(String[] args){
        MovieOperations operation = new MovieOperations();
        operation.addAtBeginning("Govindhudu","akhil",2013,9);
        operation.addAtEnd("Shathamanam bhavathi","charan",2017,8);
        operation.addAtPosition("Pushpa","trikram",2021,2,9);

        operation.addAtPosition("temper","priya",2015,2,10);
        operation.removeMovieRecord("Pushpa");
        operation.searchDirector("akhil");
        operation.printForwardOrder();
        operation.printBackwardOrder();

        operation.updateRating("Govindhudu",10);

        operation.printForwardOrder();
    }
}
