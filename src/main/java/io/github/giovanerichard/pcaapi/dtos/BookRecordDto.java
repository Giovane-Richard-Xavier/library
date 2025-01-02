package io.github.giovanerichard.pcaapi.dtos;

import java.util.Set;
import java.util.UUID;

public record BookRecordDto(String title, UUID publisherUuid, Set<UUID> authorIds, String reviewComment) {
}
