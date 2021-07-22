package ru.geekbrains.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Product {

    private final int id;
    private final String title;
    private final int cost;
}
