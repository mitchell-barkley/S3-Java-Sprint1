import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Book> booksBorrowed;

    public Customer(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        booksBorrowed = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name2) {
        name = name2;
    }

    public void setAddress(String address2) {
        address = address2;
    }

    public void setPhoneNumber(String phoneNumber2) {
        phoneNumber = phoneNumber2;
    }

    public void borrowBook(Book book, int numCopies) {
        if (book.getNumCopies() > 0) {
            book.setNumCopies(book.getNumCopies() - 1);
            booksBorrowed.add(book);
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book not available");
        }
    }

    public void returnBook(Book book, int numCopies) {
        if (booksBorrowed.contains(book)) {
            book.setNumCopies(book.getNumCopies() + 1);
            booksBorrowed.remove(book);
            System.out.println("Book returned successfully");
        } else {
            System.out.println("Book not borrowed");
        }
    }

    public void printBooksBorrowed() {
        for (Book book : booksBorrowed) {
            book.print();
        }
    }

    public void printBooksBorrowedByTitle() {
        List<String> titles = new ArrayList<>();
        for (Book book : booksBorrowed) {
            titles.add(book.getTitle());
        }
        titles.sort(String::compareTo);
        for (String title : titles) {
            System.out.println(title);
        }
    }

    public void printBooksBorrowedByAuthor() {
        List<String> authors = new ArrayList<>();
        for (Book book : booksBorrowed) {
            authors.add(book.getAuthor());
        }
        authors.sort(String::compareTo);
        for (String author : authors) {
            System.out.println(author);
        }
    }

    public void printBooksBorrowedByISBN() {
        List<String> ISBNs = new ArrayList<>();
        for (Book book : booksBorrowed) {
            ISBNs.add(book.getISBN());
        }
        ISBNs.sort(String::compareTo);
        for (String ISBN : ISBNs) {
            System.out.println(ISBN);
        }
    }

    public void printBooksBorrowedByNumCopies() {
        List<Book> books = new ArrayList<>(booksBorrowed);
        books.sort((book1, book2) -> book1.getNumCopies() - book2.getNumCopies());
        for (Book book : books) {
            book.print();
        }
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone number: " + phoneNumber);
    }
}
