package de.andrerother.service;

import de.andrerother.core.*;
import de.andrerother.core.kin.Human;
import de.andrerother.core.kin.Kin;
import jakarta.enterprise.context.ApplicationScoped;

import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class CharacterService {
    public PlayerCharacter createDummyCharacter() {
        PlayerCharacter pc = new PlayerCharacter();
        pc.setPlayerName("John Doe");
        pc.setProfession(createDummyProfession());
        pc.setAttributes(createDummyCoreSkill());
        pc.setHeroicAbilities(createDummyHeroicAbility());
        pc.setKin(createDummyKin());
        return pc;
    }

    private Kin createDummyKin() {
        Human human = new Human();
        human.setWillpower(10);
        human.setHitPoints(10);
        human.setEncumbrance(4);
        human.setMovement(10);
        return human;
    }

    private Profession createDummyProfession() {
        Profession profession = new Profession();
        profession.setName("Artisan");
        return profession;
    }

    private List<Attribute> createDummyCoreSkill() {
        List<String> attributeNames = List.of("Strength", "Constitution", "Agility", "Intelligence", "Willpower", "Charisma");
        List<Attribute> attributes = new ArrayList<>();

        for (String attribute : attributeNames) {
            Attribute a = new Attribute();
            a.setName(attribute);
            a.setValue(10);
            attributes.add(a);
        }
        return attributes;
    }

    private List<HeroicAbility> createDummyHeroicAbility() {
        List<HeroicAbility> heroicAbilities = new ArrayList<>();
        HeroicAbility heroicAbility = new HeroicAbility();
        heroicAbility.setName("My HeroicAbility");
        heroicAbility.setWillpowerCosts(5);
        Attribute attribute = new Attribute();
        attribute.setName("Strength");
        attribute.setValue(12);
        heroicAbility.setAttributeRequirement(attribute);
        heroicAbilities.add(heroicAbility);
        return heroicAbilities;
    }
}
