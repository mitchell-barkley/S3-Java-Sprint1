import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Author> authors;
    private List<Customer> customers;

    public Library() {
        books = new ArrayList<>();
        authors = new ArrayList<>();
        customers = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void printBooks() {
        for (Book book : books) {
            book.print();
        }
    }

    public Book[] getBooks() {
        return books.toArray(new Book[0]);
    }

    public Author[] getAuthors() {
        return authors.toArray(new Author[0]);
    }

    public Customer[] getCustomers() {
        return customers.toArray(new Customer[0]);
    }

    public void printAuthors() {
        for (Author author : authors) {
            author.print();
        }
    }

    public void printCustomers() {
        for (Customer customer : customers) {
            customer.print();
        }
    }

    public void printBooksByTitle() {
        List<String> titles = new ArrayList<>();
        for (Book book : books) {
            titles.add(book.getTitle());
        }
        titles.sort(null);
        for (String title : titles) {
            System.out.println(title);
        }
    }

    public void printBooksByAuthor() {
        List<String> authors = new ArrayList<>();
        for (Book book : books) {
            authors.add(book.getAuthor());
        }
        authors.sort(null);
        for (String author : authors) {
            System.out.println(author);
        }
    }

    public void printBooksByISBN() {
        List<String> ISBNs = new ArrayList<>();
        for (Book book : books) {
            ISBNs.add(book.getISBN());
        }
        ISBNs.sort(null);
        for (String ISBN : ISBNs) {
            System.out.println(ISBN);
        }
    }

    public void deleteBook(String isbnToDelete) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getISBN().equals(isbnToDelete)) {
                books.remove(i);
                break;
            }
        }
    }

    public void deleteAuthor(String authorToDelete) {
        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i).getName().equals(authorToDelete)) {
                authors.remove(i);
                break;
            }
        }
    }

    public void deleteCustomer(String customerToDelete) {
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getName().equals(customerToDelete)) {
                customers.remove(i);
                break;
            }
        }
    }

    public void borrowBook(Customer customer, Book book, int numCopies) {
        customer.borrowBook(book, numCopies);
    }

    public void returnBook(Customer customer, Book book, int numCopies) {
        customer.returnBook(book, numCopies);
    }
}
