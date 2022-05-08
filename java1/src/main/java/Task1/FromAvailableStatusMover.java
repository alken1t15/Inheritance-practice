package Task1;

public class FromAvailableStatusMover extends BookMover {
    Book book = new Book();

    protected void moveToStatus(Book book, Status beginning, Status requestedStatus) {
        switch (requestedStatus) {
            case BORROWED:
                System.out.printf("Меняем статус с %s на %s \n", beginning, requestedStatus);
                book.setStatus(Status.BORROWED);
                break;
            case ARCHIVED:
                System.out.printf("Меняем статус с %s на %s \n", beginning, requestedStatus);
                book.setStatus(Status.ARCHIVED);
                break;
            default:
                System.out.printf("Перевод книги из статуса %s в статус %s невозможен \n", beginning, requestedStatus);
        }
    }
}
