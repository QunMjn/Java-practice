//Trần Đặng Minh Quân-se180398
public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(1, "Book 1", "Author 1", true, "Publisher 1", 200);
        Book book2 = new Book(2, "Book 2", "Author 2", true, "Publisher 2", 250);
        Book book3 = new Book(3, "Book 3", "Author 3", true, "Publisher 3", 300);

        library.addLibraryItem(book1);
        library.addLibraryItem(book2);
        library.addLibraryItem(book3);

        System.out.println("Library items before update:");
        library.displayLibraryItems();

        library.updateLibraryItem();

        System.out.println("Library items after update:");
        library.displayLibraryItems();

        library.removeLibraryItem();

        System.out.println("Library items after removing element with the longest author name:");
        library.displayLibraryItems();library.arrangeLibraryItems();

        System.out.println("Library items after arranging by the second character of title:");
        library.displayLibraryItems();

        System.out.println("Checking out Book 1: " + book1.checkOut());
        System.out.println("Checking out Book 1 again: " + book1.checkOut());
        System.out.println("Returning Book 1: " + book1.checkIn());

        System.out.println("Library items after borrowing and returning Book 1:");
        library.displayLibraryItems();
    }    
}
