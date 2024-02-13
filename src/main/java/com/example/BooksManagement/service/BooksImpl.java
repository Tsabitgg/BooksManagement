package com.example.BooksManagement.service;

import com.example.BooksManagement.model.Books;
import com.example.BooksManagement.repository.BooksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BooksImpl implements BooksService {

    @Autowired
    private BooksRepository booksRepository;
    @Override
    public List<Books> getAllBooks() {
        return booksRepository.findAll();
    }

    @Override
    public Books getBooksById(Long id) {
        Optional<Books> optionalBooks = booksRepository.findById(id);
        return optionalBooks.orElse(null);
    }

    @Override
    public Books createBooks(Books books) {
        return booksRepository.save(books);
    }

    @Override
    public Books updateBooks(Long id, Books books) {
        if (booksRepository.existsById(id)){
            books.setId(id);
            return booksRepository.save(books);
        }
        return null;
    }

    @Override
    public void deleteBooks(Long id) {
        booksRepository.deleteById(id);
    }
}
