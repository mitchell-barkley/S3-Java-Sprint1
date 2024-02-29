class Book {
    private String title;
    private String author;
    private String ISBN;
    private String publisher;
    private int numCopies;

    public Book(String title, String author, String ISBN, String publisher, int numCopies) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.numCopies = numCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNumCopies() {
        return numCopies;
    }

    public void setNumCopies(int numCopies) {
        this.numCopies = numCopies;
    }

    public void setTitle(String title2) {
        title = title2;
    }

    public void setAuthor(String author2) {
        author = author2;
    }

    public void setISBN(String iSBN2) {
        ISBN = iSBN2;
    }

    public void setPublisher(String publisher2) {
        publisher = publisher2;
    }

    public void print() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Publisher: " + publisher);
        System.out.println("Number of copies: " + numCopies);
    }

    public void borrowBook() {
        if (numCopies > 0) {
            numCopies--;
            System.out.println("Book borrowed successfully");
        } else {
            System.out.println("Book not available");
        }
    }

    public void returnBook() {
        numCopies++;
        System.out.println("Book returned successfully");
    }
}