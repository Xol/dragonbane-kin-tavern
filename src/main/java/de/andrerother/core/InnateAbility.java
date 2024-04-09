package de.andrerother.core;

import lombok.Getter;

@Getter
public class InnateAbility {
    private int costs;
    private String name;
    private String description;

    @Override
    public String toString() {
        return "InnateAbility{" +
                "costs=" + costs +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
