package de.andrerother.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HeroicAbility extends Skills {
    // todo Requirements to use this Skill like "Strength 12". Maybe just a text info or Attribute?
    private Attribute attributeRequirement;
    private int willpowerCosts;
}
