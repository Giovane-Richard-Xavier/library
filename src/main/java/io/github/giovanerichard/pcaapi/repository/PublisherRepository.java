package io.github.giovanerichard.pcaapi.repository;

import io.github.giovanerichard.pcaapi.Model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PublisherRepository extends JpaRepository<Publisher, UUID> {
}
