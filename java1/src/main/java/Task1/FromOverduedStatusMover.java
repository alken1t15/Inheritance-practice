package Task1;

public class FromOverduedStatusMover extends BookMover {
    Book book = new Book();
    protected void moveToStatus(Book book, Status beginning, Status requestedStatus) {
        switch (requestedStatus) {
            case AVAILABLE:
                System.out.printf("Меняем статус с %s на %s \n", beginning, requestedStatus);
                book.setStatus(Status.AVAILABLE);
                book.setStatus(Status.ARCHIVED);
                break;
            case ARCHIVED:
                System.out.printf("Меняем статус с %s на %s \n", beginning, requestedStatus);
                book.setStatus(Status.ARCHIVED);
                break;
            default:
                book.setStatus(Status.OVERDUED);
                System.out.printf("Перевод книги из статуса %s в статус %s невозможен \n", beginning, requestedStatus);
        }
    }
}