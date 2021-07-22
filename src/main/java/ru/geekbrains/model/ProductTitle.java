package ru.geekbrains.model;

public enum ProductTitle {

    ORANGE("orange"),
    APPLE("apple"),
    GRAPES("grapes"),
    PUMPKIN("pumpkin"),
    WATERMELON("watermelon"),
    LEMON("lemon"),
    PEAR("pear"),
    KIWI("kiwi"),
    PINEAPPLE("pineapple"),
    EGGPLANT("eggplant");

    private final String title;

    ProductTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
