package common.events;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

import common.EventMetadata;

public record TransactionRequestedEvent(
    UUID eventId,
    UUID transactionId,
    UUID accountId,
    BigDecimal amount,
    String transactionType,
    Instant occurredAt,
    EventMetadata metadata
) {
    
}
