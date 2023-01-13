package com.bookstore.bookstore.Controller;
import java.util.List;
import java.util.Optional;

import com.bookstore.bookstore.Entities.Bookstore;
import com.bookstore.bookstore.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
@CrossOrigin("*")
public class BookStoreController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public Bookstore saveBook(@RequestBody Bookstore bookstore){
        return bookService.saveBook(bookstore);
    }

    @GetMapping
    public List<Bookstore> getAllBooks(){
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
public Optional<Bookstore> getBookById(@PathVariable long id){
        return bookService.getBookById(id);
}
@PutMapping("/{id}")
public Bookstore updateBook(@PathVariable long id, @RequestBody Bookstore bookstore){
        return bookService.updateBook(id, bookstore);
}

@DeleteMapping("/{id}")
public void deleteBook(@PathVariable long id){
        bookService.deleteBook(id);
}

}
