package de.andrerother.core;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeroicAbility extends Skills {
    // todo Requirements to use this Skill like "Strength 12". Maybe just a text info or Attribute?
    private int requirement;
    private int costs;
}
