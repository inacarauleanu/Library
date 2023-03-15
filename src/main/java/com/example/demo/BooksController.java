package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

@RestController
public class BooksController {

    @GetMapping("/books")
    public List<Book> showBooks()
    {
        return LibraryMethods.showBooks();
    }
    
    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book)
    {
        return LibraryMethods.addBook(book);
    }

    @PutMapping("/updateBook/{id}")
    public Book updateBook(@PathVariable Long id, @RequestBody Book book)
    {
        return LibraryMethods.updateBook(id, book);
    }

    @DeleteMapping("/deleteBook/{id}")
    public Book deleteBook(@PathVariable Long id)
    {
        return LibraryMethods.deleteBook(id);
    }

    @GetMapping("/books/{title}")
    public Book findBook(@PathVariable String title)
    {
        return LibraryMethods.findBook(title);
    }

}
