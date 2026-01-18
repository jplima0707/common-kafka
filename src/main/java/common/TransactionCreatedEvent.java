package common;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record TransactionCreatedEvent(
    UUID eventId,
    UUID transactionId,
    UUID accountId,
    BigDecimal amount,
    Instant ocurredAt,
    String transactionType,
    EventMetadata eventMetadata
) {
    
}
