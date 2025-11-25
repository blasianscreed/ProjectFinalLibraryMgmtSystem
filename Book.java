public class Book {

    // book details
    private String title;
    private String author;
    private int pageCount;
    private String genre;
    private ReadingStatus status;

    /*
    parameters
    - DEFAULT STATUS = NOT_READ for newly added books
        - title: the books primary name
        - author: who wrote the book
        - pageCount: number of pages in book
        - genre: type of genre
     */

    public Book(String title, String author, int pageCount, String genre){
        this.title = title;
        this.author = author;
        this.pageCount = pageCount;
        this.genre = genre;
        this.status = ReadingStatus.NOT_READ; // DEFAULT  STATUS FOR NEW BOOKS ADDED
    };

    public String getTitle(){
        return title; //Returns title of book
    }

    public String getAuthor(){
        return author; //Returns name of author
    }

    public String getPageCount(){
        return pageCount; //Returns number of pages in book
    }

    public String getGenre(){
        return genre; //Returns book's genre
    }

    public ReadingStatus getStatus() {
        return status; //Returns reading status of book
    }














}
