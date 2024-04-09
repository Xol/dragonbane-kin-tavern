package de.andrerother.core;

public enum Status {
    EXHAUSTED("Exhausted"),
    SICKLY("Sickly"),
    DAZED("Dazed"),
    ANGRY("Angry"),
    SCARED("Scared"),
    DISHEARTENED("Disheartened");

    public final String label;

    Status(final String label) {
        this.label = label;
    }
}
