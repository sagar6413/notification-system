package com.notificationsystem.common_library.model;

public enum NotificationStatus {
    PENDING,  // Initial state
    QUEUED,   // Queued for fan-out
    PROCESSING, // Being processed by the fan-out service
    SENT,     // Sent to the channel publisher
    DELIVERED, // Successfully delivered (confirmed by the channel)
    FAILED,    // Failed to deliver
    READ,      // User has read the notification (for in-app)
    ACTED_ON   // User has acted on the notification
}
