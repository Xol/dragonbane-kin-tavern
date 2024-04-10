package de.andrerother.core.kin;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Kin {
    private int hitPoints;
    private int willpower;
    private int encumbrance;
    private int movement;
}
