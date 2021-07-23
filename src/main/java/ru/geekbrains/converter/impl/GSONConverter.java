package ru.geekbrains.converter.impl;

import com.google.gson.Gson;
import ru.geekbrains.converter.JSONConverter;

public class GSONConverter implements JSONConverter {

    private static GSONConverter instance;
    private final Gson gson;

    private GSONConverter() {
        gson = new Gson();
    }

    public static GSONConverter getInstance() {
        if (instance == null) {
            instance = new GSONConverter();
        }
        return instance;
    }

    @Override
    public String convertToJSON(Object object) {
        return gson.toJson(object);
    }
}
