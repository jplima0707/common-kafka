package com.jplima0707.common.events;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

import com.jplima0707.common.EventMetadata;

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
