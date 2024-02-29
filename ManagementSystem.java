import java.time.LocalDate;
import java.util.Scanner;

public class ManagementSystem {
    private static LocalDate LocalDate(LocalDate birthDate) {
        return null;
    }
    public static void main(String[] args) {

        Library library = new Library();
        try (Scanner scanner = new Scanner(System.in)) {
            boolean exit = false;

            while (!exit) {
                System.out.println();
                System.out.println("Library management system");
                System.out.println();
                System.out.println("1. Add new book");
                System.out.println("2. Add new author");
                System.out.println("3. Add new customer");
                System.out.println("4. Edit book");
                System.out.println("5. Edit author");
                System.out.println("6. Edit customer");
                System.out.println("7. Delete book");
                System.out.println("8. Delete author");
                System.out.println("9. Delete customer");
                System.out.println("10. Print books");
                System.out.println("11. Print authors");
                System.out.println("12. Print customers");
                System.out.println("13. Borrow book");
                System.out.println("14. Return book");
                System.out.println("15. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter author: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter ISBN: ");
                        String ISBN = scanner.nextLine();
                        System.out.print("Enter publisher: ");
                        String publisher = scanner.nextLine();
                        System.out.print("Enter number of copies: ");
                        int numCopies = scanner.nextInt();
                        scanner.nextLine();
                        library.addBook(new Book(title, author, ISBN, publisher, numCopies));
                        break;
                    case 2:
                        System.out.print("Enter name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter birth date (yyyy-MM-dd): ");
                        Scanner scan = new Scanner(System.in);
                        LocalDate birthDate = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
                        library.addAuthor(new Author(name, birthDate));
                        break;
                    case 3:
                        System.out.print("Enter name: ");
                        name = scanner.nextLine();
                        System.out.print("Enter address: ");
                        String address = scanner.nextLine();
                        System.out.print("Enter phone number: ");
                        String phoneNumber = scanner.nextLine();
                        library.addCustomer(new Customer(name, address, phoneNumber));
                        break;
                    case 4:
                        System.out.print("Enter the ISBN of the book to edit: ");
                        String isbnToEdit = scanner.nextLine();
                        Book bookToEdit = null;
                        for (Book book : library.getBooks()) {
                            if (book.getISBN().equals(isbnToEdit)) {
                                bookToEdit = book;
                                break;
                            }
                        }
                        if (bookToEdit != null) {
                            System.out.println();
                            System.out.println("Enter new details for selected book.");
                            System.out.println();
                            System.out.println("1. Edit title");
                            System.out.println("2. Edit author");
                            System.out.println("3. Edit publisher");
                            System.out.println("4. Edit number of copies");
                            System.out.println();
                            System.out.print("Enter your choice: ");
                            int editChoice = scanner.nextInt();
                            scanner.nextLine();
                            switch (editChoice) {
                                case 1:
                                    System.out.print("Enter new title: ");
                                    title = scanner.nextLine();
                                    bookToEdit.setTitle(title);
                                    break;
                                case 2:
                                    System.out.print("Enter new author: ");
                                    author = scanner.nextLine();
                                    bookToEdit.setAuthor(author);
                                    break;
                                case 3:
                                    System.out.print("Enter new publisher: ");
                                    publisher = scanner.nextLine();
                                    bookToEdit.setPublisher(publisher);
                                    break;
                                case 4:
                                    System.out.print("Enter new number of copies: ");
                                    numCopies = scanner.nextInt();
                                    scanner.nextLine();
                                    bookToEdit.setNumCopies(numCopies);
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                                    break;
                            }
                        } else {
                            System.out.println("Book not found");
                        }
                        break;
                    case 5:
                        System.out.println("Enter the name of the author to edit: ");
                        String authorToEdit = scanner.nextLine();
                        Author authorToEdit2 = null;
                        for (Author author2 : library.getAuthors()) {
                            if (author2.getName().equals(authorToEdit)) {
                                authorToEdit2 = author2;
                                break;
                            }
                        }
                        if (authorToEdit2 != null) {
                            System.out.println();
                            System.out.println("Enter new details for selected author.");
                            System.out.println();
                            System.out.println("1. Edit name");
                            System.out.println("2. Edit birth date");
                            System.out.println();
                            System.out.print("Enter your choice: ");
                            int editChoice = scanner.nextInt();
                            scanner.nextLine();
                            switch (editChoice) {
                                case 1:
                                    System.out.print("Enter new name: ");
                                    name = scanner.nextLine();
                                    authorToEdit2.setName(name);
                                    break;
                                case 2:
                                    System.out.print("Enter new birth date (yyyy-MM-dd): ");
                                    scan = new Scanner(System.in);
                                    birthDate = LocalDate.of(scan.nextInt(), scan.nextInt(), scan.nextInt());
                                    authorToEdit2.setBirthDate(LocalDate(birthDate));
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                                    break;
                            }
                        } else {
                            System.out.println("Author not found");
                        }
                        break;
                    case 6:
                        System.out.println("Enter the name of the customer to edit: ");
                        String customerToEdit = scanner.nextLine();
                        Customer customerToEdit2 = null;
                        for (Customer customer : library.getCustomers()) {
                            if (customer.getName().equals(customerToEdit)) {
                                customerToEdit2 = customer;
                                break;
                            }
                        }
                        if (customerToEdit2 != null) {
                            System.out.println();
                            System.out.println("Enter new details for selected customer.");
                            System.out.println();
                            System.out.println("1. Edit name");
                            System.out.println("2. Edit address");
                            System.out.println("3. Edit phone number");
                            System.out.println();
                            System.out.print("Enter your choice: ");
                            int editChoice = scanner.nextInt();
                            scanner.nextLine();
                            switch (editChoice) {
                                case 1:
                                    System.out.print("Enter new name: ");
                                    name = scanner.nextLine();
                                    customerToEdit2.setName(name);
                                    break;
                                case 2:
                                    System.out.print("Enter new address: ");
                                    address = scanner.nextLine();
                                    customerToEdit2.setAddress(address);
                                    break;
                                case 3:
                                    System.out.print("Enter new phone number: ");
                                    phoneNumber = scanner.nextLine();
                                    customerToEdit2.setPhoneNumber(phoneNumber);
                                    break;
                                default:
                                    System.out.println("Invalid choice");
                                    break;
                            }
                        } else {
                            System.out.println("Customer not found");
                        }
                        break;
                    case 7:
                        System.out.print("Enter the ISBN of the book to delete: ");
                        String isbnToDelete = scanner.nextLine();
                        library.deleteBook(isbnToDelete);
                        break;
                    case 8:
                        System.out.print("Enter the name of the author to delete: ");
                        String authorToDelete = scanner.nextLine();
                        library.deleteAuthor(authorToDelete);
                        break;
                    case 9:
                        System.out.print("Enter the name of the customer to delete: ");
                        String customerToDelete = scanner.nextLine();
                        library.deleteCustomer(customerToDelete);
                        break;
                    case 10:
                        library.printBooks();
                        break;
                    case 11:
                        library.printAuthors();
                        break;
                    case 12:
                        library.printCustomers();
                        break;
                    case 13:
                        System.out.print("Enter customer name: ");
                        name = scanner.nextLine();
                        System.out.print("Enter book title: ");
                        title = scanner.nextLine();
                        System.out.print("Enter number of copies: ");
                        numCopies = scanner.nextInt();
                        scanner.nextLine();
                        library.borrowBook(new Customer(name, "", ""), new Book(title, "", "", "", 0), numCopies);
                        break;
                    case 14:
                        System.out.print("Enter customer name: ");
                        name = scanner.nextLine();
                        System.out.print("Enter book title: ");
                        title = scanner.nextLine();
                        System.out.print("Enter number of copies: ");
                        numCopies = scanner.nextInt();
                        scanner.nextLine();
                        library.returnBook(new Customer(name, "", ""), new Book(title, "", "", "", 0), numCopies);
                        break;
                    case 15:
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
