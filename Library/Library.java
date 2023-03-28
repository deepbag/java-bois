package Library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<Book>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Method to remove a book from the library
    public void removeBook(Book book) {
        books.remove(book);
    }
    
    // Method to get the total number of books in the library
    public int getNumBooks() {
        return books.size();
    }

    // view all books
    public List<Book> getAllBooks(){
        return books;
    }
}