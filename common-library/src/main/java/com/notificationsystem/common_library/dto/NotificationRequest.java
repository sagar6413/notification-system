package com.notificationsystem.common_library.dto;

import com.notificationsystem.common_library.model.NotificationPriority;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.Map;

public record NotificationRequest(
        @NotNull(message = "User ID cannot be null")
        Long userId,

        @NotBlank(message = "Notification type cannot be blank")
        @Size(max = 255, message = "Notification type must be less than 255 characters")
        String notificationType,

        String content,

        String templateId,

        Map<String, String> templateData,

        @NotNull
        NotificationPriority priority,

        String correlationId,

        Map<String, String> metadata,

        String actionUrl) {
}
