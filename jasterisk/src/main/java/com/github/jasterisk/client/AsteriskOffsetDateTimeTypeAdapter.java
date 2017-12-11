package com.github.jasterisk.client;

import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;

/**
 * {@link TypeAdapter} for {@link OffsetDateTime} that handles date times as returned by Asterisk. Asterisk returns
 * incorrect date time strings that have an offset format of +HHmm instead of the ISO-8601 +HH:mm. Use as follows:
 *
 * <pre>
 *    Gson gson = new GsonBuilder()
 *      .registerTypeAdapter(OffsetDateTime.class, new AsteriskOffsetDateTimeTypeAdapter())
 *      .create();
 *
 *    ApiClient apiClient = new ApiClient();
 *    apiClient.getJSON().setGson(gson);
 * </pre>
 */
public class AsteriskOffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

    static final DateTimeFormatter formatter = new DateTimeFormatterBuilder()
            .parseCaseInsensitive()
            .append(ISO_LOCAL_DATE_TIME)
            .appendOffset("+HHmm", "Z")
            .toFormatter();

    @Override
    public void write(JsonWriter out, OffsetDateTime date) throws IOException {
        if (date == null) {
            out.nullValue();
        } else {
            out.value(formatter.format(date));
        }
    }

    @Override
    public OffsetDateTime read(JsonReader in) throws IOException {
        switch (in.peek()) {
            case NULL:
                in.nextNull();
                return null;
            default:
                String date = in.nextString();
                return OffsetDateTime.parse(date, formatter);
        }
    }
}