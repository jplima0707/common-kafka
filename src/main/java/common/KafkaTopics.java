package common;

public final class KafkaTopics {
    public static final String TRANSACTION_CREATED = "transaction.created";
    public static final String TRANSACTION_REJECTED = "transaction.rejected"; 

    private KafkaTopics() {
        // Prevent instantiation
    }
}
