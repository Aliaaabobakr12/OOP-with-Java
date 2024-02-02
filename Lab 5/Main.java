/*
Aliaa Abobakr Elshiekh
120210151
CSE 3
*/

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter1", "Joanne Rowling");
        Book book2 = new Book("Harry Potter2", "Joanne Rowling");
        Library.addBook(book1);
        Library.addBook(book2);
        System.out.println("Number of books in Library: " + Library.getTotalBooks());
    }
}