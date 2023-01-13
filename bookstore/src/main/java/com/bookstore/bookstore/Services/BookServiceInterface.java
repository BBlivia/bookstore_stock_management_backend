package com.bookstore.bookstore.Services;
import com.bookstore.bookstore.Entities.Bookstore;

import java.util.Optional;
import java.util.List;
public interface BookServiceInterface {
    public Bookstore saveBook(Bookstore bookstore);
    public Optional<Bookstore> getBookById(long id);
    List<Bookstore> getAllBooks();
    Bookstore updateBook(long id, Bookstore bookstore);
    void deleteBook(long id);

}
