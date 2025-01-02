package io.github.giovanerichard.pcaapi.repository;

import io.github.giovanerichard.pcaapi.Model.Publisher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PublisherRepositoryTest {

    @Autowired
    PublisherRepository repository;

    @Test
    public void createPublisherTest () {
        Publisher publisher = new Publisher();
        publisher.setName("Penguin-Companhia");

        var publisherCreated = repository.save(publisher);
        System.out.println("Publish criada: " + publisherCreated);
    }
}
