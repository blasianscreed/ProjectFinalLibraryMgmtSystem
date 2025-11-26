import java.util.ArrayList;

public class LibraryManager {

    private ArrayList<Book> bookCatalog; //stores all books

    public LibraryManager(){
        bookCatalog = new ArrayList<>(); //creates new LibraryManager with an empty catalog
    }

    public void addBook(Book book){
        bookCatalog.add(book);
        System.out.println("Book added to catalog: " + book.getTitle());
    } // adds book to catalog

    public boolean removeBook(String title){
        for (int i = 0; i < bookCatalog.size(); i++) {
            if (bookCatalog.get(i).getTitle().equalsIgnoreCase(title)) {
                Book removed = bookCatalog.remove(i);
                System.out.println("Book found and removed: " + removed.getTitle());
                return true;
                //removes book by title CASE INSENSITIVE
                //true if book found and removed; false if not
            }
        }
        System.out.println("Book not found: " + title);
        return false;
    }

    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> results = new ArrayList<>();
        for (Book book : bookCatalog){
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                results.add(book);
            }
        }
        return results; //searches for book by title
    }

    public ArrayList<Book> searchByAuthor(String author){
        ArrayList<Book> results = new ArrayList<>();
        for (Book book : bookCatalog) {
            if (book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                results.add(book);
            }
        }
        return results; //searches for author by name
    }

    public ArrayList<Book> searchByGenre(String genre) {
        ArrayList<Book> results = new ArrayList<>();
        for (Book book : bookCatalog) {
            if (book.getGenre().toLowerCase().contains(genre.toLowerCase())) {
                results.add(book);
            }
        }
        return results; // searches by genre
    }

    public ArrayList<Book> getBooksByStatus(ReadingStatus status) {
        ArrayList<Book> results = new ArrayList<>();
        for (Book book : bookCatalog) {
            if (book.getStatus() == status) {
                results.add(book);
            }
        }
        return results; // retrieves books with a specific status (read,not read, reading, or DNF)
    }

    public ArrayList<Book> getTBRList() {
        return getBooksByStatus(ReadingStatus.NOT_READ); //retrieves TBR (To Be Read) list; books with NOT_READ status
    }

public ArrayList<Book> getDNFList() {
        return getBooksByStatus(ReadingStatus.DNF); // retrieves DNF (Did Not Finish) list; books with DNF status
    }

    public boolean updateReadingStatus(String title, ReadingStatus status) {
        for (Book book : bookCatalog) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.setStatus(status);
                System.out.println("Status updated: " + book.getTitle() + " -> " + status);
                return true;
            }
        }
        System.out.println("Book not found: "+ title);
        return false; // update reading status of book by title; true if book is found and updated; false if not
    }

    public void displayAllBooks(){
        if(bookCatalog.isEmpty()) {
            System.out.println("Library is empty. No books to display.");
            return; //displays all books stored; if empty a message appears.
        }

        System.out.println("Library Catalog");
        System.out.println("Total books: " + bookCatalog.size());
        System.out.println("-------------------------");
        for (Book book : bookCatalog) {
            System.out.println(book);
        }
        System.out.println("-------------------------");
    }

    public int getTotalBooks() {
        return bookCatalog.size();
    }













}
