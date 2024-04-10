package de.andrerother.core;

import lombok.Getter;

@Getter
public enum Age {
    YOUNG("Young"),
    ADULT("Adult"),
    OLD("Old");

    public final String label;

    Age(final String label) {
        this.label = label;
    }
}
