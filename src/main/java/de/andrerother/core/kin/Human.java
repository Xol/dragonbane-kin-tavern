package de.andrerother.core.kin;

import de.andrerother.core.InnateAbility;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@ToString
public class Human extends Kin {
    private final List<InnateAbility> innateAbilities = new ArrayList<>(2);
}