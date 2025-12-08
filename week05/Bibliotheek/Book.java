package week05.Bibliotheek;

public class Book {
    private boolean borrowed;
    private String author;
    private String title;
    private int numberOfPages;

    public Book(String author, String title, int numberOfPages){
        this.author = author;
        this.title = title;
        this.numberOfPages = numberOfPages;
        this.borrowed = false;
    }

    public Book(){
        this.author = "Onbekend";
        this.title = "Onbekend";
        this.numberOfPages = 0;
    }


    public boolean getBorrowed(){
            return this.borrowed;
    }

    public void setBorrowed(boolean borrowed){
        this.borrowed = borrowed;
    }

    public String getAuthor(){
        return this.author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public int getNumberOfPages(){
        return this.numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages){
        this.numberOfPages= numberOfPages;
    }

    public void printDetails(){
        System.out.println("Het book "+ title.toUpperCase() + " (" + numberOfPages + " pagina's), geschreven door "+ author.toUpperCase()+ "is momenteel"+ (borrowed ? " niet ": " ")+  "ontleend.");

    }
}
