package common.events;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

import common.EventMetadata;

public record TransactionCreatedEvent(
    UUID eventId,
    UUID transactionId,
    UUID accountId,
    BigDecimal amount,
    Instant ocurredAt,
    EventMetadata eventMetadata
) {
    
}
