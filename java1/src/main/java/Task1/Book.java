package Task1;

public class Book {
    Book() {
    }

    private Status status;
    private String name;

    public void setStatus(Status status) {
        this.status = status;
        this.status = status;
    }


    public Status getStatus() {
        return this.status;
    }

    Book(String name) {
        this.status = Status.AVAILABLE;
        this.name = name;
    }
}