package com.notificationsystem.common_library.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.notificationsystem.common_library.exception.BadRequestException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JsonConverter {
    private static final Logger log = LoggerFactory.getLogger(JsonConverter.class);
    private static final ObjectMapper objectMapper = new ObjectMapper().registerModule(new JavaTimeModule());

    public static String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            log.error("Error serializing object to JSON", e);
            // Consider a custom exception for serialization errors.
            throw new BadRequestException("Error serializing object to JSON");
        }
    }

    public static <T> T fromJson(String json, Class<T> clazz) {
        try {
            return objectMapper.readValue(json, clazz);
        } catch (JsonProcessingException e) {
            log.error("Error deserializing JSON to object", e);
            // Consider a custom exception for deserialization errors.
            throw new BadRequestException("Error deserializing JSON to object");
        }
    }

    // Add methods for handling TypeReferences if needed for collections/generics.
}