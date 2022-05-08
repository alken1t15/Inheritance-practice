package Task1;

public class FromAchievedStatusMover extends BookMover {
    Book book = new Book();

    protected void moveToStatus(Book book, Status beginning, Status requestedStatus) {
        switch (requestedStatus) {
            case AVAILABLE:
                System.out.printf("Меняем статус с %s на %s \n", beginning, requestedStatus);
                book.setStatus(Status.AVAILABLE);
                break;
            default:
                book.setStatus(Status.ARCHIVED);
                System.out.printf("Перевод книги из статуса %s в статус %s невозможен \n", beginning, requestedStatus);
        }
    }
}