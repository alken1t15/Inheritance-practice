package Task1;

public class FromBorrowedStatusMover extends BookMover {
    Book book = new Book();

    protected void moveToStatus(Book book, Status beginning, Status requestedStatus) {
        switch (requestedStatus) {
            case ARCHIVED:
                System.out.printf("Меняем статус с %s на %s \n", beginning, requestedStatus);
                book.setStatus(Status.ARCHIVED);
                break;
            case OVERDUED:
                System.out.printf("Меняем статус с %s на %s \n", beginning, requestedStatus);
                book.setStatus(Status.OVERDUED);
                break;
            default:
                book.setStatus(Status.BORROWED);
                System.out.printf("Перевод книги из статуса %s в статус %s невозможен \n", beginning, requestedStatus);
        }
    }
}