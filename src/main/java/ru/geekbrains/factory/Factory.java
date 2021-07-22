package ru.geekbrains.factory;

import ru.geekbrains.converter.JSONConverter;
import ru.geekbrains.converter.impl.GSONConverter;

public class Factory {

    public static JSONConverter getJSONConverter() {
        return GSONConverter.getInstance();
    }
}
