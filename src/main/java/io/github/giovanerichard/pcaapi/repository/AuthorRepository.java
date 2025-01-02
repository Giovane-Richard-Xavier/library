package io.github.giovanerichard.pcaapi.repository;

import io.github.giovanerichard.pcaapi.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AuthorRepository extends JpaRepository<Author, UUID> {

}
