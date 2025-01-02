package io.github.giovanerichard.pcaapi.repository;

import io.github.giovanerichard.pcaapi.Model.Author;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootTest
public class AuthorRepositoryTest {

    @Autowired
    AuthorRepository repository;

    @Test
    public void createAuthorTest () {
        Author author = new Author();
        author.setName("Machado de Assis");
        author.setNationality("Brasileiro");
        author.setBirthdate(LocalDate.of(1856, 6, 2));

        var authorCreated = repository.save(author);
        System.out.println("Author criado: " + authorCreated);
    }

    @Test
    public void listAuthors () {
        List<Author> lista = repository.findAll();

        lista.forEach(System.out::println);
    }
//
//    @Test
//    public void updateAuthorTest () {
//        var uuid = UUID.fromString("8cfe75fd-e3b6-47e9-acdf-22bf6ec847c0");
//
//        Optional<Author> existsAuthor = repository.findById(uuid);
//
//        if(existsAuthor.isPresent()) {
//            Author authorEncontrado = existsAuthor.get();
//
//            System.out.println("Dados do Author");
//            System.out.println(authorEncontrado);
//
//            authorEncontrado.setName("Aluizio de Azevedo");
//            repository.save(authorEncontrado);
//        }
//    }
}
