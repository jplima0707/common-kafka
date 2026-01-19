package common.events;

import java.time.Instant;
import java.util.UUID;

import common.EventMetadata;

public record TransactionRejectedEvent(
    UUID eventId,
    UUID transactionId,
    UUID accountId,
    Instant ocurredAt,
    String rejectionReason,
    EventMetadata eventMetadata
) {
    
}
