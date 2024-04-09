package de.andrerother.core;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Skills {
    private String name;
    private int value;
    private List<Boolean> boons;
    private List<Boolean> demons;
}
