package io.github.giovanerichard.pcaapi.repository;

import io.github.giovanerichard.pcaapi.Model.Review;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ReviewRepository extends JpaRepository<Review, UUID> {
}
