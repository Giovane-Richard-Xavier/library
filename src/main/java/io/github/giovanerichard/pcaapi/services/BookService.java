package io.github.giovanerichard.pcaapi.services;

import io.github.giovanerichard.pcaapi.Model.Books;
import io.github.giovanerichard.pcaapi.Model.GenreBooks;
import io.github.giovanerichard.pcaapi.Model.Review;
import io.github.giovanerichard.pcaapi.dtos.BookRecordDto;
import io.github.giovanerichard.pcaapi.repository.AuthorRepository;
import io.github.giovanerichard.pcaapi.repository.BookRepository;
import io.github.giovanerichard.pcaapi.repository.PublisherRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

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

    @Transactional
    public Books saveBook (BookRecordDto bookRecordDto) {
        Books book = new Books();
        book.setTitle(bookRecordDto.title());
        book.setIsbn(bookRecordDto.isbn());
        book.setPrice(bookRecordDto.price());
        book.setGenre(GenreBooks.valueOf(bookRecordDto.genre()));
        book.setPublicationDate(bookRecordDto.publication_date());
        book.setPublisher(publisherRepository.findById(bookRecordDto.publisher_uuid()).get());
        book.setAuthors(authorRepository.findAllById(bookRecordDto.author_uuid()).stream().collect(Collectors.toSet()));

        Review review = new Review();
        review.setComment(bookRecordDto.reviewComment());
        review.setBook(book);
        book.setReview(review);

        return bookRepository.save(book);
    }
}
