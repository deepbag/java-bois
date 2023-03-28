package Library;

import java.util.List;
import java.util.Scanner;

public class LibraryMain {

    private Library library;

    public LibraryMain() {
        library = new Library();
    }

    public void Options() {
        System.out.println("Choose what you want?");
        System.out.println("1: View Books");
        System.out.println("2: Add Book");
        System.out.print("Select item: ");

        Scanner scanner = new Scanner(System.in);
        int selected = scanner.nextInt();

        switch (selected) {
            case 1:
                System.out.println("Avaliable Books");
                List bookAll = library.getAllBooks();
                System.out.println(bookAll);
                break;
            case 2:
                System.out.println("Please fill all required information");
                System.out.print("Please fill title name: ");
                String title = scanner.next();
                System.out.print("Please fill author name: ");
                String author = scanner.next();
                Book booknew = new Book(title, author);
                library.addBook(booknew);
                System.out.println("Book Successfully Added");
                break;
        }
        Options();
    }

    public static void main(String[] args) {
        LibraryMain libraryMain = new LibraryMain();
        libraryMain.Options();
    }

}
