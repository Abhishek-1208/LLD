package BooksManagement;

import BooksManagement.Book.Book;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookStore {
    List<Book> books;

    public BookStore(List<Book> books) {
        this.books = books;
    }

    public BookStore() {
        this.books = new ArrayList<>();
    }

    public void addNewBooks(List<Book> newBooks) {
        this.books.addAll(newBooks);
    }

    public void addNewBook(Book book) {
        this.books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }

    public Book getBookByBookId(String bookId) {
        for (Book book : books) {
            if (book.getBookId().equals(bookId)) {
                return book;
            }
        }
        return null;
    }

    public void removeAllBooks() {
        this.books.clear();
    }

    public void removeBookByBookId(String bookId) {
        Book book = getBookByBookId(bookId);
        if (book != null) {
            books.remove(book);
        }
    }

    public void updateBookById(String bookId, Book newBook) {
        Book book = getBookByBookId(bookId);
        if (book != null) {
            book.setAuthor(newBook.getAuthor() != null ? newBook.getAuthor() : book.getAuthor());
            book.setLanguage(newBook.getLanguage() != null ? newBook.getLanguage() : book.getLanguage());
            book.setName(newBook.getName() != null ? newBook.getName() : book.getName());
            book.setPrice(newBook.getPrice() != null ? newBook.getPrice() : book.getPrice());
            book.setPublication(newBook.getPublication() != null ? newBook.getPublication() : book.getPublication());
            book.setYearOfPublication(newBook.getYearOfPublication() != null ? newBook.getYearOfPublication() : book.getYearOfPublication());
            book.setBookStatus(newBook.getBookStatus() != null ? newBook.getBookStatus() : book.getBookStatus());
        }
    }

    public List<Book> getBooksByAttributeAndValue(String attributeName, String value) {
        List<Book> booksByField = new ArrayList<>();
        for (Book book : books) {
            Class<?> bookClass = book.getClass();
            Field field;
            try {
                field = bookClass.getDeclaredField(attributeName);
                field.setAccessible(true);
                Object fieldValue = field.get(book);
                if (fieldValue != null && fieldValue.equals(value)) {
                    booksByField.add(book);
                }
            } catch (NoSuchFieldException | IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return booksByField;
    }

    public void updateBooksByAttributeAndValue(String attributeName, String value, Book newBook) {
        List<Book> booksByField = getBooksByAttributeAndValue(attributeName, value);
        for (Book book : booksByField) {
            book.setAuthor(newBook.getAuthor() != null ? newBook.getAuthor() : book.getAuthor());
            book.setLanguage(newBook.getLanguage() != null ? newBook.getLanguage() : book.getLanguage());
            book.setName(newBook.getName() != null ? newBook.getName() : book.getName());
            book.setPrice(newBook.getPrice() != null ? newBook.getPrice() : book.getPrice());
            book.setPublication(newBook.getPublication() != null ? newBook.getPublication() : book.getPublication());
            book.setYearOfPublication(newBook.getYearOfPublication() != null ? newBook.getYearOfPublication() : book.getYearOfPublication());
            book.setBookStatus(newBook.getBookStatus() != null ? newBook.getBookStatus() : book.getBookStatus());
        }
    }

    public void removeBooksByAttributeAndValue(String attributeName, String value) {
        List<Book> booksByField = getBooksByAttributeAndValue(attributeName, value);
        for (Book book : booksByField) {
            books.remove(book);
        }
    }

    public void replaceAllBooksWithNewBooks(List<Book> newBooks) {
        this.books = newBooks;
    }
}
