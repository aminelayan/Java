package com.example.bookapi.controllers;

import com.example.bookapi.models.Book;
import com.example.bookapi.services.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.List;

@Controller
public class BooksController {

    private final BookService bookService;

    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/")
    public String books(Model model) {
        List<Book> Books = bookService.allBooks();
        model.addAttribute("books", Books);
        return "showBooks.jsp";
    }
    @GetMapping ("/{id}")
    public String show(@PathVariable("id") Long id, Model model){
        Book book = bookService.findBook(id);
            model.addAttribute("book", book);
        return "Book.jsp";
        }

}