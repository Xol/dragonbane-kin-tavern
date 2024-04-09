package de.andrerother.core;

import de.andrerother.core.kin.Kin;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class PlayerCharacter {
    private String playerName;
    private Kin kin;
    private Profession profession;
    private List<Attribute> attributes;
    private List<Skills> skills;
    private List<HeroicAbility> heroicAbilities;

    @Override
    public String toString() {
        return "PlayerCharacter{" +
                "playerName='" + playerName + '\'' +
                ", kin=" + kin +
                ", profession=" + profession +
                ", attributes=" + attributes +
                ", skills=" + skills +
                ", heroicAbilities=" + heroicAbilities +
                '}';
    }
}
