package com.bookclub.Services;

import com.bookclub.Models.Book;
import com.bookclub.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
@Autowired
    private BookRepository bookRepo;

    public BookService(BookRepository bookRepo) {
        this.bookRepo=bookRepo;
    }

    //get all books
    public List<Book> allBooks(){
        return bookRepo.findAll();
    }

    //create new book
    public Book createBook(Book book) {
        return bookRepo.save(book);
    }

    //get a book
    public Book findBook(Long id) {
        Optional<Book> optionalBook=bookRepo.findById(id);
        if (optionalBook.isPresent()) {
            return optionalBook.get();
        }
        else {
            return null;
        }
    }

    //update book
    public Book updateBook(Book book) {
        return bookRepo.save(book);
    }

    //delete book
    public void deleteDojo(Long id) {
        Book requiredBook=findBook(id);
        bookRepo.delete(requiredBook);
    }

}