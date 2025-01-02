package io.github.giovanerichard.pcaapi.controllers;

import io.github.giovanerichard.pcaapi.Model.Books;
import io.github.giovanerichard.pcaapi.dtos.BookRecordDto;
import io.github.giovanerichard.pcaapi.services.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/bookstore/books")
public class BookController {

    private final BookService bookService;


    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<Books> saveBook(@RequestBody BookRecordDto bookRecordDto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(bookService.saveBook(bookRecordDto));
    }

    @GetMapping
    public ResponseEntity<List<Books>> getAllBooks() {
        return ResponseEntity.status(HttpStatus.OK).body(bookService.getAllBooks());
    }

    @DeleteMapping("/{uuid}")
    public ResponseEntity<String> deleteBook(@PathVariable UUID uuid) {
        bookService.deleteBook(uuid);
        return ResponseEntity.status(HttpStatus.OK).body("Book deleted succefully.");
    }
}
