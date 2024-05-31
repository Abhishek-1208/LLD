package BooksManagement.Book;
public class Book {
    String name;
    String author;
    String publication;
    Integer price;
    Integer yearOfPublication;
    String language;
    String bookId;
    BookStatus bookStatus;
    protected Book(BookBuilder args) {
        this.name = args.name;
        this.author = args.author;
        this.publication = args.publication;
        this.price = args.price;
        this.yearOfPublication = args.yearOfPublication;
        this.language = args.language;
        this.bookId = args.bookId;
        this.bookStatus = args.bookStatus;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getPublication() {
        return publication;
    }
    public void setPublication(String publication) {
        this.publication = publication;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public Integer getYearOfPublication() {
        return yearOfPublication;
    }
    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getBookId() {
        return bookId;
    }
    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public BookStatus getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(BookStatus bookStatus) {
        this.bookStatus = bookStatus;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", publication='" + publication + '\'' +
                ", price=" + price +
                ", yearOfPublication=" + yearOfPublication +
                ", language='" + language + '\'' +
                ", bookId='" + bookId + '\'' +
                ", bookStatus=" + bookStatus.toString() +
                '}';
    }

    public static class BookBuilder {
        private String name;
        private String author;
        private String publication;
        private Integer price;
        private Integer yearOfPublication;
        private String language;
        private String bookId;
        private BookStatus bookStatus;

        public BookBuilder Name(String name) {
            this.name = name;
            return this;
        }

        public BookBuilder Author(String author) {
            this.author = author;
            return this;
        }

        public BookBuilder Publication(String publication) {
            this.publication = publication;
            return this;
        }

        public BookBuilder Price(Integer price) {
            this.price = price;
            return this;
        }

        public BookBuilder YearOfPublication(Integer yearOfPublication) {
            this.yearOfPublication = yearOfPublication;
            return this;
        }

        public BookBuilder Language(String language) {
            this.language = language;
            return this;
        }

        public BookBuilder BookId(String bookId) {
            this.bookId = bookId;
            return this;
        }

        public BookBuilder BookStatus(BookStatus bookStatus) {
            this.bookStatus = bookStatus;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
