package de.andrerother.core.kin;

import de.andrerother.core.InnateAbility;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class Human implements Kin {
    private final List<InnateAbility> innateAbilities = new ArrayList<>(2);
    private int hitPoints;
    private int willpower;
    private int encumbrance;
    private int movement;

    @Override
    public String toString() {
        return "Human{" +
                "innateAbilities=" + innateAbilities +
                ", hitPoints=" + hitPoints +
                ", willpower=" + willpower +
                ", encumbrance=" + encumbrance +
                ", movement=" + movement +
                '}';
    }
}