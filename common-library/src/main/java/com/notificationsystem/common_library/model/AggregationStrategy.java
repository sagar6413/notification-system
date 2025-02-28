package com.notificationsystem.common_library.model;

public enum AggregationStrategy {
    COUNT_BASED,
    THREAD_BASED,
    SUMMARY_BASED,
    NONE // For critical notifications that bypass aggregation
}