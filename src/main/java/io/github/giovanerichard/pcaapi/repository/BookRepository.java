package io.github.giovanerichard.pcaapi.repository;

import io.github.giovanerichard.pcaapi.Model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface BookRepository extends JpaRepository<Books, UUID> {
}
