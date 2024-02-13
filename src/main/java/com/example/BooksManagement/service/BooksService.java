package com.example.BooksManagement.service;

import com.example.BooksManagement.model.Books;

import java.util.List;
public interface BooksService {
    List<Books> getAllBooks();
    Books getBooksById(Long id);
    Books createBooks(Books books);
    Books updateBooks(Long id, Books books);
    void deleteBooks(Long id);

}
