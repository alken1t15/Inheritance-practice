package Task1;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        BookMover bookMover = new StatusСhange();
        bookMover.moveToStatus(book, Status.AVAILABLE ,Status.BORROWED);
        System.out.println(book.getStatus());
    }
}