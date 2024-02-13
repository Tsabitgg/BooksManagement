package com.example.BooksManagement.repository;

import com.example.BooksManagement.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BooksRepository extends JpaRepository<Books, Long> {

}
