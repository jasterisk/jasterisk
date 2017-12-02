package com.github.jasterisk.invoker;

import com.google.gson.Gson;
import retrofit2.Converter;

/**
 * The point of this class is to make the {@link GsonCustomConverterFactory} implementation visible outside this
 * package because it's needed when creating a custom Retrofit.Builder for Asterisk.
 */
public class Spy {

    public static Converter.Factory gsonCustomConverterFactory(Gson gson) {
        return GsonCustomConverterFactory.create(gson);
    }
}
