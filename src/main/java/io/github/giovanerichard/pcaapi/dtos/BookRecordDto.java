package io.github.giovanerichard.pcaapi.dtos;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

public record BookRecordDto(
        String title,
        String isbn,
        BigDecimal price,
        String genre,
        LocalDate publication_date,
        UUID publisher_uuid,
        Set<UUID> author_uuid,
        String reviewComment
) {}
