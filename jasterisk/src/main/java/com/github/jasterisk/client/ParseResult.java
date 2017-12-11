package com.github.jasterisk.client;

import java.time.OffsetDateTime;

class ParseResult<T> {

    final T object;
    final String application;
    final OffsetDateTime timestamp;

    ParseResult(T object, String application, OffsetDateTime timestamp) {
        this.object = object;
        this.application = application;
        this.timestamp = timestamp;
    }
}
