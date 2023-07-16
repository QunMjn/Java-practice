 public class Book extends LibraryItem implements Borrowable {
    private String publisher;
    private int numberOfPages;

    public Book(int id, String title, String author, boolean available, String publisher, int numberOfPages) {
        super(id, title, author, available);
        this.publisher = publisher;
        this.numberOfPages = numberOfPages;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }
     @Override
    public boolean checkOut() {
        if (isAvailable()) {
            setAvailable(false);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkIn() {
        if (!isAvailable()) {
            setAvailable(true);
            return true;
        } else {
            return false;
        }
    }
}
interface Borrowable {
    boolean checkOut();
    boolean checkIn();
}