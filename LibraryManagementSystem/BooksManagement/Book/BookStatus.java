package BooksManagement.Book;
enum Availability {
    AVAILABLE, ISSUED, RESERVED
}
public class BookStatus {
    Availability availability;
    String borrowerUserId;
    String issueDate;
    String returnDate;
    String dueDate;

    protected BookStatus(BookStatusBuilder args) {
        this.availability = args.availability;
        this.borrowerUserId = args.borrowerUserId;
        this.issueDate = args.issueDate;
        this.returnDate = args.returnDate;
        this.dueDate = args.dueDate;
    }

    public String getBorrowerUserId() {
        return borrowerUserId;
    }

    public Availability getStatus() {
        return availability;
    }

    public String getIssueDate() {
        return issueDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setStatus(Availability availability) {
        this.availability = availability;
    }

    public void setIssueDate(String issueDate) {
        this.issueDate = issueDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void setBorrowerUserId(String borrowerUserId) {
        this.borrowerUserId = borrowerUserId;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "BookStatus{" +
                "availability : " + availability + ",\n" +
                "borrowerUserId : " + borrowerUserId + ",\n" +
                "issueDate : " + issueDate + ",\n" +
                "returnDate : " + returnDate + ",\n" +
                "dueDate : " + dueDate + "\n" +
                "}";
    }

    public static class BookStatusBuilder {
        private Availability availability;
        private String borrowerUserId;
        private String issueDate;
        private String returnDate;
        private String dueDate;

        public BookStatusBuilder Availability(Availability availability) {
            this.availability = availability;
            return this;
        }

        public BookStatusBuilder BorrowerUserId(String borrowerUserId) {
            this.borrowerUserId = borrowerUserId;
            return this;
        }

        public BookStatusBuilder IssueDate(String issueDate) {
            this.issueDate = issueDate;
            return this;
        }

        public BookStatusBuilder ReturnDate(String returnDate) {
            this.returnDate = returnDate;
            return this;
        }

        public BookStatusBuilder DueDate(String dueDate) {
            this.dueDate = dueDate;
            return this;
        }

        public BookStatus Build() {
            return new BookStatus(this);
        }

    }

}
