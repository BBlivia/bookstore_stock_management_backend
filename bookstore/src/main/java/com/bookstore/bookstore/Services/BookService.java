package com.bookstore.bookstore.Services;

import com.bookstore.bookstore.Entities.Bookstore;
import com.bookstore.bookstore.Repo.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BookService implements BookServiceInterface{
    @Autowired
    private BookRepository bookRepository;
    @Override
    public Bookstore saveBook(Bookstore bookstore) {
        return bookRepository.save(bookstore);
    }

    @Override
    public Optional<Bookstore> getBookById(long id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Bookstore> getAllBooks() {
        return bookRepository.findAll(Sort.by(Sort.Direction.DESC,  "id"));
    }

    @Override
    public Bookstore updateBook(long id, Bookstore bookstore) {
       Bookstore updateBook = bookRepository.findById(id).orElseThrow();

        updateBook.setTitle(bookstore.getTitle());
        updateBook.setAuthor(bookstore.getAuthor());
        updateBook.setPrice(bookstore.getPrice());
        updateBook.setEdition(bookstore.getEdition());
                return bookRepository.save(updateBook);

    }

    @Override
    public void deleteBook(long id){
    bookRepository.deleteById(id);
    }
}
