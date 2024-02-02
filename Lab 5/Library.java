/*
Aliaa Abobakr Elshiekh
120210151
CSE 3
*/

public class Library {
    private static int totalBooks = 0;
    public static void addBook(Book book) {
        totalBooks++;
        System.out.println("Book has been added to the Library is: " + book.getTitle());
    }
    public static int getTotalBooks() {
        return Library.totalBooks;
    }
}