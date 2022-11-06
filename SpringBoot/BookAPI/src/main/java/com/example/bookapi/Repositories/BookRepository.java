package com.example.bookapi.Repositories;
import com.example.bookapi.models.Book;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface BookRepository extends CrudRepository<Book,Long> {
    List<Book> findAll();
    List<Book> findByDescriptionContaining(String search);
    Long countByTitleContaining(String search);
    Long deleteByTitleStartingWith(String search);
}
