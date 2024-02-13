package com.example.BooksManagement.controller;

import com.example.BooksManagement.model.Books;
import com.example.BooksManagement.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {

    @Autowired
    private BooksService booksService;

    @GetMapping
    public List<Books> getAllBooks() {
        return booksService.getAllBooks();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Books> getBooksById(@PathVariable long id) {
        Books books = booksService.getBooksById(id);
        if (books != null) {
            return new ResponseEntity<>(books, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<Books> createBooks(@RequestBody Books books) {
        Books booksBaru = booksService.createBooks(books);
        return new ResponseEntity<>(booksBaru, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Books> updateBooks(@PathVariable long id, @RequestBody Books books) {
        Books booksUpdate = booksService.updateBooks(id, books);
        if (booksUpdate != null) {
            return new ResponseEntity<>(booksUpdate, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBooks(@PathVariable long id){
        booksService.deleteBooks(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
