package Task1;

public class StatusСhange extends BookMover {
    FromAchievedStatusMover fromAchievedStatusMover = new FromAchievedStatusMover();
    FromAvailableStatusMover fromAvailableStatusMover = new FromAvailableStatusMover();
    FromOverduedStatusMover fromOverduedStatusMover = new FromOverduedStatusMover();
    FromBorrowedStatusMover fromBorrowedStatusMover = new FromBorrowedStatusMover();
     protected void moveToStatus(Book book, Status beginning,Status requestedStatus) {
        switch(beginning) {
            case AVAILABLE:
                fromAvailableStatusMover.moveToStatus(book,beginning,requestedStatus);
                break;
            case BORROWED:
               fromBorrowedStatusMover.moveToStatus(book,beginning,requestedStatus);
                break;
            case OVERDUED:
                fromOverduedStatusMover.moveToStatus(book,beginning,requestedStatus);
                break;
            case ARCHIVED:
                fromAchievedStatusMover.moveToStatus(book,beginning,requestedStatus);
                break;
        }
    }
}
