package com.notificationsystem.common_library.dto;

import com.notificationsystem.common_library.model.NotificationPriority;
import com.notificationsystem.common_library.model.NotificationStatus;

import java.time.Instant;
import java.util.Map;

public record NotificationResponse(
        String notificationId,
        Long userId,
        String notificationType,
        String content,
        String templateId,
        NotificationPriority priority,
        NotificationStatus status,
        String channel,
        String correlationId,
        Instant createdAt,
        Instant sentAt,
        Instant readAt,
        Instant actedOnAt,
        Map<String, String> metadata,
        String actionUrl,
        String aggregatedNotificationId
) {
}
