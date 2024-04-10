package de.andrerother.core;

import de.andrerother.core.kin.Kin;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class PlayerCharacter {
    private String playerName;
    private Kin kin;
    private Age age;
    private Profession profession;
    private List<Attribute> attributes;
    private List<Skills> skills;
    private List<HeroicAbility> heroicAbilities;

}
