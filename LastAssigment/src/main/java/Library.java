import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Library {
    private List<LibraryItem> libraryItems;

    public Library() {
        libraryItems = new ArrayList<>();
    }

    public void addLibraryItem(LibraryItem item) {
        libraryItems.add(item);
    }

    public void updateLibraryItem() {
        for (LibraryItem item : libraryItems) {
            if (item.getTitle().length() >= 2) {
                String updatedTitle = item.getTitle();
                updatedTitle = updatedTitle.substring(0, 1) + Character.toUpperCase(updatedTitle.charAt(1))
                        + updatedTitle.substring(2);
                item.setTitle(updatedTitle);
            }
        }
    }

    public void removeLibraryItem() {
        if (libraryItems.size() <= 1) {
            return;
        }

        int longestAuthorIndex = 0;
        int longestAuthorLength = 0;

        for (int i = 0; i < libraryItems.size(); i++) {
            LibraryItem item = libraryItems.get(i);
            if (item.getAuthor().length() > longestAuthorLength) {
                longestAuthorIndex = i;
                longestAuthorLength = item.getAuthor().length();
            }
        }

        libraryItems.remove(longestAuthorIndex);
    }

    public void arrangeLibraryItems() {
        Collections.sort(libraryItems, new Comparator<LibraryItem>() {
            @Override
            public int compare(LibraryItem item1, LibraryItem item2) {
                if (item1.getTitle().length() >= 2 && item2.getTitle().length() >= 2) {
                    char secondChar1 = item1.getTitle().charAt(1);
                    char secondChar2 = item2.getTitle().charAt(1);
                    return Character.compare(secondChar2, secondChar1);
                }
                return 0;
            }
        });
    }

    public void displayLibraryItems() {
        for (LibraryItem item : libraryItems) {
            System.out.println("Title: " + item.getTitle());
            System.out.println("Author: " + item.getAuthor());
            System.out.println("Available: " + item.isAvailable());
            System.out.println();
        }
    }
}
