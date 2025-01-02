package io.github.giovanerichard.pcaapi.services;

import io.github.giovanerichard.pcaapi.Model.Review;
import io.github.giovanerichard.pcaapi.dtos.BookRecordDto;
import io.github.giovanerichard.pcaapi.repository.AuthorRepository;
import io.github.giovanerichard.pcaapi.repository.BookRepository;
import io.github.giovanerichard.pcaapi.repository.PublisherRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private  final PublisherRepository publisherRepository;

    public BookService(BookRepository bookRepository, AuthorRepository authorRepository, PublisherRepository publisherRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.publisherRepository = publisherRepository;
    }

//    @Transactional
//    public Book saveBook (BookRecordDto bookRecordDto) {
//        Book book = new Book();
//        book.setTitle(bookRecordDto.title());
//        book.setPublisher(publisherRepository.findById(bookRecordDto.publisherUuid()).get());
//        book.setAuthors(authorRepository.findAllById(bookRecordDto.authorIds()).stream().collect(Collectors.toSet()));
//
//        Review review = new Review();
//        review.setComment(bookRecordDto.reviewComment());
//        review.setBook(book);
//        book.setReview(review);
//
//        return bookRepository.save(book);
//    }
}
