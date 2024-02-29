import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Author {
    private String name;
    private LocalDate birthDate;
    private List<Book> booksWritten;

    public Author(String name, LocalDate birthDate2) {
        this.name = name;
        this.birthDate = birthDate2;
        booksWritten = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void addBook(Book book) {
        booksWritten.add(book);
    }

    public void setName(String name2) {
        name = name2;
    }

    public void setBirthDate(LocalDate date) {
        birthDate = date;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Birth date: " + birthDate);
        System.out.println("Books written: ");
        for (Book book : booksWritten) {
            System.out.println(book.getTitle());
        }
    }

    public void printBooks() {
        for (Book book : booksWritten) {
            book.print();
        }
    }

    public void printBooksByTitle() {
        List<String> titles = new ArrayList<>();
        for (Book book : booksWritten) {
            titles.add(book.getTitle());
        }
        Collections.sort(titles);
        for (String title : titles) {
            System.out.println(title);
        }
    }

    public void printBooksByNumCopies() {
        List<Book> books = new ArrayList<>(booksWritten);
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getNumCopies() - book2.getNumCopies();
            }
        });
        for (Book book : books) {
            book.print();
        }
    }

    public void printBooksByISBN() {
        List<Book> books = new ArrayList<>(booksWritten);
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getISBN().compareTo(book2.getISBN());
            }
        });
        for (Book book : books) {
            book.print();
        }
    }

    public void printBooksByAuthor() {
        List<Book> books = new ArrayList<>(booksWritten);
        Collections.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book book1, Book book2) {
                return book1.getAuthor().compareTo(book2.getAuthor());
            }
        });
        for (Book book : books) {
            book.print();
        }
    }
}
